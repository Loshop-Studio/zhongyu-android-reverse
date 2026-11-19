package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.RunnableC5713i;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145q5.AbstractC6438i;
import p145q5.AbstractC6439j;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;

/* renamed from: io.reactivex.internal.schedulers.d */
/* loaded from: classes.dex */
public final class C5718d extends AbstractC6439j {

    /* renamed from: b */
    public static final C5716b f9024b;

    /* renamed from: c */
    public static final RxThreadFactory f9025c;

    /* renamed from: d */
    public static final int f9026d;

    /* renamed from: e */
    public static final C5717c f9027e;

    /* renamed from: a */
    public final AtomicReference f9028a;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f9026d = iAvailableProcessors;
        C5717c c5717c = new C5717c(new RxThreadFactory("RxComputationShutdown"));
        f9027e = c5717c;
        c5717c.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f9025c = rxThreadFactory;
        C5716b c5716b = new C5716b(0, rxThreadFactory);
        f9024b = c5716b;
        for (C5717c c5717c2 : c5716b.f9022b) {
            c5717c2.dispose();
        }
    }

    public C5718d() {
        C5716b c5716b = f9024b;
        AtomicReference atomicReference = new AtomicReference(c5716b);
        this.f9028a = atomicReference;
        C5716b c5716b2 = new C5716b(f9026d, f9025c);
        while (!atomicReference.compareAndSet(c5716b, c5716b2)) {
            if (atomicReference.get() != c5716b) {
                C5717c[] c5717cArr = c5716b2.f9022b;
                for (C5717c c5717c : c5717cArr) {
                    c5717c.dispose();
                }
                return;
            }
        }
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: a */
    public final AbstractC6438i mo5086a() {
        C5717c c5717c;
        C5716b c5716b = (C5716b) this.f9028a.get();
        int i = c5716b.f9021a;
        if (i == 0) {
            c5717c = f9027e;
        } else {
            C5717c[] c5717cArr = c5716b.f9022b;
            long j7 = c5716b.f9023c;
            c5716b.f9023c = 1 + j7;
            c5717c = c5717cArr[(int) (j7 % i)];
        }
        return new C5715a(c5717c);
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: b */
    public final InterfaceC6559b mo5087b(RunnableC5713i runnableC5713i) {
        C5717c c5717c;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C5716b c5716b = (C5716b) this.f9028a.get();
        int i = c5716b.f9021a;
        if (i == 0) {
            c5717c = f9027e;
        } else {
            C5717c[] c5717cArr = c5716b.f9022b;
            long j7 = c5716b.f9023c;
            c5716b.f9023c = 1 + j7;
            c5717c = c5717cArr[(int) (j7 % i)];
        }
        ScheduledExecutorService scheduledExecutorService = c5717c.f9050a;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableC5713i);
        try {
            scheduledDirectTask.setFuture(scheduledExecutorService.submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            AbstractC6675d.m6351q(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}

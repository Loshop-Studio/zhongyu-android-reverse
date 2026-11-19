package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.RunnableC5713i;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p145q5.AbstractC6438i;
import p145q5.AbstractC6439j;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;

/* renamed from: io.reactivex.internal.schedulers.m */
/* loaded from: classes.dex */
public final class C5727m extends AbstractC6439j {

    /* renamed from: b */
    public static final RxThreadFactory f9059b;

    /* renamed from: a */
    public final AtomicReference f9060a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f9059b = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C5727m() {
        AtomicReference atomicReference = new AtomicReference();
        this.f9060a = atomicReference;
        boolean z8 = AbstractC5725k.f9052a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f9059b);
        if (AbstractC5725k.f9052a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            AbstractC5725k.f9055d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: a */
    public final AbstractC6438i mo5086a() {
        return new C5726l((ScheduledExecutorService) this.f9060a.get());
    }

    @Override // p145q5.AbstractC6439j
    /* renamed from: b */
    public final InterfaceC6559b mo5087b(RunnableC5713i runnableC5713i) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        AtomicReference atomicReference = this.f9060a;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableC5713i);
        try {
            scheduledDirectTask.setFuture(((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            AbstractC6675d.m6351q(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}

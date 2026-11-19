package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p076d7.AbstractC8314e;
import p076d7.CallableC8311b;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10049f;
import p277v6.C10249a;
import p277v6.InterfaceC10250b;

/* renamed from: io.reactivex.internal.schedulers.b */
/* loaded from: classes5.dex */
public final class C8973b extends AbstractC10049f {

    /* renamed from: d */
    public static final RxThreadFactory f17112d;

    /* renamed from: e */
    public static final ScheduledExecutorService f17113e;

    /* renamed from: b */
    public final ThreadFactory f17114b;

    /* renamed from: c */
    public final AtomicReference f17115c;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    public static final class a extends AbstractC10049f.c {

        /* renamed from: a */
        public final ScheduledExecutorService f17116a;

        /* renamed from: b */
        public final C10249a f17117b = new C10249a();

        /* renamed from: c */
        public volatile boolean f17118c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f17116a = scheduledExecutorService;
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: c */
        public InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f17118c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(AbstractC8462a.m13803m(runnable), this.f17117b);
            this.f17117b.mo19201b(scheduledRunnable);
            try {
                scheduledRunnable.m15563a(j10 <= 0 ? this.f17116a.submit((Callable) scheduledRunnable) : this.f17116a.schedule((Callable) scheduledRunnable, j10, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e10) {
                dispose();
                AbstractC8462a.m13801k(e10);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            if (this.f17118c) {
                return;
            }
            this.f17118c = true;
            this.f17117b.dispose();
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f17118c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f17113e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f17112d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C8973b() {
        this(f17112d);
    }

    /* renamed from: d */
    public static ScheduledExecutorService m15568d(ThreadFactory threadFactory) {
        return AbstractC8314e.m13481a(threadFactory);
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: a */
    public AbstractC10049f.c mo13462a() {
        return new a((ScheduledExecutorService) this.f17115c.get());
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: b */
    public InterfaceC10250b mo13463b(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(AbstractC8462a.m13803m(runnable));
        try {
            scheduledDirectTask.m15561a(j10 <= 0 ? ((ScheduledExecutorService) this.f17115c.get()).submit(scheduledDirectTask) : ((ScheduledExecutorService) this.f17115c.get()).schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            AbstractC8462a.m13801k(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: c */
    public InterfaceC10250b mo13464c(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableM13803m = AbstractC8462a.m13803m(runnable);
        if (j11 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableM13803m);
            try {
                scheduledDirectPeriodicTask.m15561a(((ScheduledExecutorService) this.f17115c.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e10) {
                AbstractC8462a.m13801k(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f17115c.get();
        CallableC8311b callableC8311b = new CallableC8311b(runnableM13803m, scheduledExecutorService);
        try {
            callableC8311b.m13471b(j10 <= 0 ? scheduledExecutorService.submit(callableC8311b) : scheduledExecutorService.schedule(callableC8311b, j10, timeUnit));
            return callableC8311b;
        } catch (RejectedExecutionException e11) {
            AbstractC8462a.m13801k(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public C8973b(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f17115c = atomicReference;
        this.f17114b = threadFactory;
        atomicReference.lazySet(m15568d(threadFactory));
    }
}

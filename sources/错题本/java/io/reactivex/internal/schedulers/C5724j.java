package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p145q5.AbstractC6438i;
import p159s5.InterfaceC6559b;
import p176u5.InterfaceC6621a;
import p185v7.AbstractC6675d;

/* renamed from: io.reactivex.internal.schedulers.j */
/* loaded from: classes.dex */
public class C5724j extends AbstractC6438i {

    /* renamed from: a */
    public final ScheduledExecutorService f9050a;

    /* renamed from: b */
    public volatile boolean f9051b;

    public C5724j(ThreadFactory threadFactory) {
        boolean z8 = AbstractC5725k.f9052a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (AbstractC5725k.f9052a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            AbstractC5725k.f9055d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f9050a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: a */
    public final InterfaceC6559b mo5084a(Runnable runnable, TimeUnit timeUnit) {
        return this.f9051b ? EmptyDisposable.INSTANCE : m5088c(runnable, timeUnit, null);
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: b */
    public final void mo5085b(Runnable runnable) {
        mo5084a(runnable, null);
    }

    /* renamed from: c */
    public final ScheduledRunnable m5088c(Runnable runnable, TimeUnit timeUnit, InterfaceC6621a interfaceC6621a) {
        ScheduledExecutorService scheduledExecutorService = this.f9050a;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, interfaceC6621a);
        if (interfaceC6621a != null && !interfaceC6621a.mo6200a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.setFuture(scheduledExecutorService.submit((Callable) scheduledRunnable));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            if (interfaceC6621a != null) {
                interfaceC6621a.mo6202c(scheduledRunnable);
            }
            AbstractC6675d.m6351q(e);
            return scheduledRunnable;
        }
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        if (this.f9051b) {
            return;
        }
        this.f9051b = true;
        this.f9050a.shutdownNow();
    }
}

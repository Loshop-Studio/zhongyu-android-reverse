package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p076d7.AbstractC8314e;
import p076d7.CallableC8311b;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10049f;
import p277v6.InterfaceC10250b;
import p310y6.InterfaceC10666a;

/* renamed from: io.reactivex.internal.schedulers.a */
/* loaded from: classes5.dex */
public class C8972a extends AbstractC10049f.c implements InterfaceC10250b {

    /* renamed from: a */
    public final ScheduledExecutorService f17110a;

    /* renamed from: b */
    public volatile boolean f17111b;

    public C8972a(ThreadFactory threadFactory) {
        this.f17110a = AbstractC8314e.m13481a(threadFactory);
    }

    @Override // p244s6.AbstractC10049f.c
    /* renamed from: b */
    public InterfaceC10250b mo13466b(Runnable runnable) {
        return mo13467c(runnable, 0L, null);
    }

    @Override // p244s6.AbstractC10049f.c
    /* renamed from: c */
    public InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f17111b ? EmptyDisposable.INSTANCE : m15564e(runnable, j10, timeUnit, null);
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
        if (this.f17111b) {
            return;
        }
        this.f17111b = true;
        this.f17110a.shutdownNow();
    }

    /* renamed from: e */
    public ScheduledRunnable m15564e(Runnable runnable, long j10, TimeUnit timeUnit, InterfaceC10666a interfaceC10666a) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(AbstractC8462a.m13803m(runnable), interfaceC10666a);
        if (interfaceC10666a != null && !interfaceC10666a.mo19201b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.m15563a(j10 <= 0 ? this.f17110a.submit((Callable) scheduledRunnable) : this.f17110a.schedule((Callable) scheduledRunnable, j10, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e10) {
            if (interfaceC10666a != null) {
                interfaceC10666a.mo19202c(scheduledRunnable);
            }
            AbstractC8462a.m13801k(e10);
            return scheduledRunnable;
        }
    }

    /* renamed from: f */
    public InterfaceC10250b m15565f(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(AbstractC8462a.m13803m(runnable));
        try {
            scheduledDirectTask.m15561a(j10 <= 0 ? this.f17110a.submit(scheduledDirectTask) : this.f17110a.schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            AbstractC8462a.m13801k(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    /* renamed from: g */
    public InterfaceC10250b m15566g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableM13803m = AbstractC8462a.m13803m(runnable);
        if (j11 <= 0) {
            CallableC8311b callableC8311b = new CallableC8311b(runnableM13803m, this.f17110a);
            try {
                callableC8311b.m13471b(j10 <= 0 ? this.f17110a.submit(callableC8311b) : this.f17110a.schedule(callableC8311b, j10, timeUnit));
                return callableC8311b;
            } catch (RejectedExecutionException e10) {
                AbstractC8462a.m13801k(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableM13803m);
        try {
            scheduledDirectPeriodicTask.m15561a(this.f17110a.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            AbstractC8462a.m13801k(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    /* renamed from: h */
    public void m15567h() {
        if (this.f17111b) {
            return;
        }
        this.f17111b = true;
        this.f17110a.shutdown();
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return this.f17111b;
    }
}

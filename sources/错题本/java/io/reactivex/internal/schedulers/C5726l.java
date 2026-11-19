package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p145q5.AbstractC6438i;
import p159s5.C6558a;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;

/* renamed from: io.reactivex.internal.schedulers.l */
/* loaded from: classes.dex */
public final class C5726l extends AbstractC6438i {

    /* renamed from: a */
    public final ScheduledExecutorService f9056a;

    /* renamed from: b */
    public final C6558a f9057b = new C6558a(0);

    /* renamed from: c */
    public volatile boolean f9058c;

    public C5726l(ScheduledExecutorService scheduledExecutorService) {
        this.f9056a = scheduledExecutorService;
    }

    @Override // p145q5.AbstractC6438i
    /* renamed from: a */
    public final InterfaceC6559b mo5084a(Runnable runnable, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (this.f9058c) {
            return EmptyDisposable.INSTANCE;
        }
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f9057b);
        this.f9057b.mo6200a(scheduledRunnable);
        try {
            scheduledRunnable.setFuture(this.f9056a.submit((Callable) scheduledRunnable));
            return scheduledRunnable;
        } catch (RejectedExecutionException e) {
            dispose();
            AbstractC6675d.m6351q(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        if (this.f9058c) {
            return;
        }
        this.f9058c = true;
        this.f9057b.dispose();
    }
}

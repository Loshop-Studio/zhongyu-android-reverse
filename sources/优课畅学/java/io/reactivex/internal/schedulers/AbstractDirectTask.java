package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p277v6.InterfaceC10250b;
import p321z6.AbstractC10725a;

/* loaded from: classes5.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements InterfaceC10250b {

    /* renamed from: c */
    public static final FutureTask f17098c;

    /* renamed from: d */
    public static final FutureTask f17099d;

    /* renamed from: a */
    public final Runnable f17100a;

    /* renamed from: b */
    public Thread f17101b;

    static {
        Runnable runnable = AbstractC10725a.f21269b;
        f17098c = new FutureTask(runnable, null);
        f17099d = new FutureTask(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.f17100a = runnable;
    }

    /* renamed from: a */
    public final void m15561a(Future future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f17098c) {
                return;
            }
            if (future2 == f17099d) {
                future.cancel(this.f17101b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // p277v6.InterfaceC10250b
    public final void dispose() {
        FutureTask futureTask;
        Future<?> future = get();
        if (future == f17098c || future == (futureTask = f17099d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f17101b != Thread.currentThread());
    }

    @Override // p277v6.InterfaceC10250b
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f17098c || future == f17099d;
    }
}

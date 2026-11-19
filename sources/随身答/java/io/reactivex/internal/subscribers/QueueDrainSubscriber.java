package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final InterfaceC0050c downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(InterfaceC0050c interfaceC0050c, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = interfaceC0050c;
        this.queue = simplePlainQueue;
    }

    public boolean accept(InterfaceC0050c interfaceC0050c, U u9) {
        return false;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        return this.wip.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        return this.wip.get() == 0 && this.wip.compareAndSet(0, 1);
    }

    public final void fastPathEmitMax(U u9, boolean z9, Disposable disposable) {
        InterfaceC0050c interfaceC0050c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j9 = this.requested.get();
            if (j9 == 0) {
                disposable.dispose();
                interfaceC0050c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(interfaceC0050c, u9) && j9 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            simplePlainQueue.offer(u9);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC0050c, z9, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u9, boolean z9, Disposable disposable) {
        InterfaceC0050c interfaceC0050c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j9 = this.requested.get();
            if (j9 == 0) {
                this.cancelled = true;
                disposable.dispose();
                interfaceC0050c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (simplePlainQueue.isEmpty()) {
                if (accept(interfaceC0050c, u9) && j9 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u9);
            }
        } else {
            simplePlainQueue.offer(u9);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC0050c, z9, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i9) {
        return this.wip.addAndGet(i9);
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j9) {
        return this.requested.addAndGet(-j9);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.requested.get();
    }

    public final void requested(long j9) {
        if (SubscriptionHelper.validate(j9)) {
            BackpressureHelper.add(this.requested, j9);
        }
    }
}

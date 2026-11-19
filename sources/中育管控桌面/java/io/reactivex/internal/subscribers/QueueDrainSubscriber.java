package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final InterfaceC7917c downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(InterfaceC7917c interfaceC7917c, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = interfaceC7917c;
        this.queue = simplePlainQueue;
    }

    public boolean accept(InterfaceC7917c interfaceC7917c, U u6) {
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

    public final void fastPathEmitMax(U u6, boolean z6, Disposable disposable) {
        InterfaceC7917c interfaceC7917c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j6 = this.requested.get();
            if (j6 == 0) {
                disposable.dispose();
                interfaceC7917c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(interfaceC7917c, u6) && j6 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            simplePlainQueue.offer(u6);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC7917c, z6, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u6, boolean z6, Disposable disposable) {
        InterfaceC7917c interfaceC7917c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j6 = this.requested.get();
            if (j6 == 0) {
                this.cancelled = true;
                disposable.dispose();
                interfaceC7917c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (simplePlainQueue.isEmpty()) {
                if (accept(interfaceC7917c, u6) && j6 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u6);
            }
        } else {
            simplePlainQueue.offer(u6);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC7917c, z6, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i6) {
        return this.wip.addAndGet(i6);
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j6) {
        return this.requested.addAndGet(-j6);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.requested.get();
    }

    public final void requested(long j6) {
        if (SubscriptionHelper.validate(j6)) {
            BackpressureHelper.add(this.requested, j6);
        }
    }
}

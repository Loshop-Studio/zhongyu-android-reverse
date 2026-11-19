package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<T>, InterfaceC7918d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i6) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i6;
        this.limit = i6 - (i6 >> 2);
    }

    @Override // p193y5.InterfaceC7918d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t6);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.setOnce(this, interfaceC7918d)) {
            if (interfaceC7918d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC7918d;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(interfaceC7918d, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(interfaceC7918d, this.prefetch);
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
        if (this.fusionMode != 1) {
            long j7 = this.produced + j6;
            if (j7 < this.limit) {
                this.produced = j7;
            } else {
                this.produced = 0L;
                get().request(j7);
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j6 = this.produced + 1;
            if (j6 != this.limit) {
                this.produced = j6;
            } else {
                this.produced = 0L;
                get().request(j6);
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}

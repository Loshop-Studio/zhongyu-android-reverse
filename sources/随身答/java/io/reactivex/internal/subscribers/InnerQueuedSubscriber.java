package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<InterfaceC0051d> implements FlowableSubscriber<T>, InterfaceC0051d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i9) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i9;
        this.limit = i9 - (i9 >> 2);
    }

    @Override // p010a9.InterfaceC0051d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t9);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        if (SubscriptionHelper.setOnce(this, interfaceC0051d)) {
            if (interfaceC0051d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC0051d;
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
                    QueueDrainHelper.request(interfaceC0051d, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(interfaceC0051d, this.prefetch);
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // p010a9.InterfaceC0051d
    public void request(long j9) {
        if (this.fusionMode != 1) {
            long j10 = this.produced + j9;
            if (j10 < this.limit) {
                this.produced = j10;
            } else {
                this.produced = 0L;
                get().request(j10);
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j9 = this.produced + 1;
            if (j9 != this.limit) {
                this.produced = j9;
            } else {
                this.produced = 0L;
                get().request(j9);
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}

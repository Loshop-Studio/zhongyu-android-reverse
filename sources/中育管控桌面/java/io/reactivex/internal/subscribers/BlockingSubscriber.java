package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class BlockingSubscriber<T> extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<T>, InterfaceC7918d {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // p193y5.InterfaceC7918d
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onNext(T t6) {
        this.queue.offer(NotificationLite.next(t6));
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (SubscriptionHelper.setOnce(this, interfaceC7918d)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // p193y5.InterfaceC7918d
    public void request(long j6) {
        get().request(j6);
    }
}

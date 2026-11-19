package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final InterfaceC7917c subscriber;
    final T value;

    public ScalarSubscription(InterfaceC7917c interfaceC7917c, T t6) {
        this.subscriber = interfaceC7917c;
        this.value = t6;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t6) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public void request(long j6) {
        if (SubscriptionHelper.validate(j6) && compareAndSet(0, 1)) {
            InterfaceC7917c interfaceC7917c = this.subscriber;
            interfaceC7917c.onNext(this.value);
            if (get() != 2) {
                interfaceC7917c.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i6) {
        return i6 & 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t6, T t7) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

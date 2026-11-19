package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final InterfaceC8989c subscriber;
    final T value;

    public ScalarSubscription(InterfaceC8989c interfaceC8989c, T t10) {
        this.subscriber = interfaceC8989c;
        this.value = t10;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
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
    public boolean offer(T t10) {
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

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            InterfaceC8989c interfaceC8989c = this.subscriber;
            interfaceC8989c.onNext(this.value);
            if (get() != 2) {
                interfaceC8989c.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

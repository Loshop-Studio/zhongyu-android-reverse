package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final InterfaceC0050c subscriber;
    final T value;

    public ScalarSubscription(InterfaceC0050c interfaceC0050c, T t9) {
        this.subscriber = interfaceC0050c;
        this.value = t9;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
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
    public boolean offer(T t9) {
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

    @Override // io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
    public void request(long j9) {
        if (SubscriptionHelper.validate(j9) && compareAndSet(0, 1)) {
            InterfaceC0050c interfaceC0050c = this.subscriber;
            interfaceC0050c.onNext(this.value);
            if (get() != 2) {
                interfaceC0050c.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i9) {
        return i9 & 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t9, T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

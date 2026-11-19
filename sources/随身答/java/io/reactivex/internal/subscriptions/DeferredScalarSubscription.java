package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final InterfaceC0050c downstream;
    protected T value;

    public DeferredScalarSubscription(InterfaceC0050c interfaceC0050c) {
        this.downstream = interfaceC0050c;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t9) {
        int i9 = get();
        while (i9 != 8) {
            if ((i9 & (-3)) != 0) {
                return;
            }
            if (i9 == 2) {
                lazySet(3);
                InterfaceC0050c interfaceC0050c = this.downstream;
                interfaceC0050c.onNext(t9);
                if (get() != 4) {
                    interfaceC0050c.onComplete();
                    return;
                }
                return;
            }
            this.value = t9;
            if (compareAndSet(0, 1)) {
                return;
            }
            i9 = get();
            if (i9 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t9;
        lazySet(16);
        InterfaceC0050c interfaceC0050c2 = this.downstream;
        interfaceC0050c2.onNext(t9);
        if (get() != 4) {
            interfaceC0050c2.onComplete();
        }
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t9 = this.value;
        this.value = null;
        return t9;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
    public final void request(long j9) {
        T t9;
        if (SubscriptionHelper.validate(j9)) {
            do {
                int i9 = get();
                if ((i9 & (-2)) != 0) {
                    return;
                }
                if (i9 == 1) {
                    if (!compareAndSet(1, 3) || (t9 = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    InterfaceC0050c interfaceC0050c = this.downstream;
                    interfaceC0050c.onNext(t9);
                    if (get() != 4) {
                        interfaceC0050c.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i9) {
        if ((i9 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}

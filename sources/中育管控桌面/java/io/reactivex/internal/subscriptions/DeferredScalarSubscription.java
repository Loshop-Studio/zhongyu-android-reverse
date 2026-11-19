package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
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
    protected final InterfaceC7917c downstream;
    protected T value;

    public DeferredScalarSubscription(InterfaceC7917c interfaceC7917c) {
        this.downstream = interfaceC7917c;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t6) {
        int i6 = get();
        while (i6 != 8) {
            if ((i6 & (-3)) != 0) {
                return;
            }
            if (i6 == 2) {
                lazySet(3);
                InterfaceC7917c interfaceC7917c = this.downstream;
                interfaceC7917c.onNext(t6);
                if (get() != 4) {
                    interfaceC7917c.onComplete();
                    return;
                }
                return;
            }
            this.value = t6;
            if (compareAndSet(0, 1)) {
                return;
            }
            i6 = get();
            if (i6 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t6;
        lazySet(16);
        InterfaceC7917c interfaceC7917c2 = this.downstream;
        interfaceC7917c2.onNext(t6);
        if (get() != 4) {
            interfaceC7917c2.onComplete();
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
        T t6 = this.value;
        this.value = null;
        return t6;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
    public final void request(long j6) {
        T t6;
        if (SubscriptionHelper.validate(j6)) {
            do {
                int i6 = get();
                if ((i6 & (-2)) != 0) {
                    return;
                }
                if (i6 == 1) {
                    if (!compareAndSet(1, 3) || (t6 = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    InterfaceC7917c interfaceC7917c = this.downstream;
                    interfaceC7917c.onNext(t6);
                    if (get() != 4) {
                        interfaceC7917c.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i6) {
        if ((i6 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}

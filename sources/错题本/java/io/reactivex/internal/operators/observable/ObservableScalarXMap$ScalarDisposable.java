package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.Nullable;
import java.util.concurrent.atomic.AtomicInteger;
import p145q5.InterfaceC6436g;
import p192w5.InterfaceC6720a;

/* loaded from: classes.dex */
public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements InterfaceC6720a, Runnable {
    static final int FUSED = 1;
    static final int ON_COMPLETE = 3;
    static final int ON_NEXT = 2;
    static final int START = 0;
    private static final long serialVersionUID = 3880992722410194083L;
    final InterfaceC6436g observer;
    final T value;

    public ObservableScalarXMap$ScalarDisposable(InterfaceC6436g interfaceC6436g, T t8) {
        this.observer = interfaceC6436g;
        this.value = t8;
    }

    @Override // p192w5.InterfaceC6721b
    public void clear() {
        lazySet(3);
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
        set(3);
    }

    public boolean isDisposed() {
        return get() == 3;
    }

    @Override // p192w5.InterfaceC6721b
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // p192w5.InterfaceC6721b
    public boolean offer(T t8) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p192w5.InterfaceC6721b
    @Nullable
    public T poll() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    @Override // p192w5.InterfaceC6720a
    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.observer.onNext(this.value);
            if (get() == 2) {
                lazySet(3);
                this.observer.onComplete();
            }
        }
    }

    public boolean offer(T t8, T t9) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

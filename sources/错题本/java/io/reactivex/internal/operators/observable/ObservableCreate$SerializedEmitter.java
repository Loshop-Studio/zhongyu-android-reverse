package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import p145q5.InterfaceC6435f;
import p159s5.InterfaceC6559b;
import p168t5.InterfaceC6598b;
import p185v7.AbstractC6675d;
import p206y5.C6776a;

/* loaded from: classes.dex */
final class ObservableCreate$SerializedEmitter<T> extends AtomicInteger implements InterfaceC6435f {
    private static final long serialVersionUID = 4883307006032401862L;
    volatile boolean done;
    final InterfaceC6435f emitter;
    final AtomicThrowable error = new AtomicThrowable();
    final C6776a queue = new C6776a(16);

    public ObservableCreate$SerializedEmitter(InterfaceC6435f interfaceC6435f) {
        this.emitter = interfaceC6435f;
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        InterfaceC6435f interfaceC6435f = this.emitter;
        C6776a c6776a = this.queue;
        AtomicThrowable atomicThrowable = this.error;
        int iAddAndGet = 1;
        while (!interfaceC6435f.isDisposed()) {
            if (atomicThrowable.get() != null) {
                c6776a.clear();
                interfaceC6435f.onError(atomicThrowable.terminate());
                return;
            }
            boolean z8 = this.done;
            Object objPoll = c6776a.poll();
            boolean z9 = objPoll == null;
            if (z8 && z9) {
                interfaceC6435f.onComplete();
                return;
            } else if (z9) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                interfaceC6435f.onNext(objPoll);
            }
        }
        c6776a.clear();
    }

    @Override // p145q5.InterfaceC6435f
    public boolean isDisposed() {
        return this.emitter.isDisposed();
    }

    @Override // p145q5.InterfaceC6435f
    public void onComplete() {
        if (this.emitter.isDisposed() || this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // p145q5.InterfaceC6435f
    public void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        AbstractC6675d.m6351q(th);
    }

    @Override // p145q5.InterfaceC6435f
    public void onNext(T t8) {
        if (this.emitter.isDisposed() || this.done) {
            return;
        }
        if (t8 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.emitter.onNext(t8);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            C6776a c6776a = this.queue;
            synchronized (c6776a) {
                c6776a.offer(t8);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    @Override // p145q5.InterfaceC6435f
    public void setCancellable(InterfaceC6598b interfaceC6598b) {
        this.emitter.setCancellable(interfaceC6598b);
    }

    @Override // p145q5.InterfaceC6435f
    public void setDisposable(InterfaceC6559b interfaceC6559b) {
        this.emitter.setDisposable(interfaceC6559b);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.emitter.toString();
    }

    public boolean tryOnError(Throwable th) {
        if (!this.emitter.isDisposed() && !this.done) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.error.addThrowable(th)) {
                this.done = true;
                drain();
                return true;
            }
        }
        return false;
    }

    public InterfaceC6435f serialize() {
        return this;
    }
}

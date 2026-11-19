package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p145q5.InterfaceC6435f;
import p145q5.InterfaceC6436g;
import p159s5.InterfaceC6559b;
import p168t5.InterfaceC6598b;
import p185v7.AbstractC6675d;

/* loaded from: classes.dex */
final class ObservableCreate$CreateEmitter<T> extends AtomicReference<InterfaceC6559b> implements InterfaceC6435f, InterfaceC6559b {
    private static final long serialVersionUID = -3434801548987643227L;
    final InterfaceC6436g observer;

    public ObservableCreate$CreateEmitter(InterfaceC6436g interfaceC6436g) {
        this.observer = interfaceC6436g;
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // p145q5.InterfaceC6435f
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // p145q5.InterfaceC6435f
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        try {
            this.observer.onComplete();
        } finally {
            dispose();
        }
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
        if (t8 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (isDisposed()) {
                return;
            }
            this.observer.onNext(t8);
        }
    }

    public InterfaceC6435f serialize() {
        return new ObservableCreate$SerializedEmitter(this);
    }

    @Override // p145q5.InterfaceC6435f
    public void setCancellable(InterfaceC6598b interfaceC6598b) {
        setDisposable(new CancellableDisposable(interfaceC6598b));
    }

    @Override // p145q5.InterfaceC6435f
    public void setDisposable(InterfaceC6559b interfaceC6559b) {
        DisposableHelper.set(this, interfaceC6559b);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return ObservableCreate$CreateEmitter.class.getSimpleName() + "{" + super.toString() + "}";
    }

    public boolean tryOnError(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isDisposed()) {
            return false;
        }
        try {
            this.observer.onError(th);
            dispose();
            return true;
        } catch (Throwable th2) {
            dispose();
            throw th2;
        }
    }
}

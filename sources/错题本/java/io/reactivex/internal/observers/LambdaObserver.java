package io.reactivex.internal.observers;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import p073h4.AbstractC5625a;
import p145q5.InterfaceC6436g;
import p159s5.InterfaceC6559b;
import p168t5.InterfaceC6597a;
import p168t5.InterfaceC6599c;
import p183v5.AbstractC6668a;
import p185v7.AbstractC6675d;

/* loaded from: classes.dex */
public final class LambdaObserver<T> extends AtomicReference<InterfaceC6559b> implements InterfaceC6436g, InterfaceC6559b {
    private static final long serialVersionUID = -7251123623727029452L;
    final InterfaceC6597a onComplete;
    final InterfaceC6599c onError;
    final InterfaceC6599c onNext;
    final InterfaceC6599c onSubscribe;

    public LambdaObserver(InterfaceC6599c interfaceC6599c, InterfaceC6599c interfaceC6599c2, InterfaceC6597a interfaceC6597a, InterfaceC6599c interfaceC6599c3) {
        this.onNext = interfaceC6599c;
        this.onError = interfaceC6599c2;
        this.onComplete = interfaceC6597a;
        this.onSubscribe = interfaceC6599c3;
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != AbstractC6668a.f11250d;
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // p145q5.InterfaceC6436g
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.getClass();
        } catch (Throwable th) {
            AbstractC5625a.m4956p(th);
            AbstractC6675d.m6351q(th);
        }
    }

    @Override // p145q5.InterfaceC6436g
    public void onError(Throwable th) {
        if (isDisposed()) {
            AbstractC6675d.m6351q(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            AbstractC5625a.m4956p(th2);
            AbstractC6675d.m6351q(new CompositeException(th, th2));
        }
    }

    @Override // p145q5.InterfaceC6436g
    public void onNext(T t8) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t8);
        } catch (Throwable th) {
            AbstractC5625a.m4956p(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // p145q5.InterfaceC6436g
    public void onSubscribe(InterfaceC6559b interfaceC6559b) {
        if (DisposableHelper.setOnce(this, interfaceC6559b)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                AbstractC5625a.m4956p(th);
                interfaceC6559b.dispose();
                onError(th);
            }
        }
    }
}

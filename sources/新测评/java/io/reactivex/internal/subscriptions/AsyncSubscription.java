package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class AsyncSubscription extends AtomicLong implements InterfaceC8990d, Disposable {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<InterfaceC8990d> actual;
    final AtomicReference<Disposable> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(Disposable disposable) {
        return DisposableHelper.replace(this.resource, disposable);
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
        SubscriptionHelper.deferredRequest(this.actual, this, j10);
    }

    public boolean setResource(Disposable disposable) {
        return DisposableHelper.set(this.resource, disposable);
    }

    public void setSubscription(InterfaceC8990d interfaceC8990d) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, interfaceC8990d);
    }

    public AsyncSubscription(Disposable disposable) {
        this();
        this.resource.lazySet(disposable);
    }
}

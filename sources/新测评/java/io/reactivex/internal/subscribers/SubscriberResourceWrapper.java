package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, InterfaceC8990d {
    private static final long serialVersionUID = -8612022020200669122L;
    final InterfaceC8989c downstream;
    final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(InterfaceC8989c interfaceC8989c) {
        this.downstream = interfaceC8989c;
    }

    @Override // p215q9.InterfaceC8990d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onNext(T t10) {
        this.downstream.onNext(t10);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC8990d)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p215q9.InterfaceC8990d
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            this.upstream.get().request(j10);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}

package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, InterfaceC0051d {
    private static final long serialVersionUID = -8612022020200669122L;
    final InterfaceC0050c downstream;
    final AtomicReference<InterfaceC0051d> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(InterfaceC0050c interfaceC0050c) {
        this.downstream = interfaceC0050c;
    }

    @Override // p010a9.InterfaceC0051d
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

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onNext(T t9) {
        this.downstream.onNext(t9);
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public void onSubscribe(InterfaceC0051d interfaceC0051d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC0051d)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p010a9.InterfaceC0051d
    public void request(long j9) {
        if (SubscriptionHelper.validate(j9)) {
            this.upstream.get().request(j9);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}

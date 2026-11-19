package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onNext(Object obj);

    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public final void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (EndConsumerHelper.setOnce(this.upstream, interfaceC8990d, getClass())) {
            onStart();
        }
    }

    public final void request(long j10) {
        this.upstream.get().request(j10);
    }
}

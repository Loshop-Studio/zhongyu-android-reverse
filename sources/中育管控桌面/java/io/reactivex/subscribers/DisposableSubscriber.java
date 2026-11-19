package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    final AtomicReference<InterfaceC7918d> upstream = new AtomicReference<>();

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

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onNext(Object obj);

    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public final void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (EndConsumerHelper.setOnce(this.upstream, interfaceC7918d, getClass())) {
            onStart();
        }
    }

    public final void request(long j6) {
        this.upstream.get().request(j6);
    }
}

package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    InterfaceC8990d upstream;

    public final void cancel() {
        InterfaceC8990d interfaceC8990d = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        interfaceC8990d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public abstract /* synthetic */ void onNext(Object obj);

    public void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
    public final void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (EndConsumerHelper.validate(this.upstream, interfaceC8990d, getClass())) {
            this.upstream = interfaceC8990d;
            onStart();
        }
    }

    public final void request(long j10) {
        InterfaceC8990d interfaceC8990d = this.upstream;
        if (interfaceC8990d != null) {
            interfaceC8990d.request(j10);
        }
    }
}

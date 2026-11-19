package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    InterfaceC7918d upstream;

    public final void cancel() {
        InterfaceC7918d interfaceC7918d = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        interfaceC7918d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public abstract /* synthetic */ void onNext(Object obj);

    public void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
    public final void onSubscribe(InterfaceC7918d interfaceC7918d) {
        if (EndConsumerHelper.validate(this.upstream, interfaceC7918d, getClass())) {
            this.upstream = interfaceC7918d;
            onStart();
        }
    }

    public final void request(long j6) {
        InterfaceC7918d interfaceC7918d = this.upstream;
        if (interfaceC7918d != null) {
            interfaceC7918d.request(j6);
        }
    }
}

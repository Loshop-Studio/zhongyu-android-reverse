package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    InterfaceC0051d upstream;

    public final void cancel() {
        InterfaceC0051d interfaceC0051d = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        interfaceC0051d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public abstract /* synthetic */ void onNext(Object obj);

    public void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
    public final void onSubscribe(InterfaceC0051d interfaceC0051d) {
        if (EndConsumerHelper.validate(this.upstream, interfaceC0051d, getClass())) {
            this.upstream = interfaceC0051d;
            onStart();
        }
    }

    public final void request(long j9) {
        InterfaceC0051d interfaceC0051d = this.upstream;
        if (interfaceC0051d != null) {
            interfaceC0051d.request(j9);
        }
    }
}

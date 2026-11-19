package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected InterfaceC8990d upstream;

    public DeferredScalarSubscriber(InterfaceC8989c interfaceC8989c) {
        super(interfaceC8989c);
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    public abstract /* synthetic */ void onNext(Object obj);

    public void onSubscribe(InterfaceC8990d interfaceC8990d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
            this.upstream = interfaceC8990d;
            this.downstream.onSubscribe(this);
            interfaceC8990d.request(Long.MAX_VALUE);
        }
    }
}

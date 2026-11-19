package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC8988b other;

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        final InterfaceC8989c downstream;
        final InterfaceC8988b other;
        boolean empty = true;
        final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b) {
            this.downstream = interfaceC8989c;
            this.other = interfaceC8988b;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (!this.empty) {
                this.downstream.onComplete();
            } else {
                this.empty = false;
                this.other.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            this.arbiter.setSubscription(interfaceC8990d);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, InterfaceC8988b interfaceC8988b) {
        super(flowable);
        this.other = interfaceC8988b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(interfaceC8989c, this.other);
        interfaceC8989c.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}

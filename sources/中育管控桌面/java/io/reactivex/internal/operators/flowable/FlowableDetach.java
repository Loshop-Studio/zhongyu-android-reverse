package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EmptyComponent;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DetachSubscriber<T> implements FlowableSubscriber<T>, InterfaceC7918d {
        InterfaceC7917c downstream;
        InterfaceC7918d upstream;

        public DetachSubscriber(InterfaceC7917c interfaceC7917c) {
            this.downstream = interfaceC7917c;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            InterfaceC7918d interfaceC7918d = this.upstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            interfaceC7918d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            InterfaceC7917c interfaceC7917c = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            interfaceC7917c.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            InterfaceC7917c interfaceC7917c = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asSubscriber();
            interfaceC7917c.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            this.upstream.request(j6);
        }
    }

    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new DetachSubscriber(interfaceC7917c));
    }
}

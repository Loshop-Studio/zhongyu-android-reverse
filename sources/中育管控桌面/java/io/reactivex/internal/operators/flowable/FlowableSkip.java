package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f8447n;

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, InterfaceC7918d {
        final InterfaceC7917c downstream;
        long remaining;
        InterfaceC7918d upstream;

        public SkipSubscriber(InterfaceC7917c interfaceC7917c, long j6) {
            this.downstream = interfaceC7917c;
            this.remaining = j6;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            long j6 = this.remaining;
            if (j6 != 0) {
                this.remaining = j6 - 1;
            } else {
                this.downstream.onNext(t6);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                long j6 = this.remaining;
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(j6);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            this.upstream.request(j6);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j6) {
        super(flowable);
        this.f8447n = j6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new SkipSubscriber(interfaceC7917c, this.f8447n));
    }
}

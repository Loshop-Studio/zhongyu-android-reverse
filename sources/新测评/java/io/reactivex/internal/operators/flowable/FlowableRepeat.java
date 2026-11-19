package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC8989c downstream;
        long produced;
        long remaining;

        /* renamed from: sa */
        final SubscriptionArbiter f13316sa;
        final InterfaceC8988b source;

        public RepeatSubscriber(InterfaceC8989c interfaceC8989c, long j10, SubscriptionArbiter subscriptionArbiter, InterfaceC8988b interfaceC8988b) {
            this.downstream = interfaceC8989c;
            this.f13316sa = subscriptionArbiter;
            this.source = interfaceC8988b;
            this.remaining = j10;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            long j10 = this.remaining;
            if (j10 != Long.MAX_VALUE) {
                this.remaining = j10 - 1;
            }
            if (j10 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            this.f13316sa.setSubscription(interfaceC8990d);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f13316sa.isCancelled()) {
                    long j10 = this.produced;
                    if (j10 != 0) {
                        this.produced = 0L;
                        this.f13316sa.produced(j10);
                    }
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    public FlowableRepeat(Flowable<T> flowable, long j10) {
        super(flowable);
        this.count = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        interfaceC8989c.onSubscribe(subscriptionArbiter);
        long j10 = this.count;
        new RepeatSubscriber(interfaceC8989c, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).subscribeNext();
    }
}

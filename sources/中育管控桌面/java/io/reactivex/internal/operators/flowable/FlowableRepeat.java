package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC7917c downstream;
        long produced;
        long remaining;

        /* renamed from: sa */
        final SubscriptionArbiter f8438sa;
        final InterfaceC7916b source;

        public RepeatSubscriber(InterfaceC7917c interfaceC7917c, long j6, SubscriptionArbiter subscriptionArbiter, InterfaceC7916b interfaceC7916b) {
            this.downstream = interfaceC7917c;
            this.f8438sa = subscriptionArbiter;
            this.source = interfaceC7916b;
            this.remaining = j6;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            long j6 = this.remaining;
            if (j6 != Long.MAX_VALUE) {
                this.remaining = j6 - 1;
            }
            if (j6 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.produced++;
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            this.f8438sa.setSubscription(interfaceC7918d);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f8438sa.isCancelled()) {
                    long j6 = this.produced;
                    if (j6 != 0) {
                        this.produced = 0L;
                        this.f8438sa.produced(j6);
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

    public FlowableRepeat(Flowable<T> flowable, long j6) {
        super(flowable);
        this.count = j6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        interfaceC7917c.onSubscribe(subscriptionArbiter);
        long j6 = this.count;
        new RepeatSubscriber(interfaceC7917c, j6 != Long.MAX_VALUE ? j6 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).subscribeNext();
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC0050c downstream;
        long produced;
        long remaining;

        /* renamed from: sa */
        final SubscriptionArbiter f14130sa;
        final InterfaceC0049b source;

        public RepeatSubscriber(InterfaceC0050c interfaceC0050c, long j9, SubscriptionArbiter subscriptionArbiter, InterfaceC0049b interfaceC0049b) {
            this.downstream = interfaceC0050c;
            this.f14130sa = subscriptionArbiter;
            this.source = interfaceC0049b;
            this.remaining = j9;
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            long j9 = this.remaining;
            if (j9 != Long.MAX_VALUE) {
                this.remaining = j9 - 1;
            }
            if (j9 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.produced++;
            this.downstream.onNext(t9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            this.f14130sa.setSubscription(interfaceC0051d);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f14130sa.isCancelled()) {
                    long j9 = this.produced;
                    if (j9 != 0) {
                        this.produced = 0L;
                        this.f14130sa.produced(j9);
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

    public FlowableRepeat(Flowable<T> flowable, long j9) {
        super(flowable);
        this.count = j9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        interfaceC0050c.onSubscribe(subscriptionArbiter);
        long j9 = this.count;
        new RepeatSubscriber(interfaceC0050c, j9 != Long.MAX_VALUE ? j9 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).subscribeNext();
    }
}

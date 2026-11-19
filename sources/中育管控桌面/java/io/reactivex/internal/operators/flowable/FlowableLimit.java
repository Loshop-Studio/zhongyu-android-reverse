package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f8436n;

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = 2288246011222124525L;
        final InterfaceC7917c downstream;
        long remaining;
        InterfaceC7918d upstream;

        public LimitSubscriber(InterfaceC7917c interfaceC7917c, long j6) {
            this.downstream = interfaceC7917c;
            this.remaining = j6;
            lazySet(j6);
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            long j6 = this.remaining;
            if (j6 > 0) {
                long j7 = j6 - 1;
                this.remaining = j7;
                this.downstream.onNext(t6);
                if (j7 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                if (this.remaining == 0) {
                    interfaceC7918d.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = interfaceC7918d;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            long j7;
            long j8;
            if (SubscriptionHelper.validate(j6)) {
                do {
                    j7 = get();
                    if (j7 == 0) {
                        return;
                    } else {
                        j8 = j7 <= j6 ? j7 : j6;
                    }
                } while (!compareAndSet(j7, j7 - j8));
                this.upstream.request(j8);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j6) {
        super(flowable);
        this.f8436n = j6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(interfaceC7917c, this.f8436n));
    }
}

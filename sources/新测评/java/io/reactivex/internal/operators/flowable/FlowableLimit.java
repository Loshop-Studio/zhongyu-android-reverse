package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f13314n;

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = 2288246011222124525L;
        final InterfaceC8989c downstream;
        long remaining;
        InterfaceC8990d upstream;

        public LimitSubscriber(InterfaceC8989c interfaceC8989c, long j10) {
            this.downstream = interfaceC8989c;
            this.remaining = j10;
            lazySet(j10);
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            long j10 = this.remaining;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.remaining = j11;
                this.downstream.onNext(t10);
                if (j11 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                if (this.remaining == 0) {
                    interfaceC8990d.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = interfaceC8990d;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == 0) {
                        return;
                    } else {
                        j12 = j11 <= j10 ? j11 : j10;
                    }
                } while (!compareAndSet(j11, j11 - j12));
                this.upstream.request(j12);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j10) {
        super(flowable);
        this.f13314n = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(interfaceC8989c, this.f13314n));
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f14128n;

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = 2288246011222124525L;
        final InterfaceC0050c downstream;
        long remaining;
        InterfaceC0051d upstream;

        public LimitSubscriber(InterfaceC0050c interfaceC0050c, long j9) {
            this.downstream = interfaceC0050c;
            this.remaining = j9;
            lazySet(j9);
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            long j9 = this.remaining;
            if (j9 > 0) {
                long j10 = j9 - 1;
                this.remaining = j10;
                this.downstream.onNext(t9);
                if (j10 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                if (this.remaining == 0) {
                    interfaceC0051d.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = interfaceC0051d;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            long j10;
            long j11;
            if (SubscriptionHelper.validate(j9)) {
                do {
                    j10 = get();
                    if (j10 == 0) {
                        return;
                    } else {
                        j11 = j10 <= j9 ? j10 : j9;
                    }
                } while (!compareAndSet(j10, j10 - j11));
                this.upstream.request(j11);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j9) {
        super(flowable);
        this.f14128n = j9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(interfaceC0050c, this.f14128n));
    }
}

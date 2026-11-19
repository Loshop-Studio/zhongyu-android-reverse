package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final InterfaceC7917c downstream;
        final long limit;
        long remaining;
        InterfaceC7918d upstream;

        public TakeSubscriber(InterfaceC7917c interfaceC7917c, long j6) {
            this.downstream = interfaceC7917c;
            this.limit = j6;
            this.remaining = j6;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (this.done) {
                return;
            }
            long j6 = this.remaining;
            long j7 = j6 - 1;
            this.remaining = j7;
            if (j6 > 0) {
                boolean z6 = j7 == 0;
                this.downstream.onNext(t6);
                if (z6) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                if (this.limit != 0) {
                    this.downstream.onSubscribe(this);
                    return;
                }
                interfaceC7918d.cancel();
                this.done = true;
                EmptySubscription.complete(this.downstream);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                if (get() || !compareAndSet(false, true) || j6 < this.limit) {
                    this.upstream.request(j6);
                } else {
                    this.upstream.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j6) {
        super(flowable);
        this.limit = j6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(interfaceC7917c, this.limit));
    }
}

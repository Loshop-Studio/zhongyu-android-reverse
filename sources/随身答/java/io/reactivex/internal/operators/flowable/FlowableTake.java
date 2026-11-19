package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final InterfaceC0050c downstream;
        final long limit;
        long remaining;
        InterfaceC0051d upstream;

        public TakeSubscriber(InterfaceC0050c interfaceC0050c, long j9) {
            this.downstream = interfaceC0050c;
            this.limit = j9;
            this.remaining = j9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            long j9 = this.remaining;
            long j10 = j9 - 1;
            this.remaining = j10;
            if (j9 > 0) {
                boolean z9 = j10 == 0;
                this.downstream.onNext(t9);
                if (z9) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                if (this.limit != 0) {
                    this.downstream.onSubscribe(this);
                    return;
                }
                interfaceC0051d.cancel();
                this.done = true;
                EmptySubscription.complete(this.downstream);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                if (get() || !compareAndSet(false, true) || j9 < this.limit) {
                    this.upstream.request(j9);
                } else {
                    this.upstream.request(Long.MAX_VALUE);
                }
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j9) {
        super(flowable);
        this.limit = j9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(interfaceC0050c, this.limit));
    }
}

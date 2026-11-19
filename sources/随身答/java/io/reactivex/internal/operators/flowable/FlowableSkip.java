package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f14139n;

    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, InterfaceC0051d {
        final InterfaceC0050c downstream;
        long remaining;
        InterfaceC0051d upstream;

        public SkipSubscriber(InterfaceC0050c interfaceC0050c, long j9) {
            this.downstream = interfaceC0050c;
            this.remaining = j9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            long j9 = this.remaining;
            if (j9 != 0) {
                this.remaining = j9 - 1;
            } else {
                this.downstream.onNext(t9);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                long j9 = this.remaining;
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(j9);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            this.upstream.request(j9);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j9) {
        super(flowable);
        this.f14139n = j9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new SkipSubscriber(interfaceC0050c, this.f14139n));
    }
}

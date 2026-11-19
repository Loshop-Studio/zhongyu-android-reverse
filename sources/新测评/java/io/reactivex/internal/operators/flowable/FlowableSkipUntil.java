package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC8988b other;

    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -6270983465606289181L;
        final InterfaceC8989c downstream;
        volatile boolean gate;
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final SkipUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onComplete() {
                SkipUntilMainSubscriber.this.gate = true;
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onError(Throwable th) {
                SubscriptionHelper.cancel(SkipUntilMainSubscriber.this.upstream);
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                HalfSerializer.onError(skipUntilMainSubscriber.downstream, th, skipUntilMainSubscriber, skipUntilMainSubscriber.error);
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onNext(Object obj) {
                SkipUntilMainSubscriber.this.gate = true;
                get().cancel();
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onSubscribe(InterfaceC8990d interfaceC8990d) {
                SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
            }
        }

        public SkipUntilMainSubscriber(InterfaceC8989c interfaceC8989c) {
            this.downstream = interfaceC8989c;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onError(this.downstream, th, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC8990d);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t10) {
            if (!this.gate) {
                return false;
            }
            HalfSerializer.onNext(this.downstream, t10, this, this.error);
            return true;
        }
    }

    public FlowableSkipUntil(Flowable<T> flowable, InterfaceC8988b interfaceC8988b) {
        super(flowable);
        this.other = interfaceC8988b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SkipUntilMainSubscriber skipUntilMainSubscriber = new SkipUntilMainSubscriber(interfaceC8989c);
        interfaceC8989c.onSubscribe(skipUntilMainSubscriber);
        this.other.subscribe(skipUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber) skipUntilMainSubscriber);
    }
}

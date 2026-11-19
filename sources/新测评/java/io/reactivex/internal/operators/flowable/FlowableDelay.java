package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, InterfaceC8990d {
        final long delay;
        final boolean delayError;
        final InterfaceC8989c downstream;
        final TimeUnit unit;
        InterfaceC8990d upstream;

        /* renamed from: w */
        final Scheduler.Worker f13306w;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f13306w.dispose();
                }
            }
        }

        public final class OnError implements Runnable {

            /* renamed from: t */
            private final Throwable f13307t;

            public OnError(Throwable th) {
                this.f13307t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f13307t);
                } finally {
                    DelaySubscriber.this.f13306w.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* renamed from: t */
            private final T f13308t;

            public OnNext(T t10) {
                this.f13308t = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f13308t);
            }
        }

        public DelaySubscriber(InterfaceC8989c interfaceC8989c, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z9) {
            this.downstream = interfaceC8989c;
            this.delay = j10;
            this.unit = timeUnit;
            this.f13306w = worker;
            this.delayError = z9;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.cancel();
            this.f13306w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.f13306w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.f13306w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.f13306w.schedule(new OnNext(t10), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            this.upstream.request(j10);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.delay = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? interfaceC8989c : new SerializedSubscriber(interfaceC8989c), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}

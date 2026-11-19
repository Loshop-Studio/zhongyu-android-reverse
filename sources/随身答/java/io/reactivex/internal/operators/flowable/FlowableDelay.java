package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, InterfaceC0051d {
        final long delay;
        final boolean delayError;
        final InterfaceC0050c downstream;
        final TimeUnit unit;
        InterfaceC0051d upstream;

        /* renamed from: w */
        final Scheduler.Worker f14120w;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f14120w.dispose();
                }
            }
        }

        public final class OnError implements Runnable {

            /* renamed from: t */
            private final Throwable f14121t;

            public OnError(Throwable th) {
                this.f14121t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f14121t);
                } finally {
                    DelaySubscriber.this.f14120w.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* renamed from: t */
            private final T f14122t;

            public OnNext(T t9) {
                this.f14122t = t9;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f14122t);
            }
        }

        public DelaySubscriber(InterfaceC0050c interfaceC0050c, long j9, TimeUnit timeUnit, Scheduler.Worker worker, boolean z9) {
            this.downstream = interfaceC0050c;
            this.delay = j9;
            this.unit = timeUnit;
            this.f14120w = worker;
            this.delayError = z9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.cancel();
            this.f14120w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.f14120w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.f14120w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.f14120w.schedule(new OnNext(t9), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            this.upstream.request(j9);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j9, TimeUnit timeUnit, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.delay = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? interfaceC0050c : new SerializedSubscriber(interfaceC0050c), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}

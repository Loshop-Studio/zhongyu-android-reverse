package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, InterfaceC7918d {
        final long delay;
        final boolean delayError;
        final InterfaceC7917c downstream;
        final TimeUnit unit;
        InterfaceC7918d upstream;

        /* renamed from: w */
        final Scheduler.Worker f8428w;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f8428w.dispose();
                }
            }
        }

        public final class OnError implements Runnable {

            /* renamed from: t */
            private final Throwable f8429t;

            public OnError(Throwable th) {
                this.f8429t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f8429t);
                } finally {
                    DelaySubscriber.this.f8428w.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* renamed from: t */
            private final T f8430t;

            public OnNext(T t6) {
                this.f8430t = t6;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f8430t);
            }
        }

        public DelaySubscriber(InterfaceC7917c interfaceC7917c, long j6, TimeUnit timeUnit, Scheduler.Worker worker, boolean z6) {
            this.downstream = interfaceC7917c;
            this.delay = j6;
            this.unit = timeUnit;
            this.f8428w = worker;
            this.delayError = z6;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.upstream.cancel();
            this.f8428w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.f8428w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.f8428w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.f8428w.schedule(new OnNext(t6), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            this.upstream.request(j6);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j6, TimeUnit timeUnit, Scheduler scheduler, boolean z6) {
        super(flowable);
        this.delay = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? interfaceC7917c : new SerializedSubscriber(interfaceC7917c), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}

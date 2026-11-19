package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, InterfaceC0051d {
        final InterfaceC0050c downstream;
        long lastTime;
        final Scheduler scheduler;
        final TimeUnit unit;
        InterfaceC0051d upstream;

        public TimeIntervalSubscriber(InterfaceC0050c interfaceC0050c, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = interfaceC0050c;
            this.scheduler = scheduler;
            this.unit = timeUnit;
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
            long jNow = this.scheduler.now(this.unit);
            long j9 = this.lastTime;
            this.lastTime = jNow;
            this.downstream.onNext(new Timed(t9, jNow - j9, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            this.upstream.request(j9);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(interfaceC0050c, this.unit, this.scheduler));
    }
}

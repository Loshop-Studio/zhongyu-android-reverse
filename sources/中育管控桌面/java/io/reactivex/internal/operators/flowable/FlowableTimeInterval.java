package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, InterfaceC7918d {
        final InterfaceC7917c downstream;
        long lastTime;
        final Scheduler scheduler;
        final TimeUnit unit;
        InterfaceC7918d upstream;

        public TimeIntervalSubscriber(InterfaceC7917c interfaceC7917c, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = interfaceC7917c;
            this.scheduler = scheduler;
            this.unit = timeUnit;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            long jNow = this.scheduler.now(this.unit);
            long j6 = this.lastTime;
            this.lastTime = jNow;
            this.downstream.onNext(new Timed(t6, jNow - j6, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            this.upstream.request(j6);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(interfaceC7917c, this.unit, this.scheduler));
    }
}

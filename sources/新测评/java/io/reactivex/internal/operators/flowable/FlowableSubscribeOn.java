package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final InterfaceC8989c downstream;
        final boolean nonScheduledRequests;
        InterfaceC8988b source;
        final Scheduler.Worker worker;
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public static final class Request implements Runnable {

            /* renamed from: n */
            final long f13326n;
            final InterfaceC8990d upstream;

            public Request(InterfaceC8990d interfaceC8990d, long j10) {
                this.upstream = interfaceC8990d;
                this.f13326n = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f13326n);
            }
        }

        public SubscribeOnSubscriber(InterfaceC8989c interfaceC8989c, Scheduler.Worker worker, InterfaceC8988b interfaceC8988b, boolean z9) {
            this.downstream = interfaceC8989c;
            this.worker = worker;
            this.source = interfaceC8988b;
            this.nonScheduledRequests = !z9;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC8990d)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, interfaceC8990d);
                }
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                InterfaceC8990d interfaceC8990d = this.upstream.get();
                if (interfaceC8990d != null) {
                    requestUpstream(j10, interfaceC8990d);
                    return;
                }
                BackpressureHelper.add(this.requested, j10);
                InterfaceC8990d interfaceC8990d2 = this.upstream.get();
                if (interfaceC8990d2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, interfaceC8990d2);
                    }
                }
            }
        }

        public void requestUpstream(long j10, InterfaceC8990d interfaceC8990d) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                interfaceC8990d.request(j10);
            } else {
                this.worker.schedule(new Request(interfaceC8990d, j10));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC8988b interfaceC8988b = this.source;
            this.source = null;
            interfaceC8988b.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(interfaceC8989c, workerCreateWorker, this.source, this.nonScheduledRequests);
        interfaceC8989c.onSubscribe(subscribeOnSubscriber);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }
}

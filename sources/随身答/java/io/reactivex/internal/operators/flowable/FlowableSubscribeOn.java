package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, InterfaceC0051d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final InterfaceC0050c downstream;
        final boolean nonScheduledRequests;
        InterfaceC0049b source;
        final Scheduler.Worker worker;
        final AtomicReference<InterfaceC0051d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public static final class Request implements Runnable {

            /* renamed from: n */
            final long f14140n;
            final InterfaceC0051d upstream;

            public Request(InterfaceC0051d interfaceC0051d, long j9) {
                this.upstream = interfaceC0051d;
                this.f14140n = j9;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f14140n);
            }
        }

        public SubscribeOnSubscriber(InterfaceC0050c interfaceC0050c, Scheduler.Worker worker, InterfaceC0049b interfaceC0049b, boolean z9) {
            this.downstream = interfaceC0050c;
            this.worker = worker;
            this.source = interfaceC0049b;
            this.nonScheduledRequests = !z9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.downstream.onNext(t9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC0051d)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, interfaceC0051d);
                }
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                InterfaceC0051d interfaceC0051d = this.upstream.get();
                if (interfaceC0051d != null) {
                    requestUpstream(j9, interfaceC0051d);
                    return;
                }
                BackpressureHelper.add(this.requested, j9);
                InterfaceC0051d interfaceC0051d2 = this.upstream.get();
                if (interfaceC0051d2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, interfaceC0051d2);
                    }
                }
            }
        }

        public void requestUpstream(long j9, InterfaceC0051d interfaceC0051d) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                interfaceC0051d.request(j9);
            } else {
                this.worker.schedule(new Request(interfaceC0051d, j9));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC0049b interfaceC0049b = this.source;
            this.source = null;
            interfaceC0049b.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(interfaceC0050c, workerCreateWorker, this.source, this.nonScheduledRequests);
        interfaceC0050c.onSubscribe(subscribeOnSubscriber);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }
}

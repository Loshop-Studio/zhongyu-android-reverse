package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, InterfaceC7918d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final InterfaceC7917c downstream;
        final boolean nonScheduledRequests;
        InterfaceC7916b source;
        final Scheduler.Worker worker;
        final AtomicReference<InterfaceC7918d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public static final class Request implements Runnable {

            /* renamed from: n */
            final long f8448n;
            final InterfaceC7918d upstream;

            public Request(InterfaceC7918d interfaceC7918d, long j6) {
                this.upstream = interfaceC7918d;
                this.f8448n = j6;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f8448n);
            }
        }

        public SubscribeOnSubscriber(InterfaceC7917c interfaceC7917c, Scheduler.Worker worker, InterfaceC7916b interfaceC7916b, boolean z6) {
            this.downstream = interfaceC7917c;
            this.worker = worker;
            this.source = interfaceC7916b;
            this.nonScheduledRequests = !z6;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC7918d)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, interfaceC7918d);
                }
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                InterfaceC7918d interfaceC7918d = this.upstream.get();
                if (interfaceC7918d != null) {
                    requestUpstream(j6, interfaceC7918d);
                    return;
                }
                BackpressureHelper.add(this.requested, j6);
                InterfaceC7918d interfaceC7918d2 = this.upstream.get();
                if (interfaceC7918d2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, interfaceC7918d2);
                    }
                }
            }
        }

        public void requestUpstream(long j6, InterfaceC7918d interfaceC7918d) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                interfaceC7918d.request(j6);
            } else {
                this.worker.schedule(new Request(interfaceC7918d, j6));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC7916b interfaceC7916b = this.source;
            this.source = null;
            interfaceC7916b.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z6) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(interfaceC7917c, workerCreateWorker, this.source, this.nonScheduledRequests);
        interfaceC7917c.onSubscribe(subscribeOnSubscriber);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }
}

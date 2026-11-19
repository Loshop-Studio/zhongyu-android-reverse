package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC0050c downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        InterfaceC0051d upstream;
        final Scheduler.Worker worker;

        public ThrottleLatestSubscriber(InterfaceC0050c interfaceC0050c, long j9, TimeUnit timeUnit, Scheduler.Worker worker, boolean z9) {
            this.downstream = interfaceC0050c;
            this.timeout = j9;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z9;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.latest;
            AtomicLong atomicLong = this.requested;
            InterfaceC0050c interfaceC0050c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z9 = this.done;
                if (z9 && this.error != null) {
                    atomicReference.lazySet(null);
                    interfaceC0050c.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z10 = atomicReference.get() == null;
                if (z9) {
                    if (z10 || !this.emitLast) {
                        atomicReference.lazySet(null);
                        interfaceC0050c.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j9 = this.emitted;
                        if (j9 != atomicLong.get()) {
                            this.emitted = j9 + 1;
                            interfaceC0050c.onNext(andSet);
                            interfaceC0050c.onComplete();
                        } else {
                            interfaceC0050c.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.worker.dispose();
                    return;
                }
                if (z10) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j10 = this.emitted;
                    if (j10 == atomicLong.get()) {
                        this.upstream.cancel();
                        interfaceC0050c.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.worker.dispose();
                        return;
                    } else {
                        interfaceC0050c.onNext(andSet2);
                        this.emitted = j10 + 1;
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.schedule(this, this.timeout, this.unit);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.latest.set(t9);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(Long.MAX_VALUE);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this.requested, j9);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j9, TimeUnit timeUnit, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.timeout = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new ThrottleLatestSubscriber(interfaceC0050c, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }
}

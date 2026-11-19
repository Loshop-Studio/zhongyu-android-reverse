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
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC8989c downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        InterfaceC8990d upstream;
        final Scheduler.Worker worker;

        public ThrottleLatestSubscriber(InterfaceC8989c interfaceC8989c, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z9) {
            this.downstream = interfaceC8989c;
            this.timeout = j10;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z9;
        }

        @Override // p215q9.InterfaceC8990d
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
            InterfaceC8989c interfaceC8989c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z9 = this.done;
                if (z9 && this.error != null) {
                    atomicReference.lazySet(null);
                    interfaceC8989c.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z10 = atomicReference.get() == null;
                if (z9) {
                    if (z10 || !this.emitLast) {
                        atomicReference.lazySet(null);
                        interfaceC8989c.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j10 = this.emitted;
                        if (j10 != atomicLong.get()) {
                            this.emitted = j10 + 1;
                            interfaceC8989c.onNext(andSet);
                            interfaceC8989c.onComplete();
                        } else {
                            interfaceC8989c.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
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
                    long j11 = this.emitted;
                    if (j11 == atomicLong.get()) {
                        this.upstream.cancel();
                        interfaceC8989c.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.worker.dispose();
                        return;
                    } else {
                        interfaceC8989c.onNext(andSet2);
                        this.emitted = j11 + 1;
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.latest.set(t10);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(Long.MAX_VALUE);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.timeout = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new ThrottleLatestSubscriber(interfaceC8989c, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }
}

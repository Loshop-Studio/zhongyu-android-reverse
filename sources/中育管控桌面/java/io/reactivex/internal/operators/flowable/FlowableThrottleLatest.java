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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC7918d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC7917c downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        InterfaceC7918d upstream;
        final Scheduler.Worker worker;

        public ThrottleLatestSubscriber(InterfaceC7917c interfaceC7917c, long j6, TimeUnit timeUnit, Scheduler.Worker worker, boolean z6) {
            this.downstream = interfaceC7917c;
            this.timeout = j6;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z6;
        }

        @Override // p193y5.InterfaceC7918d
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
            InterfaceC7917c interfaceC7917c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z6 = this.done;
                if (z6 && this.error != null) {
                    atomicReference.lazySet(null);
                    interfaceC7917c.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z7 = atomicReference.get() == null;
                if (z6) {
                    if (z7 || !this.emitLast) {
                        atomicReference.lazySet(null);
                        interfaceC7917c.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j6 = this.emitted;
                        if (j6 != atomicLong.get()) {
                            this.emitted = j6 + 1;
                            interfaceC7917c.onNext(andSet);
                            interfaceC7917c.onComplete();
                        } else {
                            interfaceC7917c.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.worker.dispose();
                    return;
                }
                if (z7) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j7 = this.emitted;
                    if (j7 == atomicLong.get()) {
                        this.upstream.cancel();
                        interfaceC7917c.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.worker.dispose();
                        return;
                    } else {
                        interfaceC7917c.onNext(andSet2);
                        this.emitted = j7 + 1;
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.latest.set(t6);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(Long.MAX_VALUE);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                BackpressureHelper.add(this.requested, j6);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j6, TimeUnit timeUnit, Scheduler scheduler, boolean z6) {
        super(flowable);
        this.timeout = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new ThrottleLatestSubscriber(interfaceC7917c, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }
}

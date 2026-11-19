package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC8989c downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        InterfaceC8990d upstream;

        public TakeLastTimedSubscriber(InterfaceC8989c interfaceC8989c, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z9) {
            this.downstream = interfaceC8989c;
            this.count = j10;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.delayError = z9;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z9, InterfaceC8989c interfaceC8989c, boolean z10) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z10) {
                if (!z9) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    interfaceC8989c.onError(th);
                } else {
                    interfaceC8989c.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                interfaceC8989c.onError(th2);
                return true;
            }
            if (!z9) {
                return false;
            }
            interfaceC8989c.onComplete();
            return true;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z9 = this.delayError;
            int iAddAndGet = 1;
            do {
                if (this.done) {
                    if (checkTerminated(spscLinkedArrayQueue.isEmpty(), interfaceC8989c, z9)) {
                        return;
                    }
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        if (checkTerminated(spscLinkedArrayQueue.peek() == null, interfaceC8989c, z9)) {
                            return;
                        }
                        if (j10 != j11) {
                            spscLinkedArrayQueue.poll();
                            interfaceC8989c.onNext(spscLinkedArrayQueue.poll());
                            j11++;
                        } else if (j11 != 0) {
                            BackpressureHelper.produced(this.requested, j11);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            trim(this.scheduler.now(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.delayError) {
                trim(this.scheduler.now(this.unit), this.queue);
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long jNow = this.scheduler.now(this.unit);
            spscLinkedArrayQueue.offer(Long.valueOf(jNow), t10);
            trim(jNow, spscLinkedArrayQueue);
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
                drain();
            }
        }

        public void trim(long j10, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            long j11 = this.time;
            long j12 = this.count;
            boolean z9 = j12 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() >= j10 - j11 && (z9 || (spscLinkedArrayQueue.size() >> 1) <= j12)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z9) {
        super(flowable);
        this.count = j10;
        this.time = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i10;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new TakeLastTimedSubscriber(interfaceC8989c, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}

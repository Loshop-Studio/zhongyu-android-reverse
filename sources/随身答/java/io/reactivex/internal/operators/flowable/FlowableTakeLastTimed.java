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
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC0050c downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        InterfaceC0051d upstream;

        public TakeLastTimedSubscriber(InterfaceC0050c interfaceC0050c, long j9, long j10, TimeUnit timeUnit, Scheduler scheduler, int i9, boolean z9) {
            this.downstream = interfaceC0050c;
            this.count = j9;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i9);
            this.delayError = z9;
        }

        @Override // p010a9.InterfaceC0051d
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

        public boolean checkTerminated(boolean z9, InterfaceC0050c interfaceC0050c, boolean z10) {
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
                    interfaceC0050c.onError(th);
                } else {
                    interfaceC0050c.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                interfaceC0050c.onError(th2);
                return true;
            }
            if (!z9) {
                return false;
            }
            interfaceC0050c.onComplete();
            return true;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC0050c interfaceC0050c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z9 = this.delayError;
            int iAddAndGet = 1;
            do {
                if (this.done) {
                    if (checkTerminated(spscLinkedArrayQueue.isEmpty(), interfaceC0050c, z9)) {
                        return;
                    }
                    long j9 = this.requested.get();
                    long j10 = 0;
                    while (true) {
                        if (checkTerminated(spscLinkedArrayQueue.peek() == null, interfaceC0050c, z9)) {
                            return;
                        }
                        if (j9 != j10) {
                            spscLinkedArrayQueue.poll();
                            interfaceC0050c.onNext(spscLinkedArrayQueue.poll());
                            j10++;
                        } else if (j10 != 0) {
                            BackpressureHelper.produced(this.requested, j10);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            trim(this.scheduler.now(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.delayError) {
                trim(this.scheduler.now(this.unit), this.queue);
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long jNow = this.scheduler.now(this.unit);
            spscLinkedArrayQueue.offer(Long.valueOf(jNow), t9);
            trim(jNow, spscLinkedArrayQueue);
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
                drain();
            }
        }

        public void trim(long j9, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            long j10 = this.time;
            long j11 = this.count;
            boolean z9 = j11 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() >= j9 - j10 && (z9 || (spscLinkedArrayQueue.size() >> 1) <= j11)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j9, long j10, TimeUnit timeUnit, Scheduler scheduler, int i9, boolean z9) {
        super(flowable);
        this.count = j9;
        this.time = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i9;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new TakeLastTimedSubscriber(interfaceC0050c, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}

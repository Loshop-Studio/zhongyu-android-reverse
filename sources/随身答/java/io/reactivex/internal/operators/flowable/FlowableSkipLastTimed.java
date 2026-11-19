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
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
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

        public SkipLastTimedSubscriber(InterfaceC0050c interfaceC0050c, long j9, TimeUnit timeUnit, Scheduler scheduler, int i9, boolean z9) {
            this.downstream = interfaceC0050c;
            this.time = j9;
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

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c, boolean z11) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z9) {
                return false;
            }
            if (z11) {
                if (!z10) {
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
            if (!z10) {
                return false;
            }
            interfaceC0050c.onComplete();
            return true;
        }

        public void drain() {
            long j9;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC0050c interfaceC0050c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z9 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j10 = this.time;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        j9 = 0;
                        break;
                    }
                    boolean z10 = this.done;
                    Long l9 = (Long) spscLinkedArrayQueue.peek();
                    boolean z11 = l9 == null;
                    boolean z12 = (z11 || l9.longValue() <= scheduler.now(timeUnit) - j10) ? z11 : true;
                    j9 = 0;
                    if (checkTerminated(z10, z12, interfaceC0050c, z9)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    interfaceC0050c.onNext(spscLinkedArrayQueue.poll());
                    j12++;
                }
                if (j12 != j9) {
                    BackpressureHelper.produced(this.requested, j12);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
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
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t9);
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
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j9, TimeUnit timeUnit, Scheduler scheduler, int i9, boolean z9) {
        super(flowable);
        this.time = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i9;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(interfaceC0050c, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}

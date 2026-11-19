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
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
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

        public SkipLastTimedSubscriber(InterfaceC8989c interfaceC8989c, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z9) {
            this.downstream = interfaceC8989c;
            this.time = j10;
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

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC8989c interfaceC8989c, boolean z11) {
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
            if (!z10) {
                return false;
            }
            interfaceC8989c.onComplete();
            return true;
        }

        public void drain() {
            long j10;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC8989c interfaceC8989c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z9 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j11 = this.time;
            int iAddAndGet = 1;
            do {
                long j12 = this.requested.get();
                long j13 = 0;
                while (true) {
                    if (j13 == j12) {
                        j10 = 0;
                        break;
                    }
                    boolean z10 = this.done;
                    Long l10 = (Long) spscLinkedArrayQueue.peek();
                    boolean z11 = l10 == null;
                    boolean z12 = (z11 || l10.longValue() <= scheduler.now(timeUnit) - j11) ? z11 : true;
                    j10 = 0;
                    if (checkTerminated(z10, z12, interfaceC8989c, z9)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    interfaceC8989c.onNext(spscLinkedArrayQueue.poll());
                    j13++;
                }
                if (j13 != j10) {
                    BackpressureHelper.produced(this.requested, j13);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
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
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t10);
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
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z9) {
        super(flowable);
        this.time = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i10;
        this.delayError = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(interfaceC8989c, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}

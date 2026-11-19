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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC7917c downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        InterfaceC7918d upstream;

        public SkipLastTimedSubscriber(InterfaceC7917c interfaceC7917c, long j6, TimeUnit timeUnit, Scheduler scheduler, int i6, boolean z6) {
            this.downstream = interfaceC7917c;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i6);
            this.delayError = z6;
        }

        @Override // p193y5.InterfaceC7918d
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

        public boolean checkTerminated(boolean z6, boolean z7, InterfaceC7917c interfaceC7917c, boolean z8) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z6) {
                return false;
            }
            if (z8) {
                if (!z7) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    interfaceC7917c.onError(th);
                } else {
                    interfaceC7917c.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                interfaceC7917c.onError(th2);
                return true;
            }
            if (!z7) {
                return false;
            }
            interfaceC7917c.onComplete();
            return true;
        }

        public void drain() {
            long j6;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC7917c interfaceC7917c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z6 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j7 = this.time;
            int iAddAndGet = 1;
            do {
                long j8 = this.requested.get();
                long j9 = 0;
                while (true) {
                    if (j9 == j8) {
                        j6 = 0;
                        break;
                    }
                    boolean z7 = this.done;
                    Long l6 = (Long) spscLinkedArrayQueue.peek();
                    boolean z8 = l6 == null;
                    boolean z9 = (z8 || l6.longValue() <= scheduler.now(timeUnit) - j7) ? z8 : true;
                    j6 = 0;
                    if (checkTerminated(z7, z9, interfaceC7917c, z6)) {
                        return;
                    }
                    if (z9) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    interfaceC7917c.onNext(spscLinkedArrayQueue.poll());
                    j9++;
                }
                if (j9 != j6) {
                    BackpressureHelper.produced(this.requested, j9);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
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
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t6);
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
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j6, TimeUnit timeUnit, Scheduler scheduler, int i6, boolean z6) {
        super(flowable);
        this.time = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i6;
        this.delayError = z6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(interfaceC7917c, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}

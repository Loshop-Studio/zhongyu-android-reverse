package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Action onOverflow;
    final boolean unbounded;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC8989c downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC8990d upstream;

        public BackpressureBufferSubscriber(InterfaceC8989c interfaceC8989c, int i10, boolean z9, boolean z10, Action action) {
            this.downstream = interfaceC8989c;
            this.onOverflow = action;
            this.delayError = z10;
            this.queue = z9 ? new SpscLinkedArrayQueue<>(i10) : new SpscArrayQueue<>(i10);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
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

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC8989c interfaceC8989c) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z9) {
                return false;
            }
            if (this.delayError) {
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                InterfaceC8989c interfaceC8989c = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC8989c)) {
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z9 = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z10 = tPoll == null;
                        if (checkTerminated(z9, z10, interfaceC8989c)) {
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        interfaceC8989c.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC8989c)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.queue.offer(t10)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p215q9.InterfaceC8990d
        public void request(long j10) {
            if (this.outputFused || !SubscriptionHelper.validate(j10)) {
                return;
            }
            BackpressureHelper.add(this.requested, j10);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i10, boolean z9, boolean z10, Action action) {
        super(flowable);
        this.bufferSize = i10;
        this.unbounded = z9;
        this.delayError = z10;
        this.onOverflow = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(interfaceC8989c, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }
}

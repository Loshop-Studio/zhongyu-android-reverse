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
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

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
        final InterfaceC0050c downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC0051d upstream;

        public BackpressureBufferSubscriber(InterfaceC0050c interfaceC0050c, int i9, boolean z9, boolean z10, Action action) {
            this.downstream = interfaceC0050c;
            this.onOverflow = action;
            this.delayError = z10;
            this.queue = z9 ? new SpscLinkedArrayQueue<>(i9) : new SpscArrayQueue<>(i9);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
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

        public boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c) {
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                InterfaceC0050c interfaceC0050c = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC0050c)) {
                    long j9 = this.requested.get();
                    long j10 = 0;
                    while (j10 != j9) {
                        boolean z9 = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z10 = tPoll == null;
                        if (checkTerminated(z9, z10, interfaceC0050c)) {
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        interfaceC0050c.onNext(tPoll);
                        j10++;
                    }
                    if (j10 == j9 && checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC0050c)) {
                        return;
                    }
                    if (j10 != 0 && j9 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j10);
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.queue.offer(t9)) {
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void request(long j9) {
            if (this.outputFused || !SubscriptionHelper.validate(j9)) {
                return;
            }
            BackpressureHelper.add(this.requested, j9);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i9) {
            if ((i9 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i9, boolean z9, boolean z10, Action action) {
        super(flowable);
        this.bufferSize = i9;
        this.unbounded = z9;
        this.delayError = z10;
        this.onOverflow = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(interfaceC0050c, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }
}

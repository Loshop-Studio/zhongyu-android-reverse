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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
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
        final InterfaceC7917c downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC7918d upstream;

        public BackpressureBufferSubscriber(InterfaceC7917c interfaceC7917c, int i6, boolean z6, boolean z7, Action action) {
            this.downstream = interfaceC7917c;
            this.onOverflow = action;
            this.delayError = z7;
            this.queue = z6 ? new SpscLinkedArrayQueue<>(i6) : new SpscArrayQueue<>(i6);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        public boolean checkTerminated(boolean z6, boolean z7, InterfaceC7917c interfaceC7917c) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z6) {
                return false;
            }
            if (this.delayError) {
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                InterfaceC7917c interfaceC7917c = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC7917c)) {
                    long j6 = this.requested.get();
                    long j7 = 0;
                    while (j7 != j6) {
                        boolean z6 = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z7 = tPoll == null;
                        if (checkTerminated(z6, z7, interfaceC7917c)) {
                            return;
                        }
                        if (z7) {
                            break;
                        }
                        interfaceC7917c.onNext(tPoll);
                        j7++;
                    }
                    if (j7 == j6 && checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC7917c)) {
                        return;
                    }
                    if (j7 != 0 && j6 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j7);
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (this.queue.offer(t6)) {
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

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p193y5.InterfaceC7918d
        public void request(long j6) {
            if (this.outputFused || !SubscriptionHelper.validate(j6)) {
                return;
            }
            BackpressureHelper.add(this.requested, j6);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i6) {
            if ((i6 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i6, boolean z6, boolean z7, Action action) {
        super(flowable);
        this.bufferSize = i6;
        this.unbounded = z6;
        this.delayError = z7;
        this.onOverflow = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(interfaceC7917c, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }
}

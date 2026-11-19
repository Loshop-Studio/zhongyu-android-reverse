package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final int maxConcurrency;
    final int prefetch;

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d, InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final InterfaceC8989c downstream;
        final ErrorMode errorMode;
        final Function<? super T, ? extends InterfaceC8988b> mapper;
        final int maxConcurrency;
        final int prefetch;
        final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;
        InterfaceC8990d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function, int i10, int i11, ErrorMode errorMode) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
            this.maxConcurrency = i10;
            this.prefetch = i11;
            this.errorMode = errorMode;
            this.subscribers = new SpscLinkedArrayQueue<>(Math.min(i11, i10));
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            drainAndCancel();
        }

        public void cancelAll() {
            while (true) {
                InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.subscribers.poll();
                if (innerQueuedSubscriberPoll == null) {
                    return;
                } else {
                    innerQueuedSubscriberPoll.cancel();
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void drain() {
            InnerQueuedSubscriber<R> innerQueuedSubscriberPoll;
            long j10;
            long j11;
            boolean z9;
            SimpleQueue<R> simpleQueueQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            InterfaceC8989c interfaceC8989c = this.downstream;
            ErrorMode errorMode = this.errorMode;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.requested.get();
                if (innerQueuedSubscriber != null) {
                    innerQueuedSubscriberPoll = innerQueuedSubscriber;
                } else {
                    if (errorMode != ErrorMode.END && this.errors.get() != null) {
                        cancelAll();
                        interfaceC8989c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z10 = this.done;
                    innerQueuedSubscriberPoll = this.subscribers.poll();
                    if (z10 && innerQueuedSubscriberPoll == null) {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            interfaceC8989c.onError(thTerminate);
                            return;
                        } else {
                            interfaceC8989c.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriberPoll != null) {
                        this.current = innerQueuedSubscriberPoll;
                    }
                }
                if (innerQueuedSubscriberPoll == null || (simpleQueueQueue = innerQueuedSubscriberPoll.queue()) == null) {
                    j10 = 0;
                    j11 = 0;
                    z9 = false;
                } else {
                    j11 = 0;
                    while (true) {
                        if (j11 == j12) {
                            j10 = 0;
                            break;
                        }
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            interfaceC8989c.onError(this.errors.terminate());
                            return;
                        }
                        boolean zIsDone = innerQueuedSubscriberPoll.isDone();
                        j10 = 0;
                        try {
                            R rPoll = simpleQueueQueue.poll();
                            boolean z11 = rPoll == null;
                            if (zIsDone && z11) {
                                this.current = null;
                                this.upstream.request(1L);
                                innerQueuedSubscriberPoll = null;
                                z9 = true;
                                break;
                            }
                            if (z11) {
                                break;
                            }
                            interfaceC8989c.onNext(rPoll);
                            j11++;
                            innerQueuedSubscriberPoll.requestOne();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            interfaceC8989c.onError(th);
                            return;
                        }
                    }
                    z9 = false;
                    if (j11 == j12) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            interfaceC8989c.onError(this.errors.terminate());
                            return;
                        }
                        boolean zIsDone2 = innerQueuedSubscriberPoll.isDone();
                        boolean zIsEmpty = simpleQueueQueue.isEmpty();
                        if (zIsDone2 && zIsEmpty) {
                            this.current = null;
                            this.upstream.request(1L);
                            innerQueuedSubscriberPoll = null;
                            z9 = true;
                        }
                    }
                }
                if (j11 != j10 && j12 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                if (!z9 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    innerQueuedSubscriber = innerQueuedSubscriberPoll;
                }
            }
        }

        public void drainAndCancel() {
            if (getAndIncrement() == 0) {
                do {
                    cancelAll();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            innerQueuedSubscriber.setDone();
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r10) {
            if (innerQueuedSubscriber.queue().offer(r10)) {
                drain();
            } else {
                innerQueuedSubscriber.cancel();
                innerError(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            try {
                InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Publisher");
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
                if (this.cancelled) {
                    return;
                }
                this.subscribers.offer(innerQueuedSubscriber);
                interfaceC8988b.subscribe(innerQueuedSubscriber);
                if (this.cancelled) {
                    innerQueuedSubscriber.cancel();
                    drainAndCancel();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                int i10 = this.maxConcurrency;
                interfaceC8990d.request(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
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

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends InterfaceC8988b> function, int i10, int i11, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.maxConcurrency = i10;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapEagerDelayErrorSubscriber(interfaceC8989c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}

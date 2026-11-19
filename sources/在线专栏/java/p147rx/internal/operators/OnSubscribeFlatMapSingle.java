package p147rx.internal.operators;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func1;
import p147rx.internal.util.ExceptionsUtils;
import p147rx.internal.util.atomic.MpscLinkedAtomicQueue;
import p147rx.internal.util.unsafe.MpscLinkedQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;
import p147rx.plugins.RxJavaHooks;
import p147rx.subscriptions.CompositeSubscription;

/* loaded from: classes2.dex */
public final class OnSubscribeFlatMapSingle<T, R> implements Observable.OnSubscribe<R> {
    final boolean delayErrors;
    final Func1<? super T, ? extends Single<? extends R>> mapper;
    final int maxConcurrency;
    final Observable<T> source;

    static final class FlatMapSingleSubscriber<T, R> extends Subscriber<T> {
        final Subscriber<? super R> actual;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Func1<? super T, ? extends Single<? extends R>> mapper;
        final int maxConcurrency;
        final Queue<Object> queue;
        final AtomicInteger wip = new AtomicInteger();
        final AtomicReference<Throwable> errors = new AtomicReference<>();
        final FlatMapSingleSubscriber<T, R>.Requested requested = new Requested();
        final CompositeSubscription set = new CompositeSubscription();
        final AtomicInteger active = new AtomicInteger();

        final class InnerSubscriber extends SingleSubscriber<R> {
            InnerSubscriber() {
            }

            @Override // p147rx.SingleSubscriber
            public void onError(Throwable th) {
                FlatMapSingleSubscriber.this.innerError(this, th);
            }

            @Override // p147rx.SingleSubscriber
            public void onSuccess(R r3) {
                FlatMapSingleSubscriber.this.innerSuccess(this, r3);
            }
        }

        final class Requested extends AtomicLong implements Producer, Subscription {
            private static final long serialVersionUID = -887187595446742742L;

            Requested() {
            }

            @Override // p147rx.Subscription
            public boolean isUnsubscribed() {
                return FlatMapSingleSubscriber.this.cancelled;
            }

            void produced(long j4) {
                BackpressureUtils.produced(this, j4);
            }

            @Override // p147rx.Producer
            public void request(long j4) {
                if (j4 > 0) {
                    BackpressureUtils.getAndAddRequest(this, j4);
                    FlatMapSingleSubscriber.this.drain();
                }
            }

            @Override // p147rx.Subscription
            public void unsubscribe() {
                FlatMapSingleSubscriber.this.cancelled = true;
                FlatMapSingleSubscriber.this.unsubscribe();
                if (FlatMapSingleSubscriber.this.wip.getAndIncrement() == 0) {
                    FlatMapSingleSubscriber.this.queue.clear();
                }
            }
        }

        FlatMapSingleSubscriber(Subscriber<? super R> subscriber, Func1<? super T, ? extends Single<? extends R>> func1, boolean z3, int i4) {
            this.actual = subscriber;
            this.mapper = func1;
            this.delayErrors = z3;
            this.maxConcurrency = i4;
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.queue = new MpscLinkedQueue();
            } else {
                this.queue = new MpscLinkedAtomicQueue();
            }
            request(i4 != Integer.MAX_VALUE ? i4 : Long.MAX_VALUE);
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.actual;
            Queue<Object> queue = this.queue;
            boolean z3 = this.delayErrors;
            AtomicInteger atomicInteger = this.active;
            int iAddAndGet = 1;
            do {
                long j4 = this.requested.get();
                long j5 = 0;
                while (j5 != j4) {
                    if (this.cancelled) {
                        queue.clear();
                        return;
                    }
                    boolean z4 = this.done;
                    if (!z3 && z4 && this.errors.get() != null) {
                        queue.clear();
                        subscriber.onError(ExceptionsUtils.terminate(this.errors));
                        return;
                    }
                    Object objPoll = queue.poll();
                    boolean z5 = objPoll == null;
                    if (z4 && atomicInteger.get() == 0 && z5) {
                        if (this.errors.get() != null) {
                            subscriber.onError(ExceptionsUtils.terminate(this.errors));
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z5) {
                        break;
                    }
                    subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                    j5++;
                }
                if (j5 == j4) {
                    if (this.cancelled) {
                        queue.clear();
                        return;
                    }
                    if (this.done) {
                        if (z3) {
                            if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                if (this.errors.get() != null) {
                                    subscriber.onError(ExceptionsUtils.terminate(this.errors));
                                    return;
                                } else {
                                    subscriber.onCompleted();
                                    return;
                                }
                            }
                        } else if (this.errors.get() != null) {
                            queue.clear();
                            subscriber.onError(ExceptionsUtils.terminate(this.errors));
                            return;
                        } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j5 != 0) {
                    this.requested.produced(j5);
                    if (!this.done && this.maxConcurrency != Integer.MAX_VALUE) {
                        request(j5);
                    }
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void innerError(FlatMapSingleSubscriber<T, R>.InnerSubscriber innerSubscriber, Throwable th) {
            if (this.delayErrors) {
                ExceptionsUtils.addThrowable(this.errors, th);
                this.set.remove(innerSubscriber);
                if (!this.done && this.maxConcurrency != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.set.unsubscribe();
                unsubscribe();
                if (!this.errors.compareAndSet(null, th)) {
                    RxJavaHooks.onError(th);
                    return;
                }
                this.done = true;
            }
            this.active.decrementAndGet();
            drain();
        }

        void innerSuccess(FlatMapSingleSubscriber<T, R>.InnerSubscriber innerSubscriber, R r3) {
            this.queue.offer(NotificationLite.next(r3));
            this.set.remove(innerSubscriber);
            this.active.decrementAndGet();
            drain();
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.delayErrors) {
                ExceptionsUtils.addThrowable(this.errors, th);
            } else {
                this.set.unsubscribe();
                if (!this.errors.compareAndSet(null, th)) {
                    RxJavaHooks.onError(th);
                    return;
                }
            }
            this.done = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            try {
                Single<? extends R> singleCall = this.mapper.call(t3);
                if (singleCall == null) {
                    throw new NullPointerException("The mapper returned a null Single");
                }
                InnerSubscriber innerSubscriber = new InnerSubscriber();
                this.set.add(innerSubscriber);
                this.active.incrementAndGet();
                singleCall.subscribe(innerSubscriber);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public OnSubscribeFlatMapSingle(Observable<T> observable, Func1<? super T, ? extends Single<? extends R>> func1, boolean z3, int i4) {
        Objects.requireNonNull(func1, "mapper is null");
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i4);
        }
        this.source = observable;
        this.mapper = func1;
        this.delayErrors = z3;
        this.maxConcurrency = i4;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        FlatMapSingleSubscriber flatMapSingleSubscriber = new FlatMapSingleSubscriber(subscriber, this.mapper, this.delayErrors, this.maxConcurrency);
        subscriber.add(flatMapSingleSubscriber.set);
        subscriber.add(flatMapSingleSubscriber.requested);
        subscriber.setProducer(flatMapSingleSubscriber.requested);
        this.source.unsafeSubscribe(flatMapSingleSubscriber);
    }
}

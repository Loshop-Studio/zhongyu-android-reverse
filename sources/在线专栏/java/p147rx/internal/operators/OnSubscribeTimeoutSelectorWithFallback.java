package p147rx.internal.operators;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func1;
import p147rx.internal.operators.OnSubscribeTimeoutTimedWithFallback;
import p147rx.internal.producers.ProducerArbiter;
import p147rx.internal.subscriptions.SequentialSubscription;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OnSubscribeTimeoutSelectorWithFallback<T, U, V> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> fallback;
    final Observable<U> firstTimeoutIndicator;
    final Func1<? super T, ? extends Observable<V>> itemTimeoutIndicator;
    final Observable<T> source;

    static final class TimeoutMainSubscriber<T> extends Subscriber<T> {
        final Subscriber<? super T> actual;
        long consumed;
        final Observable<? extends T> fallback;
        final Func1<? super T, ? extends Observable<?>> itemTimeoutIndicator;
        final SequentialSubscription task;
        final SequentialSubscription upstream;
        final ProducerArbiter arbiter = new ProducerArbiter();
        final AtomicLong index = new AtomicLong();

        final class TimeoutConsumer extends Subscriber<Object> {
            boolean done;
            final long idx;

            TimeoutConsumer(long j4) {
                this.idx = j4;
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                this.done = true;
                TimeoutMainSubscriber.this.onTimeout(this.idx);
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaHooks.onError(th);
                } else {
                    this.done = true;
                    TimeoutMainSubscriber.this.onTimeoutError(this.idx, th);
                }
            }

            @Override // p147rx.Observer
            public void onNext(Object obj) {
                if (this.done) {
                    return;
                }
                this.done = true;
                unsubscribe();
                TimeoutMainSubscriber.this.onTimeout(this.idx);
            }
        }

        TimeoutMainSubscriber(Subscriber<? super T> subscriber, Func1<? super T, ? extends Observable<?>> func1, Observable<? extends T> observable) {
            this.actual = subscriber;
            this.itemTimeoutIndicator = func1;
            this.fallback = observable;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.task = sequentialSubscription;
            this.upstream = new SequentialSubscription(this);
            add(sequentialSubscription);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.unsubscribe();
                this.actual.onCompleted();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaHooks.onError(th);
            } else {
                this.task.unsubscribe();
                this.actual.onError(th);
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            long j4 = this.index.get();
            if (j4 != Long.MAX_VALUE) {
                long j5 = j4 + 1;
                if (this.index.compareAndSet(j4, j5)) {
                    Subscription subscription = this.task.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.actual.onNext(t3);
                    this.consumed++;
                    try {
                        Observable<?> observableCall = this.itemTimeoutIndicator.call(t3);
                        if (observableCall == null) {
                            throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                        }
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j5);
                        if (this.task.replace(timeoutConsumer)) {
                            observableCall.subscribe((Subscriber<? super Object>) timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        unsubscribe();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.actual.onError(th);
                    }
                }
            }
        }

        void onTimeout(long j4) {
            if (this.index.compareAndSet(j4, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.fallback == null) {
                    this.actual.onError(new TimeoutException());
                    return;
                }
                long j5 = this.consumed;
                if (j5 != 0) {
                    this.arbiter.produced(j5);
                }
                OnSubscribeTimeoutTimedWithFallback.FallbackSubscriber fallbackSubscriber = new OnSubscribeTimeoutTimedWithFallback.FallbackSubscriber(this.actual, this.arbiter);
                if (this.upstream.replace(fallbackSubscriber)) {
                    this.fallback.subscribe((Subscriber<? super Object>) fallbackSubscriber);
                }
            }
        }

        void onTimeoutError(long j4, Throwable th) {
            if (!this.index.compareAndSet(j4, Long.MAX_VALUE)) {
                RxJavaHooks.onError(th);
            } else {
                unsubscribe();
                this.actual.onError(th);
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }

        void startFirst(Observable<?> observable) {
            if (observable != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L);
                if (this.task.replace(timeoutConsumer)) {
                    observable.subscribe((Subscriber<? super Object>) timeoutConsumer);
                }
            }
        }
    }

    public OnSubscribeTimeoutSelectorWithFallback(Observable<T> observable, Observable<U> observable2, Func1<? super T, ? extends Observable<V>> func1, Observable<? extends T> observable3) {
        this.source = observable;
        this.firstTimeoutIndicator = observable2;
        this.itemTimeoutIndicator = func1;
        this.fallback = observable3;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        TimeoutMainSubscriber timeoutMainSubscriber = new TimeoutMainSubscriber(subscriber, this.itemTimeoutIndicator, this.fallback);
        subscriber.add(timeoutMainSubscriber.upstream);
        subscriber.setProducer(timeoutMainSubscriber.arbiter);
        timeoutMainSubscriber.startFirst(this.firstTimeoutIndicator);
        this.source.subscribe((Subscriber) timeoutMainSubscriber);
    }
}

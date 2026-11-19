package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.functions.Action0;
import p147rx.internal.producers.ProducerArbiter;
import p147rx.internal.subscriptions.SequentialSubscription;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OnSubscribeTimeoutTimedWithFallback<T> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> fallback;
    final Scheduler scheduler;
    final Observable<T> source;
    final long timeout;
    final TimeUnit unit;

    static final class FallbackSubscriber<T> extends Subscriber<T> {
        final Subscriber<? super T> actual;
        final ProducerArbiter arbiter;

        FallbackSubscriber(Subscriber<? super T> subscriber, ProducerArbiter producerArbiter) {
            this.actual = subscriber;
            this.arbiter = producerArbiter;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.actual.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.actual.onNext(t3);
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }
    }

    static final class TimeoutMainSubscriber<T> extends Subscriber<T> {
        final Subscriber<? super T> actual;
        long consumed;
        final Observable<? extends T> fallback;
        final SequentialSubscription task;
        final long timeout;
        final TimeUnit unit;
        final SequentialSubscription upstream;
        final Scheduler.Worker worker;
        final ProducerArbiter arbiter = new ProducerArbiter();
        final AtomicLong index = new AtomicLong();

        final class TimeoutTask implements Action0 {
            final long idx;

            TimeoutTask(long j4) {
                this.idx = j4;
            }

            @Override // p147rx.functions.Action0
            public void call() {
                TimeoutMainSubscriber.this.onTimeout(this.idx);
            }
        }

        TimeoutMainSubscriber(Subscriber<? super T> subscriber, long j4, TimeUnit timeUnit, Scheduler.Worker worker, Observable<? extends T> observable) {
            this.actual = subscriber;
            this.timeout = j4;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = observable;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.task = sequentialSubscription;
            this.upstream = new SequentialSubscription(this);
            add(worker);
            add(sequentialSubscription);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.unsubscribe();
                this.actual.onCompleted();
                this.worker.unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaHooks.onError(th);
                return;
            }
            this.task.unsubscribe();
            this.actual.onError(th);
            this.worker.unsubscribe();
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
                    this.consumed++;
                    this.actual.onNext(t3);
                    startTimeout(j5);
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
                FallbackSubscriber fallbackSubscriber = new FallbackSubscriber(this.actual, this.arbiter);
                if (this.upstream.replace(fallbackSubscriber)) {
                    this.fallback.subscribe((Subscriber<? super Object>) fallbackSubscriber);
                }
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }

        void startTimeout(long j4) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j4), this.timeout, this.unit));
        }
    }

    public OnSubscribeTimeoutTimedWithFallback(Observable<T> observable, long j4, TimeUnit timeUnit, Scheduler scheduler, Observable<? extends T> observable2) {
        this.source = observable;
        this.timeout = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.fallback = observable2;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        TimeoutMainSubscriber timeoutMainSubscriber = new TimeoutMainSubscriber(subscriber, this.timeout, this.unit, this.scheduler.createWorker(), this.fallback);
        subscriber.add(timeoutMainSubscriber.upstream);
        subscriber.setProducer(timeoutMainSubscriber.arbiter);
        timeoutMainSubscriber.startTimeout(0L);
        this.source.subscribe((Subscriber) timeoutMainSubscriber);
    }
}

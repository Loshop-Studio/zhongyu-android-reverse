package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.functions.Func2;
import p147rx.internal.producers.ProducerArbiter;
import p147rx.schedulers.Schedulers;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class OperatorRetryWithPredicate<T> implements Observable.Operator<T, Observable<T>> {
    final Func2<Integer, Throwable, Boolean> predicate;

    static final class SourceSubscriber<T> extends Subscriber<Observable<T>> {
        final AtomicInteger attempts = new AtomicInteger();
        final Subscriber<? super T> child;
        final Scheduler.Worker inner;

        /* renamed from: pa */
        final ProducerArbiter f11784pa;
        final Func2<Integer, Throwable, Boolean> predicate;
        final SerialSubscription serialSubscription;

        public SourceSubscriber(Subscriber<? super T> subscriber, Func2<Integer, Throwable, Boolean> func2, Scheduler.Worker worker, SerialSubscription serialSubscription, ProducerArbiter producerArbiter) {
            this.child = subscriber;
            this.predicate = func2;
            this.inner = worker;
            this.serialSubscription = serialSubscription;
            this.f11784pa = producerArbiter;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.child.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(final Observable<T> observable) {
            this.inner.schedule(new Action0() { // from class: rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.1
                @Override // p147rx.functions.Action0
                public void call() {
                    SourceSubscriber.this.attempts.incrementAndGet();
                    Subscriber<T> subscriber = new Subscriber<T>() { // from class: rx.internal.operators.OperatorRetryWithPredicate.SourceSubscriber.1.1
                        boolean done;

                        @Override // p147rx.Observer
                        public void onCompleted() {
                            if (this.done) {
                                return;
                            }
                            this.done = true;
                            SourceSubscriber.this.child.onCompleted();
                        }

                        @Override // p147rx.Observer
                        public void onError(Throwable th) {
                            if (this.done) {
                                return;
                            }
                            this.done = true;
                            SourceSubscriber sourceSubscriber = SourceSubscriber.this;
                            if (!sourceSubscriber.predicate.call(Integer.valueOf(sourceSubscriber.attempts.get()), th).booleanValue() || SourceSubscriber.this.inner.isUnsubscribed()) {
                                SourceSubscriber.this.child.onError(th);
                            } else {
                                SourceSubscriber.this.inner.schedule(this);
                            }
                        }

                        @Override // p147rx.Observer
                        public void onNext(T t3) {
                            if (this.done) {
                                return;
                            }
                            SourceSubscriber.this.child.onNext(t3);
                            SourceSubscriber.this.f11784pa.produced(1L);
                        }

                        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
                        public void setProducer(Producer producer) {
                            SourceSubscriber.this.f11784pa.setProducer(producer);
                        }
                    };
                    SourceSubscriber.this.serialSubscription.set(subscriber);
                    observable.unsafeSubscribe(subscriber);
                }
            });
        }
    }

    public OperatorRetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
        this.predicate = func2;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super Observable<T>> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = Schedulers.trampoline().createWorker();
        subscriber.add(workerCreateWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        ProducerArbiter producerArbiter = new ProducerArbiter();
        subscriber.setProducer(producerArbiter);
        return new SourceSubscriber(subscriber, this.predicate, workerCreateWorker, serialSubscription, producerArbiter);
    }
}

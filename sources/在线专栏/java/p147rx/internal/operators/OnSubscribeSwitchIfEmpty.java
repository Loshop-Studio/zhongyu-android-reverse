package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.internal.producers.ProducerArbiter;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class OnSubscribeSwitchIfEmpty<T> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> alternate;
    final Observable<? extends T> source;

    static final class AlternateSubscriber<T> extends Subscriber<T> {
        private final ProducerArbiter arbiter;
        private final Subscriber<? super T> child;

        AlternateSubscriber(Subscriber<? super T> subscriber, ProducerArbiter producerArbiter) {
            this.child = subscriber;
            this.arbiter = producerArbiter;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.child.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.child.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.child.onNext(t3);
            this.arbiter.produced(1L);
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }
    }

    static final class ParentSubscriber<T> extends Subscriber<T> {
        volatile boolean active;
        private final Observable<? extends T> alternate;
        private final ProducerArbiter arbiter;
        private final Subscriber<? super T> child;
        private final SerialSubscription serial;
        private boolean empty = true;
        final AtomicInteger wip = new AtomicInteger();

        ParentSubscriber(Subscriber<? super T> subscriber, SerialSubscription serialSubscription, ProducerArbiter producerArbiter, Observable<? extends T> observable) {
            this.child = subscriber;
            this.serial = serialSubscription;
            this.arbiter = producerArbiter;
            this.alternate = observable;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (!this.empty) {
                this.child.onCompleted();
            } else {
                if (this.child.isUnsubscribed()) {
                    return;
                }
                this.active = false;
                subscribe(null);
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.child.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.empty = false;
            this.child.onNext(t3);
            this.arbiter.produced(1L);
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }

        void subscribe(Observable<? extends T> observable) {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.child.isUnsubscribed()) {
                    if (!this.active) {
                        if (observable == null) {
                            AlternateSubscriber alternateSubscriber = new AlternateSubscriber(this.child, this.arbiter);
                            this.serial.set(alternateSubscriber);
                            this.active = true;
                            this.alternate.unsafeSubscribe(alternateSubscriber);
                        } else {
                            this.active = true;
                            observable.unsafeSubscribe(this);
                            observable = null;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public OnSubscribeSwitchIfEmpty(Observable<? extends T> observable, Observable<? extends T> observable2) {
        this.source = observable;
        this.alternate = observable2;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        ProducerArbiter producerArbiter = new ProducerArbiter();
        ParentSubscriber parentSubscriber = new ParentSubscriber(subscriber, serialSubscription, producerArbiter, this.alternate);
        serialSubscription.set(parentSubscriber);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        parentSubscriber.subscribe(this.source);
    }
}

package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class OperatorSubscribeOn<T> implements Observable.OnSubscribe<T> {
    final boolean requestOn;
    final Scheduler scheduler;
    final Observable<T> source;

    static final class SubscribeOnSubscriber<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> actual;
        final boolean requestOn;
        Observable<T> source;

        /* renamed from: t */
        Thread f11785t;
        final Scheduler.Worker worker;

        SubscribeOnSubscriber(Subscriber<? super T> subscriber, boolean z3, Scheduler.Worker worker, Observable<T> observable) {
            this.actual = subscriber;
            this.requestOn = z3;
            this.worker = worker;
            this.source = observable;
        }

        @Override // p147rx.functions.Action0
        public void call() {
            Observable<T> observable = this.source;
            this.source = null;
            this.f11785t = Thread.currentThread();
            observable.unsafeSubscribe(this);
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            try {
                this.actual.onCompleted();
            } finally {
                this.worker.unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            try {
                this.actual.onError(th);
            } finally {
                this.worker.unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            this.actual.onNext(t3);
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(final Producer producer) {
            this.actual.setProducer(new Producer() { // from class: rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.1
                @Override // p147rx.Producer
                public void request(final long j4) {
                    if (SubscribeOnSubscriber.this.f11785t != Thread.currentThread()) {
                        SubscribeOnSubscriber subscribeOnSubscriber = SubscribeOnSubscriber.this;
                        if (subscribeOnSubscriber.requestOn) {
                            subscribeOnSubscriber.worker.schedule(new Action0() { // from class: rx.internal.operators.OperatorSubscribeOn.SubscribeOnSubscriber.1.1
                                @Override // p147rx.functions.Action0
                                public void call() {
                                    producer.request(j4);
                                }
                            });
                            return;
                        }
                    }
                    producer.request(j4);
                }
            });
        }
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler, boolean z3) {
        this.scheduler = scheduler;
        this.source = observable;
        this.requestOn = z3;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(subscriber, this.requestOn, workerCreateWorker, this.source);
        subscriber.add(subscribeOnSubscriber);
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedule(subscribeOnSubscriber);
    }
}

package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Producer;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public class OperatorUnsubscribeOn<T> implements Observable.Operator<T, T> {
    final Scheduler scheduler;

    public OperatorUnsubscribeOn(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        final Subscriber<T> subscriber2 = new Subscriber<T>() { // from class: rx.internal.operators.OperatorUnsubscribeOn.1
            @Override // p147rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                subscriber.onNext(t3);
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                subscriber.setProducer(producer);
            }
        };
        subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OperatorUnsubscribeOn.2
            @Override // p147rx.functions.Action0
            public void call() {
                final Scheduler.Worker workerCreateWorker = OperatorUnsubscribeOn.this.scheduler.createWorker();
                workerCreateWorker.schedule(new Action0() { // from class: rx.internal.operators.OperatorUnsubscribeOn.2.1
                    @Override // p147rx.functions.Action0
                    public void call() {
                        subscriber2.unsubscribe();
                        workerCreateWorker.unsubscribe();
                    }
                });
            }
        }));
        return subscriber2;
    }
}

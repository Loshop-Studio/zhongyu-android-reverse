package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func1;
import p147rx.observers.SerializedSubscriber;
import p147rx.observers.Subscribers;
import p147rx.subjects.PublishSubject;

/* loaded from: classes2.dex */
public final class OperatorDelayWithSelector<T, V> implements Observable.Operator<T, T> {
    final Func1<? super T, ? extends Observable<V>> itemDelay;
    final Observable<? extends T> source;

    public OperatorDelayWithSelector(Observable<? extends T> observable, Func1<? super T, ? extends Observable<V>> func1) {
        this.source = observable;
        this.itemDelay = func1;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        final PublishSubject publishSubjectCreate = PublishSubject.create();
        subscriber.add(Observable.merge(publishSubjectCreate).unsafeSubscribe(Subscribers.from(serializedSubscriber)));
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDelayWithSelector.1
            @Override // p147rx.Observer
            public void onCompleted() {
                publishSubjectCreate.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                serializedSubscriber.onError(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p147rx.Observer
            public void onNext(final T t3) {
                try {
                    publishSubjectCreate.onNext(OperatorDelayWithSelector.this.itemDelay.call(t3).take(1).defaultIfEmpty(null).map(new Func1<V, T>() { // from class: rx.internal.operators.OperatorDelayWithSelector.1.1
                        @Override // p147rx.functions.Func1
                        public T call(V v3) {
                            return (T) t3;
                        }
                    }));
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        };
    }
}

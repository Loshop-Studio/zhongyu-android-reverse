package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.observers.SerializedSubscriber;

/* loaded from: classes2.dex */
public final class OperatorSkipUntil<T, U> implements Observable.Operator<T, T> {
    final Observable<U> other;

    public OperatorSkipUntil(Observable<U> observable) {
        this.other = observable;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        Subscriber<U> subscriber2 = new Subscriber<U>() { // from class: rx.internal.operators.OperatorSkipUntil.1
            @Override // p147rx.Observer
            public void onCompleted() {
                unsubscribe();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                serializedSubscriber.onError(th);
                serializedSubscriber.unsubscribe();
            }

            @Override // p147rx.Observer
            public void onNext(U u3) {
                atomicBoolean.set(true);
                unsubscribe();
            }
        };
        subscriber.add(subscriber2);
        this.other.unsafeSubscribe(subscriber2);
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipUntil.2
            @Override // p147rx.Observer
            public void onCompleted() {
                serializedSubscriber.onCompleted();
                unsubscribe();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                serializedSubscriber.onError(th);
                unsubscribe();
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                if (atomicBoolean.get()) {
                    serializedSubscriber.onNext(t3);
                } else {
                    request(1L);
                }
            }
        };
    }
}

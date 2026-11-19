package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.observers.SerializedSubscriber;

/* loaded from: classes2.dex */
public final class OperatorSerialize<T> implements Observable.Operator<T, T> {

    static final class Holder {
        static final OperatorSerialize<Object> INSTANCE = new OperatorSerialize<>();

        Holder() {
        }
    }

    OperatorSerialize() {
    }

    public static <T> OperatorSerialize<T> instance() {
        return (OperatorSerialize<T>) Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new SerializedSubscriber(new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSerialize.1
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
        });
    }
}

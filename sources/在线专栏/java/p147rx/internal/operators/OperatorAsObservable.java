package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class OperatorAsObservable<T> implements Observable.Operator<T, T> {

    static final class Holder {
        static final OperatorAsObservable<Object> INSTANCE = new OperatorAsObservable<>();

        Holder() {
        }
    }

    OperatorAsObservable() {
    }

    public static <T> OperatorAsObservable<T> instance() {
        return (OperatorAsObservable<T>) Holder.INSTANCE;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return subscriber;
    }
}

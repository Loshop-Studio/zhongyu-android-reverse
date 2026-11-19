package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.observers.Subscribers;

/* loaded from: classes2.dex */
public class OperatorDoOnSubscribe<T> implements Observable.Operator<T, T> {
    private final Action0 subscribe;

    public OperatorDoOnSubscribe(Action0 action0) {
        this.subscribe = action0;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        this.subscribe.call();
        return Subscribers.wrap(subscriber);
    }
}

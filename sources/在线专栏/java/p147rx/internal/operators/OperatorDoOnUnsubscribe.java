package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.functions.Action0;
import p147rx.observers.Subscribers;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public class OperatorDoOnUnsubscribe<T> implements Observable.Operator<T, T> {
    private final Action0 unsubscribe;

    public OperatorDoOnUnsubscribe(Action0 action0) {
        this.unsubscribe = action0;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        subscriber.add(Subscriptions.create(this.unsubscribe));
        return Subscribers.wrap(subscriber);
    }
}

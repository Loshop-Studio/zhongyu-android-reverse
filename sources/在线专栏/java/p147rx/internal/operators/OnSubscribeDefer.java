package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func0;
import p147rx.observers.Subscribers;

/* loaded from: classes2.dex */
public final class OnSubscribeDefer<T> implements Observable.OnSubscribe<T> {
    final Func0<? extends Observable<? extends T>> observableFactory;

    public OnSubscribeDefer(Func0<? extends Observable<? extends T>> func0) {
        this.observableFactory = func0;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        try {
            this.observableFactory.call().unsafeSubscribe(Subscribers.wrap(subscriber));
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }
}

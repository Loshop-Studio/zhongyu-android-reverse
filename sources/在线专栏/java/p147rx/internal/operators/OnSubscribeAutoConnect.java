package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.Subscription;
import p147rx.functions.Action1;
import p147rx.observables.ConnectableObservable;
import p147rx.observers.Subscribers;

/* loaded from: classes2.dex */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements Observable.OnSubscribe<T> {
    final Action1<? super Subscription> connection;
    final int numberOfSubscribers;
    final ConnectableObservable<? extends T> source;

    public OnSubscribeAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i4, Action1<? super Subscription> action1) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.source = connectableObservable;
        this.numberOfSubscribers = i4;
        this.connection = action1;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.source.unsafeSubscribe(Subscribers.wrap(subscriber));
        if (incrementAndGet() == this.numberOfSubscribers) {
            this.source.connect(this.connection);
        }
    }
}

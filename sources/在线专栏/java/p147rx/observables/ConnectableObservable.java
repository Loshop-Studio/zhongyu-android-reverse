package p147rx.observables;

import p147rx.Observable;
import p147rx.Subscription;
import p147rx.functions.Action1;
import p147rx.functions.Actions;
import p147rx.internal.operators.OnSubscribeAutoConnect;
import p147rx.internal.operators.OnSubscribeRefCount;

/* loaded from: classes2.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {
    protected ConnectableObservable(Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
    }

    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public final Subscription connect() {
        final Subscription[] subscriptionArr = new Subscription[1];
        connect(new Action1<Subscription>() { // from class: rx.observables.ConnectableObservable.1
            @Override // p147rx.functions.Action1
            public void call(Subscription subscription) {
                subscriptionArr[0] = subscription;
            }
        });
        return subscriptionArr[0];
    }

    public abstract void connect(Action1<? super Subscription> action1);

    public Observable<T> refCount() {
        return Observable.unsafeCreate(new OnSubscribeRefCount(this));
    }

    public Observable<T> autoConnect(int i4) {
        return autoConnect(i4, Actions.empty());
    }

    public Observable<T> autoConnect(int i4, Action1<? super Subscription> action1) {
        if (i4 <= 0) {
            connect(action1);
            return this;
        }
        return Observable.unsafeCreate(new OnSubscribeAutoConnect(this, i4, action1));
    }
}

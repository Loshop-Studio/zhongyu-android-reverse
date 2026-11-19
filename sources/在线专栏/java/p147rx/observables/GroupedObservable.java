package p147rx.observables;

import p147rx.Observable;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public class GroupedObservable<K, T> extends Observable<T> {
    private final K key;

    protected GroupedObservable(K k4, Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
        this.key = k4;
    }

    public static <K, T> GroupedObservable<K, T> create(K k4, Observable.OnSubscribe<T> onSubscribe) {
        return new GroupedObservable<>(k4, onSubscribe);
    }

    public static <K, T> GroupedObservable<K, T> from(K k4, final Observable<T> observable) {
        return new GroupedObservable<>(k4, new Observable.OnSubscribe<T>() { // from class: rx.observables.GroupedObservable.1
            @Override // p147rx.functions.Action1
            public void call(Subscriber<? super T> subscriber) {
                observable.unsafeSubscribe(subscriber);
            }
        });
    }

    public K getKey() {
        return this.key;
    }
}

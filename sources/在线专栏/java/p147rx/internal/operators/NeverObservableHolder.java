package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public enum NeverObservableHolder implements Observable.OnSubscribe<Object> {
    INSTANCE;

    static final Observable<Object> NEVER = Observable.unsafeCreate(INSTANCE);

    public static <T> Observable<T> instance() {
        return (Observable<T>) NEVER;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super Object> subscriber) {
    }
}

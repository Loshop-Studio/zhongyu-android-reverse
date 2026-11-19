package p147rx.internal.util;

import p147rx.Observer;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class ObserverSubscriber<T> extends Subscriber<T> {
    final Observer<? super T> observer;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.observer = observer;
    }

    @Override // p147rx.Observer
    public void onCompleted() {
        this.observer.onCompleted();
    }

    @Override // p147rx.Observer
    public void onError(Throwable th) {
        this.observer.onError(th);
    }

    @Override // p147rx.Observer
    public void onNext(T t3) {
        this.observer.onNext(t3);
    }
}

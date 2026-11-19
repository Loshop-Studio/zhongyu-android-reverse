package p147rx.subjects;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.observers.SerializedObserver;

/* loaded from: classes2.dex */
public class SerializedSubject<T, R> extends Subject<T, R> {
    private final Subject<T, R> actual;
    private final SerializedObserver<T> observer;

    public SerializedSubject(final Subject<T, R> subject) {
        super(new Observable.OnSubscribe<R>() { // from class: rx.subjects.SerializedSubject.1
            @Override // p147rx.functions.Action1
            public void call(Subscriber<? super R> subscriber) {
                subject.unsafeSubscribe(subscriber);
            }
        });
        this.actual = subject;
        this.observer = new SerializedObserver<>(subject);
    }

    @Override // p147rx.subjects.Subject
    public boolean hasObservers() {
        return this.actual.hasObservers();
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

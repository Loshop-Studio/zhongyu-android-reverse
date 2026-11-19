package p147rx.subjects;

import p147rx.Observable;
import p147rx.Observer;

/* loaded from: classes2.dex */
public abstract class Subject<T, R> extends Observable<R> implements Observer<T> {
    protected Subject(Observable.OnSubscribe<R> onSubscribe) {
        super(onSubscribe);
    }

    public abstract boolean hasObservers();

    public final SerializedSubject<T, R> toSerialized() {
        return getClass() == SerializedSubject.class ? (SerializedSubject) this : new SerializedSubject<>(this);
    }
}

package p147rx.observers;

import p147rx.Observer;
import p147rx.Subscriber;
import p147rx.exceptions.OnErrorNotImplementedException;
import p147rx.functions.Action0;
import p147rx.functions.Action1;

/* loaded from: classes2.dex */
public final class Subscribers {
    private Subscribers() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1) {
        if (action1 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.2
                @Override // p147rx.Observer
                public final void onCompleted() {
                }

                @Override // p147rx.Observer
                public final void onError(Throwable th) {
                    throw new OnErrorNotImplementedException(th);
                }

                @Override // p147rx.Observer
                public final void onNext(T t3) {
                    action1.call(t3);
                }
            };
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public static <T> Subscriber<T> empty() {
        return from(Observers.empty());
    }

    public static <T> Subscriber<T> from(final Observer<? super T> observer) {
        return new Subscriber<T>() { // from class: rx.observers.Subscribers.1
            @Override // p147rx.Observer
            public void onCompleted() {
                observer.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                observer.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                observer.onNext(t3);
            }
        };
    }

    public static <T> Subscriber<T> wrap(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.observers.Subscribers.5
            @Override // p147rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                subscriber.onNext(t3);
            }
        };
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1, final Action1<Throwable> action12) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action12 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.3
                @Override // p147rx.Observer
                public final void onCompleted() {
                }

                @Override // p147rx.Observer
                public final void onError(Throwable th) {
                    action12.call(th);
                }

                @Override // p147rx.Observer
                public final void onNext(T t3) {
                    action1.call(t3);
                }
            };
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public static <T> Subscriber<T> create(final Action1<? super T> action1, final Action1<Throwable> action12, final Action0 action0) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (action0 != null) {
            return new Subscriber<T>() { // from class: rx.observers.Subscribers.4
                @Override // p147rx.Observer
                public final void onCompleted() {
                    action0.call();
                }

                @Override // p147rx.Observer
                public final void onError(Throwable th) {
                    action12.call(th);
                }

                @Override // p147rx.Observer
                public final void onNext(T t3) {
                    action1.call(t3);
                }
            };
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }
}

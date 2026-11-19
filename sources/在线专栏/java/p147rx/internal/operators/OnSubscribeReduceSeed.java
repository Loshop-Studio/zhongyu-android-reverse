package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func2;

/* loaded from: classes2.dex */
public final class OnSubscribeReduceSeed<T, R> implements Observable.OnSubscribe<R> {
    final R initialValue;
    final Func2<R, ? super T, R> reducer;
    final Observable<T> source;

    static final class ReduceSeedSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        final Func2<R, ? super T, R> reducer;

        public ReduceSeedSubscriber(Subscriber<? super R> subscriber, R r3, Func2<R, ? super T, R> func2) {
            super(subscriber);
            this.value = r3;
            this.hasValue = true;
            this.reducer = func2;
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            try {
                this.value = this.reducer.call(this.value, t3);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                this.actual.onError(th);
            }
        }
    }

    public OnSubscribeReduceSeed(Observable<T> observable, R r3, Func2<R, ? super T, R> func2) {
        this.source = observable;
        this.initialValue = r3;
        this.reducer = func2;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        new ReduceSeedSubscriber(subscriber, this.initialValue, this.reducer).subscribeTo(this.source);
    }
}

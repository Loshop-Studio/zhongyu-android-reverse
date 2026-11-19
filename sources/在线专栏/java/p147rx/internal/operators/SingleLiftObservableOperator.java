package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.internal.operators.SingleFromObservable;
import p147rx.internal.producers.SingleProducer;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class SingleLiftObservableOperator<T, R> implements Single.OnSubscribe<R> {
    final Observable.Operator<? extends R, ? super T> lift;
    final Single.OnSubscribe<T> source;

    static final class WrapSubscriberIntoSingle<T> extends SingleSubscriber<T> {
        final Subscriber<? super T> actual;

        WrapSubscriberIntoSingle(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        @Override // p147rx.SingleSubscriber
        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // p147rx.SingleSubscriber
        public void onSuccess(T t3) {
            this.actual.setProducer(new SingleProducer(this.actual, t3));
        }
    }

    public SingleLiftObservableOperator(Single.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.source = onSubscribe;
        this.lift = operator;
    }

    public static <T> SingleSubscriber<T> wrap(Subscriber<T> subscriber) {
        WrapSubscriberIntoSingle wrapSubscriberIntoSingle = new WrapSubscriberIntoSingle(subscriber);
        subscriber.add(wrapSubscriberIntoSingle);
        return wrapSubscriberIntoSingle;
    }

    @Override // p147rx.functions.Action1
    public void call(SingleSubscriber<? super R> singleSubscriber) {
        SingleFromObservable.WrapSingleIntoSubscriber wrapSingleIntoSubscriber = new SingleFromObservable.WrapSingleIntoSubscriber(singleSubscriber);
        singleSubscriber.add(wrapSingleIntoSubscriber);
        try {
            Subscriber<? super T> subscriberCall = RxJavaHooks.onSingleLift(this.lift).call(wrapSingleIntoSubscriber);
            SingleSubscriber singleSubscriberWrap = wrap(subscriberCall);
            subscriberCall.onStart();
            this.source.call(singleSubscriberWrap);
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, singleSubscriber);
        }
    }
}

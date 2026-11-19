package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.Subscriber;
import p147rx.plugins.RxJavaHooks;
import p147rx.subscriptions.SerialSubscription;

/* loaded from: classes2.dex */
public final class SingleOnSubscribeDelaySubscriptionOther<T> implements Single.OnSubscribe<T> {
    final Single<? extends T> main;
    final Observable<?> other;

    public SingleOnSubscribeDelaySubscriptionOther(Single<? extends T> single, Observable<?> observable) {
        this.main = single;
        this.other = observable;
    }

    @Override // p147rx.functions.Action1
    public void call(final SingleSubscriber<? super T> singleSubscriber) {
        final SingleSubscriber<T> singleSubscriber2 = new SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.1
            @Override // p147rx.SingleSubscriber
            public void onError(Throwable th) {
                singleSubscriber.onError(th);
            }

            @Override // p147rx.SingleSubscriber
            public void onSuccess(T t3) {
                singleSubscriber.onSuccess(t3);
            }
        };
        final SerialSubscription serialSubscription = new SerialSubscription();
        singleSubscriber.add(serialSubscription);
        Subscriber<? super Object> subscriber = new Subscriber<Object>() { // from class: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.2
            boolean done;

            @Override // p147rx.Observer
            public void onCompleted() {
                if (this.done) {
                    return;
                }
                this.done = true;
                serialSubscription.set(singleSubscriber2);
                SingleOnSubscribeDelaySubscriptionOther.this.main.subscribe(singleSubscriber2);
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaHooks.onError(th);
                } else {
                    this.done = true;
                    singleSubscriber2.onError(th);
                }
            }

            @Override // p147rx.Observer
            public void onNext(Object obj) {
                onCompleted();
            }
        };
        serialSubscription.set(subscriber);
        this.other.subscribe(subscriber);
    }
}

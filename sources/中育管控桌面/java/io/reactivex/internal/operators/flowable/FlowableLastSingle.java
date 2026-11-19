package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableLastSingle<T> extends Single<T> {
    final T defaultItem;
    final InterfaceC7916b source;

    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final T defaultItem;
        final SingleObserver<? super T> downstream;
        T item;
        InterfaceC7918d upstream;

        public LastSubscriber(SingleObserver<? super T> singleObserver, T t6) {
            this.downstream = singleObserver;
            this.defaultItem = t6;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            T t6 = this.item;
            if (t6 != null) {
                this.item = null;
                this.downstream.onSuccess(t6);
                return;
            }
            T t7 = this.defaultItem;
            if (t7 != null) {
                this.downstream.onSuccess(t7);
            } else {
                this.downstream.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.item = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.item = t6;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                this.downstream.onSubscribe(this);
                interfaceC7918d.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastSingle(InterfaceC7916b interfaceC7916b, T t6) {
        this.source = interfaceC7916b;
        this.defaultItem = t6;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new LastSubscriber(singleObserver, this.defaultItem));
    }
}

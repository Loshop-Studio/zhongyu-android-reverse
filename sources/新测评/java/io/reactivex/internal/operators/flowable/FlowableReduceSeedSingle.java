package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {
    final BiFunction<R, ? super T, R> reducer;
    final R seed;
    final InterfaceC8988b source;

    public static final class ReduceSeedObserver<T, R> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super R> downstream;
        final BiFunction<R, ? super T, R> reducer;
        InterfaceC8990d upstream;
        R value;

        public ReduceSeedObserver(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r10) {
            this.downstream = singleObserver;
            this.value = r10;
            this.reducer = biFunction;
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            R r10 = this.value;
            if (r10 != null) {
                this.value = null;
                this.upstream = SubscriptionHelper.CANCELLED;
                this.downstream.onSuccess(r10);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.value == null) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.value = null;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            R r10 = this.value;
            if (r10 != null) {
                try {
                    this.value = (R) ObjectHelper.requireNonNull(this.reducer.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                interfaceC8990d.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceSeedSingle(InterfaceC8988b interfaceC8988b, R r10, BiFunction<R, ? super T, R> biFunction) {
        this.source = interfaceC8988b;
        this.seed = r10;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }
}

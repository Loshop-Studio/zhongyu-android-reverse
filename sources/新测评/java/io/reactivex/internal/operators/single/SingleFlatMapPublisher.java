package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final SingleSource<T> source;

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends InterfaceC8988b> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new SingleFlatMapPublisherObserver(interfaceC8989c, this.mapper));
    }

    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final InterfaceC8989c downstream;
        final Function<? super S, ? extends InterfaceC8988b> mapper;
        final AtomicReference<InterfaceC8990d> parent = new AtomicReference<>();

        public SingleFlatMapPublisherObserver(InterfaceC8989c interfaceC8989c, Function<? super S, ? extends InterfaceC8988b> function) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.disposable = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S s10) {
            try {
                ((InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(s10), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.parent, this, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, interfaceC8990d);
        }
    }
}

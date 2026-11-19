package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends InterfaceC8988b> mapper;
    final MaybeSource<T> source;

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends InterfaceC8988b> function) {
        this.source = maybeSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new FlatMapPublisherSubscriber(interfaceC8989c, this.mapper));
    }

    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<R>, MaybeObserver<T>, InterfaceC8990d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC8989c downstream;
        final Function<? super T, ? extends InterfaceC8988b> mapper;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public FlatMapPublisherSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function) {
            this.downstream = interfaceC8989c;
            this.mapper = function;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t10) {
            try {
                ((InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(t10), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.requested, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, interfaceC8990d);
        }
    }
}

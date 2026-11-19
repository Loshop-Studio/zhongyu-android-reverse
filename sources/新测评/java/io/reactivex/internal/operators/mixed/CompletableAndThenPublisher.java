package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final InterfaceC8988b other;
    final CompletableSource source;

    public CompletableAndThenPublisher(CompletableSource completableSource, InterfaceC8988b interfaceC8988b) {
        this.source = completableSource;
        this.other = interfaceC8988b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe(new AndThenPublisherSubscriber(interfaceC8989c, this.other));
    }

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<R>, CompletableObserver, InterfaceC8990d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC8989c downstream;
        InterfaceC8988b other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public AndThenPublisherSubscriber(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b) {
            this.downstream = interfaceC8989c;
            this.other = interfaceC8988b;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            InterfaceC8988b interfaceC8988b = this.other;
            if (interfaceC8988b == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                interfaceC8988b.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
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

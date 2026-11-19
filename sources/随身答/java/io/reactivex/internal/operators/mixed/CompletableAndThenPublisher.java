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
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final InterfaceC0049b other;
    final CompletableSource source;

    public CompletableAndThenPublisher(CompletableSource completableSource, InterfaceC0049b interfaceC0049b) {
        this.source = completableSource;
        this.other = interfaceC0049b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe(new AndThenPublisherSubscriber(interfaceC0050c, this.other));
    }

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<InterfaceC0051d> implements FlowableSubscriber<R>, CompletableObserver, InterfaceC0051d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC0050c downstream;
        InterfaceC0049b other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public AndThenPublisherSubscriber(InterfaceC0050c interfaceC0050c, InterfaceC0049b interfaceC0049b) {
            this.downstream = interfaceC0050c;
            this.other = interfaceC0049b;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            InterfaceC0049b interfaceC0049b = this.other;
            if (interfaceC0049b == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                interfaceC0049b.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(R r9) {
            this.downstream.onNext(r9);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            SubscriptionHelper.deferredRequest(this, this.requested, j9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, interfaceC0051d);
        }
    }
}

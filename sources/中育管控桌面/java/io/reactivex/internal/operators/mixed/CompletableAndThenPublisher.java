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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final InterfaceC7916b other;
    final CompletableSource source;

    public CompletableAndThenPublisher(CompletableSource completableSource, InterfaceC7916b interfaceC7916b) {
        this.source = completableSource;
        this.other = interfaceC7916b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe(new AndThenPublisherSubscriber(interfaceC7917c, this.other));
    }

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<R>, CompletableObserver, InterfaceC7918d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC7917c downstream;
        InterfaceC7916b other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        public AndThenPublisherSubscriber(InterfaceC7917c interfaceC7917c, InterfaceC7916b interfaceC7916b) {
            this.downstream = interfaceC7917c;
            this.other = interfaceC7916b;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            InterfaceC7916b interfaceC7916b = this.other;
            if (interfaceC7916b == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                interfaceC7916b.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(R r6) {
            this.downstream.onNext(r6);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            SubscriptionHelper.deferredRequest(this, this.requested, j6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, interfaceC7918d);
        }
    }
}

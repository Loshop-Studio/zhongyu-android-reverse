package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final InterfaceC8988b main;
    final InterfaceC8988b other;

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = 2259811067697317255L;
        final InterfaceC8989c downstream;
        final InterfaceC8988b main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onNext(Object obj) {
                InterfaceC8990d interfaceC8990d = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC8990d != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    interfaceC8990d.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
            public void onSubscribe(InterfaceC8990d interfaceC8990d) {
                if (SubscriptionHelper.setOnce(this, interfaceC8990d)) {
                    interfaceC8990d.request(Long.MAX_VALUE);
                }
            }
        }

        public MainSubscriber(InterfaceC8989c interfaceC8989c, InterfaceC8988b interfaceC8988b) {
            this.downstream = interfaceC8989c;
            this.main = interfaceC8988b;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        public void next() {
            this.main.subscribe(this);
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
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, interfaceC8990d);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j10);
            }
        }
    }

    public FlowableDelaySubscriptionOther(InterfaceC8988b interfaceC8988b, InterfaceC8988b interfaceC8988b2) {
        this.main = interfaceC8988b;
        this.other = interfaceC8988b2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        MainSubscriber mainSubscriber = new MainSubscriber(interfaceC8989c, this.main);
        interfaceC8989c.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}

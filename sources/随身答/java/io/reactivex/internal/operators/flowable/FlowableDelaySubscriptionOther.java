package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final InterfaceC0049b main;
    final InterfaceC0049b other;

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC0051d {
        private static final long serialVersionUID = 2259811067697317255L;
        final InterfaceC0050c downstream;
        final InterfaceC0049b main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<InterfaceC0051d> upstream = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<InterfaceC0051d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
            public void onNext(Object obj) {
                InterfaceC0051d interfaceC0051d = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC0051d != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    interfaceC0051d.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
            public void onSubscribe(InterfaceC0051d interfaceC0051d) {
                if (SubscriptionHelper.setOnce(this, interfaceC0051d)) {
                    interfaceC0051d.request(Long.MAX_VALUE);
                }
            }
        }

        public MainSubscriber(InterfaceC0050c interfaceC0050c, InterfaceC0049b interfaceC0049b) {
            this.downstream = interfaceC0050c;
            this.main = interfaceC0049b;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        public void next() {
            this.main.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            this.downstream.onNext(t9);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, interfaceC0051d);
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j9);
            }
        }
    }

    public FlowableDelaySubscriptionOther(InterfaceC0049b interfaceC0049b, InterfaceC0049b interfaceC0049b2) {
        this.main = interfaceC0049b;
        this.other = interfaceC0049b2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        MainSubscriber mainSubscriber = new MainSubscriber(interfaceC0050c, this.main);
        interfaceC0050c.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}

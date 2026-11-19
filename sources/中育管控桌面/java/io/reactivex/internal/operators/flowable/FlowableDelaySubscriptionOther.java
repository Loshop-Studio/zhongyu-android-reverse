package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final InterfaceC7916b main;
    final InterfaceC7916b other;

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC7918d {
        private static final long serialVersionUID = 2259811067697317255L;
        final InterfaceC7917c downstream;
        final InterfaceC7916b main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<InterfaceC7918d> upstream = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<InterfaceC7918d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
            public void onNext(Object obj) {
                InterfaceC7918d interfaceC7918d = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC7918d != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    interfaceC7918d.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
            public void onSubscribe(InterfaceC7918d interfaceC7918d) {
                if (SubscriptionHelper.setOnce(this, interfaceC7918d)) {
                    interfaceC7918d.request(Long.MAX_VALUE);
                }
            }
        }

        public MainSubscriber(InterfaceC7917c interfaceC7917c, InterfaceC7916b interfaceC7916b) {
            this.downstream = interfaceC7917c;
            this.main = interfaceC7916b;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        public void next() {
            this.main.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, interfaceC7918d);
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j6);
            }
        }
    }

    public FlowableDelaySubscriptionOther(InterfaceC7916b interfaceC7916b, InterfaceC7916b interfaceC7916b2) {
        this.main = interfaceC7916b;
        this.other = interfaceC7916b2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        MainSubscriber mainSubscriber = new MainSubscriber(interfaceC7917c, this.main);
        interfaceC7917c.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}

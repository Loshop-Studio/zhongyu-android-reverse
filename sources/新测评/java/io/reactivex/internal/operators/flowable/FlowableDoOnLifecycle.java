package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Action onCancel;
    private final LongConsumer onRequest;
    private final Consumer<? super InterfaceC8990d> onSubscribe;

    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, InterfaceC8990d {
        final InterfaceC8989c downstream;
        final Action onCancel;
        final LongConsumer onRequest;
        final Consumer<? super InterfaceC8990d> onSubscribe;
        InterfaceC8990d upstream;

        public SubscriptionLambdaSubscriber(InterfaceC8989c interfaceC8989c, Consumer<? super InterfaceC8990d> consumer, LongConsumer longConsumer, Action action) {
            this.downstream = interfaceC8989c;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            InterfaceC8990d interfaceC8990d = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC8990d != subscriptionHelper) {
                this.upstream = subscriptionHelper;
                try {
                    this.onCancel.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
                interfaceC8990d.cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            try {
                this.onSubscribe.accept(interfaceC8990d);
                if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                    this.upstream = interfaceC8990d;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                interfaceC8990d.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.downstream);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            try {
                this.onRequest.accept(j10);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.request(j10);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super InterfaceC8990d> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        this.source.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber(interfaceC8989c, this.onSubscribe, this.onRequest, this.onCancel));
    }
}

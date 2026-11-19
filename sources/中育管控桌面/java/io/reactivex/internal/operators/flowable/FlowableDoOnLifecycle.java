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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Action onCancel;
    private final LongConsumer onRequest;
    private final Consumer<? super InterfaceC7918d> onSubscribe;

    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, InterfaceC7918d {
        final InterfaceC7917c downstream;
        final Action onCancel;
        final LongConsumer onRequest;
        final Consumer<? super InterfaceC7918d> onSubscribe;
        InterfaceC7918d upstream;

        public SubscriptionLambdaSubscriber(InterfaceC7917c interfaceC7917c, Consumer<? super InterfaceC7918d> consumer, LongConsumer longConsumer, Action action) {
            this.downstream = interfaceC7917c;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            InterfaceC7918d interfaceC7918d = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC7918d != subscriptionHelper) {
                this.upstream = subscriptionHelper;
                try {
                    this.onCancel.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
                interfaceC7918d.cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            try {
                this.onSubscribe.accept(interfaceC7918d);
                if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                    this.upstream = interfaceC7918d;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                interfaceC7918d.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.downstream);
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            try {
                this.onRequest.accept(j6);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.request(j6);
        }
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super InterfaceC7918d> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber(interfaceC7917c, this.onSubscribe, this.onRequest, this.onCancel));
    }
}

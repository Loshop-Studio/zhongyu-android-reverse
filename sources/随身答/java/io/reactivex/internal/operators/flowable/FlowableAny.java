package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableAny<T> extends AbstractFlowableWithUpstream<T, Boolean> {
    final Predicate<? super T> predicate;

    public static final class AnySubscriber<T> extends DeferredScalarSubscription<Boolean> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2311252482644620661L;
        boolean done;
        final Predicate<? super T> predicate;
        InterfaceC0051d upstream;

        public AnySubscriber(InterfaceC0050c interfaceC0050c, Predicate<? super T> predicate) {
            super(interfaceC0050c);
            this.predicate = predicate;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p010a9.InterfaceC0051d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            complete(Boolean.FALSE);
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.done) {
                return;
            }
            try {
                if (this.predicate.test(t9)) {
                    this.done = true;
                    this.upstream.cancel();
                    complete(Boolean.TRUE);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                this.downstream.onSubscribe(this);
                interfaceC0051d.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableAny(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        this.source.subscribe((FlowableSubscriber) new AnySubscriber(interfaceC0050c, this.predicate));
    }
}

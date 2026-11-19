package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean allowFatal;
    final Function<? super Throwable, ? extends InterfaceC8988b> nextSupplier;

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        final boolean allowFatal;
        boolean done;
        final InterfaceC8989c downstream;
        final Function<? super Throwable, ? extends InterfaceC8988b> nextSupplier;
        boolean once;
        long produced;

        public OnErrorNextSubscriber(InterfaceC8989c interfaceC8989c, Function<? super Throwable, ? extends InterfaceC8988b> function, boolean z9) {
            super(false);
            this.downstream = interfaceC8989c;
            this.nextSupplier = function;
            this.allowFatal = z9;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.once) {
                if (this.done) {
                    RxJavaPlugins.onError(th);
                    return;
                } else {
                    this.downstream.onError(th);
                    return;
                }
            }
            this.once = true;
            if (this.allowFatal && !(th instanceof Exception)) {
                this.downstream.onError(th);
                return;
            }
            try {
                InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.nextSupplier.apply(th), "The nextSupplier returned a null Publisher");
                long j10 = this.produced;
                if (j10 != 0) {
                    produced(j10);
                }
                interfaceC8988b.subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (!this.once) {
                this.produced++;
            }
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            setSubscription(interfaceC8990d);
        }
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends InterfaceC8988b> function, boolean z9) {
        super(flowable);
        this.nextSupplier = function;
        this.allowFatal = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(interfaceC8989c, this.nextSupplier, this.allowFatal);
        interfaceC8989c.onSubscribe(onErrorNextSubscriber);
        this.source.subscribe((FlowableSubscriber) onErrorNextSubscriber);
    }
}

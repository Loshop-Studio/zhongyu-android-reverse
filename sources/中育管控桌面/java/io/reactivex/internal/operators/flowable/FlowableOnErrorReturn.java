package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Throwable, ? extends T> valueSupplier;

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final Function<? super Throwable, ? extends T> valueSupplier;

        public OnErrorReturnSubscriber(InterfaceC7917c interfaceC7917c, Function<? super Throwable, ? extends T> function) {
            super(interfaceC7917c);
            this.valueSupplier = function;
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            try {
                complete(ObjectHelper.requireNonNull(this.valueSupplier.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.produced++;
            this.downstream.onNext(t6);
        }
    }

    public FlowableOnErrorReturn(Flowable<T> flowable, Function<? super Throwable, ? extends T> function) {
        super(flowable);
        this.valueSupplier = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        this.source.subscribe((FlowableSubscriber) new OnErrorReturnSubscriber(interfaceC7917c, this.valueSupplier));
    }
}

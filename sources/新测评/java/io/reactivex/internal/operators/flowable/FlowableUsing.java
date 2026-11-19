package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {
    final Consumer<? super D> disposer;
    final boolean eager;
    final Callable<? extends D> resourceSupplier;
    final Function<? super D, ? extends InterfaceC8988b> sourceSupplier;

    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC8990d {
        private static final long serialVersionUID = 5904473792286235046L;
        final Consumer<? super D> disposer;
        final InterfaceC8989c downstream;
        final boolean eager;
        final D resource;
        InterfaceC8990d upstream;

        public UsingSubscriber(InterfaceC8989c interfaceC8989c, D d10, Consumer<? super D> consumer, boolean z9) {
            this.downstream = interfaceC8989c;
            this.resource = d10;
            this.disposer = consumer;
            this.eager = z9;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            disposeAfter();
            this.upstream.cancel();
        }

        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (!this.eager) {
                this.downstream.onComplete();
                this.upstream.cancel();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                    return;
                }
            }
            this.upstream.cancel();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (!this.eager) {
                this.downstream.onError(th);
                this.upstream.cancel();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    Exceptions.throwIfFatal(th);
                }
            } else {
                th = null;
            }
            this.upstream.cancel();
            if (th != null) {
                this.downstream.onError(new CompositeException(th, th));
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            this.upstream.request(j10);
        }
    }

    public FlowableUsing(Callable<? extends D> callable, Function<? super D, ? extends InterfaceC8988b> function, Consumer<? super D> consumer, boolean z9) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.disposer = consumer;
        this.eager = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((InterfaceC8988b) ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null Publisher")).subscribe(new UsingSubscriber(interfaceC8989c, dCall, this.disposer, this.eager));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                try {
                    this.disposer.accept(dCall);
                    EmptySubscription.error(th, interfaceC8989c);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(new CompositeException(th, th2), interfaceC8989c);
                }
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, interfaceC8989c);
        }
    }
}

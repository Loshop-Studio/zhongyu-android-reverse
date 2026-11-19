package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p002a0.InterfaceC0007b;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends InterfaceC8988b> mapper;
        final T value;

        public ScalarXMapFlowable(T t10, Function<? super T, ? extends InterfaceC8988b> function) {
            this.value = t10;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC8989c interfaceC8989c) {
            try {
                InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (!(interfaceC8988b instanceof Callable)) {
                    interfaceC8988b.subscribe(interfaceC8989c);
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC8988b).call();
                    if (objCall == null) {
                        EmptySubscription.complete(interfaceC8989c);
                    } else {
                        interfaceC8989c.onSubscribe(new ScalarSubscription(interfaceC8989c, objCall));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, interfaceC8989c);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, interfaceC8989c);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t10, Function<? super T, ? extends InterfaceC8988b> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t10, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(InterfaceC8988b interfaceC8988b, InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function) {
        if (!(interfaceC8988b instanceof Callable)) {
            return false;
        }
        try {
            InterfaceC0007b interfaceC0007b = (Object) ((Callable) interfaceC8988b).call();
            if (interfaceC0007b == null) {
                EmptySubscription.complete(interfaceC8989c);
                return true;
            }
            try {
                InterfaceC8988b interfaceC8988b2 = (InterfaceC8988b) ObjectHelper.requireNonNull(function.apply(interfaceC0007b), "The mapper returned a null Publisher");
                if (interfaceC8988b2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) interfaceC8988b2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(interfaceC8989c);
                            return true;
                        }
                        interfaceC8989c.onSubscribe(new ScalarSubscription(interfaceC8989c, objCall));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, interfaceC8989c);
                        return true;
                    }
                } else {
                    interfaceC8988b2.subscribe(interfaceC8989c);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC8989c);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, interfaceC8989c);
            return true;
        }
    }
}

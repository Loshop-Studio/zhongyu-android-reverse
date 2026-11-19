package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p001a0.C0007d;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends InterfaceC0049b> mapper;
        final T value;

        public ScalarXMapFlowable(T t9, Function<? super T, ? extends InterfaceC0049b> function) {
            this.value = t9;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC0050c interfaceC0050c) {
            try {
                InterfaceC0049b interfaceC0049b = (InterfaceC0049b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (!(interfaceC0049b instanceof Callable)) {
                    interfaceC0049b.subscribe(interfaceC0050c);
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC0049b).call();
                    if (objCall == null) {
                        EmptySubscription.complete(interfaceC0050c);
                    } else {
                        interfaceC0050c.onSubscribe(new ScalarSubscription(interfaceC0050c, objCall));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, interfaceC0050c);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, interfaceC0050c);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t9, Function<? super T, ? extends InterfaceC0049b> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t9, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(InterfaceC0049b interfaceC0049b, InterfaceC0050c interfaceC0050c, Function<? super T, ? extends InterfaceC0049b> function) {
        if (!(interfaceC0049b instanceof Callable)) {
            return false;
        }
        try {
            C0007d.a aVar = (Object) ((Callable) interfaceC0049b).call();
            if (aVar == null) {
                EmptySubscription.complete(interfaceC0050c);
                return true;
            }
            try {
                InterfaceC0049b interfaceC0049b2 = (InterfaceC0049b) ObjectHelper.requireNonNull(function.apply(aVar), "The mapper returned a null Publisher");
                if (interfaceC0049b2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) interfaceC0049b2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(interfaceC0050c);
                            return true;
                        }
                        interfaceC0050c.onSubscribe(new ScalarSubscription(interfaceC0050c, objCall));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, interfaceC0050c);
                        return true;
                    }
                } else {
                    interfaceC0049b2.subscribe(interfaceC0050c);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC0050c);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, interfaceC0050c);
            return true;
        }
    }
}

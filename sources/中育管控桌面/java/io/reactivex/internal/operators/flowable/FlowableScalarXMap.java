package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p003a2.AbstractDialogC0008a;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends InterfaceC7916b> mapper;
        final T value;

        public ScalarXMapFlowable(T t6, Function<? super T, ? extends InterfaceC7916b> function) {
            this.value = t6;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC7917c interfaceC7917c) {
            try {
                InterfaceC7916b interfaceC7916b = (InterfaceC7916b) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (!(interfaceC7916b instanceof Callable)) {
                    interfaceC7916b.subscribe(interfaceC7917c);
                    return;
                }
                try {
                    Object objCall = ((Callable) interfaceC7916b).call();
                    if (objCall == null) {
                        EmptySubscription.complete(interfaceC7917c);
                    } else {
                        interfaceC7917c.onSubscribe(new ScalarSubscription(interfaceC7917c, objCall));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, interfaceC7917c);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, interfaceC7917c);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t6, Function<? super T, ? extends InterfaceC7916b> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t6, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(InterfaceC7916b interfaceC7916b, InterfaceC7917c interfaceC7917c, Function<? super T, ? extends InterfaceC7916b> function) {
        if (!(interfaceC7916b instanceof Callable)) {
            return false;
        }
        try {
            AbstractDialogC0008a abstractDialogC0008a = (Object) ((Callable) interfaceC7916b).call();
            if (abstractDialogC0008a == null) {
                EmptySubscription.complete(interfaceC7917c);
                return true;
            }
            try {
                InterfaceC7916b interfaceC7916b2 = (InterfaceC7916b) ObjectHelper.requireNonNull(function.apply(abstractDialogC0008a), "The mapper returned a null Publisher");
                if (interfaceC7916b2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) interfaceC7916b2).call();
                        if (objCall == null) {
                            EmptySubscription.complete(interfaceC7917c);
                            return true;
                        }
                        interfaceC7917c.onSubscribe(new ScalarSubscription(interfaceC7917c, objCall));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, interfaceC7917c);
                        return true;
                    }
                } else {
                    interfaceC7916b2.subscribe(interfaceC7917c);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC7917c);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, interfaceC7917c);
            return true;
        }
    }
}

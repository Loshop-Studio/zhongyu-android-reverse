package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    final Callable<? extends InterfaceC7916b> supplier;

    public FlowableDefer(Callable<? extends InterfaceC7916b> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        try {
            ((InterfaceC7916b) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(interfaceC7917c);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC7917c);
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    final Callable<? extends InterfaceC8988b> supplier;

    public FlowableDefer(Callable<? extends InterfaceC8988b> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        try {
            ((InterfaceC8988b) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(interfaceC8989c);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC8989c);
        }
    }
}

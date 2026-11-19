package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    final Callable<? extends InterfaceC0049b> supplier;

    public FlowableDefer(Callable<? extends InterfaceC0049b> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        try {
            ((InterfaceC0049b) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(interfaceC0050c);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC0050c);
        }
    }
}

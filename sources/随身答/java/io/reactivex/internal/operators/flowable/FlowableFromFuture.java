package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p010a9.InterfaceC0050c;

/* loaded from: classes5.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j9, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j9;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC0050c);
        interfaceC0050c.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            T t9 = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t9 == null) {
                interfaceC0050c.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t9);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            interfaceC0050c.onError(th);
        }
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p193y5.InterfaceC7917c;

/* loaded from: classes4.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j6, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j6;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC7917c);
        interfaceC7917c.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            T t6 = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t6 == null) {
                interfaceC7917c.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t6);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            interfaceC7917c.onError(th);
        }
    }
}

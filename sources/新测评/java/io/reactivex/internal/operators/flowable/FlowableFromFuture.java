package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p215q9.InterfaceC8989c;

/* loaded from: classes5.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j10;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC8989c);
        interfaceC8989c.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            T t10 = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t10 == null) {
                interfaceC8989c.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t10);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            interfaceC8989c.onError(th);
        }
    }
}

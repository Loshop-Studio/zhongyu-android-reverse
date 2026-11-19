package p147rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.exceptions.Exceptions;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class SingleFromFuture<T> implements Single.OnSubscribe<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public SingleFromFuture(Future<? extends T> future, long j4, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j4;
        this.unit = timeUnit;
    }

    @Override // p147rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Future<? extends T> future = this.future;
        singleSubscriber.add(Subscriptions.from(future));
        try {
            long j4 = this.timeout;
            singleSubscriber.onSuccess(j4 == 0 ? future.get() : future.get(j4, this.unit));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}

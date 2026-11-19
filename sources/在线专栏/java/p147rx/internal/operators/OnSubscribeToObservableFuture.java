package p147rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;
import p147rx.internal.producers.SingleProducer;
import p147rx.subscriptions.Subscriptions;

/* loaded from: classes2.dex */
public final class OnSubscribeToObservableFuture {

    static class ToObservableFuture<T> implements Observable.OnSubscribe<T> {
        final Future<? extends T> that;
        private final long time;
        private final TimeUnit unit;

        public ToObservableFuture(Future<? extends T> future) {
            this.that = future;
            this.time = 0L;
            this.unit = null;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super T> subscriber) {
            subscriber.add(Subscriptions.create(new Action0() { // from class: rx.internal.operators.OnSubscribeToObservableFuture.ToObservableFuture.1
                @Override // p147rx.functions.Action0
                public void call() {
                    ToObservableFuture.this.that.cancel(true);
                }
            }));
            try {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.unit;
                subscriber.setProducer(new SingleProducer(subscriber, timeUnit == null ? this.that.get() : this.that.get(this.time, timeUnit)));
            } catch (Throwable th) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                Exceptions.throwOrReport(th, subscriber);
            }
        }

        public ToObservableFuture(Future<? extends T> future, long j4, TimeUnit timeUnit) {
            this.that = future;
            this.time = j4;
            this.unit = timeUnit;
        }
    }

    private OnSubscribeToObservableFuture() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future) {
        return new ToObservableFuture(future);
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future, long j4, TimeUnit timeUnit) {
        return new ToObservableFuture(future, j4, timeUnit);
    }
}

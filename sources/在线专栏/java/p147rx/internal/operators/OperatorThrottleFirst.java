package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Subscriber;

/* loaded from: classes2.dex */
public final class OperatorThrottleFirst<T> implements Observable.Operator<T, T> {
    final Scheduler scheduler;
    final long timeInMilliseconds;

    public OperatorThrottleFirst(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.timeInMilliseconds = timeUnit.toMillis(j4);
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorThrottleFirst.1
            private long lastOnNext = -1;

            @Override // p147rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                long jNow = OperatorThrottleFirst.this.scheduler.now();
                long j4 = this.lastOnNext;
                if (j4 == -1 || jNow < j4 || jNow - j4 >= OperatorThrottleFirst.this.timeInMilliseconds) {
                    this.lastOnNext = jNow;
                    subscriber.onNext(t3);
                }
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }
        };
    }
}

package p147rx.internal.operators;

import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.schedulers.TimeInterval;

/* loaded from: classes2.dex */
public final class OperatorTimeInterval<T> implements Observable.Operator<TimeInterval<T>, T> {
    final Scheduler scheduler;

    public OperatorTimeInterval(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super TimeInterval<T>> subscriber) {
        return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorTimeInterval.1
            private long lastTimestamp;

            {
                this.lastTimestamp = OperatorTimeInterval.this.scheduler.now();
            }

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
                long jNow = OperatorTimeInterval.this.scheduler.now();
                subscriber.onNext(new TimeInterval(jNow - this.lastTimestamp, t3));
                this.lastTimestamp = jNow;
            }
        };
    }
}

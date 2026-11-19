package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class OnSubscribeSkipTimed<T> implements Observable.OnSubscribe<T> {
    final Scheduler scheduler;
    final Observable<T> source;
    final long time;
    final TimeUnit unit;

    static final class SkipTimedSubscriber<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> child;
        volatile boolean gate;

        SkipTimedSubscriber(Subscriber<? super T> subscriber) {
            this.child = subscriber;
        }

        @Override // p147rx.functions.Action0
        public void call() {
            this.gate = true;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            try {
                this.child.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            try {
                this.child.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.gate) {
                this.child.onNext(t3);
            }
        }
    }

    public OnSubscribeSkipTimed(Observable<T> observable, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = observable;
        this.time = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        SkipTimedSubscriber skipTimedSubscriber = new SkipTimedSubscriber(subscriber);
        skipTimedSubscriber.add(workerCreateWorker);
        subscriber.add(skipTimedSubscriber);
        workerCreateWorker.schedule(skipTimedSubscriber, this.time, this.unit);
        this.source.unsafeSubscribe(skipTimedSubscriber);
    }
}

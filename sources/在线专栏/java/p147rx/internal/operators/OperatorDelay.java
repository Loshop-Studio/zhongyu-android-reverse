package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class OperatorDelay<T> implements Observable.Operator<T, T> {
    final long delay;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* renamed from: rx.internal.operators.OperatorDelay$1 */
    class C31841 extends Subscriber<T> {
        boolean done;
        final /* synthetic */ Subscriber val$child;
        final /* synthetic */ Scheduler.Worker val$worker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31841(Subscriber subscriber, Scheduler.Worker worker, Subscriber subscriber2) {
            super(subscriber);
            this.val$worker = worker;
            this.val$child = subscriber2;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            Scheduler.Worker worker = this.val$worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorDelay.1.1
                @Override // p147rx.functions.Action0
                public void call() {
                    C31841 c31841 = C31841.this;
                    if (c31841.done) {
                        return;
                    }
                    c31841.done = true;
                    c31841.val$child.onCompleted();
                }
            };
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(action0, operatorDelay.delay, operatorDelay.unit);
        }

        @Override // p147rx.Observer
        public void onError(final Throwable th) {
            this.val$worker.schedule(new Action0() { // from class: rx.internal.operators.OperatorDelay.1.2
                @Override // p147rx.functions.Action0
                public void call() {
                    C31841 c31841 = C31841.this;
                    if (c31841.done) {
                        return;
                    }
                    c31841.done = true;
                    c31841.val$child.onError(th);
                    C31841.this.val$worker.unsubscribe();
                }
            });
        }

        @Override // p147rx.Observer
        public void onNext(final T t3) {
            Scheduler.Worker worker = this.val$worker;
            Action0 action0 = new Action0() { // from class: rx.internal.operators.OperatorDelay.1.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p147rx.functions.Action0
                public void call() {
                    C31841 c31841 = C31841.this;
                    if (c31841.done) {
                        return;
                    }
                    c31841.val$child.onNext(t3);
                }
            };
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(action0, operatorDelay.delay, operatorDelay.unit);
        }
    }

    public OperatorDelay(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.delay = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        subscriber.add(workerCreateWorker);
        return new C31841(subscriber, workerCreateWorker, subscriber);
    }
}

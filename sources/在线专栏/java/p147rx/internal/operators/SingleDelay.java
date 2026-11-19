package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p147rx.Scheduler;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class SingleDelay<T> implements Single.OnSubscribe<T> {
    final long delay;
    final Scheduler scheduler;
    final Single.OnSubscribe<T> source;
    final TimeUnit unit;

    static final class ObserveOnSingleSubscriber<T> extends SingleSubscriber<T> implements Action0 {
        final SingleSubscriber<? super T> actual;
        final long delay;
        Throwable error;
        final TimeUnit unit;
        T value;

        /* renamed from: w */
        final Scheduler.Worker f11787w;

        public ObserveOnSingleSubscriber(SingleSubscriber<? super T> singleSubscriber, Scheduler.Worker worker, long j4, TimeUnit timeUnit) {
            this.actual = singleSubscriber;
            this.f11787w = worker;
            this.delay = j4;
            this.unit = timeUnit;
        }

        @Override // p147rx.functions.Action0
        public void call() {
            try {
                Throwable th = this.error;
                if (th != null) {
                    this.error = null;
                    this.actual.onError(th);
                } else {
                    T t3 = this.value;
                    this.value = null;
                    this.actual.onSuccess(t3);
                }
            } finally {
                this.f11787w.unsubscribe();
            }
        }

        @Override // p147rx.SingleSubscriber
        public void onError(Throwable th) {
            this.error = th;
            this.f11787w.schedule(this, this.delay, this.unit);
        }

        @Override // p147rx.SingleSubscriber
        public void onSuccess(T t3) {
            this.value = t3;
            this.f11787w.schedule(this, this.delay, this.unit);
        }
    }

    public SingleDelay(Single.OnSubscribe<T> onSubscribe, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = onSubscribe;
        this.scheduler = scheduler;
        this.delay = j4;
        this.unit = timeUnit;
    }

    @Override // p147rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        ObserveOnSingleSubscriber observeOnSingleSubscriber = new ObserveOnSingleSubscriber(singleSubscriber, workerCreateWorker, this.delay, this.unit);
        singleSubscriber.add(workerCreateWorker);
        singleSubscriber.add(observeOnSingleSubscriber);
        this.source.call(observeOnSingleSubscriber);
    }
}

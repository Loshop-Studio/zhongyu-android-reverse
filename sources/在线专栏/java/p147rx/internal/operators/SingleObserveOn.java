package p147rx.internal.operators;

import p147rx.Scheduler;
import p147rx.Single;
import p147rx.SingleSubscriber;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class SingleObserveOn<T> implements Single.OnSubscribe<T> {
    final Scheduler scheduler;
    final Single.OnSubscribe<T> source;

    static final class ObserveOnSingleSubscriber<T> extends SingleSubscriber<T> implements Action0 {
        final SingleSubscriber<? super T> actual;
        Throwable error;
        T value;

        /* renamed from: w */
        final Scheduler.Worker f11788w;

        public ObserveOnSingleSubscriber(SingleSubscriber<? super T> singleSubscriber, Scheduler.Worker worker) {
            this.actual = singleSubscriber;
            this.f11788w = worker;
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
                this.f11788w.unsubscribe();
            }
        }

        @Override // p147rx.SingleSubscriber
        public void onError(Throwable th) {
            this.error = th;
            this.f11788w.schedule(this);
        }

        @Override // p147rx.SingleSubscriber
        public void onSuccess(T t3) {
            this.value = t3;
            this.f11788w.schedule(this);
        }
    }

    public SingleObserveOn(Single.OnSubscribe<T> onSubscribe, Scheduler scheduler) {
        this.source = onSubscribe;
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        ObserveOnSingleSubscriber observeOnSingleSubscriber = new ObserveOnSingleSubscriber(singleSubscriber, workerCreateWorker);
        singleSubscriber.add(workerCreateWorker);
        singleSubscriber.add(observeOnSingleSubscriber);
        this.source.call(observeOnSingleSubscriber);
    }
}

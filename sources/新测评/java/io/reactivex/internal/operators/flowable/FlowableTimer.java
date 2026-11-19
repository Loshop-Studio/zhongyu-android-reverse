package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableTimer extends Flowable<Long> {
    final long delay;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements InterfaceC8990d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final InterfaceC8989c downstream;
        volatile boolean requested;

        public TimerSubscriber(InterfaceC8989c interfaceC8989c) {
            this.downstream = interfaceC8989c;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.requested) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.delay = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(interfaceC8989c);
        interfaceC8989c.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.scheduler.scheduleDirect(timerSubscriber, this.delay, this.unit));
    }
}

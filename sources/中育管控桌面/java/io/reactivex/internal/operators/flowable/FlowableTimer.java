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
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableTimer extends Flowable<Long> {
    final long delay;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements InterfaceC7918d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final InterfaceC7917c downstream;
        volatile boolean requested;

        public TimerSubscriber(InterfaceC7917c interfaceC7917c) {
            this.downstream = interfaceC7917c;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            if (SubscriptionHelper.validate(j6)) {
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

    public FlowableTimer(long j6, TimeUnit timeUnit, Scheduler scheduler) {
        this.delay = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(interfaceC7917c);
        interfaceC7917c.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.scheduler.scheduleDirect(timerSubscriber, this.delay, this.unit));
    }
}

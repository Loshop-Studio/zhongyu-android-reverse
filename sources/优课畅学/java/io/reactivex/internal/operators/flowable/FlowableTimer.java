package io.reactivex.internal.operators.flowable;

import ba.InterfaceC5218b;
import ba.InterfaceC5219c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p244s6.AbstractC10045b;
import p244s6.AbstractC10049f;
import p277v6.InterfaceC10250b;

/* loaded from: classes5.dex */
public final class FlowableTimer extends AbstractC10045b {

    /* renamed from: b */
    public final AbstractC10049f f17087b;

    /* renamed from: c */
    public final long f17088c;

    /* renamed from: d */
    public final TimeUnit f17089d;

    public static final class TimerSubscriber extends AtomicReference<InterfaceC10250b> implements InterfaceC5219c, Runnable {

        /* renamed from: a */
        public final InterfaceC5218b f17090a;

        /* renamed from: b */
        public volatile boolean f17091b;

        public TimerSubscriber(InterfaceC5218b interfaceC5218b) {
            this.f17090a = interfaceC5218b;
        }

        /* renamed from: a */
        public void m15554a(InterfaceC10250b interfaceC10250b) {
            DisposableHelper.m15534g(this, interfaceC10250b);
        }

        @Override // ba.InterfaceC5219c
        public void cancel() {
            DisposableHelper.m15529a(this);
        }

        @Override // ba.InterfaceC5219c
        public void request(long j10) {
            if (SubscriptionHelper.m15574g(j10)) {
                this.f17091b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.f17091b) {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f17090a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f17090a.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.f17090a.onComplete();
                }
            }
        }
    }

    public FlowableTimer(long j10, TimeUnit timeUnit, AbstractC10049f abstractC10049f) {
        this.f17088c = j10;
        this.f17089d = timeUnit;
        this.f17087b = abstractC10049f;
    }

    @Override // p244s6.AbstractC10045b
    /* renamed from: k */
    public void mo15536k(InterfaceC5218b interfaceC5218b) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(interfaceC5218b);
        interfaceC5218b.onSubscribe(timerSubscriber);
        timerSubscriber.m15554a(this.f17087b.mo13463b(timerSubscriber, this.f17088c, this.f17089d));
    }
}

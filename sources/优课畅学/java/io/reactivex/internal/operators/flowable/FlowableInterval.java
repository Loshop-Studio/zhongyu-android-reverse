package io.reactivex.internal.operators.flowable;

import ba.InterfaceC5218b;
import ba.InterfaceC5219c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p076d7.C8315f;
import p088e7.AbstractC8368a;
import p244s6.AbstractC10045b;
import p244s6.AbstractC10049f;
import p277v6.InterfaceC10250b;

/* loaded from: classes5.dex */
public final class FlowableInterval extends AbstractC10045b {

    /* renamed from: b */
    public final AbstractC10049f f17053b;

    /* renamed from: c */
    public final long f17054c;

    /* renamed from: d */
    public final long f17055d;

    /* renamed from: e */
    public final TimeUnit f17056e;

    public static final class IntervalSubscriber extends AtomicLong implements InterfaceC5219c, Runnable {

        /* renamed from: a */
        public final InterfaceC5218b f17057a;

        /* renamed from: b */
        public long f17058b;

        /* renamed from: c */
        public final AtomicReference f17059c = new AtomicReference();

        public IntervalSubscriber(InterfaceC5218b interfaceC5218b) {
            this.f17057a = interfaceC5218b;
        }

        /* renamed from: a */
        public void m15547a(InterfaceC10250b interfaceC10250b) {
            DisposableHelper.m15533e(this.f17059c, interfaceC10250b);
        }

        @Override // ba.InterfaceC5219c
        public void cancel() {
            DisposableHelper.m15529a(this.f17059c);
        }

        @Override // ba.InterfaceC5219c
        public void request(long j10) {
            if (SubscriptionHelper.m15574g(j10)) {
                AbstractC8368a.m13654a(this, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17059c.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    InterfaceC5218b interfaceC5218b = this.f17057a;
                    long j10 = this.f17058b;
                    this.f17058b = j10 + 1;
                    interfaceC5218b.onNext(Long.valueOf(j10));
                    AbstractC8368a.m13656c(this, 1L);
                    return;
                }
                this.f17057a.onError(new MissingBackpressureException("Can't deliver value " + this.f17058b + " due to lack of requests"));
                DisposableHelper.m15529a(this.f17059c);
            }
        }
    }

    public FlowableInterval(long j10, long j11, TimeUnit timeUnit, AbstractC10049f abstractC10049f) {
        this.f17054c = j10;
        this.f17055d = j11;
        this.f17056e = timeUnit;
        this.f17053b = abstractC10049f;
    }

    @Override // p244s6.AbstractC10045b
    /* renamed from: k */
    public void mo15536k(InterfaceC5218b interfaceC5218b) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(interfaceC5218b);
        interfaceC5218b.onSubscribe(intervalSubscriber);
        AbstractC10049f abstractC10049f = this.f17053b;
        if (!(abstractC10049f instanceof C8315f)) {
            intervalSubscriber.m15547a(abstractC10049f.mo13464c(intervalSubscriber, this.f17054c, this.f17055d, this.f17056e));
            return;
        }
        AbstractC10049f.c cVarMo13462a = abstractC10049f.mo13462a();
        intervalSubscriber.m15547a(cVarMo13462a);
        cVarMo13462a.m18754d(intervalSubscriber, this.f17054c, this.f17055d, this.f17056e);
    }
}

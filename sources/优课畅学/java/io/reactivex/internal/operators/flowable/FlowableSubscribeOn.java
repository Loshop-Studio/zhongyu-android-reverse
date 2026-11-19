package io.reactivex.internal.operators.flowable;

import ba.InterfaceC5217a;
import ba.InterfaceC5218b;
import ba.InterfaceC5219c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p027b7.AbstractC5209a;
import p088e7.AbstractC8368a;
import p244s6.AbstractC10045b;
import p244s6.AbstractC10049f;
import p244s6.InterfaceC10048e;

/* loaded from: classes5.dex */
public final class FlowableSubscribeOn extends AbstractC5209a {

    /* renamed from: c */
    public final AbstractC10049f f17077c;

    /* renamed from: d */
    public final boolean f17078d;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements InterfaceC10048e, InterfaceC5219c, Runnable {

        /* renamed from: a */
        public final InterfaceC5218b f17079a;

        /* renamed from: b */
        public final AbstractC10049f.c f17080b;

        /* renamed from: c */
        public final AtomicReference f17081c = new AtomicReference();

        /* renamed from: d */
        public final AtomicLong f17082d = new AtomicLong();

        /* renamed from: e */
        public final boolean f17083e;

        /* renamed from: f */
        public InterfaceC5217a f17084f;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$a */
        public static final class RunnableC8970a implements Runnable {

            /* renamed from: a */
            public final InterfaceC5219c f17085a;

            /* renamed from: b */
            public final long f17086b;

            public RunnableC8970a(InterfaceC5219c interfaceC5219c, long j10) {
                this.f17085a = interfaceC5219c;
                this.f17086b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17085a.request(this.f17086b);
            }
        }

        public SubscribeOnSubscriber(InterfaceC5218b interfaceC5218b, AbstractC10049f.c cVar, InterfaceC5217a interfaceC5217a, boolean z10) {
            this.f17079a = interfaceC5218b;
            this.f17080b = cVar;
            this.f17084f = interfaceC5217a;
            this.f17083e = !z10;
        }

        /* renamed from: a */
        public void m15553a(long j10, InterfaceC5219c interfaceC5219c) {
            if (this.f17083e || Thread.currentThread() == get()) {
                interfaceC5219c.request(j10);
            } else {
                this.f17080b.mo13466b(new RunnableC8970a(interfaceC5219c, j10));
            }
        }

        @Override // ba.InterfaceC5219c
        public void cancel() {
            SubscriptionHelper.m15569a(this.f17081c);
            this.f17080b.dispose();
        }

        @Override // ba.InterfaceC5218b
        public void onComplete() {
            this.f17079a.onComplete();
            this.f17080b.dispose();
        }

        @Override // ba.InterfaceC5218b
        public void onError(Throwable th) {
            this.f17079a.onError(th);
            this.f17080b.dispose();
        }

        @Override // ba.InterfaceC5218b
        public void onNext(Object obj) {
            this.f17079a.onNext(obj);
        }

        @Override // ba.InterfaceC5218b
        public void onSubscribe(InterfaceC5219c interfaceC5219c) {
            if (SubscriptionHelper.m15573e(this.f17081c, interfaceC5219c)) {
                long andSet = this.f17082d.getAndSet(0L);
                if (andSet != 0) {
                    m15553a(andSet, interfaceC5219c);
                }
            }
        }

        @Override // ba.InterfaceC5219c
        public void request(long j10) {
            if (SubscriptionHelper.m15574g(j10)) {
                InterfaceC5219c interfaceC5219c = (InterfaceC5219c) this.f17081c.get();
                if (interfaceC5219c != null) {
                    m15553a(j10, interfaceC5219c);
                    return;
                }
                AbstractC8368a.m13654a(this.f17082d, j10);
                InterfaceC5219c interfaceC5219c2 = (InterfaceC5219c) this.f17081c.get();
                if (interfaceC5219c2 != null) {
                    long andSet = this.f17082d.getAndSet(0L);
                    if (andSet != 0) {
                        m15553a(andSet, interfaceC5219c2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC5217a interfaceC5217a = this.f17084f;
            this.f17084f = null;
            interfaceC5217a.mo2110a(this);
        }
    }

    public FlowableSubscribeOn(AbstractC10045b abstractC10045b, AbstractC10049f abstractC10049f, boolean z10) {
        super(abstractC10045b);
        this.f17077c = abstractC10049f;
        this.f17078d = z10;
    }

    @Override // p244s6.AbstractC10045b
    /* renamed from: k */
    public void mo15536k(InterfaceC5218b interfaceC5218b) {
        AbstractC10049f.c cVarMo13462a = this.f17077c.mo13462a();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(interfaceC5218b, cVarMo13462a, this.f2291b, this.f17078d);
        interfaceC5218b.onSubscribe(subscribeOnSubscriber);
        cVarMo13462a.mo13466b(subscribeOnSubscriber);
    }
}

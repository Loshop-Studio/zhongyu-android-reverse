package io.reactivex.internal.operators.flowable;

import ba.InterfaceC5218b;
import ba.InterfaceC5219c;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import p008a7.InterfaceC0043b;
import p008a7.InterfaceC0044c;
import p027b7.AbstractC5209a;
import p088e7.AbstractC8368a;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10045b;
import p244s6.AbstractC10049f;
import p244s6.InterfaceC10048e;
import p288w6.AbstractC10359a;

/* loaded from: classes5.dex */
public final class FlowableObserveOn extends AbstractC5209a {

    /* renamed from: c */
    public final AbstractC10049f f17060c;

    /* renamed from: d */
    public final boolean f17061d;

    /* renamed from: e */
    public final int f17062e;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements InterfaceC10048e, Runnable {

        /* renamed from: a */
        public final AbstractC10049f.c f17063a;

        /* renamed from: b */
        public final boolean f17064b;

        /* renamed from: c */
        public final int f17065c;

        /* renamed from: d */
        public final int f17066d;

        /* renamed from: e */
        public final AtomicLong f17067e = new AtomicLong();

        /* renamed from: f */
        public InterfaceC5219c f17068f;

        /* renamed from: g */
        public InterfaceC0044c f17069g;

        /* renamed from: h */
        public volatile boolean f17070h;

        /* renamed from: i */
        public volatile boolean f17071i;

        /* renamed from: j */
        public Throwable f17072j;

        /* renamed from: k */
        public int f17073k;

        /* renamed from: l */
        public long f17074l;

        /* renamed from: m */
        public boolean f17075m;

        public BaseObserveOnSubscriber(AbstractC10049f.c cVar, boolean z10, int i10) {
            this.f17063a = cVar;
            this.f17064b = z10;
            this.f17065c = i10;
            this.f17066d = i10 - (i10 >> 2);
        }

        @Override // p008a7.InterfaceC0042a
        /* renamed from: a */
        public final int mo116a(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f17075m = true;
            return 2;
        }

        /* renamed from: b */
        public final boolean m15548b(boolean z10, boolean z11, InterfaceC5218b interfaceC5218b) {
            if (this.f17070h) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f17064b) {
                if (!z11) {
                    return false;
                }
                this.f17070h = true;
                Throwable th = this.f17072j;
                if (th != null) {
                    interfaceC5218b.onError(th);
                } else {
                    interfaceC5218b.onComplete();
                }
                this.f17063a.dispose();
                return true;
            }
            Throwable th2 = this.f17072j;
            if (th2 != null) {
                this.f17070h = true;
                clear();
                interfaceC5218b.onError(th2);
                this.f17063a.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f17070h = true;
            interfaceC5218b.onComplete();
            this.f17063a.dispose();
            return true;
        }

        /* renamed from: c */
        public abstract void mo15549c();

        @Override // ba.InterfaceC5219c
        public final void cancel() {
            if (this.f17070h) {
                return;
            }
            this.f17070h = true;
            this.f17068f.cancel();
            this.f17063a.dispose();
            if (getAndIncrement() == 0) {
                this.f17069g.clear();
            }
        }

        @Override // p008a7.InterfaceC0044c
        public final void clear() {
            this.f17069g.clear();
        }

        /* renamed from: d */
        public abstract void mo15550d();

        /* renamed from: e */
        public abstract void mo15551e();

        /* renamed from: g */
        public final void m15552g() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f17063a.mo13466b(this);
        }

        @Override // p008a7.InterfaceC0044c
        public final boolean isEmpty() {
            return this.f17069g.isEmpty();
        }

        @Override // ba.InterfaceC5218b
        public final void onComplete() {
            if (this.f17071i) {
                return;
            }
            this.f17071i = true;
            m15552g();
        }

        @Override // ba.InterfaceC5218b
        public final void onError(Throwable th) {
            if (this.f17071i) {
                AbstractC8462a.m13801k(th);
                return;
            }
            this.f17072j = th;
            this.f17071i = true;
            m15552g();
        }

        @Override // ba.InterfaceC5218b
        public final void onNext(Object obj) {
            if (this.f17071i) {
                return;
            }
            if (this.f17073k == 2) {
                m15552g();
                return;
            }
            if (!this.f17069g.offer(obj)) {
                this.f17068f.cancel();
                this.f17072j = new MissingBackpressureException("Queue is full?!");
                this.f17071i = true;
            }
            m15552g();
        }

        @Override // ba.InterfaceC5219c
        public final void request(long j10) {
            if (SubscriptionHelper.m15574g(j10)) {
                AbstractC8368a.m13654a(this.f17067e, j10);
                m15552g();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f17075m) {
                mo15550d();
            } else if (this.f17073k == 1) {
                mo15551e();
            } else {
                mo15549c();
            }
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements InterfaceC10048e {

        /* renamed from: n */
        public final InterfaceC5218b f17076n;

        public ObserveOnSubscriber(InterfaceC5218b interfaceC5218b, AbstractC10049f.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f17076n = interfaceC5218b;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: c */
        public void mo15549c() {
            InterfaceC5218b interfaceC5218b = this.f17076n;
            InterfaceC0044c interfaceC0044c = this.f17069g;
            long j10 = this.f17074l;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f17067e.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f17071i;
                    try {
                        Object objPoll = interfaceC0044c.poll();
                        boolean z11 = objPoll == null;
                        if (m15548b(z10, z11, interfaceC5218b)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC5218b.onNext(objPoll);
                        j10++;
                        if (j10 == this.f17066d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f17067e.addAndGet(-j10);
                            }
                            this.f17068f.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th) {
                        AbstractC10359a.m19297b(th);
                        this.f17070h = true;
                        this.f17068f.cancel();
                        interfaceC0044c.clear();
                        interfaceC5218b.onError(th);
                        this.f17063a.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && m15548b(this.f17071i, interfaceC0044c.isEmpty(), interfaceC5218b)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f17074l = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: d */
        public void mo15550d() {
            int iAddAndGet = 1;
            while (!this.f17070h) {
                boolean z10 = this.f17071i;
                this.f17076n.onNext(null);
                if (z10) {
                    this.f17070h = true;
                    Throwable th = this.f17072j;
                    if (th != null) {
                        this.f17076n.onError(th);
                    } else {
                        this.f17076n.onComplete();
                    }
                    this.f17063a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        /* renamed from: e */
        public void mo15551e() {
            InterfaceC5218b interfaceC5218b = this.f17076n;
            InterfaceC0044c interfaceC0044c = this.f17069g;
            long j10 = this.f17074l;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f17067e.get();
                while (j10 != j11) {
                    try {
                        Object objPoll = interfaceC0044c.poll();
                        if (this.f17070h) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f17070h = true;
                            interfaceC5218b.onComplete();
                            this.f17063a.dispose();
                            return;
                        }
                        interfaceC5218b.onNext(objPoll);
                        j10++;
                    } catch (Throwable th) {
                        AbstractC10359a.m19297b(th);
                        this.f17070h = true;
                        this.f17068f.cancel();
                        interfaceC5218b.onError(th);
                        this.f17063a.dispose();
                        return;
                    }
                }
                if (this.f17070h) {
                    return;
                }
                if (interfaceC0044c.isEmpty()) {
                    this.f17070h = true;
                    interfaceC5218b.onComplete();
                    this.f17063a.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f17074l = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // ba.InterfaceC5218b
        public void onSubscribe(InterfaceC5219c interfaceC5219c) {
            if (SubscriptionHelper.m15575h(this.f17068f, interfaceC5219c)) {
                this.f17068f = interfaceC5219c;
                if (interfaceC5219c instanceof InterfaceC0043b) {
                    InterfaceC0043b interfaceC0043b = (InterfaceC0043b) interfaceC5219c;
                    int iMo116a = interfaceC0043b.mo116a(7);
                    if (iMo116a == 1) {
                        this.f17073k = 1;
                        this.f17069g = interfaceC0043b;
                        this.f17071i = true;
                        this.f17076n.onSubscribe(this);
                        return;
                    }
                    if (iMo116a == 2) {
                        this.f17073k = 2;
                        this.f17069g = interfaceC0043b;
                        this.f17076n.onSubscribe(this);
                        interfaceC5219c.request(this.f17065c);
                        return;
                    }
                }
                this.f17069g = new SpscArrayQueue(this.f17065c);
                this.f17076n.onSubscribe(this);
                interfaceC5219c.request(this.f17065c);
            }
        }

        @Override // p008a7.InterfaceC0044c
        public Object poll() {
            Object objPoll = this.f17069g.poll();
            if (objPoll != null && this.f17073k != 1) {
                long j10 = this.f17074l + 1;
                if (j10 == this.f17066d) {
                    this.f17074l = 0L;
                    this.f17068f.request(j10);
                    return objPoll;
                }
                this.f17074l = j10;
            }
            return objPoll;
        }
    }

    public FlowableObserveOn(AbstractC10045b abstractC10045b, AbstractC10049f abstractC10049f, boolean z10, int i10) {
        super(abstractC10045b);
        this.f17060c = abstractC10049f;
        this.f17061d = z10;
        this.f17062e = i10;
    }

    @Override // p244s6.AbstractC10045b
    /* renamed from: k */
    public void mo15536k(InterfaceC5218b interfaceC5218b) {
        this.f2291b.m18750j(new ObserveOnSubscriber(interfaceC5218b, this.f17060c.mo13462a(), this.f17061d, this.f17062e));
    }
}

package p410xd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import sd.AbstractC11106e0;
import sd.AbstractC11114g0;
import sd.AbstractC11134l0;
import sd.InterfaceC11125j;
import sd.InterfaceC11146o0;
import sd.InterfaceC11163t0;

/* renamed from: xd.k */
/* loaded from: classes6.dex */
public final class C11854k extends AbstractC11106e0 implements InterfaceC11146o0 {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28097i = AtomicIntegerFieldUpdater.newUpdater(C11854k.class, "runningWorkers$volatile");

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11146o0 f28098c;

    /* renamed from: d */
    public final AbstractC11106e0 f28099d;

    /* renamed from: e */
    public final int f28100e;

    /* renamed from: f */
    public final String f28101f;

    /* renamed from: g */
    public final C11862o f28102g;

    /* renamed from: h */
    public final Object f28103h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: xd.k$a */
    public final class a implements Runnable {

        /* renamed from: c */
        public Runnable f28104c;

        public a(Runnable runnable) {
            this.f28104c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f28104c.run();
                } catch (Throwable th) {
                    AbstractC11114g0.m24718a(EmptyCoroutineContext.f23351c, th);
                }
                Runnable runnableM26299s = C11854k.this.m26299s();
                if (runnableM26299s == null) {
                    return;
                }
                try {
                    this.f28104c = runnableM26299s;
                    i10++;
                    if (i10 >= 16 && AbstractC11850i.m26280d(C11854k.this.f28099d, C11854k.this)) {
                        AbstractC11850i.m26279c(C11854k.this.f28099d, C11854k.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = C11854k.this.f28103h;
                    C11854k c11854k = C11854k.this;
                    synchronized (obj) {
                        C11854k.m26298r().decrementAndGet(c11854k);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11854k(AbstractC11106e0 abstractC11106e0, int i10, String str) {
        InterfaceC11146o0 interfaceC11146o0 = abstractC11106e0 instanceof InterfaceC11146o0 ? (InterfaceC11146o0) abstractC11106e0 : null;
        this.f28098c = interfaceC11146o0 == null ? AbstractC11134l0.m24749a() : interfaceC11146o0;
        this.f28099d = abstractC11106e0;
        this.f28100e = i10;
        this.f28101f = str;
        this.f28102g = new C11862o(false);
        this.f28103h = new Object();
    }

    /* renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m26298r() {
        return f28097i;
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: c */
    public InterfaceC11163t0 mo24710c(long j10, Runnable runnable, InterfaceC9945d interfaceC9945d) {
        return this.f28098c.mo24710c(j10, runnable, interfaceC9945d);
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: d */
    public void mo24711d(long j10, InterfaceC11125j interfaceC11125j) {
        this.f28098c.mo24711d(j10, interfaceC11125j);
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        Runnable runnableM26299s;
        this.f28102g.m26319a(runnable);
        if (f28097i.get(this) >= this.f28100e || !m26300u() || (runnableM26299s = m26299s()) == null) {
            return;
        }
        try {
            AbstractC11850i.m26279c(this.f28099d, this, new a(runnableM26299s));
        } catch (Throwable th) {
            f28097i.decrementAndGet(this);
            throw th;
        }
    }

    @Override // sd.AbstractC11106e0
    public void dispatchYield(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        Runnable runnableM26299s;
        this.f28102g.m26319a(runnable);
        if (f28097i.get(this) >= this.f28100e || !m26300u() || (runnableM26299s = m26299s()) == null) {
            return;
        }
        try {
            this.f28099d.dispatchYield(this, new a(runnableM26299s));
        } catch (Throwable th) {
            f28097i.decrementAndGet(this);
            throw th;
        }
    }

    @Override // sd.AbstractC11106e0
    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        AbstractC11856l.m26301a(i10);
        return i10 >= this.f28100e ? AbstractC11856l.m26302b(this, str) : super.limitedParallelism(i10, str);
    }

    /* renamed from: s */
    public final Runnable m26299s() {
        while (true) {
            Runnable runnable = (Runnable) this.f28102g.m26322e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f28103h) {
                f28097i.decrementAndGet(this);
                if (this.f28102g.m26321c() == 0) {
                    return null;
                }
                f28097i.incrementAndGet(this);
            }
        }
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        String str = this.f28101f;
        if (str != null) {
            return str;
        }
        return this.f28099d + ".limitedParallelism(" + this.f28100e + ')';
    }

    /* renamed from: u */
    public final boolean m26300u() {
        synchronized (this.f28103h) {
            if (f28097i.get(this) >= this.f28100e) {
                return false;
            }
            f28097i.incrementAndGet(this);
            return true;
        }
    }
}

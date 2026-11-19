package p192n9;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8722b;
import p147j9.AbstractC9041k;
import p181m9.AbstractC9343a;
import p181m9.C9345c;
import p181m9.C9346d;
import p192n9.InterfaceC9494u;

/* renamed from: n9.k */
/* loaded from: classes5.dex */
public final class C9484k implements InterfaceC9482i {

    /* renamed from: a */
    public final InterfaceC9494u f18749a;

    /* renamed from: b */
    public final C9346d f18750b;

    /* renamed from: c */
    public final long f18751c;

    /* renamed from: d */
    public long f18752d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f18753e;

    /* renamed from: f */
    public final BlockingQueue f18754f;

    /* renamed from: n9.k$a */
    public static final class a extends AbstractC9343a {

        /* renamed from: e */
        public final /* synthetic */ InterfaceC9494u.b f18755e;

        /* renamed from: f */
        public final /* synthetic */ C9484k f18756f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC9494u.b bVar, C9484k c9484k) {
            super(str, false, 2, null);
            this.f18755e = bVar;
            this.f18756f = c9484k;
        }

        @Override // p181m9.AbstractC9343a
        /* renamed from: f */
        public long mo17176f() throws InterruptedException {
            InterfaceC9494u.a aVar;
            try {
                aVar = this.f18755e.mo17447e();
            } catch (Throwable th) {
                aVar = new InterfaceC9494u.a(this.f18755e, null, th, 2, null);
            }
            if (!this.f18756f.f18753e.contains(this.f18755e)) {
                return -1L;
            }
            this.f18756f.f18754f.put(aVar);
            return -1L;
        }
    }

    public C9484k(InterfaceC9494u routePlanner, C9346d taskRunner) {
        AbstractC9133u.m16133g(routePlanner, "routePlanner");
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        this.f18749a = routePlanner;
        this.f18750b = taskRunner;
        this.f18751c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f18752d = Long.MIN_VALUE;
        this.f18753e = new CopyOnWriteArrayList();
        this.f18754f = taskRunner.m17205h().mo17211b(new LinkedBlockingDeque());
    }

    @Override // p192n9.InterfaceC9482i
    /* renamed from: a */
    public C9488o mo17492a() throws IOException {
        InterfaceC9494u.a aVarM17502g;
        long j10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f18753e.isEmpty() && !InterfaceC9494u.m17593f(mo17493b(), null, 1, null)) {
                    m17501f();
                    AbstractC9133u.m16130d(iOException);
                    throw iOException;
                }
                if (mo17493b().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jMo17214e = this.f18750b.m17205h().mo17214e();
                long j11 = this.f18752d - jMo17214e;
                if (this.f18753e.isEmpty() || j11 <= 0) {
                    aVarM17502g = m17502g();
                    j10 = this.f18751c;
                    this.f18752d = jMo17214e + j10;
                } else {
                    j10 = j11;
                    aVarM17502g = null;
                }
                if (aVarM17502g != null || (aVarM17502g = m17500e(j10, TimeUnit.NANOSECONDS)) != null) {
                    if (aVarM17502g.m17599f()) {
                        m17501f();
                        if (!aVarM17502g.m17597d().isReady()) {
                            aVarM17502g = aVarM17502g.m17597d().mo17445c();
                        }
                        if (aVarM17502g.m17599f()) {
                            return aVarM17502g.m17597d().mo17443a();
                        }
                    }
                    Throwable thM17598e = aVarM17502g.m17598e();
                    if (thM17598e != null) {
                        if (!(thM17598e instanceof IOException)) {
                            throw thM17598e;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thM17598e;
                        } else {
                            AbstractC8722b.m14228a(iOException, thM17598e);
                        }
                    }
                    InterfaceC9494u.b bVarM17596c = aVarM17502g.m17596c();
                    if (bVarM17596c != null) {
                        mo17493b().mo17505c().addFirst(bVarM17596c);
                    }
                }
            } finally {
                m17501f();
            }
        }
    }

    @Override // p192n9.InterfaceC9482i
    /* renamed from: b */
    public InterfaceC9494u mo17493b() {
        return this.f18749a;
    }

    /* renamed from: e */
    public final InterfaceC9494u.a m17500e(long j10, TimeUnit timeUnit) {
        InterfaceC9494u.a aVar;
        if (this.f18753e.isEmpty() || (aVar = (InterfaceC9494u.a) this.f18754f.poll(j10, timeUnit)) == null) {
            return null;
        }
        this.f18753e.remove(aVar.m17597d());
        return aVar;
    }

    /* renamed from: f */
    public final void m17501f() {
        Iterator it = this.f18753e.iterator();
        AbstractC9133u.m16132f(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC9494u.b bVar = (InterfaceC9494u.b) it.next();
            bVar.cancel();
            InterfaceC9494u.b bVarRetry = bVar.retry();
            if (bVarRetry != null) {
                mo17493b().mo17505c().addLast(bVarRetry);
            }
        }
        this.f18753e.clear();
    }

    /* renamed from: g */
    public final InterfaceC9494u.a m17502g() {
        InterfaceC9494u.b c9483j;
        if (InterfaceC9494u.m17593f(mo17493b(), null, 1, null)) {
            try {
                c9483j = mo17493b().mo17506d();
            } catch (Throwable th) {
                c9483j = new C9483j(th);
            }
            if (c9483j.isReady()) {
                return new InterfaceC9494u.a(c9483j, null, null, 6, null);
            }
            if (c9483j instanceof C9483j) {
                return ((C9483j) c9483j).m17495d();
            }
            this.f18753e.add(c9483j);
            C9345c.m17182m(this.f18750b.m17208k(), new a(AbstractC9041k.f17266c + " connect " + mo17493b().mo17503a().m14950l().m15291o(), c9483j, this), 0L, 2, null);
        }
        return null;
    }
}

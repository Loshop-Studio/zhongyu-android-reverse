package sd;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p410xd.C11861n0;
import p410xd.C11864p;
import p410xd.InterfaceC11863o0;
import sd.InterfaceC11146o0;

/* renamed from: sd.y0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11178y0 extends AbstractC11181z0 implements InterfaceC11146o0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26841f = AtomicReferenceFieldUpdater.newUpdater(AbstractC11178y0.class, Object.class, "_queue$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f26842g = AtomicReferenceFieldUpdater.newUpdater(AbstractC11178y0.class, Object.class, "_delayed$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26843h = AtomicIntegerFieldUpdater.newUpdater(AbstractC11178y0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: sd.y0$a */
    public final class a extends c {

        /* renamed from: e */
        public final InterfaceC11125j f26844e;

        public a(long j10, InterfaceC11125j interfaceC11125j) {
            super(j10);
            this.f26844e = interfaceC11125j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26844e.mo20501C(AbstractC11178y0.this, C10786q.f26013a);
        }

        @Override // sd.AbstractC11178y0.c
        public String toString() {
            return super.toString() + this.f26844e;
        }
    }

    /* renamed from: sd.y0$b */
    public static final class b extends c {

        /* renamed from: e */
        public final Runnable f26846e;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f26846e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26846e.run();
        }

        @Override // sd.AbstractC11178y0.c
        public String toString() {
            return super.toString() + this.f26846e;
        }
    }

    /* renamed from: sd.y0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC11163t0, InterfaceC11863o0 {
        private volatile Object _heap;

        /* renamed from: c */
        public long f26847c;

        /* renamed from: d */
        public int f26848d = -1;

        public c(long j10) {
            this.f26847c = j10;
        }

        @Override // p410xd.InterfaceC11863o0
        /* renamed from: b */
        public C11861n0 mo24847b() {
            Object obj = this._heap;
            if (obj instanceof C11861n0) {
                return (C11861n0) obj;
            }
            return null;
        }

        @Override // p410xd.InterfaceC11863o0
        /* renamed from: c */
        public void mo24848c(C11861n0 c11861n0) {
            if (this._heap == AbstractC11095b1.f26772a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c11861n0;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f26847c - cVar.f26847c;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // sd.InterfaceC11163t0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC11095b1.f26772a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m26311h(this);
                    }
                    this._heap = AbstractC11095b1.f26772a;
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final int m24850e(long j10, d dVar, AbstractC11178y0 abstractC11178y0) {
            synchronized (this) {
                if (this._heap == AbstractC11095b1.f26772a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.m26306b();
                        if (abstractC11178y0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f26849c = j10;
                        } else {
                            long j11 = cVar.f26847c;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f26849c > 0) {
                                dVar.f26849c = j10;
                            }
                        }
                        long j12 = this.f26847c;
                        long j13 = dVar.f26849c;
                        if (j12 - j13 < 0) {
                            this.f26847c = j13;
                        }
                        dVar.m26305a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* renamed from: f */
        public final boolean m24851f(long j10) {
            return j10 - this.f26847c >= 0;
        }

        @Override // p410xd.InterfaceC11863o0
        public int getIndex() {
            return this.f26848d;
        }

        @Override // p410xd.InterfaceC11863o0
        public void setIndex(int i10) {
            this.f26848d = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f26847c + ']';
        }
    }

    /* renamed from: sd.y0$d */
    public static final class d extends C11861n0 {

        /* renamed from: c */
        public long f26849c;

        public d(long j10) {
            this.f26849c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f26843h.get(this) == 1;
    }

    @Override // sd.AbstractC11175x0
    /* renamed from: B */
    public long mo24818B() {
        if (m24819C()) {
            return 0L;
        }
        m24837L();
        Runnable runnableM24836J = m24836J();
        if (runnableM24836J == null) {
            return mo24824r();
        }
        runnableM24836J.run();
        return 0L;
    }

    /* renamed from: I */
    public final void m24835I() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26841f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC3223a.m1395a(f26841f, this, null, AbstractC11095b1.f26773b)) {
                    return;
                }
            } else if (obj instanceof C11864p) {
                ((C11864p) obj).m26328d();
                return;
            } else {
                if (obj == AbstractC11095b1.f26773b) {
                    return;
                }
                C11864p c11864p = new C11864p(8, true);
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c11864p.m26325a((Runnable) obj);
                if (AbstractC3223a.m1395a(f26841f, this, obj, c11864p)) {
                    return;
                }
            }
        }
    }

    /* renamed from: J */
    public final Runnable m24836J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26841f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C11864p) {
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C11864p c11864p = (C11864p) obj;
                Object objM26335m = c11864p.m26335m();
                if (objM26335m != C11864p.f28117h) {
                    return (Runnable) objM26335m;
                }
                AbstractC3223a.m1395a(f26841f, this, obj, c11864p.m26334l());
            } else {
                if (obj == AbstractC11095b1.f26773b) {
                    return null;
                }
                if (AbstractC3223a.m1395a(f26841f, this, obj, null)) {
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: K */
    public void mo24742K(Runnable runnable) {
        m24837L();
        if (m24838M(runnable)) {
            m24852G();
        } else {
            RunnableC11130k0.f26794i.mo24742K(runnable);
        }
    }

    /* renamed from: L */
    public final void m24837L() {
        InterfaceC11863o0 interfaceC11863o0M26312i;
        d dVar = (d) f26842g.get(this);
        if (dVar == null || dVar.m26308e()) {
            return;
        }
        AbstractC11093b.m24675a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    InterfaceC11863o0 interfaceC11863o0M26306b = dVar.m26306b();
                    if (interfaceC11863o0M26306b != null) {
                        c cVar = (c) interfaceC11863o0M26306b;
                        interfaceC11863o0M26312i = cVar.m24851f(jNanoTime) ? m24838M(cVar) : false ? dVar.m26312i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) interfaceC11863o0M26312i) != null);
    }

    /* renamed from: M */
    public final boolean m24838M(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26841f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC3223a.m1395a(f26841f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C11864p) {
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C11864p c11864p = (C11864p) obj;
                int iM26325a = c11864p.m26325a(runnable);
                if (iM26325a == 0) {
                    return true;
                }
                if (iM26325a == 1) {
                    AbstractC3223a.m1395a(f26841f, this, obj, c11864p.m26334l());
                } else if (iM26325a == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC11095b1.f26773b) {
                    return false;
                }
                C11864p c11864p2 = new C11864p(8, true);
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c11864p2.m26325a((Runnable) obj);
                c11864p2.m26325a(runnable);
                if (AbstractC3223a.m1395a(f26841f, this, obj, c11864p2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: Q */
    public boolean m24839Q() {
        if (!m24827x()) {
            return false;
        }
        d dVar = (d) f26842g.get(this);
        if (dVar != null && !dVar.m26308e()) {
            return false;
        }
        Object obj = f26841f.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof C11864p ? ((C11864p) obj).m26332j() : obj == AbstractC11095b1.f26773b;
    }

    /* renamed from: R */
    public final void m24840R() {
        c cVar;
        AbstractC11093b.m24675a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f26842g.get(this);
            if (dVar == null || (cVar = (c) dVar.m26313j()) == null) {
                return;
            } else {
                mo24741F(jNanoTime, cVar);
            }
        }
    }

    /* renamed from: S */
    public final void m24841S() {
        f26841f.set(this, null);
        f26842g.set(this, null);
    }

    /* renamed from: T */
    public final void m24842T(long j10, c cVar) {
        int iM24843U = m24843U(j10, cVar);
        if (iM24843U == 0) {
            if (m24846X(cVar)) {
                m24852G();
            }
        } else if (iM24843U == 1) {
            mo24741F(j10, cVar);
        } else if (iM24843U != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    /* renamed from: U */
    public final int m24843U(long j10, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f26842g.get(this);
        if (dVar == null) {
            AbstractC3223a.m1395a(f26842g, this, null, new d(j10));
            Object obj = f26842g.get(this);
            AbstractC9979u.m20291d(obj);
            dVar = (d) obj;
        }
        return cVar.m24850e(j10, dVar, this);
    }

    /* renamed from: V */
    public final InterfaceC11163t0 m24844V(long j10, Runnable runnable) {
        long jM24678c = AbstractC11095b1.m24678c(j10);
        if (jM24678c >= 4611686018427387903L) {
            return C11170v1.f26829c;
        }
        AbstractC11093b.m24675a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jM24678c + jNanoTime, runnable);
        m24842T(jNanoTime, bVar);
        return bVar;
    }

    /* renamed from: W */
    public final void m24845W(boolean z10) {
        f26843h.set(this, z10 ? 1 : 0);
    }

    /* renamed from: X */
    public final boolean m24846X(c cVar) {
        d dVar = (d) f26842g.get(this);
        return (dVar != null ? (c) dVar.m26309f() : null) == cVar;
    }

    /* renamed from: c */
    public InterfaceC11163t0 mo24710c(long j10, Runnable runnable, InterfaceC9945d interfaceC9945d) {
        return InterfaceC11146o0.a.m24766a(this, j10, runnable, interfaceC9945d);
    }

    @Override // sd.InterfaceC11146o0
    /* renamed from: d */
    public void mo24711d(long j10, InterfaceC11125j interfaceC11125j) {
        long jM24678c = AbstractC11095b1.m24678c(j10);
        if (jM24678c < 4611686018427387903L) {
            AbstractC11093b.m24675a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM24678c + jNanoTime, interfaceC11125j);
            m24842T(jNanoTime, aVar);
            AbstractC11137m.m24756a(interfaceC11125j, aVar);
        }
    }

    @Override // sd.AbstractC11106e0
    public final void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        mo24742K(runnable);
    }

    @Override // sd.AbstractC11175x0
    /* renamed from: r */
    public long mo24824r() {
        c cVar;
        if (super.mo24824r() == 0) {
            return 0L;
        }
        Object obj = f26841f.get(this);
        if (obj != null) {
            if (!(obj instanceof C11864p)) {
                return obj == AbstractC11095b1.f26773b ? Long.MAX_VALUE : 0L;
            }
            if (!((C11864p) obj).m26332j()) {
                return 0L;
            }
        }
        d dVar = (d) f26842g.get(this);
        if (dVar == null || (cVar = (c) dVar.m26309f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f26847c;
        AbstractC11093b.m24675a();
        return AbstractC10410o.m21753f(j10 - System.nanoTime(), 0L);
    }

    @Override // sd.AbstractC11175x0
    public void shutdown() {
        C11120h2.f26785a.m24731c();
        m24845W(true);
        m24835I();
        while (mo24818B() <= 0) {
        }
        m24840R();
    }
}

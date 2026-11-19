package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9203g;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.AbstractC8821b;
import p135i8.AbstractC8851l;
import p135i8.AbstractC8867q0;
import p135i8.C8847j1;
import p135i8.C8883v1;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;
import p191n8.C9456k0;
import p191n8.C9465r;
import p191n8.InterfaceC9458l0;

/* renamed from: kotlinx.coroutines.j */
/* loaded from: classes5.dex */
public abstract class AbstractC9208j extends AbstractC9209k implements InterfaceC9203g {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18084d = AtomicReferenceFieldUpdater.newUpdater(AbstractC9208j.class, Object.class, "_queue$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18085e = AtomicReferenceFieldUpdater.newUpdater(AbstractC9208j.class, Object.class, "_delayed$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18086f = AtomicIntegerFieldUpdater.newUpdater(AbstractC9208j.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: kotlinx.coroutines.j$a */
    public final class a extends c {

        /* renamed from: c */
        public final InterfaceC8845j f18087c;

        public a(long j10, InterfaceC8845j interfaceC8845j) {
            super(j10);
            this.f18087c = interfaceC8845j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18087c.mo14872q(AbstractC9208j.this, C8736p.f16368a);
        }

        @Override // kotlinx.coroutines.AbstractC9208j.c
        public String toString() {
            return super.toString() + this.f18087c;
        }
    }

    /* renamed from: kotlinx.coroutines.j$b */
    public static final class b extends c {

        /* renamed from: c */
        public final Runnable f18089c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f18089c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18089c.run();
        }

        @Override // kotlinx.coroutines.AbstractC9208j.c
        public String toString() {
            return super.toString() + this.f18089c;
        }
    }

    /* renamed from: kotlinx.coroutines.j$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC8849k0, InterfaceC9458l0 {
        private volatile Object _heap;

        /* renamed from: a */
        public long f18090a;

        /* renamed from: b */
        public int f18091b = -1;

        public c(long j10) {
            this.f18090a = j10;
        }

        @Override // p191n8.InterfaceC9458l0
        /* renamed from: a */
        public void mo16769a(C9456k0 c9456k0) {
            if (this._heap == AbstractC8867q0.f16533a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c9456k0;
        }

        @Override // p191n8.InterfaceC9458l0
        /* renamed from: c */
        public C9456k0 mo16770c() {
            Object obj = this._heap;
            if (obj instanceof C9456k0) {
                return (C9456k0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f18090a - cVar.f18090a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // p135i8.InterfaceC8849k0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC8867q0.f16533a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m17363h(this);
                    }
                    this._heap = AbstractC8867q0.f16533a;
                    C8736p c8736p = C8736p.f16368a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public final int m16772e(long j10, d dVar, AbstractC9208j abstractC9208j) {
            synchronized (this) {
                if (this._heap == AbstractC8867q0.f16533a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.m17358b();
                        if (abstractC9208j.m16757l()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f18092c = j10;
                        } else {
                            long j11 = cVar.f18090a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f18092c > 0) {
                                dVar.f18092c = j10;
                            }
                        }
                        long j12 = this.f18090a;
                        long j13 = dVar.f18092c;
                        if (j12 - j13 < 0) {
                            this.f18090a = j13;
                        }
                        dVar.m17357a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* renamed from: f */
        public final boolean m16773f(long j10) {
            return j10 - this.f18090a >= 0;
        }

        @Override // p191n8.InterfaceC9458l0
        public int getIndex() {
            return this.f18091b;
        }

        @Override // p191n8.InterfaceC9458l0
        public void setIndex(int i10) {
            this.f18091b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f18090a + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.j$d */
    public static final class d extends C9456k0 {

        /* renamed from: c */
        public long f18092c;

        public d(long j10) {
            this.f18092c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m16757l() {
        return f18086f.get(this) != 0;
    }

    /* renamed from: F */
    public final void m16758F() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18084d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC3193a.m1318a(f18084d, this, null, AbstractC8867q0.f16534b)) {
                    return;
                }
            } else if (obj instanceof C9465r) {
                ((C9465r) obj).m17392d();
                return;
            } else {
                if (obj == AbstractC8867q0.f16534b) {
                    return;
                }
                C9465r c9465r = new C9465r(8, true);
                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c9465r.m17389a((Runnable) obj);
                if (AbstractC3193a.m1318a(f18084d, this, obj, c9465r)) {
                    return;
                }
            }
        }
    }

    /* renamed from: G */
    public final Runnable m16759G() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18084d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C9465r) {
                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C9465r c9465r = (C9465r) obj;
                Object objM17399m = c9465r.m17399m();
                if (objM17399m != C9465r.f18684h) {
                    return (Runnable) objM17399m;
                }
                AbstractC3193a.m1318a(f18084d, this, obj, c9465r.m17398l());
            } else {
                if (obj == AbstractC8867q0.f16534b) {
                    return null;
                }
                if (AbstractC3193a.m1318a(f18084d, this, obj, null)) {
                    AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: H */
    public void mo16561H(Runnable runnable) {
        if (m16760I(runnable)) {
            m16774D();
        } else {
            RunnableC9166f.f17681g.mo16561H(runnable);
        }
    }

    /* renamed from: I */
    public final boolean m16760I(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18084d;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m16757l()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC3193a.m1318a(f18084d, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C9465r) {
                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C9465r c9465r = (C9465r) obj;
                int iM17389a = c9465r.m17389a(runnable);
                if (iM17389a == 0) {
                    return true;
                }
                if (iM17389a == 1) {
                    AbstractC3193a.m1318a(f18084d, this, obj, c9465r.m17398l());
                } else if (iM17389a == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC8867q0.f16534b) {
                    return false;
                }
                C9465r c9465r2 = new C9465r(8, true);
                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c9465r2.m17389a((Runnable) obj);
                c9465r2.m17389a(runnable);
                if (AbstractC3193a.m1318a(f18084d, this, obj, c9465r2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: M */
    public boolean m16761M() {
        if (!m14894x()) {
            return false;
        }
        d dVar = (d) f18085e.get(this);
        if (dVar != null && !dVar.m17360e()) {
            return false;
        }
        Object obj = f18084d.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof C9465r ? ((C9465r) obj).m17396j() : obj == AbstractC8867q0.f16534b;
    }

    /* renamed from: N */
    public final void m16762N() {
        c cVar;
        AbstractC8821b.m14804a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f18085e.get(this);
            if (dVar == null || (cVar = (c) dVar.m17365j()) == null) {
                return;
            } else {
                mo16560C(jNanoTime, cVar);
            }
        }
    }

    /* renamed from: O */
    public final void m16763O() {
        f18084d.set(this, null);
        f18085e.set(this, null);
    }

    /* renamed from: P */
    public final void m16764P(long j10, c cVar) {
        int iM16765Q = m16765Q(j10, cVar);
        if (iM16765Q == 0) {
            if (m16768T(cVar)) {
                m16774D();
            }
        } else if (iM16765Q == 1) {
            mo16560C(j10, cVar);
        } else if (iM16765Q != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    /* renamed from: Q */
    public final int m16765Q(long j10, c cVar) {
        if (m16757l()) {
            return 1;
        }
        d dVar = (d) f18085e.get(this);
        if (dVar == null) {
            AbstractC3193a.m1318a(f18085e, this, null, new d(j10));
            Object obj = f18085e.get(this);
            AbstractC9133u.m16130d(obj);
            dVar = (d) obj;
        }
        return cVar.m16772e(j10, dVar, this);
    }

    /* renamed from: R */
    public final InterfaceC8849k0 m16766R(long j10, Runnable runnable) {
        long jM14902c = AbstractC8867q0.m14902c(j10);
        if (jM14902c >= 4611686018427387903L) {
            return C8847j1.f16518a;
        }
        AbstractC8821b.m14804a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jM14902c + jNanoTime, runnable);
        m16764P(jNanoTime, bVar);
        return bVar;
    }

    /* renamed from: S */
    public final void m16767S(boolean z10) {
        f18086f.set(this, z10 ? 1 : 0);
    }

    /* renamed from: T */
    public final boolean m16768T(c cVar) {
        d dVar = (d) f18085e.get(this);
        return (dVar != null ? (c) dVar.m17361f() : null) == cVar;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        mo16561H(runnable);
    }

    /* renamed from: f */
    public InterfaceC8849k0 mo16335f(long j10, Runnable runnable, InterfaceC9100d interfaceC9100d) {
        return InterfaceC9203g.a.m16718a(this, j10, runnable, interfaceC9100d);
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: g */
    public void mo16336g(long j10, InterfaceC8845j interfaceC8845j) {
        long jM14902c = AbstractC8867q0.m14902c(j10);
        if (jM14902c < 4611686018427387903L) {
            AbstractC8821b.m14804a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM14902c + jNanoTime, interfaceC8845j);
            m16764P(jNanoTime, aVar);
            AbstractC8851l.m14878a(interfaceC8845j, aVar);
        }
    }

    @Override // p135i8.AbstractC8861o0
    /* renamed from: r */
    public long mo14891r() {
        c cVar;
        if (super.mo14891r() == 0) {
            return 0L;
        }
        Object obj = f18084d.get(this);
        if (obj != null) {
            if (!(obj instanceof C9465r)) {
                return obj == AbstractC8867q0.f16534b ? Long.MAX_VALUE : 0L;
            }
            if (!((C9465r) obj).m17396j()) {
                return 0L;
            }
        }
        d dVar = (d) f18085e.get(this);
        if (dVar == null || (cVar = (c) dVar.m17361f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f18090a;
        AbstractC8821b.m14804a();
        return AbstractC8323h.m13511f(j10 - System.nanoTime(), 0L);
    }

    @Override // p135i8.AbstractC8861o0
    public void shutdown() {
        C8883v1.f16542a.m14924c();
        m16767S(true);
        m16758F();
        while (mo14895y() <= 0) {
        }
        m16762N();
    }

    @Override // p135i8.AbstractC8861o0
    /* renamed from: y */
    public long mo14895y() {
        InterfaceC9458l0 interfaceC9458l0M17364i;
        if (m14896z()) {
            return 0L;
        }
        d dVar = (d) f18085e.get(this);
        if (dVar != null && !dVar.m17360e()) {
            AbstractC8821b.m14804a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        InterfaceC9458l0 interfaceC9458l0M17358b = dVar.m17358b();
                        if (interfaceC9458l0M17358b != null) {
                            c cVar = (c) interfaceC9458l0M17358b;
                            interfaceC9458l0M17364i = cVar.m16773f(jNanoTime) ? m16760I(cVar) : false ? dVar.m17364i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) interfaceC9458l0M17364i) != null);
        }
        Runnable runnableM16759G = m16759G();
        if (runnableM16759G == null) {
            return mo14891r();
        }
        runnableM16759G.run();
        return 0L;
    }
}

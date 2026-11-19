package p087f3;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.C2798m;
import kotlinx.coroutines.internal.C2810y;
import kotlinx.coroutines.internal.InterfaceC2811z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;
import p128o2.C2925r;
import p142q2.InterfaceC3015g;

/* renamed from: f3.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC2530a1 extends AbstractC2534b1 implements InterfaceC2590q0 {

    /* renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10221e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2530a1.class, Object.class, "_queue");

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10222f = AtomicReferenceFieldUpdater.newUpdater(AbstractC2530a1.class, Object.class, "_delayed");

    @NotNull
    private volatile /* synthetic */ Object _queue = null;

    @NotNull
    private volatile /* synthetic */ Object _delayed = null;

    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    /* renamed from: f3.a1$a */
    private final class a extends b {

        /* renamed from: d */
        @NotNull
        private final InterfaceC2572l<C2925r> f10223d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j4, @NotNull InterfaceC2572l<? super C2925r> interfaceC2572l) {
            super(j4);
            this.f10223d = interfaceC2572l;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10223d.mo8588f(AbstractC2530a1.this, C2925r.f11415a);
        }

        @Override // p087f3.AbstractC2530a1.b
        @NotNull
        public String toString() {
            return C2769l.m9248l(super.toString(), this.f10223d);
        }
    }

    /* renamed from: f3.a1$b */
    public static abstract class b implements Runnable, Comparable<b>, InterfaceC2608w0, InterfaceC2811z {

        /* renamed from: a */
        public long f10225a;

        /* renamed from: b */
        @Nullable
        private Object f10226b;

        /* renamed from: c */
        private int f10227c = -1;

        public b(long j4) {
            this.f10225a = j4;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC2811z
        /* renamed from: a */
        public void mo8519a(int i4) {
            this.f10227c = i4;
        }

        @Override // p087f3.InterfaceC2608w0
        /* renamed from: b */
        public final synchronized void mo8520b() {
            Object obj = this.f10226b;
            if (obj == C2542d1.f10232a) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.m9373g(this);
            }
            this.f10226b = C2542d1.f10232a;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC2811z
        /* renamed from: c */
        public void mo8521c(@Nullable C2810y<?> c2810y) {
            if (!(this.f10226b != C2542d1.f10232a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f10226b = c2810y;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC2811z
        @Nullable
        /* renamed from: d */
        public C2810y<?> mo8522d() {
            Object obj = this.f10226b;
            if (obj instanceof C2810y) {
                return (C2810y) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull b bVar) {
            long j4 = this.f10225a - bVar.f10225a;
            if (j4 > 0) {
                return 1;
            }
            return j4 < 0 ? -1 : 0;
        }

        /* renamed from: g */
        public final synchronized int m8524g(long j4, @NotNull c cVar, @NotNull AbstractC2530a1 abstractC2530a1) {
            if (this.f10226b == C2542d1.f10232a) {
                return 2;
            }
            synchronized (cVar) {
                b bVarM9369b = cVar.m9369b();
                if (abstractC2530a1.m8507f0()) {
                    return 1;
                }
                if (bVarM9369b == null) {
                    cVar.f10228b = j4;
                } else {
                    long j5 = bVarM9369b.f10225a;
                    if (j5 - j4 < 0) {
                        j4 = j5;
                    }
                    if (j4 - cVar.f10228b > 0) {
                        cVar.f10228b = j4;
                    }
                }
                long j6 = this.f10225a;
                long j7 = cVar.f10228b;
                if (j6 - j7 < 0) {
                    this.f10225a = j7;
                }
                cVar.m9368a(this);
                return 0;
            }
        }

        @Override // kotlinx.coroutines.internal.InterfaceC2811z
        public int getIndex() {
            return this.f10227c;
        }

        /* renamed from: h */
        public final boolean m8525h(long j4) {
            return j4 - this.f10225a >= 0;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f10225a + ']';
        }
    }

    /* renamed from: f3.a1$c */
    public static final class c extends C2810y<b> {

        /* renamed from: b */
        public long f10228b;

        public c(long j4) {
            this.f10228b = j4;
        }
    }

    /* renamed from: b0 */
    private final void m8504b0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C0827b.m4278a(f10221e, this, null, C2542d1.f10233b)) {
                    return;
                }
            } else if (obj instanceof C2798m) {
                ((C2798m) obj).m9324d();
                return;
            } else {
                if (obj == C2542d1.f10233b) {
                    return;
                }
                C2798m c2798m = new C2798m(8, true);
                c2798m.m9323a((Runnable) obj);
                if (C0827b.m4278a(f10221e, this, obj, c2798m)) {
                    return;
                }
            }
        }
    }

    /* renamed from: c0 */
    private final Runnable m8505c0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C2798m) {
                C2798m c2798m = (C2798m) obj;
                Object objM9328j = c2798m.m9328j();
                if (objM9328j != C2798m.f10773h) {
                    return (Runnable) objM9328j;
                }
                C0827b.m4278a(f10221e, this, obj, c2798m.m9327i());
            } else {
                if (obj == C2542d1.f10233b) {
                    return null;
                }
                if (C0827b.m4278a(f10221e, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: e0 */
    private final boolean m8506e0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m8507f0()) {
                return false;
            }
            if (obj == null) {
                if (C0827b.m4278a(f10221e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C2798m) {
                C2798m c2798m = (C2798m) obj;
                int iM9323a = c2798m.m9323a(runnable);
                if (iM9323a == 0) {
                    return true;
                }
                if (iM9323a == 1) {
                    C0827b.m4278a(f10221e, this, obj, c2798m.m9327i());
                } else if (iM9323a == 2) {
                    return false;
                }
            } else {
                if (obj == C2542d1.f10233b) {
                    return false;
                }
                C2798m c2798m2 = new C2798m(8, true);
                c2798m2.m9323a((Runnable) obj);
                c2798m2.m9323a(runnable);
                if (C0827b.m4278a(f10221e, this, obj, c2798m2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: f0 */
    public final boolean m8507f0() {
        return this._isCompleted;
    }

    /* renamed from: h0 */
    private final void m8508h0() {
        C2536c.m8530a();
        long jNanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            b bVarM9375i = cVar == null ? null : cVar.m9375i();
            if (bVarM9375i == null) {
                return;
            } else {
                m8527Y(jNanoTime, bVarM9375i);
            }
        }
    }

    /* renamed from: k0 */
    private final int m8509k0(long j4, b bVar) {
        if (m8507f0()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            C0827b.m4278a(f10222f, this, null, new c(j4));
            Object obj = this._delayed;
            C2769l.m9239c(obj);
            cVar = (c) obj;
        }
        return bVar.m8524g(j4, cVar, this);
    }

    /* renamed from: l0 */
    private final void m8510l0(boolean z3) {
        this._isCompleted = z3 ? 1 : 0;
    }

    /* renamed from: m0 */
    private final boolean m8511m0(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar == null ? null : cVar.m9372e()) == bVar;
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public final void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        m8514d0(runnable);
    }

    @Override // p087f3.AbstractC2617z0
    /* renamed from: P */
    protected long mo8512P() {
        if (super.mo8512P() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C2798m)) {
                return obj == C2542d1.f10233b ? Long.MAX_VALUE : 0L;
            }
            if (!((C2798m) obj).m9326g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        b bVarM9372e = cVar == null ? null : cVar.m9372e();
        if (bVarM9372e == null) {
            return Long.MAX_VALUE;
        }
        long j4 = bVarM9372e.f10225a;
        C2536c.m8530a();
        return C1037f.m4822c(j4 - System.nanoTime(), 0L);
    }

    @Override // p087f3.AbstractC2617z0
    /* renamed from: U */
    public long mo8513U() {
        b bVarM9374h;
        if (m8769V()) {
            return 0L;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m9371d()) {
            C2536c.m8530a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    b bVarM9369b = cVar.m9369b();
                    if (bVarM9369b != null) {
                        b bVar = bVarM9369b;
                        bVarM9374h = bVar.m8525h(jNanoTime) ? m8506e0(bVar) : false ? cVar.m9374h(0) : null;
                    }
                }
            } while (bVarM9374h != null);
        }
        Runnable runnableM8505c0 = m8505c0();
        if (runnableM8505c0 == null) {
            return mo8512P();
        }
        runnableM8505c0.run();
        return 0L;
    }

    /* renamed from: d0 */
    public final void m8514d0(@NotNull Runnable runnable) {
        if (m8506e0(runnable)) {
            m8528Z();
        } else {
            RunnableC2577m0.f10266g.m8514d0(runnable);
        }
    }

    /* renamed from: g0 */
    protected boolean m8515g0() {
        if (!m8768T()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m9371d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C2798m) {
                return ((C2798m) obj).m9326g();
            }
            if (obj != C2542d1.f10233b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i0 */
    protected final void m8516i0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: j0 */
    public final void m8517j0(long j4, @NotNull b bVar) {
        int iM8509k0 = m8509k0(j4, bVar);
        if (iM8509k0 == 0) {
            if (m8511m0(bVar)) {
                m8528Z();
            }
        } else if (iM8509k0 == 1) {
            m8527Y(j4, bVar);
        } else if (iM8509k0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // p087f3.AbstractC2617z0
    protected void shutdown() {
        C2563i2.f10245a.m8580c();
        m8510l0(true);
        m8504b0();
        while (mo8513U() <= 0) {
        }
        m8508h0();
    }

    @Override // p087f3.InterfaceC2590q0
    /* renamed from: y */
    public void mo8518y(long j4, @NotNull InterfaceC2572l<? super C2925r> interfaceC2572l) {
        long jM8543c = C2542d1.m8543c(j4);
        if (jM8543c < 4611686018427387903L) {
            C2536c.m8530a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM8543c + jNanoTime, interfaceC2572l);
            C2580n.m8639a(interfaceC2572l, aVar);
            m8517j0(jNanoTime, aVar);
        }
    }
}

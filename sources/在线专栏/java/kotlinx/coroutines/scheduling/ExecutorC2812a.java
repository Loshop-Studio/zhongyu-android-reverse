package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.C2805t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;
import p087f3.C2536c;
import p087f3.C2573l0;
import p128o2.C2925r;
import p179z2.AbstractC3515c;

/* renamed from: kotlinx.coroutines.scheduling.a */
/* loaded from: classes.dex */
public final class ExecutorC2812a implements Executor, Closeable {

    @NotNull
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a */
    public final int f10802a;

    /* renamed from: b */
    public final int f10803b;

    /* renamed from: c */
    public final long f10804c;

    @NotNull
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    @NotNull
    public final String f10805d;

    /* renamed from: e */
    @NotNull
    public final C2815d f10806e;

    /* renamed from: f */
    @NotNull
    public final C2815d f10807f;

    /* renamed from: g */
    @NotNull
    public final AtomicReferenceArray<c> f10808g;

    @NotNull
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: h */
    @NotNull
    public static final a f10797h = new a(null);

    /* renamed from: l */
    @NotNull
    public static final C2805t f10801l = new C2805t("NOT_IN_STACK");

    /* renamed from: i */
    private static final /* synthetic */ AtomicLongFieldUpdater f10798i = AtomicLongFieldUpdater.newUpdater(ExecutorC2812a.class, "parkedWorkersStack");

    /* renamed from: j */
    static final /* synthetic */ AtomicLongFieldUpdater f10799j = AtomicLongFieldUpdater.newUpdater(ExecutorC2812a.class, "controlState");

    /* renamed from: k */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10800k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC2812a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10809a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f10809a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC2812a(int i4, int i5, long j4, @NotNull String str) {
        this.f10802a = i4;
        this.f10803b = i5;
        this.f10804c = j4;
        this.f10805d = str;
        if (!(i4 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (!(i5 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j4 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f10806e = new C2815d();
        this.f10807f = new C2815d();
        this.parkedWorkersStack = 0L;
        this.f10808g = new AtomicReferenceArray<>(i5 + 1);
        this.controlState = i4 << 42;
        this._isTerminated = 0;
    }

    /* renamed from: B */
    private final void m9376B(boolean z3) {
        long jAddAndGet = f10799j.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        if (z3 || m9380M() || m9378K(jAddAndGet)) {
            return;
        }
        m9380M();
    }

    /* renamed from: J */
    private final AbstractRunnableC2820i m9377J(c cVar, AbstractRunnableC2820i abstractRunnableC2820i, boolean z3) {
        if (cVar == null || cVar.f10812b == d.TERMINATED) {
            return abstractRunnableC2820i;
        }
        if (abstractRunnableC2820i.f10841b.mo9419I() == 0 && cVar.f10812b == d.BLOCKING) {
            return abstractRunnableC2820i;
        }
        cVar.f10816f = true;
        return cVar.f10811a.m9428a(abstractRunnableC2820i, z3);
    }

    /* renamed from: K */
    private final boolean m9378K(long j4) {
        if (C1037f.m4821b(((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21)), 0) < this.f10802a) {
            int iM9382b = m9382b();
            if (iM9382b == 1 && this.f10802a > 1) {
                m9382b();
            }
            if (iM9382b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    static /* synthetic */ boolean m9379L(ExecutorC2812a executorC2812a, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = executorC2812a.controlState;
        }
        return executorC2812a.m9378K(j4);
    }

    /* renamed from: M */
    private final boolean m9380M() {
        c cVarM9386r;
        do {
            cVarM9386r = m9386r();
            if (cVarM9386r == null) {
                return false;
            }
        } while (!c.f10810h.compareAndSet(cVarM9386r, -1, 0));
        LockSupport.unpark(cVarM9386r);
        return true;
    }

    /* renamed from: a */
    private final boolean m9381a(AbstractRunnableC2820i abstractRunnableC2820i) {
        return abstractRunnableC2820i.f10841b.mo9419I() == 1 ? this.f10807f.m9314a(abstractRunnableC2820i) : this.f10806e.m9314a(abstractRunnableC2820i);
    }

    /* renamed from: b */
    private final int m9382b() {
        synchronized (this.f10808g) {
            if (isTerminated()) {
                return -1;
            }
            long j4 = this.controlState;
            int i4 = (int) (j4 & 2097151);
            int iM4821b = C1037f.m4821b(i4 - ((int) ((j4 & 4398044413952L) >> 21)), 0);
            if (iM4821b >= this.f10802a) {
                return 0;
            }
            if (i4 >= this.f10803b) {
                return 0;
            }
            int i5 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i5 > 0 && this.f10808g.get(i5) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(i5);
            this.f10808g.set(i5, cVar);
            if (!(i5 == ((int) (2097151 & f10799j.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            cVar.start();
            return iM4821b + 1;
        }
    }

    /* renamed from: m */
    private final c m9383m() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar != null && C2769l.m9237a(ExecutorC2812a.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: o */
    public static /* synthetic */ void m9384o(ExecutorC2812a executorC2812a, Runnable runnable, InterfaceC2821j interfaceC2821j, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            interfaceC2821j = C2818g.f10838a;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        executorC2812a.m9389n(runnable, interfaceC2821j, z3);
    }

    /* renamed from: q */
    private final int m9385q(c cVar) {
        Object objM9409g = cVar.m9409g();
        while (objM9409g != f10801l) {
            if (objM9409g == null) {
                return 0;
            }
            c cVar2 = (c) objM9409g;
            int iM9408f = cVar2.m9408f();
            if (iM9408f != 0) {
                return iM9408f;
            }
            objM9409g = cVar2.m9409g();
        }
        return -1;
    }

    /* renamed from: r */
    private final c m9386r() {
        while (true) {
            long j4 = this.parkedWorkersStack;
            c cVar = this.f10808g.get((int) (2097151 & j4));
            if (cVar == null) {
                return null;
            }
            long j5 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j4) & (-2097152);
            int iM9385q = m9385q(cVar);
            if (iM9385q >= 0 && f10798i.compareAndSet(this, j4, iM9385q | j5)) {
                cVar.m9412o(f10801l);
                return cVar;
            }
        }
    }

    /* renamed from: I */
    public final void m9387I() {
        if (m9380M() || m9379L(this, 0L, 1, null)) {
            return;
        }
        m9380M();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m9393y(10000L);
    }

    @NotNull
    /* renamed from: d */
    public final AbstractRunnableC2820i m9388d(@NotNull Runnable runnable, @NotNull InterfaceC2821j interfaceC2821j) {
        long jMo9421a = C2823l.f10848f.mo9421a();
        if (!(runnable instanceof AbstractRunnableC2820i)) {
            return new C2822k(runnable, jMo9421a, interfaceC2821j);
        }
        AbstractRunnableC2820i abstractRunnableC2820i = (AbstractRunnableC2820i) runnable;
        abstractRunnableC2820i.f10840a = jMo9421a;
        abstractRunnableC2820i.f10841b = interfaceC2821j;
        return abstractRunnableC2820i;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        m9384o(this, runnable, null, false, 6, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: n */
    public final void m9389n(@NotNull Runnable runnable, @NotNull InterfaceC2821j interfaceC2821j, boolean z3) {
        C2536c.m8530a();
        AbstractRunnableC2820i abstractRunnableC2820iM9388d = m9388d(runnable, interfaceC2821j);
        c cVarM9383m = m9383m();
        AbstractRunnableC2820i abstractRunnableC2820iM9377J = m9377J(cVarM9383m, abstractRunnableC2820iM9388d, z3);
        if (abstractRunnableC2820iM9377J != null && !m9381a(abstractRunnableC2820iM9377J)) {
            throw new RejectedExecutionException(C2769l.m9248l(this.f10805d, " was terminated"));
        }
        boolean z4 = z3 && cVarM9383m != null;
        if (abstractRunnableC2820iM9388d.f10841b.mo9419I() != 0) {
            m9376B(z4);
        } else {
            if (z4) {
                return;
            }
            m9387I();
        }
    }

    /* renamed from: s */
    public final boolean m9390s(@NotNull c cVar) {
        long j4;
        long j5;
        int iM9408f;
        if (cVar.m9409g() != f10801l) {
            return false;
        }
        do {
            j4 = this.parkedWorkersStack;
            j5 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j4) & (-2097152);
            iM9408f = cVar.m9408f();
            cVar.m9412o(this.f10808g.get((int) (2097151 & j4)));
        } while (!f10798i.compareAndSet(this, j4, j5 | iM9408f));
        return true;
    }

    /* renamed from: t */
    public final void m9391t(@NotNull c cVar, int i4, int i5) {
        while (true) {
            long j4 = this.parkedWorkersStack;
            int iM9385q = (int) (2097151 & j4);
            long j5 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j4) & (-2097152);
            if (iM9385q == i4) {
                iM9385q = i5 == 0 ? m9385q(cVar) : i5;
            }
            if (iM9385q >= 0 && f10798i.compareAndSet(this, j4, j5 | iM9385q)) {
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        int length = this.f10808g.length();
        int i8 = 0;
        if (1 < length) {
            i5 = 0;
            int i9 = 0;
            i6 = 0;
            i7 = 0;
            int i10 = 1;
            while (true) {
                int i11 = i10 + 1;
                c cVar = this.f10808g.get(i10);
                if (cVar != null) {
                    int iM9430f = cVar.f10811a.m9430f();
                    int i12 = b.f10809a[cVar.f10812b.ordinal()];
                    if (i12 == 1) {
                        i8++;
                    } else if (i12 == 2) {
                        i5++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(iM9430f);
                        sb.append('b');
                        arrayList.add(sb.toString());
                    } else if (i12 == 3) {
                        i9++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(iM9430f);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (i12 == 4) {
                        i6++;
                        if (iM9430f > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(iM9430f);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i12 == 5) {
                        i7++;
                    }
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
            i4 = i8;
            i8 = i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        long j4 = this.controlState;
        return this.f10805d + '@' + C2573l0.m8592b(this) + "[Pool Size {core = " + this.f10802a + ", max = " + this.f10803b + "}, Worker States {CPU = " + i8 + ", blocking = " + i5 + ", parked = " + i4 + ", dormant = " + i6 + ", terminated = " + i7 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f10806e.m9316c() + ", global blocking queue size = " + this.f10807f.m9316c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f10802a - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final void m9392u(@NotNull AbstractRunnableC2820i abstractRunnableC2820i) {
        try {
            abstractRunnableC2820i.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: y */
    public final void m9393y(long j4) throws InterruptedException {
        int i4;
        if (f10800k.compareAndSet(this, 0, 1)) {
            c cVarM9383m = m9383m();
            synchronized (this.f10808g) {
                i4 = (int) (this.controlState & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    int i6 = i5 + 1;
                    c cVar = this.f10808g.get(i5);
                    C2769l.m9239c(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != cVarM9383m) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j4);
                        }
                        cVar2.f10811a.m9431g(this.f10807f);
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        i5 = i6;
                    }
                }
            }
            this.f10807f.m9315b();
            this.f10806e.m9315b();
            while (true) {
                AbstractRunnableC2820i abstractRunnableC2820iM9407e = cVarM9383m == null ? null : cVarM9383m.m9407e(true);
                if (abstractRunnableC2820iM9407e == null && (abstractRunnableC2820iM9407e = this.f10806e.m9317d()) == null && (abstractRunnableC2820iM9407e = this.f10807f.m9317d()) == null) {
                    break;
                } else {
                    m9392u(abstractRunnableC2820iM9407e);
                }
            }
            if (cVarM9383m != null) {
                cVarM9383m.m9413r(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    public final class c extends Thread {

        /* renamed from: h */
        static final /* synthetic */ AtomicIntegerFieldUpdater f10810h = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a */
        @NotNull
        public final C2824m f10811a;

        /* renamed from: b */
        @NotNull
        public d f10812b;

        /* renamed from: c */
        private long f10813c;

        /* renamed from: d */
        private long f10814d;

        /* renamed from: e */
        private int f10815e;

        /* renamed from: f */
        public boolean f10816f;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;

        @NotNull
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f10811a = new C2824m();
            this.f10812b = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC2812a.f10801l;
            this.f10815e = AbstractC3515c.f12368a.mo10728b();
        }

        /* renamed from: a */
        private final void m9394a(int i4) {
            if (i4 == 0) {
                return;
            }
            ExecutorC2812a.f10799j.addAndGet(ExecutorC2812a.this, -2097152L);
            if (this.f10812b != d.TERMINATED) {
                this.f10812b = d.DORMANT;
            }
        }

        /* renamed from: b */
        private final void m9395b(int i4) {
            if (i4 != 0 && m9413r(d.BLOCKING)) {
                ExecutorC2812a.this.m9387I();
            }
        }

        /* renamed from: c */
        private final void m9396c(AbstractRunnableC2820i abstractRunnableC2820i) {
            int iMo9419I = abstractRunnableC2820i.f10841b.mo9419I();
            m9398h(iMo9419I);
            m9395b(iMo9419I);
            ExecutorC2812a.this.m9392u(abstractRunnableC2820i);
            m9394a(iMo9419I);
        }

        /* renamed from: d */
        private final AbstractRunnableC2820i m9397d(boolean z3) {
            AbstractRunnableC2820i abstractRunnableC2820iM9401l;
            AbstractRunnableC2820i abstractRunnableC2820iM9401l2;
            if (z3) {
                boolean z4 = m9410j(ExecutorC2812a.this.f10802a * 2) == 0;
                if (z4 && (abstractRunnableC2820iM9401l2 = m9401l()) != null) {
                    return abstractRunnableC2820iM9401l2;
                }
                AbstractRunnableC2820i abstractRunnableC2820iM9432h = this.f10811a.m9432h();
                if (abstractRunnableC2820iM9432h != null) {
                    return abstractRunnableC2820iM9432h;
                }
                if (!z4 && (abstractRunnableC2820iM9401l = m9401l()) != null) {
                    return abstractRunnableC2820iM9401l;
                }
            } else {
                AbstractRunnableC2820i abstractRunnableC2820iM9401l3 = m9401l();
                if (abstractRunnableC2820iM9401l3 != null) {
                    return abstractRunnableC2820iM9401l3;
                }
            }
            return m9405s(false);
        }

        /* renamed from: h */
        private final void m9398h(int i4) {
            this.f10813c = 0L;
            if (this.f10812b == d.PARKING) {
                this.f10812b = d.BLOCKING;
            }
        }

        /* renamed from: i */
        private final boolean m9399i() {
            return this.nextParkedWorker != ExecutorC2812a.f10801l;
        }

        /* renamed from: k */
        private final void m9400k() {
            if (this.f10813c == 0) {
                this.f10813c = System.nanoTime() + ExecutorC2812a.this.f10804c;
            }
            LockSupport.parkNanos(ExecutorC2812a.this.f10804c);
            if (System.nanoTime() - this.f10813c >= 0) {
                this.f10813c = 0L;
                m9406t();
            }
        }

        /* renamed from: l */
        private final AbstractRunnableC2820i m9401l() {
            if (m9410j(2) == 0) {
                AbstractRunnableC2820i abstractRunnableC2820iM9317d = ExecutorC2812a.this.f10806e.m9317d();
                return abstractRunnableC2820iM9317d == null ? ExecutorC2812a.this.f10807f.m9317d() : abstractRunnableC2820iM9317d;
            }
            AbstractRunnableC2820i abstractRunnableC2820iM9317d2 = ExecutorC2812a.this.f10807f.m9317d();
            return abstractRunnableC2820iM9317d2 == null ? ExecutorC2812a.this.f10806e.m9317d() : abstractRunnableC2820iM9317d2;
        }

        /* renamed from: m */
        private final void m9402m() {
            loop0: while (true) {
                boolean z3 = false;
                while (!ExecutorC2812a.this.isTerminated() && this.f10812b != d.TERMINATED) {
                    AbstractRunnableC2820i abstractRunnableC2820iM9407e = m9407e(this.f10816f);
                    if (abstractRunnableC2820iM9407e != null) {
                        this.f10814d = 0L;
                        m9396c(abstractRunnableC2820iM9407e);
                    } else {
                        this.f10816f = false;
                        if (this.f10814d == 0) {
                            m9404q();
                        } else if (z3) {
                            m9413r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10814d);
                            this.f10814d = 0L;
                        } else {
                            z3 = true;
                        }
                    }
                }
                break loop0;
            }
            m9413r(d.TERMINATED);
        }

        /* renamed from: p */
        private final boolean m9403p() {
            boolean z3;
            if (this.f10812b != d.CPU_ACQUIRED) {
                ExecutorC2812a executorC2812a = ExecutorC2812a.this;
                while (true) {
                    long j4 = executorC2812a.controlState;
                    if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                        z3 = false;
                        break;
                    }
                    if (ExecutorC2812a.f10799j.compareAndSet(executorC2812a, j4, j4 - 4398046511104L)) {
                        z3 = true;
                        break;
                    }
                }
                if (!z3) {
                    return false;
                }
                this.f10812b = d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: q */
        private final void m9404q() {
            if (!m9399i()) {
                ExecutorC2812a.this.m9390s(this);
                return;
            }
            this.workerCtl = -1;
            while (m9399i() && this.workerCtl == -1 && !ExecutorC2812a.this.isTerminated() && this.f10812b != d.TERMINATED) {
                m9413r(d.PARKING);
                Thread.interrupted();
                m9400k();
            }
        }

        /* renamed from: s */
        private final AbstractRunnableC2820i m9405s(boolean z3) {
            int i4 = (int) (ExecutorC2812a.this.controlState & 2097151);
            if (i4 < 2) {
                return null;
            }
            int iM9410j = m9410j(i4);
            ExecutorC2812a executorC2812a = ExecutorC2812a.this;
            long jMin = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                iM9410j++;
                if (iM9410j > i4) {
                    iM9410j = 1;
                }
                c cVar = executorC2812a.f10808g.get(iM9410j);
                if (cVar != null && cVar != this) {
                    long jM9433k = z3 ? this.f10811a.m9433k(cVar.f10811a) : this.f10811a.m9434l(cVar.f10811a);
                    if (jM9433k == -1) {
                        return this.f10811a.m9432h();
                    }
                    if (jM9433k > 0) {
                        jMin = Math.min(jMin, jM9433k);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f10814d = jMin;
            return null;
        }

        /* renamed from: t */
        private final void m9406t() {
            ExecutorC2812a executorC2812a = ExecutorC2812a.this;
            synchronized (executorC2812a.f10808g) {
                if (executorC2812a.isTerminated()) {
                    return;
                }
                if (((int) (executorC2812a.controlState & 2097151)) <= executorC2812a.f10802a) {
                    return;
                }
                if (f10810h.compareAndSet(this, -1, 1)) {
                    int iM9408f = m9408f();
                    m9411n(0);
                    executorC2812a.m9391t(this, iM9408f, 0);
                    int andDecrement = (int) (ExecutorC2812a.f10799j.getAndDecrement(executorC2812a) & 2097151);
                    if (andDecrement != iM9408f) {
                        c cVar = executorC2812a.f10808g.get(andDecrement);
                        C2769l.m9239c(cVar);
                        c cVar2 = cVar;
                        executorC2812a.f10808g.set(iM9408f, cVar2);
                        cVar2.m9411n(iM9408f);
                        executorC2812a.m9391t(cVar2, andDecrement, iM9408f);
                    }
                    executorC2812a.f10808g.set(andDecrement, null);
                    C2925r c2925r = C2925r.f11415a;
                    this.f10812b = d.TERMINATED;
                }
            }
        }

        @Nullable
        /* renamed from: e */
        public final AbstractRunnableC2820i m9407e(boolean z3) {
            AbstractRunnableC2820i abstractRunnableC2820iM9317d;
            if (m9403p()) {
                return m9397d(z3);
            }
            if (!z3 || (abstractRunnableC2820iM9317d = this.f10811a.m9432h()) == null) {
                abstractRunnableC2820iM9317d = ExecutorC2812a.this.f10807f.m9317d();
            }
            return abstractRunnableC2820iM9317d == null ? m9405s(true) : abstractRunnableC2820iM9317d;
        }

        /* renamed from: f */
        public final int m9408f() {
            return this.indexInArray;
        }

        @Nullable
        /* renamed from: g */
        public final Object m9409g() {
            return this.nextParkedWorker;
        }

        /* renamed from: j */
        public final int m9410j(int i4) {
            int i5 = this.f10815e;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f10815e = i8;
            int i9 = i4 - 1;
            return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
        }

        /* renamed from: n */
        public final void m9411n(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC2812a.this.f10805d);
            sb.append("-worker-");
            sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
            setName(sb.toString());
            this.indexInArray = i4;
        }

        /* renamed from: o */
        public final void m9412o(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: r */
        public final boolean m9413r(@NotNull d dVar) {
            d dVar2 = this.f10812b;
            boolean z3 = dVar2 == d.CPU_ACQUIRED;
            if (z3) {
                ExecutorC2812a.f10799j.addAndGet(ExecutorC2812a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f10812b = dVar;
            }
            return z3;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m9402m();
        }

        public c(int i4) {
            this();
            m9411n(i4);
        }
    }
}

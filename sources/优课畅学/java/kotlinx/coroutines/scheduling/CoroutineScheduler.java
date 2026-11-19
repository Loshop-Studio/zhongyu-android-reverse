package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.WorkRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p135i8.AbstractC8821b;
import p135i8.AbstractC8825c0;
import p191n8.C9442d0;
import p191n8.C9472y;
import p212p7.InterfaceC9760a;
import p213p8.AbstractC9771k;
import p213p8.AbstractRunnableC9767g;
import p213p8.C9763c;
import p213p8.C9770j;
import p213p8.C9773m;
import p213p8.InterfaceC9768h;

/* loaded from: classes5.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: h */
    public static final C9216a f18101h = new C9216a(null);

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f18102i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f18103j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18104k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* renamed from: l */
    public static final C9442d0 f18105l = new C9442d0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a */
    public final int f18106a;

    /* renamed from: b */
    public final int f18107b;

    /* renamed from: c */
    public final long f18108c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final String f18109d;

    /* renamed from: e */
    public final C9763c f18110e;

    /* renamed from: f */
    public final C9763c f18111f;

    /* renamed from: g */
    public final C9472y f18112g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerState {

        /* renamed from: a */
        public static final WorkerState f18113a = new WorkerState("CPU_ACQUIRED", 0);

        /* renamed from: b */
        public static final WorkerState f18114b = new WorkerState("BLOCKING", 1);

        /* renamed from: c */
        public static final WorkerState f18115c = new WorkerState("PARKING", 2);

        /* renamed from: d */
        public static final WorkerState f18116d = new WorkerState("DORMANT", 3);

        /* renamed from: e */
        public static final WorkerState f18117e = new WorkerState("TERMINATED", 4);

        /* renamed from: f */
        public static final /* synthetic */ WorkerState[] f18118f;

        /* renamed from: g */
        public static final /* synthetic */ InterfaceC9760a f18119g;

        static {
            WorkerState[] workerStateArrM16804a = m16804a();
            f18118f = workerStateArrM16804a;
            f18119g = AbstractC9108a.m16085a(workerStateArrM16804a);
        }

        public WorkerState(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ WorkerState[] m16804a() {
            return new WorkerState[]{f18113a, f18114b, f18115c, f18116d, f18117e};
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f18118f.clone();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public static final class C9216a {
        public /* synthetic */ C9216a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9216a() {
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public /* synthetic */ class C9217b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18120a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.f18115c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.f18114b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.f18113a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.f18116d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.f18117e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f18120a = iArr;
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        this.f18106a = i10;
        this.f18107b = i11;
        this.f18108c = j10;
        this.f18109d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f18110e = new C9763c();
        this.f18111f = new C9763c();
        this.f18112g = new C9472y((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    /* renamed from: g */
    public static /* synthetic */ void m16783g(CoroutineScheduler coroutineScheduler, Runnable runnable, InterfaceC9768h interfaceC9768h, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9768h = AbstractC9771k.f19501g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        coroutineScheduler.m16792f(runnable, interfaceC9768h, z10);
    }

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater m16784h() {
        return f18103j;
    }

    /* renamed from: u */
    public static /* synthetic */ boolean m16787u(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f18103j.get(coroutineScheduler);
        }
        return coroutineScheduler.m16802t(j10);
    }

    /* renamed from: b */
    public final boolean m16788b(AbstractRunnableC9767g abstractRunnableC9767g) {
        return abstractRunnableC9767g.f19492b.mo18282b() == 1 ? this.f18111f.m17383a(abstractRunnableC9767g) : this.f18110e.m17383a(abstractRunnableC9767g);
    }

    /* renamed from: c */
    public final int m16789c() {
        synchronized (this.f18112g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f18103j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iM13510e = AbstractC8323h.m13510e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iM13510e >= this.f18106a) {
                    return 0;
                }
                if (i10 >= this.f18107b) {
                    return 0;
                }
                int i11 = ((int) (m16784h().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f18112g.m17412b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C9218c c9218c = new C9218c(this, i11);
                this.f18112g.m17413c(i11, c9218c);
                if (i11 != ((int) (2097151 & f18103j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iM13510e + 1;
                c9218c.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m16798p(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* renamed from: d */
    public final AbstractRunnableC9767g m16790d(Runnable runnable, InterfaceC9768h interfaceC9768h) {
        long jMo18278a = AbstractC9771k.f19500f.mo18278a();
        if (!(runnable instanceof AbstractRunnableC9767g)) {
            return new C9770j(runnable, jMo18278a, interfaceC9768h);
        }
        AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) runnable;
        abstractRunnableC9767g.f19491a = jMo18278a;
        abstractRunnableC9767g.f19492b = interfaceC9768h;
        return abstractRunnableC9767g;
    }

    /* renamed from: e */
    public final C9218c m16791e() {
        Thread threadCurrentThread = Thread.currentThread();
        C9218c c9218c = threadCurrentThread instanceof C9218c ? (C9218c) threadCurrentThread : null;
        if (c9218c == null || !AbstractC9133u.m16128b(CoroutineScheduler.this, this)) {
            return null;
        }
        return c9218c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m16783g(this, runnable, null, false, 6, null);
    }

    /* renamed from: f */
    public final void m16792f(Runnable runnable, InterfaceC9768h interfaceC9768h, boolean z10) {
        AbstractC8821b.m14804a();
        AbstractRunnableC9767g abstractRunnableC9767gM16790d = m16790d(runnable, interfaceC9768h);
        boolean z11 = false;
        boolean z12 = abstractRunnableC9767gM16790d.f19492b.mo18282b() == 1;
        long jAddAndGet = z12 ? f18103j.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        C9218c c9218cM16791e = m16791e();
        AbstractRunnableC9767g abstractRunnableC9767gM16801s = m16801s(c9218cM16791e, abstractRunnableC9767gM16790d, z10);
        if (abstractRunnableC9767gM16801s != null && !m16788b(abstractRunnableC9767gM16801s)) {
            throw new RejectedExecutionException(this.f18109d + " was terminated");
        }
        if (z10 && c9218cM16791e != null) {
            z11 = true;
        }
        if (z12) {
            m16799q(jAddAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            m16800r();
        }
    }

    public final boolean isTerminated() {
        return f18104k.get(this) != 0;
    }

    /* renamed from: k */
    public final int m16793k(C9218c c9218c) {
        Object objM16814i = c9218c.m16814i();
        while (objM16814i != f18105l) {
            if (objM16814i == null) {
                return 0;
            }
            C9218c c9218c2 = (C9218c) objM16814i;
            int iM16813h = c9218c2.m16813h();
            if (iM16813h != 0) {
                return iM16813h;
            }
            objM16814i = c9218c2.m16814i();
        }
        return -1;
    }

    /* renamed from: l */
    public final C9218c m16794l() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18102i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            C9218c c9218c = (C9218c) this.f18112g.m17412b((int) (2097151 & j10));
            if (c9218c == null) {
                return null;
            }
            long j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            int iM16793k = m16793k(c9218c);
            if (iM16793k >= 0 && f18102i.compareAndSet(this, j10, iM16793k | j11)) {
                c9218c.m16822r(f18105l);
                return c9218c;
            }
        }
    }

    /* renamed from: m */
    public final boolean m16795m(C9218c c9218c) {
        long j10;
        long j11;
        int iM16813h;
        if (c9218c.m16814i() != f18105l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18102i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            iM16813h = c9218c.m16813h();
            c9218c.m16822r(this.f18112g.m17412b((int) (2097151 & j10)));
        } while (!f18102i.compareAndSet(this, j10, j11 | iM16813h));
        return true;
    }

    /* renamed from: n */
    public final void m16796n(C9218c c9218c, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18102i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iM16793k = (int) (2097151 & j10);
            long j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            if (iM16793k == i10) {
                iM16793k = i11 == 0 ? m16793k(c9218c) : i11;
            }
            if (iM16793k >= 0) {
                if (f18102i.compareAndSet(this, j10, j11 | iM16793k)) {
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final void m16797o(AbstractRunnableC9767g abstractRunnableC9767g) {
        try {
            abstractRunnableC9767g.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC8821b.m14804a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16798p(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = m16786j()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r7.m16791e()
            n8.y r1 = r7.f18112g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m16782a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            n8.y r4 = r7.f18112g
            java.lang.Object r4 = r4.m17412b(r1)
            kotlin.jvm.internal.AbstractC9133u.m16130d(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.C9218c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            p8.m r4 = r4.f18122a
            p8.c r5 = r7.f18111f
            r4.m18292j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            p8.c r8 = r7.f18111f
            r8.m17384b()
            p8.c r8 = r7.f18110e
            r8.m17384b()
        L57:
            if (r0 == 0) goto L5f
            p8.g r8 = r0.m16812g(r2)
            if (r8 != 0) goto L8b
        L5f:
            p8.c r8 = r7.f18110e
            java.lang.Object r8 = r8.m17386e()
            p8.g r8 = (p213p8.AbstractRunnableC9767g) r8
            if (r8 != 0) goto L8b
            p8.c r8 = r7.f18111f
            java.lang.Object r8 = r8.m17386e()
            p8.g r8 = (p213p8.AbstractRunnableC9767g) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.f18117e
            r0.m16825u(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m16785i()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m16784h()
            r8.set(r7, r0)
            return
        L8b:
            r7.m16797o(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.m16798p(long):void");
    }

    /* renamed from: q */
    public final void m16799q(long j10, boolean z10) {
        if (z10 || m16803v() || m16802t(j10)) {
            return;
        }
        m16803v();
    }

    /* renamed from: r */
    public final void m16800r() {
        if (m16803v() || m16787u(this, 0L, 1, null)) {
            return;
        }
        m16803v();
    }

    /* renamed from: s */
    public final AbstractRunnableC9767g m16801s(C9218c c9218c, AbstractRunnableC9767g abstractRunnableC9767g, boolean z10) {
        if (c9218c == null || c9218c.f18124c == WorkerState.f18117e) {
            return abstractRunnableC9767g;
        }
        if (abstractRunnableC9767g.f19492b.mo18282b() == 0 && c9218c.f18124c == WorkerState.f18114b) {
            return abstractRunnableC9767g;
        }
        c9218c.f18128g = true;
        return c9218c.f18122a.m18287a(abstractRunnableC9767g, z10);
    }

    /* renamed from: t */
    public final boolean m16802t(long j10) {
        if (AbstractC8323h.m13510e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f18106a) {
            int iM16789c = m16789c();
            if (iM16789c == 1 && this.f18106a > 1) {
                m16789c();
            }
            if (iM16789c > 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM17411a = this.f18112g.m17411a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM17411a; i15++) {
            C9218c c9218c = (C9218c) this.f18112g.m17412b(i15);
            if (c9218c != null) {
                int iM18291i = c9218c.f18122a.m18291i();
                int i16 = C9217b.f18120a[c9218c.f18124c.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM18291i);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM18291i);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iM18291i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM18291i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f18103j.get(this);
        return this.f18109d + '@' + AbstractC8825c0.m14821b(this) + "[Pool Size {core = " + this.f18106a + ", max = " + this.f18107b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f18110e.m17385c() + ", global blocking queue size = " + this.f18111f.m17385c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f18106a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: v */
    public final boolean m16803v() {
        C9218c c9218cM16794l;
        do {
            c9218cM16794l = m16794l();
            if (c9218cM16794l == null) {
                return false;
            }
        } while (!C9218c.f18121i.compareAndSet(c9218cM16794l, -1, 0));
        LockSupport.unpark(c9218cM16794l);
        return true;
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    public final class C9218c extends Thread {

        /* renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f18121i = AtomicIntegerFieldUpdater.newUpdater(C9218c.class, "workerCtl$volatile");

        /* renamed from: a */
        public final C9773m f18122a;

        /* renamed from: b */
        public final Ref$ObjectRef f18123b;

        /* renamed from: c */
        public WorkerState f18124c;

        /* renamed from: d */
        public long f18125d;

        /* renamed from: e */
        public long f18126e;

        /* renamed from: f */
        public int f18127f;

        /* renamed from: g */
        public boolean f18128g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C9218c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f18122a = new C9773m();
            this.f18123b = new Ref$ObjectRef();
            this.f18124c = WorkerState.f18116d;
            this.nextParkedWorker = CoroutineScheduler.f18105l;
            int iNanoTime = (int) System.nanoTime();
            this.f18127f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* renamed from: b */
        public final void m16807b(int i10) {
            if (i10 == 0) {
                return;
            }
            CoroutineScheduler.m16784h().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.f18124c != WorkerState.f18117e) {
                this.f18124c = WorkerState.f18116d;
            }
        }

        /* renamed from: c */
        public final void m16808c(int i10) {
            if (i10 != 0 && m16825u(WorkerState.f18114b)) {
                CoroutineScheduler.this.m16800r();
            }
        }

        /* renamed from: d */
        public final void m16809d(AbstractRunnableC9767g abstractRunnableC9767g) {
            int iMo18282b = abstractRunnableC9767g.f19492b.mo18282b();
            m16815k(iMo18282b);
            m16808c(iMo18282b);
            CoroutineScheduler.this.m16797o(abstractRunnableC9767g);
            m16807b(iMo18282b);
        }

        /* renamed from: e */
        public final AbstractRunnableC9767g m16810e(boolean z10) {
            AbstractRunnableC9767g abstractRunnableC9767gM16819o;
            AbstractRunnableC9767g abstractRunnableC9767gM16819o2;
            if (z10) {
                boolean z11 = m16817m(CoroutineScheduler.this.f18106a * 2) == 0;
                if (z11 && (abstractRunnableC9767gM16819o2 = m16819o()) != null) {
                    return abstractRunnableC9767gM16819o2;
                }
                AbstractRunnableC9767g abstractRunnableC9767gM18293k = this.f18122a.m18293k();
                if (abstractRunnableC9767gM18293k != null) {
                    return abstractRunnableC9767gM18293k;
                }
                if (!z11 && (abstractRunnableC9767gM16819o = m16819o()) != null) {
                    return abstractRunnableC9767gM16819o;
                }
            } else {
                AbstractRunnableC9767g abstractRunnableC9767gM16819o3 = m16819o();
                if (abstractRunnableC9767gM16819o3 != null) {
                    return abstractRunnableC9767gM16819o3;
                }
            }
            return m16826v(3);
        }

        /* renamed from: f */
        public final AbstractRunnableC9767g m16811f() {
            AbstractRunnableC9767g abstractRunnableC9767gM18294l = this.f18122a.m18294l();
            if (abstractRunnableC9767gM18294l != null) {
                return abstractRunnableC9767gM18294l;
            }
            AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) CoroutineScheduler.this.f18111f.m17386e();
            return abstractRunnableC9767g == null ? m16826v(1) : abstractRunnableC9767g;
        }

        /* renamed from: g */
        public final AbstractRunnableC9767g m16812g(boolean z10) {
            return m16823s() ? m16810e(z10) : m16811f();
        }

        /* renamed from: h */
        public final int m16813h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object m16814i() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final void m16815k(int i10) {
            this.f18125d = 0L;
            if (this.f18124c == WorkerState.f18115c) {
                this.f18124c = WorkerState.f18114b;
            }
        }

        /* renamed from: l */
        public final boolean m16816l() {
            return this.nextParkedWorker != CoroutineScheduler.f18105l;
        }

        /* renamed from: m */
        public final int m16817m(int i10) {
            int i11 = this.f18127f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f18127f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        /* renamed from: n */
        public final void m16818n() {
            if (this.f18125d == 0) {
                this.f18125d = System.nanoTime() + CoroutineScheduler.this.f18108c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f18108c);
            if (System.nanoTime() - this.f18125d >= 0) {
                this.f18125d = 0L;
                m16827w();
            }
        }

        /* renamed from: o */
        public final AbstractRunnableC9767g m16819o() {
            if (m16817m(2) == 0) {
                AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) CoroutineScheduler.this.f18110e.m17386e();
                return abstractRunnableC9767g != null ? abstractRunnableC9767g : (AbstractRunnableC9767g) CoroutineScheduler.this.f18111f.m17386e();
            }
            AbstractRunnableC9767g abstractRunnableC9767g2 = (AbstractRunnableC9767g) CoroutineScheduler.this.f18111f.m17386e();
            return abstractRunnableC9767g2 != null ? abstractRunnableC9767g2 : (AbstractRunnableC9767g) CoroutineScheduler.this.f18110e.m17386e();
        }

        /* renamed from: p */
        public final void m16820p() {
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f18124c != WorkerState.f18117e) {
                    AbstractRunnableC9767g abstractRunnableC9767gM16812g = m16812g(this.f18128g);
                    if (abstractRunnableC9767gM16812g != null) {
                        this.f18126e = 0L;
                        m16809d(abstractRunnableC9767gM16812g);
                    } else {
                        this.f18128g = false;
                        if (this.f18126e == 0) {
                            m16824t();
                        } else if (z10) {
                            m16825u(WorkerState.f18115c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f18126e);
                            this.f18126e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            m16825u(WorkerState.f18117e);
        }

        /* renamed from: q */
        public final void m16821q(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f18109d);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        /* renamed from: r */
        public final void m16822r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m16820p();
        }

        /* renamed from: s */
        public final boolean m16823s() {
            long j10;
            if (this.f18124c == WorkerState.f18113a) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM16784h = CoroutineScheduler.m16784h();
            do {
                j10 = atomicLongFieldUpdaterM16784h.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.m16784h().compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
            this.f18124c = WorkerState.f18113a;
            return true;
        }

        /* renamed from: t */
        public final void m16824t() {
            if (!m16816l()) {
                CoroutineScheduler.this.m16795m(this);
                return;
            }
            f18121i.set(this, -1);
            while (m16816l() && f18121i.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f18124c != WorkerState.f18117e) {
                m16825u(WorkerState.f18115c);
                Thread.interrupted();
                m16818n();
            }
        }

        /* renamed from: u */
        public final boolean m16825u(WorkerState workerState) {
            WorkerState workerState2 = this.f18124c;
            boolean z10 = workerState2 == WorkerState.f18113a;
            if (z10) {
                CoroutineScheduler.m16784h().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f18124c = workerState;
            }
            return z10;
        }

        /* renamed from: v */
        public final AbstractRunnableC9767g m16826v(int i10) {
            int i11 = (int) (CoroutineScheduler.m16784h().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iM16817m = m16817m(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iM16817m++;
                if (iM16817m > i11) {
                    iM16817m = 1;
                }
                C9218c c9218c = (C9218c) coroutineScheduler.f18112g.m17412b(iM16817m);
                if (c9218c != null && c9218c != this) {
                    long jM18300r = c9218c.f18122a.m18300r(i10, this.f18123b);
                    if (jM18300r == -1) {
                        Ref$ObjectRef ref$ObjectRef = this.f18123b;
                        AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) ref$ObjectRef.f17473a;
                        ref$ObjectRef.f17473a = null;
                        return abstractRunnableC9767g;
                    }
                    if (jM18300r > 0) {
                        jMin = Math.min(jMin, jM18300r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f18126e = jMin;
            return null;
        }

        /* renamed from: w */
        public final void m16827w() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f18112g) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.m16784h().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f18106a) {
                        return;
                    }
                    if (f18121i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        m16821q(0);
                        coroutineScheduler.m16796n(this, i10, 0);
                        int andDecrement = (int) (CoroutineScheduler.m16784h().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i10) {
                            Object objM17412b = coroutineScheduler.f18112g.m17412b(andDecrement);
                            AbstractC9133u.m16130d(objM17412b);
                            C9218c c9218c = (C9218c) objM17412b;
                            coroutineScheduler.f18112g.m17413c(i10, c9218c);
                            c9218c.m16821q(i10);
                            coroutineScheduler.m16796n(c9218c, andDecrement, i10);
                        }
                        coroutineScheduler.f18112g.m17413c(andDecrement, null);
                        C8736p c8736p = C8736p.f16368a;
                        this.f18124c = WorkerState.f18117e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public C9218c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            m16821q(i10);
        }
    }
}

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
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p410xd.C11839c0;
import p410xd.C11873x;
import p425yc.InterfaceC11943a;
import p440zd.AbstractC12048i;
import p440zd.AbstractRunnableC12046g;
import p440zd.C12042c;
import p440zd.C12050k;
import sd.AbstractC11093b;
import sd.AbstractC11126j0;

/* loaded from: classes6.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: j */
    public static final C10048a f23983j = new C10048a(null);

    /* renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f23984k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f23985l = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23986m = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* renamed from: n */
    public static final C11839c0 f23987n = new C11839c0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: c */
    public final int f23988c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final int f23989d;

    /* renamed from: e */
    public final long f23990e;

    /* renamed from: f */
    public final String f23991f;

    /* renamed from: g */
    public final C12042c f23992g;

    /* renamed from: h */
    public final C12042c f23993h;

    /* renamed from: i */
    public final C11873x f23994i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerState {

        /* renamed from: c */
        public static final WorkerState f23995c = new WorkerState("CPU_ACQUIRED", 0);

        /* renamed from: d */
        public static final WorkerState f23996d = new WorkerState("BLOCKING", 1);

        /* renamed from: e */
        public static final WorkerState f23997e = new WorkerState("PARKING", 2);

        /* renamed from: f */
        public static final WorkerState f23998f = new WorkerState("DORMANT", 3);

        /* renamed from: g */
        public static final WorkerState f23999g = new WorkerState("TERMINATED", 4);

        /* renamed from: h */
        public static final /* synthetic */ WorkerState[] f24000h;

        /* renamed from: i */
        public static final /* synthetic */ InterfaceC11943a f24001i;

        static {
            WorkerState[] workerStateArrM20944a = m20944a();
            f24000h = workerStateArrM20944a;
            f24001i = AbstractC9953a.m20230a(workerStateArrM20944a);
        }

        public WorkerState(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ WorkerState[] m20944a() {
            return new WorkerState[]{f23995c, f23996d, f23997e, f23998f, f23999g};
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f24000h.clone();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public static final class C10048a {
        public /* synthetic */ C10048a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C10048a() {
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public /* synthetic */ class C10049b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24002a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.f23997e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.f23996d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.f23995c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.f23998f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.f23999g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24002a = iArr;
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        this.f23988c = i10;
        this.f23989d = i11;
        this.f23990e = j10;
        this.f23991f = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f23992g = new C12042c();
            this.f23993h = new C12042c();
            this.f23994i = new C11873x((i10 + 1) * 2);
            this.controlState$volatile = i10 << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m20922B(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f23985l.get(coroutineScheduler);
        }
        return coroutineScheduler.m20928A(j10);
    }

    /* renamed from: l */
    public static /* synthetic */ void m20924l(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        coroutineScheduler.m20934k(runnable, z10, z11);
    }

    /* renamed from: m */
    public static final /* synthetic */ AtomicLongFieldUpdater m20925m() {
        return f23985l;
    }

    /* renamed from: A */
    public final boolean m20928A(long j10) {
        if (AbstractC10410o.m21752e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f23988c) {
            int iM20931g = m20931g();
            if (iM20931g == 1 && this.f23988c > 1) {
                m20931g();
            }
            if (iM20931g > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m20929C() {
        C10050c c10050cM20936s;
        do {
            c10050cM20936s = m20936s();
            if (c10050cM20936s == null) {
                return false;
            }
        } while (!C10050c.f24003k.compareAndSet(c10050cM20936s, -1, 0));
        LockSupport.unpark(c10050cM20936s);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m20940w(WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m20924l(this, runnable, false, false, 6, null);
    }

    /* renamed from: f */
    public final boolean m20930f(AbstractRunnableC12046g abstractRunnableC12046g) {
        return abstractRunnableC12046g.f28423d ? this.f23993h.m26319a(abstractRunnableC12046g) : this.f23992g.m26319a(abstractRunnableC12046g);
    }

    /* renamed from: g */
    public final int m20931g() {
        synchronized (this.f23994i) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f23985l.get(this);
                int i10 = (int) (j10 & 2097151);
                int iM21752e = AbstractC10410o.m21752e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iM21752e >= this.f23988c) {
                    return 0;
                }
                if (i10 >= this.f23989d) {
                    return 0;
                }
                int i11 = ((int) (m20925m().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f23994i.m26353b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C10050c c10050c = new C10050c(this, i11);
                this.f23994i.m26354c(i11, c10050c);
                if (i11 != ((int) (2097151 & f23985l.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iM21752e + 1;
                c10050c.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final AbstractRunnableC12046g m20932i(Runnable runnable, boolean z10) {
        long jMo26669a = AbstractC12048i.f28430f.mo26669a();
        if (!(runnable instanceof AbstractRunnableC12046g)) {
            return AbstractC12048i.m26673b(runnable, jMo26669a, z10);
        }
        AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) runnable;
        abstractRunnableC12046g.f28422c = jMo26669a;
        abstractRunnableC12046g.f28423d = z10;
        return abstractRunnableC12046g;
    }

    public final boolean isTerminated() {
        return f23986m.get(this) == 1;
    }

    /* renamed from: j */
    public final C10050c m20933j() {
        Thread threadCurrentThread = Thread.currentThread();
        C10050c c10050c = threadCurrentThread instanceof C10050c ? (C10050c) threadCurrentThread : null;
        if (c10050c == null || !AbstractC9979u.m20289b(CoroutineScheduler.this, this)) {
            return null;
        }
        return c10050c;
    }

    /* renamed from: k */
    public final void m20934k(Runnable runnable, boolean z10, boolean z11) {
        AbstractC11093b.m24675a();
        AbstractRunnableC12046g abstractRunnableC12046gM20932i = m20932i(runnable, z10);
        boolean z12 = abstractRunnableC12046gM20932i.f28423d;
        long jAddAndGet = z12 ? f23985l.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        AbstractRunnableC12046g abstractRunnableC12046gM20943z = m20943z(m20933j(), abstractRunnableC12046gM20932i, z11);
        if (abstractRunnableC12046gM20943z != null && !m20930f(abstractRunnableC12046gM20943z)) {
            throw new RejectedExecutionException(this.f23991f + " was terminated");
        }
        if (z12) {
            m20941x(jAddAndGet);
        } else {
            m20942y();
        }
    }

    /* renamed from: r */
    public final int m20935r(C10050c c10050c) {
        Object objM20952g = c10050c.m20952g();
        while (objM20952g != f23987n) {
            if (objM20952g == null) {
                return 0;
            }
            C10050c c10050c2 = (C10050c) objM20952g;
            int iM20951f = c10050c2.m20951f();
            if (iM20951f != 0) {
                return iM20951f;
            }
            objM20952g = c10050c2.m20952g();
        }
        return -1;
    }

    /* renamed from: s */
    public final C10050c m20936s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23984k;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            C10050c c10050c = (C10050c) this.f23994i.m26353b((int) (2097151 & j10));
            if (c10050c == null) {
                return null;
            }
            long j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            int iM20935r = m20935r(c10050c);
            if (iM20935r >= 0 && f23984k.compareAndSet(this, j10, iM20935r | j11)) {
                c10050c.m20959o(f23987n);
                return c10050c;
            }
        }
    }

    /* renamed from: t */
    public final boolean m20937t(C10050c c10050c) {
        long j10;
        long j11;
        int iM20951f;
        if (c10050c.m20952g() != f23987n) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23984k;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            iM20951f = c10050c.m20951f();
            c10050c.m20959o(this.f23994i.m26353b((int) (2097151 & j10)));
        } while (!f23984k.compareAndSet(this, j10, j11 | iM20951f));
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM26352a = this.f23994i.m26352a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM26352a; i15++) {
            C10050c c10050c = (C10050c) this.f23994i.m26353b(i15);
            if (c10050c != null) {
                int iM26683i = c10050c.f24004c.m26683i();
                int i16 = C10049b.f24002a[c10050c.f24006e.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM26683i);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iM26683i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iM26683i > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iM26683i);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i16 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f23985l.get(this);
        return this.f23991f + '@' + AbstractC11126j0.m24739b(this) + "[Pool Size {core = " + this.f23988c + ", max = " + this.f23989d + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f23992g.m26321c() + ", global blocking queue size = " + this.f23993h.m26321c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f23988c - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final void m20938u(C10050c c10050c, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23984k;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iM20935r = (int) (2097151 & j10);
            long j11 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j10) & (-2097152);
            if (iM20935r == i10) {
                iM20935r = i11 == 0 ? m20935r(c10050c) : i11;
            }
            if (iM20935r >= 0) {
                if (f23984k.compareAndSet(this, j10, j11 | iM20935r)) {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public final void m20939v(AbstractRunnableC12046g abstractRunnableC12046g) {
        try {
            abstractRunnableC12046g.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC11093b.m24675a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m20940w(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = m20927p()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r7.m20933j()
            xd.x r1 = r7.f23994i
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m20923e()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            xd.x r4 = r7.f23994i
            java.lang.Object r4 = r4.m26353b(r1)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.C10050c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            zd.k r4 = r4.f24004c
            zd.c r5 = r7.f23993h
            r4.m26684j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            zd.c r8 = r7.f23993h
            r8.m26320b()
            zd.c r8 = r7.f23992g
            r8.m26320b()
        L57:
            if (r0 == 0) goto L5f
            zd.g r8 = r0.m20950e(r2)
            if (r8 != 0) goto L8b
        L5f:
            zd.c r8 = r7.f23992g
            java.lang.Object r8 = r8.m26322e()
            zd.g r8 = (p440zd.AbstractRunnableC12046g) r8
            if (r8 != 0) goto L8b
            zd.c r8 = r7.f23993h
            java.lang.Object r8 = r8.m26322e()
            zd.g r8 = (p440zd.AbstractRunnableC12046g) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.f23999g
            r0.m20962r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m20926n()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m20925m()
            r8.set(r7, r0)
            return
        L8b:
            r7.m20939v(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.m20940w(long):void");
    }

    /* renamed from: x */
    public final void m20941x(long j10) {
        if (m20929C() || m20928A(j10)) {
            return;
        }
        m20929C();
    }

    /* renamed from: y */
    public final void m20942y() {
        if (m20929C() || m20922B(this, 0L, 1, null)) {
            return;
        }
        m20929C();
    }

    /* renamed from: z */
    public final AbstractRunnableC12046g m20943z(C10050c c10050c, AbstractRunnableC12046g abstractRunnableC12046g, boolean z10) {
        WorkerState workerState;
        if (c10050c == null || (workerState = c10050c.f24006e) == WorkerState.f23999g) {
            return abstractRunnableC12046g;
        }
        if (!abstractRunnableC12046g.f28423d && workerState == WorkerState.f23996d) {
            return abstractRunnableC12046g;
        }
        c10050c.f24010i = true;
        return c10050c.f24004c.m26679a(abstractRunnableC12046g, z10);
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    public final class C10050c extends Thread {

        /* renamed from: k */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f24003k = AtomicIntegerFieldUpdater.newUpdater(C10050c.class, "workerCtl$volatile");

        /* renamed from: c */
        public final C12050k f24004c;

        /* renamed from: d */
        public final Ref$ObjectRef f24005d;

        /* renamed from: e */
        public WorkerState f24006e;

        /* renamed from: f */
        public long f24007f;

        /* renamed from: g */
        public long f24008g;

        /* renamed from: h */
        public int f24009h;

        /* renamed from: i */
        public boolean f24010i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C10050c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f24004c = new C12050k();
            this.f24005d = new Ref$ObjectRef();
            this.f24006e = WorkerState.f23998f;
            this.nextParkedWorker = CoroutineScheduler.f23987n;
            int iNanoTime = (int) System.nanoTime();
            this.f24009h = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* renamed from: b */
        public final void m20947b(AbstractRunnableC12046g abstractRunnableC12046g) {
            this.f24007f = 0L;
            if (this.f24006e == WorkerState.f23997e) {
                this.f24006e = WorkerState.f23996d;
            }
            if (!abstractRunnableC12046g.f28423d) {
                CoroutineScheduler.this.m20939v(abstractRunnableC12046g);
                return;
            }
            if (m20962r(WorkerState.f23996d)) {
                CoroutineScheduler.this.m20942y();
            }
            CoroutineScheduler.this.m20939v(abstractRunnableC12046g);
            CoroutineScheduler.m20925m().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.f24006e != WorkerState.f23999g) {
                this.f24006e = WorkerState.f23998f;
            }
        }

        /* renamed from: c */
        public final AbstractRunnableC12046g m20948c(boolean z10) {
            AbstractRunnableC12046g abstractRunnableC12046gM20956l;
            AbstractRunnableC12046g abstractRunnableC12046gM20956l2;
            if (z10) {
                boolean z11 = m20954j(CoroutineScheduler.this.f23988c * 2) == 0;
                if (z11 && (abstractRunnableC12046gM20956l2 = m20956l()) != null) {
                    return abstractRunnableC12046gM20956l2;
                }
                AbstractRunnableC12046g abstractRunnableC12046gM26685k = this.f24004c.m26685k();
                if (abstractRunnableC12046gM26685k != null) {
                    return abstractRunnableC12046gM26685k;
                }
                if (!z11 && (abstractRunnableC12046gM20956l = m20956l()) != null) {
                    return abstractRunnableC12046gM20956l;
                }
            } else {
                AbstractRunnableC12046g abstractRunnableC12046gM20956l3 = m20956l();
                if (abstractRunnableC12046gM20956l3 != null) {
                    return abstractRunnableC12046gM20956l3;
                }
            }
            return m20963s(3);
        }

        /* renamed from: d */
        public final AbstractRunnableC12046g m20949d() {
            AbstractRunnableC12046g abstractRunnableC12046gM26686l = this.f24004c.m26686l();
            if (abstractRunnableC12046gM26686l != null) {
                return abstractRunnableC12046gM26686l;
            }
            AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) CoroutineScheduler.this.f23993h.m26322e();
            return abstractRunnableC12046g == null ? m20963s(1) : abstractRunnableC12046g;
        }

        /* renamed from: e */
        public final AbstractRunnableC12046g m20950e(boolean z10) {
            return m20960p() ? m20948c(z10) : m20949d();
        }

        /* renamed from: f */
        public final int m20951f() {
            return this.indexInArray;
        }

        /* renamed from: g */
        public final Object m20952g() {
            return this.nextParkedWorker;
        }

        /* renamed from: i */
        public final boolean m20953i() {
            return this.nextParkedWorker != CoroutineScheduler.f23987n;
        }

        /* renamed from: j */
        public final int m20954j(int i10) {
            int i11 = this.f24009h;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f24009h = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        /* renamed from: k */
        public final void m20955k() {
            if (this.f24007f == 0) {
                this.f24007f = System.nanoTime() + CoroutineScheduler.this.f23990e;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f23990e);
            if (System.nanoTime() - this.f24007f >= 0) {
                this.f24007f = 0L;
                m20964t();
            }
        }

        /* renamed from: l */
        public final AbstractRunnableC12046g m20956l() {
            if (m20954j(2) == 0) {
                AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) CoroutineScheduler.this.f23992g.m26322e();
                return abstractRunnableC12046g != null ? abstractRunnableC12046g : (AbstractRunnableC12046g) CoroutineScheduler.this.f23993h.m26322e();
            }
            AbstractRunnableC12046g abstractRunnableC12046g2 = (AbstractRunnableC12046g) CoroutineScheduler.this.f23993h.m26322e();
            return abstractRunnableC12046g2 != null ? abstractRunnableC12046g2 : (AbstractRunnableC12046g) CoroutineScheduler.this.f23992g.m26322e();
        }

        /* renamed from: m */
        public final void m20957m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f24006e != WorkerState.f23999g) {
                    AbstractRunnableC12046g abstractRunnableC12046gM20950e = m20950e(this.f24010i);
                    if (abstractRunnableC12046gM20950e != null) {
                        this.f24008g = 0L;
                        m20947b(abstractRunnableC12046gM20950e);
                    } else {
                        this.f24010i = false;
                        if (this.f24008g == 0) {
                            m20961q();
                        } else if (z10) {
                            m20962r(WorkerState.f23997e);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f24008g);
                            this.f24008g = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            m20962r(WorkerState.f23999g);
        }

        /* renamed from: n */
        public final void m20958n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f23991f);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* renamed from: o */
        public final void m20959o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: p */
        public final boolean m20960p() {
            long j10;
            if (this.f24006e == WorkerState.f23995c) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM20925m = CoroutineScheduler.m20925m();
            do {
                j10 = atomicLongFieldUpdaterM20925m.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.m20925m().compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
            this.f24006e = WorkerState.f23995c;
            return true;
        }

        /* renamed from: q */
        public final void m20961q() {
            if (!m20953i()) {
                CoroutineScheduler.this.m20937t(this);
                return;
            }
            f24003k.set(this, -1);
            while (m20953i() && f24003k.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f24006e != WorkerState.f23999g) {
                m20962r(WorkerState.f23997e);
                Thread.interrupted();
                m20955k();
            }
        }

        /* renamed from: r */
        public final boolean m20962r(WorkerState workerState) {
            WorkerState workerState2 = this.f24006e;
            boolean z10 = workerState2 == WorkerState.f23995c;
            if (z10) {
                CoroutineScheduler.m20925m().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f24006e = workerState;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m20957m();
        }

        /* renamed from: s */
        public final AbstractRunnableC12046g m20963s(int i10) {
            int i11 = (int) (CoroutineScheduler.m20925m().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iM20954j = m20954j(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iM20954j++;
                if (iM20954j > i11) {
                    iM20954j = 1;
                }
                C10050c c10050c = (C10050c) coroutineScheduler.f23994i.m26353b(iM20954j);
                if (c10050c != null && c10050c != this) {
                    long jM26692r = c10050c.f24004c.m26692r(i10, this.f24005d);
                    if (jM26692r == -1) {
                        Ref$ObjectRef ref$ObjectRef = this.f24005d;
                        AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) ref$ObjectRef.f23402c;
                        ref$ObjectRef.f23402c = null;
                        return abstractRunnableC12046g;
                    }
                    if (jM26692r > 0) {
                        jMin = Math.min(jMin, jM26692r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f24008g = jMin;
            return null;
        }

        /* renamed from: t */
        public final void m20964t() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f23994i) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.m20925m().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f23988c) {
                        return;
                    }
                    if (f24003k.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        m20958n(0);
                        coroutineScheduler.m20938u(this, i10, 0);
                        int andDecrement = (int) (CoroutineScheduler.m20925m().getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i10) {
                            Object objM26353b = coroutineScheduler.f23994i.m26353b(andDecrement);
                            AbstractC9979u.m20291d(objM26353b);
                            C10050c c10050c = (C10050c) objM26353b;
                            coroutineScheduler.f23994i.m26354c(i10, c10050c);
                            c10050c.m20958n(i10);
                            coroutineScheduler.m20938u(c10050c, andDecrement, i10);
                        }
                        coroutineScheduler.f23994i.m26354c(andDecrement, null);
                        C10786q c10786q = C10786q.f26013a;
                        this.f24006e = WorkerState.f23999g;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public C10050c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            m20958n(i10);
        }
    }
}

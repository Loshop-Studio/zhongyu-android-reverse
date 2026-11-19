package p068g7;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import p054e7.C5482n;
import p054e7.C5486r;

/* renamed from: g7.c */
/* loaded from: classes4.dex */
public final class ExecutorC5607c implements Executor, Closeable {

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f8719h = AtomicLongFieldUpdater.newUpdater(ExecutorC5607c.class, "parkedWorkersStack$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f8720i = AtomicLongFieldUpdater.newUpdater(ExecutorC5607c.class, "controlState$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8721j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5607c.class, "_isTerminated$volatile");

    /* renamed from: k */
    public static final C5486r f8722k = new C5486r("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a */
    public final int f8723a;

    /* renamed from: b */
    public final int f8724b;

    /* renamed from: c */
    public final long f8725c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final String f8726d;

    /* renamed from: e */
    public final C5610f f8727e;

    /* renamed from: f */
    public final C5610f f8728f;

    /* renamed from: g */
    public final C5482n f8729g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC5607c(String str, long j7, int i, int i8) {
        this.f8723a = i;
        this.f8724b = i8;
        this.f8725c = j7;
        this.f8726d = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i8 < i) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(i8, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f8727e = new C5610f();
        this.f8728f = new C5610f();
        this.f8729g = new C5482n((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    /* renamed from: c */
    public static /* synthetic */ void m4927c(ExecutorC5607c executorC5607c, Runnable runnable, int i) {
        executorC5607c.m4929b(runnable, false, (i & 4) == 0);
    }

    /* renamed from: a */
    public final int m4928a() {
        synchronized (this.f8729g) {
            try {
                if (f8721j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f8720i;
                long j7 = atomicLongFieldUpdater.get(this);
                int i = (int) (j7 & 2097151);
                int i8 = i - ((int) ((j7 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f8723a) {
                    return 0;
                }
                if (i >= this.f8724b) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f8729g.m4856b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C5606b c5606b = new C5606b(this, i9);
                this.f8729g.m4857c(i9, c5606b);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i8 + 1;
                c5606b.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m4929b(Runnable runnable, boolean z8, boolean z9) {
        AbstractRunnableC5613i c5614j;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        AbstractC5615k.f8743f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC5613i) {
            c5614j = (AbstractRunnableC5613i) runnable;
            c5614j.f8735a = jNanoTime;
            c5614j.f8736b = z8;
        } else {
            c5614j = new C5614j(runnable, jNanoTime, z8);
        }
        boolean z10 = c5614j.f8736b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8720i;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C5606b c5606b = threadCurrentThread instanceof C5606b ? (C5606b) threadCurrentThread : null;
        if (c5606b == null || !AbstractC5830k.m5325b(c5606b.f8718h, this)) {
            c5606b = null;
        }
        if (c5606b != null && (coroutineScheduler$WorkerState = c5606b.f8713c) != CoroutineScheduler$WorkerState.TERMINATED && (c5614j.f8736b || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.BLOCKING)) {
            c5606b.f8717g = true;
            C5617m c5617m = c5606b.f8711a;
            if (z9) {
                c5614j = c5617m.m4934a(c5614j);
            } else {
                c5617m.getClass();
                AbstractRunnableC5613i abstractRunnableC5613i = (AbstractRunnableC5613i) C5617m.f8745b.getAndSet(c5617m, c5614j);
                c5614j = abstractRunnableC5613i == null ? null : c5617m.m4934a(abstractRunnableC5613i);
            }
        }
        if (c5614j != null) {
            if (!(c5614j.f8736b ? this.f8728f.m4847a(c5614j) : this.f8727e.m4847a(c5614j))) {
                throw new RejectedExecutionException(AbstractC0037f.m91p(new StringBuilder(), this.f8726d, " was terminated"));
            }
        }
        if (z10) {
            if (m4932f() || m4931e(jAddAndGet)) {
                return;
            }
            m4932f();
            return;
        }
        if (m4932f() || m4931e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m4932f();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p068g7.ExecutorC5607c.f8721j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p068g7.C5606b
            r3 = 0
            if (r1 == 0) goto L17
            g7.b r0 = (p068g7.C5606b) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            g7.c r1 = r0.f8718h
            boolean r1 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            e7.n r1 = r8.f8729g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p068g7.ExecutorC5607c.f8720i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            e7.n r5 = r8.f8729g
            java.lang.Object r5 = r5.m4856b(r1)
            kotlin.jvm.internal.AbstractC5830k.m5327d(r5)
            g7.b r5 = (p068g7.C5606b) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            g7.m r5 = r5.f8711a
            g7.f r6 = r8.f8728f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p068g7.C5617m.f8745b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            g7.i r7 = (p068g7.AbstractRunnableC5613i) r7
            if (r7 == 0) goto L68
            r6.m4847a(r7)
        L68:
            g7.i r7 = r5.m4935b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.m4847a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            g7.f r1 = r8.f8728f
            r1.m4848b()
            g7.f r1 = r8.f8727e
            r1.m4848b()
        L82:
            if (r0 == 0) goto L8a
            g7.i r1 = r0.m4918a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            g7.f r1 = r8.f8727e
            java.lang.Object r1 = r1.m4850d()
            g7.i r1 = (p068g7.AbstractRunnableC5613i) r1
            if (r1 != 0) goto Lb2
            g7.f r1 = r8.f8728f
            java.lang.Object r1 = r1.m4850d()
            g7.i r1 = (p068g7.AbstractRunnableC5613i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.TERMINATED
            r0.m4925h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p068g7.ExecutorC5607c.f8719h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p068g7.ExecutorC5607c.f8720i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p068g7.ExecutorC5607c.close():void");
    }

    /* renamed from: d */
    public final void m4930d(C5606b c5606b, int i, int i8) {
        while (true) {
            long j7 = f8719h.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i) {
                if (i8 == 0) {
                    Object objM4920c = c5606b.m4920c();
                    while (true) {
                        if (objM4920c == f8722k) {
                            i9 = -1;
                            break;
                        }
                        if (objM4920c == null) {
                            i9 = 0;
                            break;
                        }
                        C5606b c5606b2 = (C5606b) objM4920c;
                        int iM4919b = c5606b2.m4919b();
                        if (iM4919b != 0) {
                            i9 = iM4919b;
                            break;
                        }
                        objM4920c = c5606b2.m4920c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f8719h.compareAndSet(this, j7, i9 | j8)) {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean m4931e(long j7) {
        int i = ((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i8 = this.f8723a;
        if (i < i8) {
            int iM4928a = m4928a();
            if (iM4928a == 1 && i8 > 1) {
                m4928a();
            }
            if (iM4928a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m4927c(this, runnable, 6);
    }

    /* renamed from: f */
    public final boolean m4932f() {
        C5486r c5486r;
        int iM4919b;
        while (true) {
            long j7 = f8719h.get(this);
            C5606b c5606b = (C5606b) this.f8729g.m4856b((int) (2097151 & j7));
            if (c5606b == null) {
                c5606b = null;
            } else {
                long j8 = (2097152 + j7) & (-2097152);
                Object objM4920c = c5606b.m4920c();
                while (true) {
                    c5486r = f8722k;
                    if (objM4920c == c5486r) {
                        iM4919b = -1;
                        break;
                    }
                    if (objM4920c == null) {
                        iM4919b = 0;
                        break;
                    }
                    C5606b c5606b2 = (C5606b) objM4920c;
                    iM4919b = c5606b2.m4919b();
                    if (iM4919b != 0) {
                        break;
                    }
                    objM4920c = c5606b2.m4920c();
                }
                if (iM4919b >= 0) {
                    if (f8719h.compareAndSet(this, j7, iM4919b | j8)) {
                        c5606b.m4924g(c5486r);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c5606b == null) {
                return false;
            }
            if (C5606b.f8710i.compareAndSet(c5606b, -1, 0)) {
                LockSupport.unpark(c5606b);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C5482n c5482n = this.f8729g;
        int iM4855a = c5482n.m4855a();
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < iM4855a; i12++) {
            C5606b c5606b = (C5606b) c5482n.m4856b(i12);
            if (c5606b != null) {
                C5617m c5617m = c5606b.f8711a;
                c5617m.getClass();
                int i13 = C5617m.f8745b.get(c5617m) != null ? (C5617m.f8746c.get(c5617m) - C5617m.f8747d.get(c5617m)) + 1 : C5617m.f8746c.get(c5617m) - C5617m.f8747d.get(c5617m);
                int i14 = AbstractC5605a.f8709a[c5606b.f8713c.ordinal()];
                if (i14 == 1) {
                    i9++;
                } else if (i14 == 2) {
                    i8++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i14 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i14 == 4) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i11++;
                }
            }
        }
        long j7 = f8720i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f8726d);
        sb4.append('@');
        sb4.append(AbstractC6014x.m5642m(this));
        sb4.append("[Pool Size {core = ");
        int i15 = this.f8723a;
        sb4.append(i15);
        sb4.append(", max = ");
        AbstractC1923c.m1059w(sb4, this.f8724b, "}, Worker States {CPU = ", i, ", blocking = ");
        AbstractC1923c.m1059w(sb4, i8, ", parked = ", i9, ", dormant = ");
        AbstractC1923c.m1059w(sb4, i10, ", terminated = ", i11, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f8727e.m4849c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f8728f.m4849c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j7));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j7) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i15 - ((int) ((j7 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

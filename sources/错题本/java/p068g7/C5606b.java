package p068g7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import org.jetbrains.annotations.Nullable;

/* renamed from: g7.b */
/* loaded from: classes4.dex */
public final class C5606b extends Thread {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8710i = AtomicIntegerFieldUpdater.newUpdater(C5606b.class, "workerCtl$volatile");

    /* renamed from: a */
    public final C5617m f8711a;

    /* renamed from: b */
    public final Ref$ObjectRef f8712b;

    /* renamed from: c */
    public CoroutineScheduler$WorkerState f8713c;

    /* renamed from: d */
    public long f8714d;

    /* renamed from: e */
    public long f8715e;

    /* renamed from: f */
    public int f8716f;

    /* renamed from: g */
    public boolean f8717g;

    /* renamed from: h */
    public final /* synthetic */ ExecutorC5607c f8718h;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C5606b(ExecutorC5607c executorC5607c, int i) {
        this.f8718h = executorC5607c;
        setDaemon(true);
        setContextClassLoader(ExecutorC5607c.class.getClassLoader());
        this.f8711a = new C5617m();
        this.f8712b = new Ref$ObjectRef();
        this.f8713c = CoroutineScheduler$WorkerState.DORMANT;
        this.nextParkedWorker = ExecutorC5607c.f8722k;
        int iNanoTime = (int) System.nanoTime();
        this.f8716f = iNanoTime == 0 ? 42 : iNanoTime;
        m4923f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p068g7.C5617m.f8747d.get(r10);
        r0 = p068g7.C5617m.f8746c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p068g7.C5617m.f8748e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.m4936c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p068g7.AbstractRunnableC5613i m4918a(boolean r12) {
        /*
            r11 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r11.f8713c
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.CPU_ACQUIRED
            g7.c r3 = r11.f8718h
            r8 = 0
            r9 = 1
            g7.m r10 = r11.f8711a
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p068g7.ExecutorC5607c.f8720i
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p068g7.C5617m.f8745b
            java.lang.Object r0 = r12.get(r10)
            g7.i r0 = (p068g7.AbstractRunnableC5613i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f8736b
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = p068g7.C5617m.f8747d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p068g7.C5617m.f8746c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p068g7.C5617m.f8748e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            g7.i r1 = r10.m4936c(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            g7.f r12 = r3.f8728f
            java.lang.Object r12 = r12.m4850d()
            g7.i r12 = (p068g7.AbstractRunnableC5613i) r12
            if (r12 != 0) goto L71
            g7.i r12 = r11.m4926i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p068g7.ExecutorC5607c.f8720i
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.CPU_ACQUIRED
            r11.f8713c = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.f8723a
            int r12 = r12 * 2
            int r12 = r11.m4921d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            g7.i r12 = r11.m4922e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p068g7.C5617m.f8745b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            g7.i r12 = (p068g7.AbstractRunnableC5613i) r12
            if (r12 != 0) goto Lae
            g7.i r12 = r10.m4935b()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            g7.i r12 = r11.m4922e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            g7.i r12 = r11.m4922e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            g7.i r12 = r11.m4926i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p068g7.C5606b.m4918a(boolean):g7.i");
    }

    /* renamed from: b */
    public final int m4919b() {
        return this.indexInArray;
    }

    /* renamed from: c */
    public final Object m4920c() {
        return this.nextParkedWorker;
    }

    /* renamed from: d */
    public final int m4921d(int i) {
        int i8 = this.f8716f;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f8716f = i11;
        int i12 = i - 1;
        return (i12 & i) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i;
    }

    /* renamed from: e */
    public final AbstractRunnableC5613i m4922e() {
        int iM4921d = m4921d(2);
        ExecutorC5607c executorC5607c = this.f8718h;
        if (iM4921d == 0) {
            AbstractRunnableC5613i abstractRunnableC5613i = (AbstractRunnableC5613i) executorC5607c.f8727e.m4850d();
            return abstractRunnableC5613i != null ? abstractRunnableC5613i : (AbstractRunnableC5613i) executorC5607c.f8728f.m4850d();
        }
        AbstractRunnableC5613i abstractRunnableC5613i2 = (AbstractRunnableC5613i) executorC5607c.f8728f.m4850d();
        return abstractRunnableC5613i2 != null ? abstractRunnableC5613i2 : (AbstractRunnableC5613i) executorC5607c.f8727e.m4850d();
    }

    /* renamed from: f */
    public final void m4923f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8718h.f8726d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* renamed from: g */
    public final void m4924g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: h */
    public final boolean m4925h(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.f8713c;
        boolean z8 = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        if (z8) {
            ExecutorC5607c.f8720i.addAndGet(this.f8718h, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.f8713c = coroutineScheduler$WorkerState;
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, g7.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [g7.i] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [g7.i] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p068g7.AbstractRunnableC5613i m4926i(int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p068g7.C5606b.m4926i(int):g7.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p068g7.C5606b.run():void");
    }
}

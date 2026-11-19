package kotlinx.coroutines.scheduling;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.scheduling.m */
/* loaded from: classes.dex */
public final class C2824m {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10849b = AtomicReferenceFieldUpdater.newUpdater(C2824m.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10850c = AtomicIntegerFieldUpdater.newUpdater(C2824m.class, "producerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10851d = AtomicIntegerFieldUpdater.newUpdater(C2824m.class, "consumerIndex");

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10852e = AtomicIntegerFieldUpdater.newUpdater(C2824m.class, "blockingTasksInBuffer");

    /* renamed from: a */
    @NotNull
    private final AtomicReferenceArray<AbstractRunnableC2820i> f10853a = new AtomicReferenceArray<>(128);

    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;

    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;

    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC2820i m9422b(C2824m c2824m, AbstractRunnableC2820i abstractRunnableC2820i, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return c2824m.m9428a(abstractRunnableC2820i, z3);
    }

    /* renamed from: c */
    private final AbstractRunnableC2820i m9423c(AbstractRunnableC2820i abstractRunnableC2820i) {
        if (abstractRunnableC2820i.f10841b.mo9419I() == 1) {
            f10852e.incrementAndGet(this);
        }
        if (m9429e() == 127) {
            return abstractRunnableC2820i;
        }
        int i4 = this.producerIndex & 127;
        while (this.f10853a.get(i4) != null) {
            Thread.yield();
        }
        this.f10853a.lazySet(i4, abstractRunnableC2820i);
        f10850c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m9424d(AbstractRunnableC2820i abstractRunnableC2820i) {
        if (abstractRunnableC2820i != null) {
            if (abstractRunnableC2820i.f10841b.mo9419I() == 1) {
                f10852e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final AbstractRunnableC2820i m9425i() {
        AbstractRunnableC2820i andSet;
        while (true) {
            int i4 = this.consumerIndex;
            if (i4 - this.producerIndex == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (f10851d.compareAndSet(this, i4, i4 + 1) && (andSet = this.f10853a.getAndSet(i5, null)) != null) {
                m9424d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m9426j(C2815d c2815d) {
        AbstractRunnableC2820i abstractRunnableC2820iM9425i = m9425i();
        if (abstractRunnableC2820iM9425i == null) {
            return false;
        }
        c2815d.m9314a(abstractRunnableC2820iM9425i);
        return true;
    }

    /* renamed from: m */
    private final long m9427m(C2824m c2824m, boolean z3) {
        AbstractRunnableC2820i abstractRunnableC2820i;
        do {
            abstractRunnableC2820i = (AbstractRunnableC2820i) c2824m.lastScheduledTask;
            if (abstractRunnableC2820i == null) {
                return -2L;
            }
            if (z3) {
                if (!(abstractRunnableC2820i.f10841b.mo9419I() == 1)) {
                    return -2L;
                }
            }
            long jMo9421a = C2823l.f10848f.mo9421a() - abstractRunnableC2820i.f10840a;
            long j4 = C2823l.f10843a;
            if (jMo9421a < j4) {
                return j4 - jMo9421a;
            }
        } while (!C0827b.m4278a(f10849b, c2824m, abstractRunnableC2820i, null));
        m9422b(this, abstractRunnableC2820i, false, 2, null);
        return -1L;
    }

    @Nullable
    /* renamed from: a */
    public final AbstractRunnableC2820i m9428a(@NotNull AbstractRunnableC2820i abstractRunnableC2820i, boolean z3) {
        if (z3) {
            return m9423c(abstractRunnableC2820i);
        }
        AbstractRunnableC2820i abstractRunnableC2820i2 = (AbstractRunnableC2820i) f10849b.getAndSet(this, abstractRunnableC2820i);
        if (abstractRunnableC2820i2 == null) {
            return null;
        }
        return m9423c(abstractRunnableC2820i2);
    }

    /* renamed from: e */
    public final int m9429e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m9430f() {
        return this.lastScheduledTask != null ? m9429e() + 1 : m9429e();
    }

    /* renamed from: g */
    public final void m9431g(@NotNull C2815d c2815d) {
        AbstractRunnableC2820i abstractRunnableC2820i = (AbstractRunnableC2820i) f10849b.getAndSet(this, null);
        if (abstractRunnableC2820i != null) {
            c2815d.m9314a(abstractRunnableC2820i);
        }
        while (m9426j(c2815d)) {
        }
    }

    @Nullable
    /* renamed from: h */
    public final AbstractRunnableC2820i m9432h() {
        AbstractRunnableC2820i abstractRunnableC2820i = (AbstractRunnableC2820i) f10849b.getAndSet(this, null);
        return abstractRunnableC2820i == null ? m9425i() : abstractRunnableC2820i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return m9427m(r9, true);
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m9433k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.C2824m r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.i> r2 = r9.f10853a
        L6:
            r3 = 1
            if (r0 == r1) goto L3b
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 != 0) goto L10
            goto L3b
        L10:
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.i r5 = (kotlinx.coroutines.scheduling.AbstractRunnableC2820i) r5
            if (r5 == 0) goto L38
            kotlinx.coroutines.scheduling.j r6 = r5.f10841b
            int r6 = r6.mo9419I()
            r7 = 0
            if (r6 != r3) goto L22
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L38
            r3 = 0
            boolean r4 = r2.compareAndSet(r4, r5, r3)
            if (r4 == 0) goto L38
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.C2824m.f10852e
            r0.decrementAndGet(r9)
            r9 = 2
            m9422b(r8, r5, r7, r9, r3)
            r0 = -1
            return r0
        L38:
            int r0 = r0 + 1
            goto L6
        L3b:
            long r0 = r8.m9427m(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.C2824m.m9433k(kotlinx.coroutines.scheduling.m):long");
    }

    /* renamed from: l */
    public final long m9434l(@NotNull C2824m c2824m) {
        AbstractRunnableC2820i abstractRunnableC2820iM9425i = c2824m.m9425i();
        if (abstractRunnableC2820iM9425i == null) {
            return m9427m(c2824m, false);
        }
        m9422b(this, abstractRunnableC2820iM9425i, false, 2, null);
        return -1L;
    }
}

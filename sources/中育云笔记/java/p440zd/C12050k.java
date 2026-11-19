package p440zd;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import p365ud.AbstractC11391f;

/* renamed from: zd.k */
/* loaded from: classes6.dex */
public final class C12050k {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28432b = AtomicReferenceFieldUpdater.newUpdater(C12050k.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28433c = AtomicIntegerFieldUpdater.newUpdater(C12050k.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28434d = AtomicIntegerFieldUpdater.newUpdater(C12050k.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28435e = AtomicIntegerFieldUpdater.newUpdater(C12050k.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f28436a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC12046g m26679a(AbstractRunnableC12046g abstractRunnableC12046g, boolean z10) {
        if (z10) {
            return m26680b(abstractRunnableC12046g);
        }
        AbstractRunnableC12046g abstractRunnableC12046g2 = (AbstractRunnableC12046g) f28432b.getAndSet(this, abstractRunnableC12046g);
        if (abstractRunnableC12046g2 == null) {
            return null;
        }
        return m26680b(abstractRunnableC12046g2);
    }

    /* renamed from: b */
    public final AbstractRunnableC12046g m26680b(AbstractRunnableC12046g abstractRunnableC12046g) {
        if (m26682e() == 127) {
            return abstractRunnableC12046g;
        }
        if (abstractRunnableC12046g.f28423d) {
            f28435e.incrementAndGet(this);
        }
        int i10 = f28433c.get(this) & 127;
        while (this.f28436a.get(i10) != null) {
            Thread.yield();
        }
        this.f28436a.lazySet(i10, abstractRunnableC12046g);
        f28433c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final void m26681c(AbstractRunnableC12046g abstractRunnableC12046g) {
        if (abstractRunnableC12046g == null || !abstractRunnableC12046g.f28423d) {
            return;
        }
        f28435e.decrementAndGet(this);
    }

    /* renamed from: e */
    public final int m26682e() {
        return f28433c.get(this) - f28434d.get(this);
    }

    /* renamed from: i */
    public final int m26683i() {
        return f28432b.get(this) != null ? m26682e() + 1 : m26682e();
    }

    /* renamed from: j */
    public final void m26684j(C12042c c12042c) {
        AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) f28432b.getAndSet(this, null);
        if (abstractRunnableC12046g != null) {
            c12042c.m26319a(abstractRunnableC12046g);
        }
        while (m26688n(c12042c)) {
        }
    }

    /* renamed from: k */
    public final AbstractRunnableC12046g m26685k() {
        AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) f28432b.getAndSet(this, null);
        return abstractRunnableC12046g == null ? m26687m() : abstractRunnableC12046g;
    }

    /* renamed from: l */
    public final AbstractRunnableC12046g m26686l() {
        return m26689o(true);
    }

    /* renamed from: m */
    public final AbstractRunnableC12046g m26687m() {
        AbstractRunnableC12046g abstractRunnableC12046g;
        while (true) {
            int i10 = f28434d.get(this);
            if (i10 - f28433c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f28434d.compareAndSet(this, i10, i10 + 1) && (abstractRunnableC12046g = (AbstractRunnableC12046g) this.f28436a.getAndSet(i11, null)) != null) {
                m26681c(abstractRunnableC12046g);
                return abstractRunnableC12046g;
            }
        }
    }

    /* renamed from: n */
    public final boolean m26688n(C12042c c12042c) {
        AbstractRunnableC12046g abstractRunnableC12046gM26687m = m26687m();
        if (abstractRunnableC12046gM26687m == null) {
            return false;
        }
        c12042c.m26319a(abstractRunnableC12046gM26687m);
        return true;
    }

    /* renamed from: o */
    public final AbstractRunnableC12046g m26689o(boolean z10) {
        AbstractRunnableC12046g abstractRunnableC12046g;
        do {
            abstractRunnableC12046g = (AbstractRunnableC12046g) f28432b.get(this);
            if (abstractRunnableC12046g == null || abstractRunnableC12046g.f28423d != z10) {
                int i10 = f28434d.get(this);
                int i11 = f28433c.get(this);
                while (i10 != i11) {
                    if (z10 && f28435e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    AbstractRunnableC12046g abstractRunnableC12046gM26691q = m26691q(i11, z10);
                    if (abstractRunnableC12046gM26691q != null) {
                        return abstractRunnableC12046gM26691q;
                    }
                }
                return null;
            }
        } while (!AbstractC3223a.m1395a(f28432b, this, abstractRunnableC12046g, null));
        return abstractRunnableC12046g;
    }

    /* renamed from: p */
    public final AbstractRunnableC12046g m26690p(int i10) {
        int i11 = f28434d.get(this);
        int i12 = f28433c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f28435e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC12046g abstractRunnableC12046gM26691q = m26691q(i11, z10);
            if (abstractRunnableC12046gM26691q != null) {
                return abstractRunnableC12046gM26691q;
            }
            i11 = i13;
        }
        return null;
    }

    /* renamed from: q */
    public final AbstractRunnableC12046g m26691q(int i10, boolean z10) {
        int i11 = i10 & 127;
        AbstractRunnableC12046g abstractRunnableC12046g = (AbstractRunnableC12046g) this.f28436a.get(i11);
        if (abstractRunnableC12046g == null || abstractRunnableC12046g.f28423d != z10 || !AbstractC11391f.m25342a(this.f28436a, i11, abstractRunnableC12046g, null)) {
            return null;
        }
        if (z10) {
            f28435e.decrementAndGet(this);
        }
        return abstractRunnableC12046g;
    }

    /* renamed from: r */
    public final long m26692r(int i10, Ref$ObjectRef ref$ObjectRef) {
        AbstractRunnableC12046g abstractRunnableC12046gM26687m = i10 == 3 ? m26687m() : m26690p(i10);
        if (abstractRunnableC12046gM26687m == null) {
            return m26693s(i10, ref$ObjectRef);
        }
        ref$ObjectRef.f23402c = abstractRunnableC12046gM26687m;
        return -1L;
    }

    /* renamed from: s */
    public final long m26693s(int i10, Ref$ObjectRef ref$ObjectRef) {
        AbstractRunnableC12046g abstractRunnableC12046g;
        do {
            abstractRunnableC12046g = (AbstractRunnableC12046g) f28432b.get(this);
            if (abstractRunnableC12046g == null) {
                return -2L;
            }
            if (((abstractRunnableC12046g.f28423d ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jMo26669a = AbstractC12048i.f28430f.mo26669a() - abstractRunnableC12046g.f28422c;
            long j10 = AbstractC12048i.f28426b;
            if (jMo26669a < j10) {
                return j10 - jMo26669a;
            }
        } while (!AbstractC3223a.m1395a(f28432b, this, abstractRunnableC12046g, null));
        ref$ObjectRef.f23402c = abstractRunnableC12046g;
        return -1L;
    }
}

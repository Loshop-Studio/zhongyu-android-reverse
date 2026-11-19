package p213p8;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import p157k8.AbstractC9067c;

/* renamed from: p8.m */
/* loaded from: classes5.dex */
public final class C9773m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19504b = AtomicReferenceFieldUpdater.newUpdater(C9773m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19505c = AtomicIntegerFieldUpdater.newUpdater(C9773m.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19506d = AtomicIntegerFieldUpdater.newUpdater(C9773m.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19507e = AtomicIntegerFieldUpdater.newUpdater(C9773m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f19508a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC9767g m18287a(AbstractRunnableC9767g abstractRunnableC9767g, boolean z10) {
        if (z10) {
            return m18288b(abstractRunnableC9767g);
        }
        AbstractRunnableC9767g abstractRunnableC9767g2 = (AbstractRunnableC9767g) f19504b.getAndSet(this, abstractRunnableC9767g);
        if (abstractRunnableC9767g2 == null) {
            return null;
        }
        return m18288b(abstractRunnableC9767g2);
    }

    /* renamed from: b */
    public final AbstractRunnableC9767g m18288b(AbstractRunnableC9767g abstractRunnableC9767g) {
        if (m18290e() == 127) {
            return abstractRunnableC9767g;
        }
        if (abstractRunnableC9767g.f19492b.mo18282b() == 1) {
            f19507e.incrementAndGet(this);
        }
        int i10 = f19505c.get(this) & 127;
        while (this.f19508a.get(i10) != null) {
            Thread.yield();
        }
        this.f19508a.lazySet(i10, abstractRunnableC9767g);
        f19505c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final void m18289c(AbstractRunnableC9767g abstractRunnableC9767g) {
        if (abstractRunnableC9767g == null || abstractRunnableC9767g.f19492b.mo18282b() != 1) {
            return;
        }
        f19507e.decrementAndGet(this);
    }

    /* renamed from: e */
    public final int m18290e() {
        return f19505c.get(this) - f19506d.get(this);
    }

    /* renamed from: i */
    public final int m18291i() {
        return f19504b.get(this) != null ? m18290e() + 1 : m18290e();
    }

    /* renamed from: j */
    public final void m18292j(C9763c c9763c) {
        AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) f19504b.getAndSet(this, null);
        if (abstractRunnableC9767g != null) {
            c9763c.m17383a(abstractRunnableC9767g);
        }
        while (m18296n(c9763c)) {
        }
    }

    /* renamed from: k */
    public final AbstractRunnableC9767g m18293k() {
        AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) f19504b.getAndSet(this, null);
        return abstractRunnableC9767g == null ? m18295m() : abstractRunnableC9767g;
    }

    /* renamed from: l */
    public final AbstractRunnableC9767g m18294l() {
        return m18297o(true);
    }

    /* renamed from: m */
    public final AbstractRunnableC9767g m18295m() {
        AbstractRunnableC9767g abstractRunnableC9767g;
        while (true) {
            int i10 = f19506d.get(this);
            if (i10 - f19505c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f19506d.compareAndSet(this, i10, i10 + 1) && (abstractRunnableC9767g = (AbstractRunnableC9767g) this.f19508a.getAndSet(i11, null)) != null) {
                m18289c(abstractRunnableC9767g);
                return abstractRunnableC9767g;
            }
        }
    }

    /* renamed from: n */
    public final boolean m18296n(C9763c c9763c) {
        AbstractRunnableC9767g abstractRunnableC9767gM18295m = m18295m();
        if (abstractRunnableC9767gM18295m == null) {
            return false;
        }
        c9763c.m17383a(abstractRunnableC9767gM18295m);
        return true;
    }

    /* renamed from: o */
    public final AbstractRunnableC9767g m18297o(boolean z10) {
        AbstractRunnableC9767g abstractRunnableC9767g;
        do {
            abstractRunnableC9767g = (AbstractRunnableC9767g) f19504b.get(this);
            if (abstractRunnableC9767g != null) {
                if ((abstractRunnableC9767g.f19492b.mo18282b() == 1) == z10) {
                }
            }
            int i10 = f19506d.get(this);
            int i11 = f19505c.get(this);
            while (i10 != i11) {
                if (z10 && f19507e.get(this) == 0) {
                    return null;
                }
                i11--;
                AbstractRunnableC9767g abstractRunnableC9767gM18299q = m18299q(i11, z10);
                if (abstractRunnableC9767gM18299q != null) {
                    return abstractRunnableC9767gM18299q;
                }
            }
            return null;
        } while (!AbstractC3193a.m1318a(f19504b, this, abstractRunnableC9767g, null));
        return abstractRunnableC9767g;
    }

    /* renamed from: p */
    public final AbstractRunnableC9767g m18298p(int i10) {
        int i11 = f19506d.get(this);
        int i12 = f19505c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f19507e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC9767g abstractRunnableC9767gM18299q = m18299q(i11, z10);
            if (abstractRunnableC9767gM18299q != null) {
                return abstractRunnableC9767gM18299q;
            }
            i11 = i13;
        }
        return null;
    }

    /* renamed from: q */
    public final AbstractRunnableC9767g m18299q(int i10, boolean z10) {
        int i11 = i10 & 127;
        AbstractRunnableC9767g abstractRunnableC9767g = (AbstractRunnableC9767g) this.f19508a.get(i11);
        if (abstractRunnableC9767g != null) {
            if ((abstractRunnableC9767g.f19492b.mo18282b() == 1) == z10 && AbstractC9067c.m15881a(this.f19508a, i11, abstractRunnableC9767g, null)) {
                if (z10) {
                    f19507e.decrementAndGet(this);
                }
                return abstractRunnableC9767g;
            }
        }
        return null;
    }

    /* renamed from: r */
    public final long m18300r(int i10, Ref$ObjectRef ref$ObjectRef) {
        AbstractRunnableC9767g abstractRunnableC9767gM18295m = i10 == 3 ? m18295m() : m18298p(i10);
        if (abstractRunnableC9767gM18295m == null) {
            return m18301s(i10, ref$ObjectRef);
        }
        ref$ObjectRef.f17473a = abstractRunnableC9767gM18295m;
        return -1L;
    }

    /* renamed from: s */
    public final long m18301s(int i10, Ref$ObjectRef ref$ObjectRef) {
        AbstractRunnableC9767g abstractRunnableC9767g;
        do {
            abstractRunnableC9767g = (AbstractRunnableC9767g) f19504b.get(this);
            if (abstractRunnableC9767g == null) {
                return -2L;
            }
            if (((abstractRunnableC9767g.f19492b.mo18282b() != 1 ? 2 : 1) & i10) == 0) {
                return -2L;
            }
            long jMo18278a = AbstractC9771k.f19500f.mo18278a() - abstractRunnableC9767g.f19491a;
            long j10 = AbstractC9771k.f19496b;
            if (jMo18278a < j10) {
                return j10 - jMo18278a;
            }
        } while (!AbstractC3193a.m1318a(f19504b, this, abstractRunnableC9767g, null));
        ref$ObjectRef.f17473a = abstractRunnableC9767g;
        return -1L;
    }
}

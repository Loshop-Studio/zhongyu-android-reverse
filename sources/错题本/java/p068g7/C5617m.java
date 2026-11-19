package p068g7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: g7.m */
/* loaded from: classes4.dex */
public final class C5617m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8745b = AtomicReferenceFieldUpdater.newUpdater(C5617m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8746c = AtomicIntegerFieldUpdater.newUpdater(C5617m.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8747d = AtomicIntegerFieldUpdater.newUpdater(C5617m.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8748e = AtomicIntegerFieldUpdater.newUpdater(C5617m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f8749a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC5613i m4934a(AbstractRunnableC5613i abstractRunnableC5613i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8746c;
        if (atomicIntegerFieldUpdater.get(this) - f8747d.get(this) == 127) {
            return abstractRunnableC5613i;
        }
        if (abstractRunnableC5613i.f8736b) {
            f8748e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f8749a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC5613i);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* renamed from: b */
    public final AbstractRunnableC5613i m4935b() {
        AbstractRunnableC5613i abstractRunnableC5613i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8747d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f8746c.get(this) == 0) {
                return null;
            }
            int i8 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC5613i = (AbstractRunnableC5613i) this.f8749a.getAndSet(i8, null)) != null) {
                if (abstractRunnableC5613i.f8736b) {
                    f8748e.decrementAndGet(this);
                }
                return abstractRunnableC5613i;
            }
        }
    }

    /* renamed from: c */
    public final AbstractRunnableC5613i m4936c(int i, boolean z8) {
        int i8 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f8749a;
        AbstractRunnableC5613i abstractRunnableC5613i = (AbstractRunnableC5613i) atomicReferenceArray.get(i8);
        if (abstractRunnableC5613i != null && abstractRunnableC5613i.f8736b == z8) {
            while (!atomicReferenceArray.compareAndSet(i8, abstractRunnableC5613i, null)) {
                if (atomicReferenceArray.get(i8) != abstractRunnableC5613i) {
                }
            }
            if (z8) {
                f8748e.decrementAndGet(this);
            }
            return abstractRunnableC5613i;
        }
        return null;
    }
}

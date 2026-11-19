package p054e7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e7.h */
/* loaded from: classes4.dex */
public class C5476h {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8462a = AtomicReferenceFieldUpdater.newUpdater(C5476h.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C5478j(8, false);

    /* renamed from: a */
    public final boolean m4847a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8462a;
            C5478j c5478j = (C5478j) atomicReferenceFieldUpdater.get(this);
            int iM4851a = c5478j.m4851a(runnable);
            if (iM4851a == 0) {
                return true;
            }
            if (iM4851a == 1) {
                C5478j c5478jM4853c = c5478j.m4853c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c5478j, c5478jM4853c) && atomicReferenceFieldUpdater.get(this) == c5478j) {
                }
            } else if (iM4851a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m4848b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8462a;
            C5478j c5478j = (C5478j) atomicReferenceFieldUpdater.get(this);
            if (c5478j.m4852b()) {
                return;
            }
            C5478j c5478jM4853c = c5478j.m4853c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5478j, c5478jM4853c) && atomicReferenceFieldUpdater.get(this) == c5478j) {
            }
        }
    }

    /* renamed from: c */
    public final int m4849c() {
        C5478j c5478j = (C5478j) f8462a.get(this);
        c5478j.getClass();
        long j7 = C5478j.f8465f.get(c5478j);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    /* renamed from: d */
    public final Object m4850d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8462a;
            C5478j c5478j = (C5478j) atomicReferenceFieldUpdater.get(this);
            Object objM4854d = c5478j.m4854d();
            if (objM4854d != C5478j.f8466g) {
                return objM4854d;
            }
            C5478j c5478jM4853c = c5478j.m4853c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c5478j, c5478jM4853c) && atomicReferenceFieldUpdater.get(this) == c5478j) {
            }
        }
    }
}

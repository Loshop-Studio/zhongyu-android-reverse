package kotlinx.coroutines.sync;

import ae.InterfaceC0115k;
import androidx.concurrent.futures.AbstractC3223a;
import be.AbstractC5198j;
import be.C5199k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p365ud.AbstractC11391f;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11835a0;
import p410xd.AbstractC11836b;
import p410xd.AbstractC11875z;
import sd.AbstractC11137m;
import sd.InterfaceC11125j;
import sd.InterfaceC11144n2;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public class SemaphoreAndMutexImpl {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24049e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f24050f = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24051g = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f24052h = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24053i = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: c */
    public final int f24054c;

    /* renamed from: d */
    public final InterfaceC9545q f24055d;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreAndMutexImpl(int i10, int i11) {
        this.f24054c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        C5199k c5199k = new C5199k(0L, null, 2);
        this.head$volatile = c5199k;
        this.tail$volatile = c5199k;
        this._availablePermits$volatile = i10 - i11;
        this.f24055d = new InterfaceC9545q() { // from class: be.h
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SemaphoreAndMutexImpl.m21026p(this.f3063c, (Throwable) obj, (C10786q) obj2, (InterfaceC9945d) obj3);
            }
        };
    }

    /* renamed from: p */
    public static final C10786q m21026p(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th, C10786q c10786q, InterfaceC9945d interfaceC9945d) {
        semaphoreAndMutexImpl.release();
        return C10786q.f26013a;
    }

    /* renamed from: a */
    public final int m21027a() {
        return Math.max(f24053i.get(this), 0);
    }

    /* renamed from: b */
    public final Object m21028b(InterfaceC11588c interfaceC11588c) {
        if (m21033i() > 0) {
            return C10786q.f26013a;
        }
        Object objM21030f = m21030f(interfaceC11588c);
        return objM21030f == AbstractC11725a.m25952f() ? objM21030f : C10786q.f26013a;
    }

    /* renamed from: e */
    public final void m21029e(InterfaceC11125j interfaceC11125j) {
        while (m21033i() <= 0) {
            AbstractC9979u.m20292e(interfaceC11125j, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m21031g((InterfaceC11144n2) interfaceC11125j)) {
                return;
            }
        }
        interfaceC11125j.mo20526k(C10786q.f26013a, this.f24055d);
    }

    /* renamed from: f */
    public final Object m21030f(InterfaceC11588c interfaceC11588c) {
        C9997c c9997cM24757b = AbstractC11137m.m24757b(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c));
        try {
            if (!m21031g(c9997cM24757b)) {
                m21029e(c9997cM24757b);
            }
            Object objM20538x = c9997cM24757b.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
        } catch (Throwable th) {
            c9997cM24757b.m20511O();
            throw th;
        }
    }

    /* renamed from: g */
    public final boolean m21031g(InterfaceC11144n2 interfaceC11144n2) {
        Object objM26231c;
        C5199k c5199k = (C5199k) f24051g.get(this);
        long andIncrement = f24052h.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.f24056c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24051g;
        long j10 = andIncrement / AbstractC5198j.f3069f;
        loop0: while (true) {
            objM26231c = AbstractC11836b.m26231c(c5199k, j10, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!AbstractC11835a0.m26228c(objM26231c)) {
                AbstractC11875z abstractC11875zM26227b = AbstractC11835a0.m26227b(objM26231c);
                while (true) {
                    AbstractC11875z abstractC11875z = (AbstractC11875z) atomicReferenceFieldUpdater.get(this);
                    if (abstractC11875z.f28135e >= abstractC11875zM26227b.f28135e) {
                        break loop0;
                    }
                    if (!abstractC11875zM26227b.m26358u()) {
                        break;
                    }
                    if (AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, abstractC11875z, abstractC11875zM26227b)) {
                        if (abstractC11875z.m26356p()) {
                            abstractC11875z.m26245n();
                        }
                    } else if (abstractC11875zM26227b.m26356p()) {
                        abstractC11875zM26227b.m26245n();
                    }
                }
            } else {
                break;
            }
        }
        C5199k c5199k2 = (C5199k) AbstractC11835a0.m26227b(objM26231c);
        int i10 = (int) (andIncrement % AbstractC5198j.f3069f);
        if (AbstractC11391f.m25342a(c5199k2.m2762v(), i10, null, interfaceC11144n2)) {
            interfaceC11144n2.mo20523f(c5199k2, i10);
            return true;
        }
        if (!AbstractC11391f.m25342a(c5199k2.m2762v(), i10, AbstractC5198j.f3065b, AbstractC5198j.f3066c)) {
            return false;
        }
        if (interfaceC11144n2 instanceof InterfaceC11125j) {
            AbstractC9979u.m20292e(interfaceC11144n2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC11125j) interfaceC11144n2).mo20526k(C10786q.f26013a, this.f24055d);
        } else {
            if (!(interfaceC11144n2 instanceof InterfaceC0115k)) {
                throw new IllegalStateException(("unexpected: " + interfaceC11144n2).toString());
            }
            ((InterfaceC0115k) interfaceC11144n2).mo286b(C10786q.f26013a);
        }
        return true;
    }

    /* renamed from: h */
    public final void m21032h() {
        int i10;
        do {
            i10 = f24053i.get(this);
            if (i10 <= this.f24054c) {
                return;
            }
        } while (!f24053i.compareAndSet(this, i10, this.f24054c));
    }

    /* renamed from: i */
    public final int m21033i() {
        int andDecrement;
        do {
            andDecrement = f24053i.getAndDecrement(this);
        } while (andDecrement > this.f24054c);
        return andDecrement;
    }

    /* renamed from: o */
    public final void m21034o(InterfaceC0115k interfaceC0115k, Object obj) {
        while (m21033i() <= 0) {
            AbstractC9979u.m20292e(interfaceC0115k, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m21031g((InterfaceC11144n2) interfaceC0115k)) {
                return;
            }
        }
        interfaceC0115k.mo286b(C10786q.f26013a);
    }

    /* renamed from: q */
    public final boolean m21035q() {
        while (true) {
            int i10 = f24053i.get(this);
            if (i10 > this.f24054c) {
                m21032h();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f24053i.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: r */
    public final boolean m21036r(Object obj) {
        if (!(obj instanceof InterfaceC11125j)) {
            if (obj instanceof InterfaceC0115k) {
                return ((InterfaceC0115k) obj).mo287d(this, C10786q.f26013a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC11125j interfaceC11125j = (InterfaceC11125j) obj;
        Object objMo20533r = interfaceC11125j.mo20533r(C10786q.f26013a, null, this.f24055d);
        if (objMo20533r == null) {
            return false;
        }
        interfaceC11125j.mo20502D(objMo20533r);
        return true;
    }

    public final void release() {
        do {
            int andIncrement = f24053i.getAndIncrement(this);
            if (andIncrement >= this.f24054c) {
                m21032h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f24054c).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m21037s());
    }

    /* renamed from: s */
    public final boolean m21037s() {
        Object objM26231c;
        C5199k c5199k = (C5199k) f24049e.get(this);
        long andIncrement = f24050f.getAndIncrement(this);
        long j10 = andIncrement / AbstractC5198j.f3069f;
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.f24057c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24049e;
        loop0: while (true) {
            objM26231c = AbstractC11836b.m26231c(c5199k, j10, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (AbstractC11835a0.m26228c(objM26231c)) {
                break;
            }
            AbstractC11875z abstractC11875zM26227b = AbstractC11835a0.m26227b(objM26231c);
            while (true) {
                AbstractC11875z abstractC11875z = (AbstractC11875z) atomicReferenceFieldUpdater.get(this);
                if (abstractC11875z.f28135e >= abstractC11875zM26227b.f28135e) {
                    break loop0;
                }
                if (!abstractC11875zM26227b.m26358u()) {
                    break;
                }
                if (AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, abstractC11875z, abstractC11875zM26227b)) {
                    if (abstractC11875z.m26356p()) {
                        abstractC11875z.m26245n();
                    }
                } else if (abstractC11875zM26227b.m26356p()) {
                    abstractC11875zM26227b.m26245n();
                }
            }
        }
        C5199k c5199k2 = (C5199k) AbstractC11835a0.m26227b(objM26231c);
        c5199k2.m26236c();
        if (c5199k2.f28135e > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % AbstractC5198j.f3069f);
        Object andSet = c5199k2.m2762v().getAndSet(i10, AbstractC5198j.f3065b);
        if (andSet != null) {
            if (andSet == AbstractC5198j.f3068e) {
                return false;
            }
            return m21036r(andSet);
        }
        int i11 = AbstractC5198j.f3064a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (c5199k2.m2762v().get(i10) == AbstractC5198j.f3066c) {
                return true;
            }
        }
        return !AbstractC11391f.m25342a(c5199k2.m2762v(), i10, AbstractC5198j.f3065b, AbstractC5198j.f3067d);
    }
}

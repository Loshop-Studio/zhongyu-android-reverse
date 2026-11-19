package kotlinx.coroutines.sync;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p135i8.AbstractC8851l;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8895z1;
import p157k8.AbstractC9067c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9436a0;
import p191n8.AbstractC9438b0;
import p191n8.AbstractC9441d;
import p201o7.AbstractC9541f;
import p224q8.InterfaceC9854j;
import p235r8.AbstractC9945d;
import p235r8.C9946e;
import p235r8.InterfaceC9944c;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public class SemaphoreImpl implements InterfaceC9944c {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18183c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f18184d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18185e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f18186f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18187g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f18188a;

    /* renamed from: b */
    public final InterfaceC10570l f18189b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreImpl(int i10, int i11) {
        this.f18188a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        C9946e c9946e = new C9946e(0L, null, 2);
        this.head$volatile = c9946e;
        this.tail$volatile = c9946e;
        this._availablePermits$volatile = i10 - i11;
        this.f18189b = new InterfaceC10570l() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Throwable th) {
                this.f18191a.release();
            }
        };
    }

    /* renamed from: e */
    public static /* synthetic */ Object m16888e(SemaphoreImpl semaphoreImpl, InterfaceC9324c interfaceC9324c) {
        if (semaphoreImpl.m16900i() > 0) {
            return C8736p.f16368a;
        }
        Object objM16897f = semaphoreImpl.m16897f(interfaceC9324c);
        return objM16897f == AbstractC9434a.m17291f() ? objM16897f : C8736p.f16368a;
    }

    @Override // p235r8.InterfaceC9944c
    /* renamed from: a */
    public int mo16894a() {
        return Math.max(f18187g.get(this), 0);
    }

    @Override // p235r8.InterfaceC9944c
    /* renamed from: b */
    public Object mo16895b(InterfaceC9324c interfaceC9324c) {
        return m16888e(this, interfaceC9324c);
    }

    /* renamed from: d */
    public final void m16896d(InterfaceC8845j interfaceC8845j) {
        while (m16900i() <= 0) {
            AbstractC9133u.m16131e(interfaceC8845j, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m16898g((InterfaceC8895z1) interfaceC8845j)) {
                return;
            }
        }
        interfaceC8845j.mo14870g(C8736p.f16368a, this.f18189b);
    }

    /* renamed from: f */
    public final Object m16897f(InterfaceC9324c interfaceC9324c) {
        C9155c c9155cM14879b = AbstractC8851l.m14879b(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c));
        try {
            if (!m16898g(c9155cM14879b)) {
                m16896d(c9155cM14879b);
            }
            Object objM16372x = c9155cM14879b.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
        } catch (Throwable th) {
            c9155cM14879b.m16351M();
            throw th;
        }
    }

    /* renamed from: g */
    public final boolean m16898g(InterfaceC8895z1 interfaceC8895z1) {
        Object objM17307c;
        C9946e c9946e = (C9946e) f18185e.get(this);
        long andIncrement = f18186f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.f18190a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18185e;
        long j10 = andIncrement / AbstractC9945d.f19921f;
        loop0: while (true) {
            objM17307c = AbstractC9441d.m17307c(c9946e, j10, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!AbstractC9438b0.m17302c(objM17307c)) {
                AbstractC9436a0 abstractC9436a0M17301b = AbstractC9438b0.m17301b(objM17307c);
                while (true) {
                    AbstractC9436a0 abstractC9436a0 = (AbstractC9436a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC9436a0.f18641c >= abstractC9436a0M17301b.f18641c) {
                        break loop0;
                    }
                    if (!abstractC9436a0M17301b.m17296u()) {
                        break;
                    }
                    if (AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, abstractC9436a0, abstractC9436a0M17301b)) {
                        if (abstractC9436a0.m17294p()) {
                            abstractC9436a0.m17319n();
                        }
                    } else if (abstractC9436a0M17301b.m17294p()) {
                        abstractC9436a0M17301b.m17319n();
                    }
                }
            } else {
                break;
            }
        }
        C9946e c9946e2 = (C9946e) AbstractC9438b0.m17301b(objM17307c);
        int i10 = (int) (andIncrement % AbstractC9945d.f19921f);
        if (AbstractC9067c.m15881a(c9946e2.m18584v(), i10, null, interfaceC8895z1)) {
            interfaceC8895z1.mo14938c(c9946e2, i10);
            return true;
        }
        if (!AbstractC9067c.m15881a(c9946e2.m18584v(), i10, AbstractC9945d.f19917b, AbstractC9945d.f19918c)) {
            return false;
        }
        if (interfaceC8895z1 instanceof InterfaceC8845j) {
            AbstractC9133u.m16131e(interfaceC8895z1, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC8845j) interfaceC8895z1).mo14870g(C8736p.f16368a, this.f18189b);
        } else {
            if (!(interfaceC8895z1 instanceof InterfaceC9854j)) {
                throw new IllegalStateException(("unexpected: " + interfaceC8895z1).toString());
            }
            ((InterfaceC9854j) interfaceC8895z1).mo16842e(C8736p.f16368a);
        }
        return true;
    }

    /* renamed from: h */
    public final void m16899h() {
        int i10;
        do {
            i10 = f18187g.get(this);
            if (i10 <= this.f18188a) {
                return;
            }
        } while (!f18187g.compareAndSet(this, i10, this.f18188a));
    }

    /* renamed from: i */
    public final int m16900i() {
        int andDecrement;
        do {
            andDecrement = f18187g.getAndDecrement(this);
        } while (andDecrement > this.f18188a);
        return andDecrement;
    }

    /* renamed from: o */
    public final void m16901o(InterfaceC9854j interfaceC9854j, Object obj) {
        while (m16900i() <= 0) {
            AbstractC9133u.m16131e(interfaceC9854j, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m16898g((InterfaceC8895z1) interfaceC9854j)) {
                return;
            }
        }
        interfaceC9854j.mo16842e(C8736p.f16368a);
    }

    /* renamed from: p */
    public boolean m16902p() {
        while (true) {
            int i10 = f18187g.get(this);
            if (i10 > this.f18188a) {
                m16899h();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f18187g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: q */
    public final boolean m16903q(Object obj) {
        if (!(obj instanceof InterfaceC8845j)) {
            if (obj instanceof InterfaceC9854j) {
                return ((InterfaceC9854j) obj).mo16843f(this, C8736p.f16368a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC8845j interfaceC8845j = (InterfaceC8845j) obj;
        Object objMo14874t = interfaceC8845j.mo14874t(C8736p.f16368a, null, this.f18189b);
        if (objMo14874t == null) {
            return false;
        }
        interfaceC8845j.mo14875w(objMo14874t);
        return true;
    }

    /* renamed from: r */
    public final boolean m16904r() {
        Object objM17307c;
        C9946e c9946e = (C9946e) f18183c.get(this);
        long andIncrement = f18184d.getAndIncrement(this);
        long j10 = andIncrement / AbstractC9945d.f19921f;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.f18192a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18183c;
        loop0: while (true) {
            objM17307c = AbstractC9441d.m17307c(c9946e, j10, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (AbstractC9438b0.m17302c(objM17307c)) {
                break;
            }
            AbstractC9436a0 abstractC9436a0M17301b = AbstractC9438b0.m17301b(objM17307c);
            while (true) {
                AbstractC9436a0 abstractC9436a0 = (AbstractC9436a0) atomicReferenceFieldUpdater.get(this);
                if (abstractC9436a0.f18641c >= abstractC9436a0M17301b.f18641c) {
                    break loop0;
                }
                if (!abstractC9436a0M17301b.m17296u()) {
                    break;
                }
                if (AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, abstractC9436a0, abstractC9436a0M17301b)) {
                    if (abstractC9436a0.m17294p()) {
                        abstractC9436a0.m17319n();
                    }
                } else if (abstractC9436a0M17301b.m17294p()) {
                    abstractC9436a0M17301b.m17319n();
                }
            }
        }
        C9946e c9946e2 = (C9946e) AbstractC9438b0.m17301b(objM17307c);
        c9946e2.m17311c();
        if (c9946e2.f18641c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % AbstractC9945d.f19921f);
        Object andSet = c9946e2.m18584v().getAndSet(i10, AbstractC9945d.f19917b);
        if (andSet != null) {
            if (andSet == AbstractC9945d.f19920e) {
                return false;
            }
            return m16903q(andSet);
        }
        int i11 = AbstractC9945d.f19916a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (c9946e2.m18584v().get(i10) == AbstractC9945d.f19918c) {
                return true;
            }
        }
        return !AbstractC9067c.m15881a(c9946e2.m18584v(), i10, AbstractC9945d.f19917b, AbstractC9945d.f19919d);
    }

    @Override // p235r8.InterfaceC9944c
    public void release() {
        do {
            int andIncrement = f18187g.getAndIncrement(this);
            if (andIncrement >= this.f18188a) {
                m16899h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f18188a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m16904r());
    }
}

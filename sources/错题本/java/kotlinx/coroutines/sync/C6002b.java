package kotlinx.coroutines.sync;

import android.support.v4.media.AbstractC0037f;
import androidx.navigation.serialization.C2872b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6008u1;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p054e7.AbstractC5484p;
import p054e7.C5486r;
import p076h7.AbstractC5643f;
import p076h7.C5644g;

/* renamed from: kotlinx.coroutines.sync.b */
/* loaded from: classes4.dex */
public class C6002b {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9501c = AtomicReferenceFieldUpdater.newUpdater(C6002b.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f9502d = AtomicLongFieldUpdater.newUpdater(C6002b.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9503e = AtomicReferenceFieldUpdater.newUpdater(C6002b.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f9504f = AtomicLongFieldUpdater.newUpdater(C6002b.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9505g = AtomicIntegerFieldUpdater.newUpdater(C6002b.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f9506a;

    /* renamed from: b */
    public final C2872b f9507b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C6002b(int i) {
        this.f9506a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "The number of acquired permits should be in 0..").toString());
        }
        C5644g c5644g = new C5644g(0L, null, 2);
        this.head$volatile = c5644g;
        this.tail$volatile = c5644g;
        this._availablePermits$volatile = i;
        this.f9507b = new C2872b(this, 9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.mo4963b(r3, r4.f9507b);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5618a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.C6002b.f9505g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f9506a
            if (r1 > r2) goto L0
            d6.s r3 = p045d6.C5443s.f8405a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            h6.c r5 = p185v7.AbstractC6683l.m6374n(r5)
            kotlinx.coroutines.g r5 = kotlinx.coroutines.AbstractC6014x.m5644o(r5)
            boolean r1 = r4.m5619b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            androidx.navigation.serialization.b r0 = r4.f9507b     // Catch: java.lang.Throwable -> L3f
            r5.mo4963b(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.m5619b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.m5583t()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.m5574A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6002b.m5618a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean m5619b(InterfaceC6008u1 interfaceC6008u1) {
        Object objM4826b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9503e;
        C5644g c5644g = (C5644g) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f9504f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        long j7 = andIncrement / AbstractC5643f.f8775f;
        loop0: while (true) {
            objM4826b = AbstractC5469a.m4826b(c5644g, j7, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!AbstractC5469a.m4829e(objM4826b)) {
                AbstractC5484p abstractC5484pM4827c = AbstractC5469a.m4827c(objM4826b);
                while (true) {
                    AbstractC5484p abstractC5484p = (AbstractC5484p) atomicReferenceFieldUpdater.get(this);
                    if (abstractC5484p.f8478c >= abstractC5484pM4827c.f8478c) {
                        break loop0;
                    }
                    if (!abstractC5484pM4827c.m4866i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC5484p, abstractC5484pM4827c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC5484p) {
                            if (abstractC5484pM4827c.m4862e()) {
                                abstractC5484pM4827c.m4842d();
                            }
                        }
                    }
                    if (abstractC5484p.m4862e()) {
                        abstractC5484p.m4842d();
                    }
                }
            } else {
                break;
            }
        }
        C5644g c5644g2 = (C5644g) AbstractC5469a.m4827c(objM4826b);
        AtomicReferenceArray atomicReferenceArray = c5644g2.f8776e;
        int i = (int) (andIncrement % AbstractC5643f.f8775f);
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC6008u1)) {
            if (atomicReferenceArray.get(i) != null) {
                C5486r c5486r = AbstractC5643f.f8771b;
                C5486r c5486r2 = AbstractC5643f.f8772c;
                while (!atomicReferenceArray.compareAndSet(i, c5486r, c5486r2)) {
                    if (atomicReferenceArray.get(i) != c5486r) {
                        return false;
                    }
                }
                ((InterfaceC5895f) interfaceC6008u1).mo4963b(C5443s.f8405a, this.f9507b);
                return true;
            }
        }
        interfaceC6008u1.mo4962a(c5644g2, i);
        return true;
    }

    /* renamed from: c */
    public final void m5620c() {
        int i;
        Object objM4826b;
        boolean z8;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9505g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i8 = this.f9506a;
            if (andIncrement >= i8) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i8) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i8));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i8).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9501c;
            C5644g c5644g = (C5644g) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f9502d.getAndIncrement(this);
            long j7 = andIncrement2 / AbstractC5643f.f8775f;
            SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
            while (true) {
                objM4826b = AbstractC5469a.m4826b(c5644g, j7, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (AbstractC5469a.m4829e(objM4826b)) {
                    break;
                }
                AbstractC5484p abstractC5484pM4827c = AbstractC5469a.m4827c(objM4826b);
                while (true) {
                    AbstractC5484p abstractC5484p = (AbstractC5484p) atomicReferenceFieldUpdater.get(this);
                    if (abstractC5484p.f8478c >= abstractC5484pM4827c.f8478c) {
                        break;
                    }
                    if (!abstractC5484pM4827c.m4866i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC5484p, abstractC5484pM4827c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC5484p) {
                            if (abstractC5484pM4827c.m4862e()) {
                                abstractC5484pM4827c.m4842d();
                            }
                        }
                    }
                    if (abstractC5484p.m4862e()) {
                        abstractC5484p.m4842d();
                    }
                }
            }
            C5644g c5644g2 = (C5644g) AbstractC5469a.m4827c(objM4826b);
            AtomicReferenceArray atomicReferenceArray = c5644g2.f8776e;
            c5644g2.m4839a();
            z8 = false;
            if (c5644g2.f8478c <= j7) {
                int i9 = (int) (andIncrement2 % AbstractC5643f.f8775f);
                Object andSet = atomicReferenceArray.getAndSet(i9, AbstractC5643f.f8771b);
                if (andSet == null) {
                    int i10 = AbstractC5643f.f8770a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (atomicReferenceArray.get(i9) == AbstractC5643f.f8772c) {
                            z8 = true;
                            break;
                        }
                    }
                    C5486r c5486r = AbstractC5643f.f8771b;
                    C5486r c5486r2 = AbstractC5643f.f8773d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i9, c5486r, c5486r2)) {
                            if (atomicReferenceArray.get(i9) != c5486r) {
                                break;
                            }
                        } else {
                            z8 = true;
                            break;
                        }
                    }
                    z8 = !z8;
                } else if (andSet != AbstractC5643f.f8774e) {
                    if (!(andSet instanceof InterfaceC5895f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC5895f interfaceC5895f = (InterfaceC5895f) andSet;
                    C5486r c5486rMo4967n = interfaceC5895f.mo4967n(C5443s.f8405a, this.f9507b);
                    if (c5486rMo4967n != null) {
                        interfaceC5895f.mo4968r(c5486rMo4967n);
                        z8 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z8);
    }
}

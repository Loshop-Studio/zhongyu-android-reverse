package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC6014x;
import p054e7.C5486r;
import p076h7.AbstractC5640c;
import p076h7.InterfaceC5638a;

/* renamed from: kotlinx.coroutines.sync.a */
/* loaded from: classes4.dex */
public final class C6001a extends C6002b implements InterfaceC5638a {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9500h = AtomicReferenceFieldUpdater.newUpdater(C6001a.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C6001a() {
        super(1);
        this.owner$volatile = AbstractC5640c.f8769a;
    }

    /* renamed from: d */
    public final boolean m5614d() {
        return Math.max(C6002b.f9505g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f8768b;
        kotlinx.coroutines.sync.C6001a.f9500h.set(r2, null);
        r0.f8767a.mo4964d(r1, new androidx.navigation.C2861i(r2, r0));
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5615e(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r5.m5616f()
            d6.s r1 = p045d6.C5443s.f8405a
            if (r0 == 0) goto L9
            goto L48
        L9:
            h6.c r6 = p185v7.AbstractC6683l.m6374n(r6)
            kotlinx.coroutines.g r6 = kotlinx.coroutines.AbstractC6014x.m5644o(r6)
            h7.b r0 = new h7.b     // Catch: java.lang.Throwable -> L49
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L49
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.C6002b.f9505g     // Catch: java.lang.Throwable -> L49
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L49
            int r3 = r5.f9506a     // Catch: java.lang.Throwable -> L49
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L35
            kotlinx.coroutines.sync.a r2 = r0.f8768b     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.sync.C6001a.f9500h     // Catch: java.lang.Throwable -> L49
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L49
            kotlinx.coroutines.g r3 = r0.f8767a     // Catch: java.lang.Throwable -> L49
            androidx.navigation.i r4 = new androidx.navigation.i     // Catch: java.lang.Throwable -> L49
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L49
            r3.mo4964d(r1, r4)     // Catch: java.lang.Throwable -> L49
            goto L3b
        L35:
            boolean r2 = r5.m5619b(r0)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L16
        L3b:
            java.lang.Object r6 = r6.m5583t()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r0) goto L44
            goto L45
        L44:
            r6 = r1
        L45:
            if (r6 != r0) goto L48
            return r6
        L48:
            return r1
        L49:
            r0 = move-exception
            r6.m5574A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6001a.m5615e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: f */
    public final boolean m5616f() {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6002b.f9505g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = this.f9506a;
            if (i8 > i9) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i9) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i9));
            } else {
                if (i8 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    f9500h.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    /* renamed from: g */
    public final void m5617g(Object obj) {
        while (m5614d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9500h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C5486r c5486r = AbstractC5640c.f8769a;
            if (obj2 != c5486r) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c5486r)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m5620c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC6014x.m5642m(this) + "[isLocked=" + m5614d() + ",owner=" + f9500h.get(this) + ']';
    }
}

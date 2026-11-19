package p191n8;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: n8.r */
/* loaded from: classes5.dex */
public final class C9465r {

    /* renamed from: e */
    public static final a f18681e = new a(null);

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18682f = AtomicReferenceFieldUpdater.newUpdater(C9465r.class, Object.class, "_next$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f18683g = AtomicLongFieldUpdater.newUpdater(C9465r.class, "_state$volatile");

    /* renamed from: h */
    public static final C9442d0 f18684h = new C9442d0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f18685a;

    /* renamed from: b */
    public final boolean f18686b;

    /* renamed from: c */
    public final int f18687c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f18688d;

    /* renamed from: n8.r$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final int m17401a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m17402b(long j10, int i10) {
            return m17404d(j10, 1073741823L) | i10;
        }

        /* renamed from: c */
        public final long m17403c(long j10, int i10) {
            return m17404d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m17404d(long j10, long j11) {
            return j10 & (~j11);
        }

        public a() {
        }
    }

    /* renamed from: n8.r$b */
    public static final class b {

        /* renamed from: a */
        public final int f18689a;

        public b(int i10) {
            this.f18689a = i10;
        }
    }

    public C9465r(int i10, boolean z10) {
        this.f18685a = i10;
        this.f18686b = z10;
        int i11 = i10 - 1;
        this.f18687c = i11;
        this.f18688d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m17389a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m17388i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            n8.r$a r13 = p191n8.C9465r.f18681e
            int r13 = r13.m17401a(r3)
            return r13
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f18687c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f18686b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.m17394f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f18685a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m17388i()
            n8.r$a r5 = p191n8.C9465r.f18681e
            long r5 = r5.m17403c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.m17394f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m17388i()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            n8.r r0 = r0.m17398l()
            n8.r r0 = r0.m17393e(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p191n8.C9465r.m17389a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final C9465r m17390b(long j10) {
        C9465r c9465r = new C9465r(this.f18685a * 2, this.f18686b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f18687c;
            if ((i10 & i12) == (i12 & i11)) {
                f18683g.set(c9465r, f18681e.m17404d(j10, 1152921504606846976L));
                return c9465r;
            }
            Object bVar = m17394f().get(this.f18687c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            c9465r.m17394f().set(c9465r.f18687c & i10, bVar);
            i10++;
        }
    }

    /* renamed from: c */
    public final C9465r m17391c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18682f;
        while (true) {
            C9465r c9465r = (C9465r) atomicReferenceFieldUpdater.get(this);
            if (c9465r != null) {
                return c9465r;
            }
            AbstractC3193a.m1318a(f18682f, this, null, m17390b(j10));
        }
    }

    /* renamed from: d */
    public final boolean m17392d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18683g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    /* renamed from: e */
    public final C9465r m17393e(int i10, Object obj) {
        Object obj2 = m17394f().get(this.f18687c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f18689a != i10) {
            return null;
        }
        m17394f().set(i10 & this.f18687c, obj);
        return this;
    }

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray m17394f() {
        return this.f18688d;
    }

    /* renamed from: g */
    public final int m17395g() {
        long j10 = f18683g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    /* renamed from: j */
    public final boolean m17396j() {
        long j10 = f18683g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* renamed from: k */
    public final long m17397k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18683g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = 1152921504606846976L | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    /* renamed from: l */
    public final C9465r m17398l() {
        return m17391c(m17397k());
    }

    /* renamed from: m */
    public final Object m17399m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18683g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f18684h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f18687c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = m17394f().get(this.f18687c & i10);
            if (obj == null) {
                if (this.f18686b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f18683g.compareAndSet(this, j10, f18681e.m17402b(j10, i12))) {
                    m17394f().set(this.f18687c & i10, null);
                    return obj;
                }
                if (this.f18686b) {
                    C9465r c9465rM17400n = this;
                    do {
                        c9465rM17400n = c9465rM17400n.m17400n(i10, i12);
                    } while (c9465rM17400n != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: n */
    public final C9465r m17400n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18683g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return m17398l();
            }
        } while (!f18683g.compareAndSet(this, j10, f18681e.m17402b(j10, i11)));
        m17394f().set(this.f18687c & i12, null);
        return null;
    }
}

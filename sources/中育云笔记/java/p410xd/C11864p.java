package p410xd;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: xd.p */
/* loaded from: classes6.dex */
public final class C11864p {

    /* renamed from: e */
    public static final a f28114e = new a(null);

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28115f = AtomicReferenceFieldUpdater.newUpdater(C11864p.class, Object.class, "_next$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f28116g = AtomicLongFieldUpdater.newUpdater(C11864p.class, "_state$volatile");

    /* renamed from: h */
    public static final C11839c0 f28117h = new C11839c0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f28118a;

    /* renamed from: b */
    public final boolean f28119b;

    /* renamed from: c */
    public final int f28120c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f28121d;

    /* renamed from: xd.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final int m26337a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m26338b(long j10, int i10) {
            return m26340d(j10, 1073741823L) | i10;
        }

        /* renamed from: c */
        public final long m26339c(long j10, int i10) {
            return m26340d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m26340d(long j10, long j11) {
            return j10 & (~j11);
        }

        public a() {
        }
    }

    /* renamed from: xd.p$b */
    public static final class b {

        /* renamed from: a */
        public final int f28122a;

        public b(int i10) {
            this.f28122a = i10;
        }
    }

    public C11864p(int i10, boolean z10) {
        this.f28118a = i10;
        this.f28119b = z10;
        int i11 = i10 - 1;
        this.f28120c = i11;
        this.f28121d = new AtomicReferenceArray(i10);
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
    public final int m26325a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m26324i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            xd.p$a r13 = p410xd.C11864p.f28114e
            int r13 = r13.m26337a(r3)
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
            int r10 = r12.f28120c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f28119b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.m26330f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f28118a
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m26324i()
            xd.p$a r5 = p410xd.C11864p.f28114e
            long r5 = r5.m26339c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.m26330f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m26324i()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            xd.p r0 = r0.m26334l()
            xd.p r0 = r0.m26329e(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p410xd.C11864p.m26325a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final C11864p m26326b(long j10) {
        C11864p c11864p = new C11864p(this.f28118a * 2, this.f28119b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f28120c;
            if ((i10 & i12) == (i12 & i11)) {
                f28116g.set(c11864p, f28114e.m26340d(j10, 1152921504606846976L));
                return c11864p;
            }
            Object bVar = m26330f().get(this.f28120c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            c11864p.m26330f().set(c11864p.f28120c & i10, bVar);
            i10++;
        }
    }

    /* renamed from: c */
    public final C11864p m26327c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28115f;
        while (true) {
            C11864p c11864p = (C11864p) atomicReferenceFieldUpdater.get(this);
            if (c11864p != null) {
                return c11864p;
            }
            AbstractC3223a.m1395a(f28115f, this, null, m26326b(j10));
        }
    }

    /* renamed from: d */
    public final boolean m26328d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28116g;
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
    public final C11864p m26329e(int i10, Object obj) {
        Object obj2 = m26330f().get(this.f28120c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f28122a != i10) {
            return null;
        }
        m26330f().set(i10 & this.f28120c, obj);
        return this;
    }

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray m26330f() {
        return this.f28121d;
    }

    /* renamed from: g */
    public final int m26331g() {
        long j10 = f28116g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    /* renamed from: j */
    public final boolean m26332j() {
        long j10 = f28116g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* renamed from: k */
    public final long m26333k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28116g;
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
    public final C11864p m26334l() {
        return m26327c(m26333k());
    }

    /* renamed from: m */
    public final Object m26335m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28116g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f28117h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f28120c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = m26330f().get(this.f28120c & i10);
            if (obj == null) {
                if (this.f28119b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f28116g.compareAndSet(this, j10, f28114e.m26338b(j10, i12))) {
                    m26330f().set(this.f28120c & i10, null);
                    return obj;
                }
                if (this.f28119b) {
                    C11864p c11864pM26336n = this;
                    do {
                        c11864pM26336n = c11864pM26336n.m26336n(i10, i12);
                    } while (c11864pM26336n != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: n */
    public final C11864p m26336n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28116g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return m26334l();
            }
        } while (!f28116g.compareAndSet(this, j10, f28114e.m26338b(j10, i11)));
        m26330f().set(this.f28120c & i12, null);
        return null;
    }
}

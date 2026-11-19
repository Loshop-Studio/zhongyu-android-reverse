package p054e7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e7.j */
/* loaded from: classes4.dex */
public final class C5478j {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8464e = AtomicReferenceFieldUpdater.newUpdater(C5478j.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f8465f = AtomicLongFieldUpdater.newUpdater(C5478j.class, "_state$volatile");

    /* renamed from: g */
    public static final C5486r f8466g = new C5486r("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f8467a;

    /* renamed from: b */
    public final boolean f8468b;

    /* renamed from: c */
    public final int f8469c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f8470d;

    public C5478j(int i, boolean z8) {
        this.f8467a = i;
        this.f8468b = z8;
        int i8 = i - 1;
        this.f8469c = i8;
        this.f8470d = new AtomicReferenceArray(i);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final int m4851a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8465f;
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return (2305843009213693952L & j7) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f8469c;
            if (((i8 + 2) & i9) == (i & i9)) {
                return 1;
            }
            boolean z8 = this.f8468b;
            AtomicReferenceArray atomicReferenceArray = this.f8470d;
            if (z8 || atomicReferenceArray.get(i8 & i9) == null) {
                if (f8465f.compareAndSet(this, j7, ((-1152921503533105153L) & j7) | (((i8 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i8 & i9, obj);
                    C5478j c5478jM4853c = this;
                    while ((atomicLongFieldUpdater.get(c5478jM4853c) & 1152921504606846976L) != 0) {
                        c5478jM4853c = c5478jM4853c.m4853c();
                        AtomicReferenceArray atomicReferenceArray2 = c5478jM4853c.f8470d;
                        int i10 = c5478jM4853c.f8469c & i8;
                        Object obj2 = atomicReferenceArray2.get(i10);
                        if ((obj2 instanceof C5477i) && ((C5477i) obj2).f8463a == i8) {
                            atomicReferenceArray2.set(i10, obj);
                        } else {
                            c5478jM4853c = null;
                        }
                        if (c5478jM4853c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i11 = this.f8467a;
                if (i11 < 1024 || ((i8 - i) & 1073741823) > (i11 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m4852b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        do {
            atomicLongFieldUpdater = f8465f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, 2305843009213693952L | j7));
        return true;
    }

    /* renamed from: c */
    public final C5478j m4853c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        C5478j c5478j;
        while (true) {
            atomicLongFieldUpdater = f8465f;
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                c5478j = this;
                break;
            }
            long j8 = 1152921504606846976L | j7;
            c5478j = this;
            if (atomicLongFieldUpdater.compareAndSet(c5478j, j7, j8)) {
                j7 = j8;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8464e;
            C5478j c5478j2 = (C5478j) atomicReferenceFieldUpdater.get(this);
            if (c5478j2 != null) {
                return c5478j2;
            }
            C5478j c5478j3 = new C5478j(c5478j.f8467a * 2, c5478j.f8468b);
            int i = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            while (true) {
                int i9 = c5478j.f8469c;
                int i10 = i & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object c5477i = c5478j.f8470d.get(i10);
                if (c5477i == null) {
                    c5477i = new C5477i(i);
                }
                c5478j3.f8470d.set(c5478j3.f8469c & i, c5477i);
                i++;
            }
            atomicLongFieldUpdater.set(c5478j3, (-1152921504606846977L) & j7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c5478j3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4854d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = p054e7.C5478j.f8465f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            e7.r r0 = p054e7.C5478j.f8466g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f8469c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f8470d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f8468b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof p054e7.C5477i
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p054e7.C5478j.f8465f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            e7.j r0 = r1.m4853c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = p054e7.C5478j.f8465f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f8470d
            int r2 = r2.f8469c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: p054e7.C5478j.m4854d():java.lang.Object");
    }
}

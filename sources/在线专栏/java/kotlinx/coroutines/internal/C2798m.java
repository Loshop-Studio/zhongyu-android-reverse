package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.m */
/* loaded from: classes.dex */
public final class C2798m<E> {

    @NotNull
    private volatile /* synthetic */ Object _next = null;

    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f10774a;

    /* renamed from: b */
    private final boolean f10775b;

    /* renamed from: c */
    private final int f10776c;

    /* renamed from: d */
    @NotNull
    private /* synthetic */ AtomicReferenceArray f10777d;

    /* renamed from: e */
    @NotNull
    public static final a f10770e = new a(null);

    /* renamed from: h */
    @NotNull
    public static final C2805t f10773h = new C2805t("REMOVE_FROZEN");

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10771f = AtomicReferenceFieldUpdater.newUpdater(C2798m.class, Object.class, "_next");

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f10772g = AtomicLongFieldUpdater.newUpdater(C2798m.class, "_state");

    /* renamed from: kotlinx.coroutines.internal.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }

        /* renamed from: a */
        public final int m9329a(long j4) {
            return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m9330b(long j4, int i4) {
            return m9332d(j4, 1073741823L) | (i4 << 0);
        }

        /* renamed from: c */
        public final long m9331c(long j4, int i4) {
            return m9332d(j4, 1152921503533105152L) | (i4 << 30);
        }

        /* renamed from: d */
        public final long m9332d(long j4, long j5) {
            return j4 & (~j5);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.m$b */
    public static final class b {

        /* renamed from: a */
        public final int f10778a;

        public b(int i4) {
            this.f10778a = i4;
        }
    }

    public C2798m(int i4, boolean z3) {
        this.f10774a = i4;
        this.f10775b = z3;
        int i5 = i4 - 1;
        this.f10776c = i5;
        this.f10777d = new AtomicReferenceArray(i4);
        if (!(i5 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i4 & i5) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C2798m<E> m9318b(long j4) {
        C2798m<E> c2798m = new C2798m<>(this.f10774a * 2, this.f10775b);
        int i4 = (int) ((1073741823 & j4) >> 0);
        int i5 = (int) ((1152921503533105152L & j4) >> 30);
        while (true) {
            int i6 = this.f10776c;
            if ((i4 & i6) == (i5 & i6)) {
                c2798m._state = f10770e.m9332d(j4, 1152921504606846976L);
                return c2798m;
            }
            Object bVar = this.f10777d.get(i6 & i4);
            if (bVar == null) {
                bVar = new b(i4);
            }
            c2798m.f10777d.set(c2798m.f10776c & i4, bVar);
            i4++;
        }
    }

    /* renamed from: c */
    private final C2798m<E> m9319c(long j4) {
        while (true) {
            C2798m<E> c2798m = (C2798m) this._next;
            if (c2798m != null) {
                return c2798m;
            }
            C0827b.m4278a(f10771f, this, null, m9318b(j4));
        }
    }

    /* renamed from: e */
    private final C2798m<E> m9320e(int i4, E e4) {
        Object obj = this.f10777d.get(this.f10776c & i4);
        if (!(obj instanceof b) || ((b) obj).f10778a != i4) {
            return null;
        }
        this.f10777d.set(i4 & this.f10776c, e4);
        return this;
    }

    /* renamed from: h */
    private final long m9321h() {
        long j4;
        long j5;
        do {
            j4 = this._state;
            if ((j4 & 1152921504606846976L) != 0) {
                return j4;
            }
            j5 = j4 | 1152921504606846976L;
        } while (!f10772g.compareAndSet(this, j4, j5));
        return j5;
    }

    /* renamed from: k */
    private final C2798m<E> m9322k(int i4, int i5) {
        long j4;
        a aVar;
        int i6;
        do {
            j4 = this._state;
            aVar = f10770e;
            i6 = (int) ((1073741823 & j4) >> 0);
            if ((1152921504606846976L & j4) != 0) {
                return m9327i();
            }
        } while (!f10772g.compareAndSet(this, j4, aVar.m9330b(j4, i5)));
        this.f10777d.set(this.f10776c & i6, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m9323a(@org.jetbrains.annotations.NotNull E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.m$a r14 = kotlinx.coroutines.internal.C2798m.f10770e
            int r14 = r14.m9329a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.m$a r0 = kotlinx.coroutines.internal.C2798m.f10770e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f10776c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f10775b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f10777d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f10774a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.C2798m.f10772g
            long r11 = r0.m9331c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f10777d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L73
            goto L7d
        L73:
            kotlinx.coroutines.internal.m r0 = r0.m9327i()
            kotlinx.coroutines.internal.m r0 = r0.m9320e(r9, r14)
            if (r0 != 0) goto L69
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2798m.m9323a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean m9324d() {
        long j4;
        do {
            j4 = this._state;
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!f10772g.compareAndSet(this, j4, j4 | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int m9325f() {
        long j4 = this._state;
        return 1073741823 & (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j4) >> 0)));
    }

    /* renamed from: g */
    public final boolean m9326g() {
        long j4 = this._state;
        return ((int) ((1073741823 & j4) >> 0)) == ((int) ((j4 & 1152921503533105152L) >> 30));
    }

    @NotNull
    /* renamed from: i */
    public final C2798m<E> m9327i() {
        return m9319c(m9321h());
    }

    @Nullable
    /* renamed from: j */
    public final Object m9328j() {
        while (true) {
            long j4 = this._state;
            if ((1152921504606846976L & j4) != 0) {
                return f10773h;
            }
            a aVar = f10770e;
            int i4 = (int) ((1073741823 & j4) >> 0);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.f10776c;
            if ((i5 & i6) == (i4 & i6)) {
                return null;
            }
            Object obj = this.f10777d.get(i6 & i4);
            if (obj == null) {
                if (this.f10775b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i7 = (i4 + 1) & 1073741823;
                if (f10772g.compareAndSet(this, j4, aVar.m9330b(j4, i7))) {
                    this.f10777d.set(this.f10776c & i4, null);
                    return obj;
                }
                if (this.f10775b) {
                    C2798m<E> c2798mM9322k = this;
                    do {
                        c2798mM9322k = c2798mM9322k.m9322k(i4, i7);
                    } while (c2798mM9322k != null);
                    return obj;
                }
            }
        }
    }
}

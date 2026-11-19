package kotlinx.coroutines.flow;

import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C5892e;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC5919a;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import kotlinx.coroutines.flow.internal.AbstractC5921c;
import kotlinx.coroutines.flow.internal.InterfaceC5929k;
import p045d6.C5443s;
import p054e7.C5486r;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.flow.f0 */
/* loaded from: classes4.dex */
public class C5911f0 extends AbstractC5919a implements InterfaceC5958x, InterfaceC5910f, InterfaceC5929k {

    /* renamed from: e */
    public final int f9364e;

    /* renamed from: f */
    public final int f9365f;

    /* renamed from: g */
    public final BufferOverflow f9366g;

    /* renamed from: h */
    public Object[] f9367h;

    /* renamed from: i */
    public long f9368i;

    /* renamed from: j */
    public long f9369j;

    /* renamed from: k */
    public int f9370k;

    /* renamed from: l */
    public int f9371l;

    public C5911f0(int i, int i8, BufferOverflow bufferOverflow) {
        this.f9364e = i;
        this.f9365f = i8;
        this.f9366g = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r8 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r8.isActive() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        throw r8.mo5457f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = r9;
        r0.L$3 = r8;
        r0.label = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r2.emit(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x0039, B:32:0x0090, B:34:0x0098, B:38:0x00ab, B:41:0x00b2, B:42:0x00b6, B:43:0x00b7, B:22:0x005b), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9 A[EDGE_INSN: B:56:0x00a9->B:37:0x00a9 BREAK  A[LOOP:0: B:32:0x0090->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.flow.internal.a] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlinx.coroutines.flow.f0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.flow.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlinx.coroutines.flow.g0] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlinx.coroutines.flow.g0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c5 -> B:16:0x003c). Please report as a decompilation issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.coroutines.intrinsics.CoroutineSingletons m5526k(kotlinx.coroutines.flow.C5911f0 r8, kotlinx.coroutines.flow.InterfaceC5912g r9, p075h6.InterfaceC5631c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5911f0.m5526k(kotlinx.coroutines.flow.f0, kotlinx.coroutines.flow.g, h6.c):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5958x
    /* renamed from: a */
    public final boolean mo5527a(Object obj) {
        int i;
        boolean z8;
        InterfaceC5631c[] interfaceC5631cArrM5535n = AbstractC5920b.f9387a;
        synchronized (this) {
            if (m5538q(obj)) {
                interfaceC5631cArrM5535n = m5535n(interfaceC5631cArrM5535n);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (InterfaceC5631c interfaceC5631c : interfaceC5631cArrM5535n) {
            if (interfaceC5631c != null) {
                interfaceC5631c.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
            }
        }
        return z8;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5929k
    /* renamed from: b */
    public final InterfaceC5910f mo5520b(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return AbstractC5914h.m5555k(this, interfaceC5636h, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5958x
    /* renamed from: c */
    public final void mo5528c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m5541t(m5536o() + this.f9370k, this.f9369j, m5536o() + this.f9370k, m5536o() + this.f9370k + this.f9371l);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        return m5526k(this, interfaceC5912g, interfaceC5631c);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5919a
    /* renamed from: e */
    public final AbstractC5921c mo5529e() {
        C5913g0 c5913g0 = new C5913g0();
        c5913g0.f9372a = -1L;
        return c5913g0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5958x, kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) throws Throwable {
        Throwable th;
        InterfaceC5631c[] interfaceC5631cArrM5535n;
        C5907d0 c5907d0;
        if (mo5527a(obj)) {
            return C5443s.f8405a;
        }
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        InterfaceC5631c[] interfaceC5631cArrM5535n2 = AbstractC5920b.f9387a;
        synchronized (this) {
            try {
                if (m5538q(obj)) {
                    try {
                        c5961g.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                        interfaceC5631cArrM5535n = m5535n(interfaceC5631cArrM5535n2);
                        c5907d0 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        C5907d0 c5907d02 = new C5907d0(this, m5536o() + this.f9370k + this.f9371l, obj, c5961g);
                        m5534m(c5907d02);
                        this.f9371l++;
                        if (this.f9365f == 0) {
                            interfaceC5631cArrM5535n2 = m5535n(interfaceC5631cArrM5535n2);
                        }
                        interfaceC5631cArrM5535n = interfaceC5631cArrM5535n2;
                        c5907d0 = c5907d02;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c5907d0 != null) {
                    c5961g.m5586w(new C5892e(c5907d0, 1));
                }
                for (InterfaceC5631c interfaceC5631c2 : interfaceC5631cArrM5535n) {
                    if (interfaceC5631c2 != null) {
                        interfaceC5631c2.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                    }
                }
                Object objM5583t = c5961g.m5583t();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM5583t != coroutineSingletons) {
                    objM5583t = C5443s.f8405a;
                }
                return objM5583t == coroutineSingletons ? objM5583t : C5443s.f8405a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5919a
    /* renamed from: f */
    public final AbstractC5921c[] mo5530f() {
        return new C5913g0[2];
    }

    /* renamed from: i */
    public final Object m5531i(C5913g0 c5913g0, InterfaceC5631c interfaceC5631c) {
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        synchronized (this) {
            try {
                if (m5539r(c5913g0) < 0) {
                    c5913g0.f9373b = c5961g;
                } else {
                    c5961g.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM5583t = c5961g.m5583t();
        return objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5583t : C5443s.f8405a;
    }

    /* renamed from: j */
    public final void m5532j() {
        if (this.f9365f != 0 || this.f9371l > 1) {
            Object[] objArr = this.f9367h;
            AbstractC5830k.m5327d(objArr);
            while (this.f9371l > 0) {
                long jM5536o = m5536o();
                int i = this.f9370k;
                int i8 = this.f9371l;
                if (objArr[((int) ((jM5536o + (i + i8)) - 1)) & (objArr.length - 1)] != AbstractC5914h.f9375b) {
                    return;
                }
                this.f9371l = i8 - 1;
                AbstractC5914h.m5549e(objArr, m5536o() + this.f9370k + this.f9371l, null);
            }
        }
    }

    /* renamed from: l */
    public final void m5533l() {
        AbstractC5921c[] abstractC5921cArr;
        Object[] objArr = this.f9367h;
        AbstractC5830k.m5327d(objArr);
        AbstractC5914h.m5549e(objArr, m5536o(), null);
        this.f9370k--;
        long jM5536o = m5536o() + 1;
        if (this.f9368i < jM5536o) {
            this.f9368i = jM5536o;
        }
        if (this.f9369j < jM5536o) {
            if (this.f9384b != 0 && (abstractC5921cArr = this.f9383a) != null) {
                for (AbstractC5921c abstractC5921c : abstractC5921cArr) {
                    if (abstractC5921c != null) {
                        C5913g0 c5913g0 = (C5913g0) abstractC5921c;
                        long j7 = c5913g0.f9372a;
                        if (j7 >= 0 && j7 < jM5536o) {
                            c5913g0.f9372a = jM5536o;
                        }
                    }
                }
            }
            this.f9369j = jM5536o;
        }
    }

    /* renamed from: m */
    public final void m5534m(Object obj) {
        int i = this.f9370k + this.f9371l;
        Object[] objArrM5537p = this.f9367h;
        if (objArrM5537p == null) {
            objArrM5537p = m5537p(0, 2, null);
        } else if (i >= objArrM5537p.length) {
            objArrM5537p = m5537p(i, objArrM5537p.length * 2, objArrM5537p);
        }
        AbstractC5914h.m5549e(objArrM5537p, m5536o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: n */
    public final InterfaceC5631c[] m5535n(InterfaceC5631c[] interfaceC5631cArr) {
        AbstractC5921c[] abstractC5921cArr;
        C5913g0 c5913g0;
        C5961g c5961g;
        int length = interfaceC5631cArr.length;
        if (this.f9384b != 0 && (abstractC5921cArr = this.f9383a) != null) {
            int length2 = abstractC5921cArr.length;
            int i = 0;
            interfaceC5631cArr = interfaceC5631cArr;
            while (i < length2) {
                AbstractC5921c abstractC5921c = abstractC5921cArr[i];
                if (abstractC5921c != null && (c5961g = (c5913g0 = (C5913g0) abstractC5921c).f9373b) != null && m5539r(c5913g0) >= 0) {
                    int length3 = interfaceC5631cArr.length;
                    interfaceC5631cArr = interfaceC5631cArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC5631cArr, Math.max(2, interfaceC5631cArr.length * 2));
                        AbstractC5830k.m5329f(CopyOf, "copyOf(...)");
                        interfaceC5631cArr = CopyOf;
                    }
                    interfaceC5631cArr[length] = c5961g;
                    c5913g0.f9373b = null;
                    length++;
                }
                i++;
                interfaceC5631cArr = interfaceC5631cArr;
            }
        }
        return interfaceC5631cArr;
    }

    /* renamed from: o */
    public final long m5536o() {
        return Math.min(this.f9369j, this.f9368i);
    }

    /* renamed from: p */
    public final Object[] m5537p(int i, int i8, Object[] objArr) {
        if (i8 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i8];
        this.f9367h = objArr2;
        if (objArr != null) {
            long jM5536o = m5536o();
            for (int i9 = 0; i9 < i; i9++) {
                long j7 = i9 + jM5536o;
                AbstractC5914h.m5549e(objArr2, j7, objArr[((int) j7) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5538q(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f9384b
            int r2 = r12.f9364e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L84
        Lb:
            r12.m5534m(r13)
            int r1 = r12.f9370k
            int r1 = r1 + r9
            r12.f9370k = r1
            if (r1 <= r2) goto L18
            r12.m5533l()
        L18:
            long r1 = r12.m5536o()
            int r3 = r12.f9370k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f9369j = r1
            return r9
        L23:
            int r1 = r12.f9370k
            int r3 = r12.f9365f
            if (r1 < r3) goto L4c
            long r4 = r12.f9369j
            long r6 = r12.f9368i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4c
            int[] r1 = kotlinx.coroutines.flow.AbstractC5909e0.f9363a
            kotlinx.coroutines.channels.BufferOverflow r4 = r12.f9366g
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L4a
            r4 = 2
            if (r1 == r4) goto L84
            r4 = 3
            if (r1 != r4) goto L44
            goto L4c
        L44:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L4a:
            r1 = 0
            return r1
        L4c:
            r12.m5534m(r13)
            int r1 = r12.f9370k
            int r1 = r1 + r9
            r12.f9370k = r1
            if (r1 <= r3) goto L59
            r12.m5533l()
        L59:
            long r3 = r12.m5536o()
            int r1 = r12.f9370k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f9368i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L84
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f9369j
            long r5 = r12.m5536o()
            int r7 = r12.f9370k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m5536o()
            int r10 = r12.f9370k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f9371l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.m5541t(r1, r3, r5, r7)
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5911f0.m5538q(java.lang.Object):boolean");
    }

    /* renamed from: r */
    public final long m5539r(C5913g0 c5913g0) {
        long j7 = c5913g0.f9372a;
        if (j7 < m5536o() + this.f9370k) {
            return j7;
        }
        if (this.f9365f <= 0 && j7 <= m5536o() && this.f9371l != 0) {
            return j7;
        }
        return -1L;
    }

    /* renamed from: s */
    public final Object m5540s(C5913g0 c5913g0) {
        Object obj;
        InterfaceC5631c[] interfaceC5631cArrM5542u = AbstractC5920b.f9387a;
        synchronized (this) {
            try {
                long jM5539r = m5539r(c5913g0);
                if (jM5539r < 0) {
                    obj = AbstractC5914h.f9375b;
                } else {
                    long j7 = c5913g0.f9372a;
                    Object[] objArr = this.f9367h;
                    AbstractC5830k.m5327d(objArr);
                    Object obj2 = objArr[((int) jM5539r) & (objArr.length - 1)];
                    if (obj2 instanceof C5907d0) {
                        obj2 = ((C5907d0) obj2).f9359c;
                    }
                    c5913g0.f9372a = jM5539r + 1;
                    Object obj3 = obj2;
                    interfaceC5631cArrM5542u = m5542u(j7);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5631c interfaceC5631c : interfaceC5631cArrM5542u) {
            if (interfaceC5631c != null) {
                interfaceC5631c.resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
            }
        }
        return obj;
    }

    /* renamed from: t */
    public final void m5541t(long j7, long j8, long j9, long j10) {
        long jMin = Math.min(j8, j7);
        for (long jM5536o = m5536o(); jM5536o < jMin; jM5536o++) {
            Object[] objArr = this.f9367h;
            AbstractC5830k.m5327d(objArr);
            AbstractC5914h.m5549e(objArr, jM5536o, null);
        }
        this.f9368i = j7;
        this.f9369j = j8;
        this.f9370k = (int) (j9 - jMin);
        this.f9371l = (int) (j10 - j9);
    }

    /* renamed from: u */
    public final InterfaceC5631c[] m5542u(long j7) {
        long j8;
        long j9;
        long j10;
        InterfaceC5631c[] interfaceC5631cArr;
        InterfaceC5631c[] interfaceC5631cArr2;
        AbstractC5921c[] abstractC5921cArr;
        C5486r c5486r = AbstractC5914h.f9375b;
        InterfaceC5631c[] interfaceC5631cArr3 = AbstractC5920b.f9387a;
        if (j7 <= this.f9369j) {
            long jM5536o = m5536o();
            long j11 = this.f9370k + jM5536o;
            int i = this.f9365f;
            if (i == 0 && this.f9371l > 0) {
                j11++;
            }
            int i8 = 0;
            if (this.f9384b != 0 && (abstractC5921cArr = this.f9383a) != null) {
                for (AbstractC5921c abstractC5921c : abstractC5921cArr) {
                    if (abstractC5921c != null) {
                        long j12 = ((C5913g0) abstractC5921c).f9372a;
                        if (j12 >= 0 && j12 < j11) {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > this.f9369j) {
                long jM5536o2 = m5536o() + this.f9370k;
                int iMin = this.f9384b > 0 ? Math.min(this.f9371l, i - ((int) (jM5536o2 - j11))) : this.f9371l;
                long j13 = this.f9371l + jM5536o2;
                if (iMin > 0) {
                    j10 = 1;
                    Object[] objArr = this.f9367h;
                    AbstractC5830k.m5327d(objArr);
                    j8 = jM5536o;
                    InterfaceC5631c[] interfaceC5631cArr4 = new InterfaceC5631c[iMin];
                    long j14 = jM5536o2;
                    while (true) {
                        if (jM5536o2 >= j13) {
                            interfaceC5631cArr2 = interfaceC5631cArr4;
                            j9 = j11;
                            break;
                        }
                        interfaceC5631cArr2 = interfaceC5631cArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jM5536o2)];
                        if (obj != c5486r) {
                            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C5907d0 c5907d0 = (C5907d0) obj;
                            int i9 = i8 + 1;
                            j9 = j11;
                            interfaceC5631cArr2[i8] = c5907d0.f9360d;
                            AbstractC5914h.m5549e(objArr, jM5536o2, c5486r);
                            AbstractC5914h.m5549e(objArr, j14, c5907d0.f9359c);
                            j14++;
                            if (i9 >= iMin) {
                                break;
                            }
                            i8 = i9;
                        } else {
                            j9 = j11;
                        }
                        jM5536o2++;
                        interfaceC5631cArr4 = interfaceC5631cArr2;
                        j11 = j9;
                    }
                    jM5536o2 = j14;
                    interfaceC5631cArr = interfaceC5631cArr2;
                } else {
                    j8 = jM5536o;
                    j9 = j11;
                    j10 = 1;
                    interfaceC5631cArr = interfaceC5631cArr3;
                }
                int i10 = (int) (jM5536o2 - j8);
                long j15 = this.f9384b == 0 ? jM5536o2 : j9;
                long jMax = Math.max(this.f9368i, jM5536o2 - Math.min(this.f9364e, i10));
                if (i == 0 && jMax < j13) {
                    Object[] objArr2 = this.f9367h;
                    AbstractC5830k.m5327d(objArr2);
                    if (AbstractC5830k.m5325b(objArr2[((int) jMax) & (objArr2.length - 1)], c5486r)) {
                        jM5536o2 += j10;
                        jMax += j10;
                    }
                }
                m5541t(jMax, j15, jM5536o2, j13);
                m5532j();
                return interfaceC5631cArr.length == 0 ? interfaceC5631cArr : m5535n(interfaceC5631cArr);
            }
        }
        return interfaceC5631cArr3;
    }
}

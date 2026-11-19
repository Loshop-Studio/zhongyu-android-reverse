package p102i3;

import java.util.Arrays;
import kotlin.coroutines.jvm.internal.AbstractC2748d;
import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.C2576m;
import p087f3.C2580n;
import p087f3.InterfaceC2608w0;
import p097h3.EnumC2659a;
import p107j3.AbstractC2694a;
import p107j3.AbstractC2696c;
import p107j3.C2695b;
import p128o2.C2919l;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3032c;
import p146r2.C3033d;

/* renamed from: i3.i */
/* loaded from: classes.dex */
final class C2676i<T> extends AbstractC2694a<C2678k> implements InterfaceC2672e<T>, InterfaceC2668a {

    /* renamed from: e */
    private final int f10607e;

    /* renamed from: f */
    private final int f10608f;

    /* renamed from: g */
    @NotNull
    private final EnumC2659a f10609g;

    /* renamed from: h */
    @Nullable
    private Object[] f10610h;

    /* renamed from: i */
    private long f10611i;

    /* renamed from: j */
    private long f10612j;

    /* renamed from: k */
    private int f10613k;

    /* renamed from: l */
    private int f10614l;

    /* renamed from: i3.i$a */
    private static final class a implements InterfaceC2608w0 {

        /* renamed from: a */
        @NotNull
        public final C2676i<?> f10615a;

        /* renamed from: b */
        public long f10616b;

        /* renamed from: c */
        @Nullable
        public final Object f10617c;

        /* renamed from: d */
        @NotNull
        public final InterfaceC3012d<C2925r> f10618d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull C2676i<?> c2676i, long j4, @Nullable Object obj, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
            this.f10615a = c2676i;
            this.f10616b = j4;
            this.f10617c = obj;
            this.f10618d = interfaceC3012d;
        }

        @Override // p087f3.InterfaceC2608w0
        /* renamed from: b */
        public void mo8520b() {
            this.f10615a.m8979w(this);
        }
    }

    /* renamed from: i3.i$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10619a;

        static {
            int[] iArr = new int[EnumC2659a.values().length];
            iArr[EnumC2659a.SUSPEND.ordinal()] = 1;
            iArr[EnumC2659a.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC2659a.DROP_OLDEST.ordinal()] = 3;
            f10619a = iArr;
        }
    }

    @InterfaceC2750f(m9206c = "kotlinx.coroutines.flow.SharedFlowImpl", m9207f = "SharedFlow.kt", m9208l = {341, 348, 351}, m9209m = "collect")
    /* renamed from: i3.i$c */
    static final class c extends AbstractC2748d {

        /* renamed from: a */
        Object f10620a;

        /* renamed from: b */
        Object f10621b;

        /* renamed from: c */
        Object f10622c;

        /* renamed from: d */
        Object f10623d;

        /* renamed from: e */
        /* synthetic */ Object f10624e;

        /* renamed from: f */
        final /* synthetic */ C2676i<T> f10625f;

        /* renamed from: g */
        int f10626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2676i<T> c2676i, InterfaceC3012d<? super c> interfaceC3012d) {
            super(interfaceC3012d);
            this.f10625f = c2676i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10624e = obj;
            this.f10626g |= Integer.MIN_VALUE;
            return this.f10625f.mo8948c(null, this);
        }
    }

    public C2676i(int i4, int i5, @NotNull EnumC2659a enumC2659a) {
        this.f10607e = i4;
        this.f10608f = i5;
        this.f10609g = enumC2659a;
    }

    /* renamed from: B */
    private final void m8952B() {
        Object[] objArr = this.f10610h;
        C2769l.m9239c(objArr);
        C2677j.m8994f(objArr, m8957G(), null);
        this.f10613k--;
        long jM8957G = m8957G() + 1;
        if (this.f10611i < jM8957G) {
            this.f10611i = jM8957G;
        }
        if (this.f10612j < jM8957G) {
            m8981y(jM8957G);
        }
    }

    /* renamed from: C */
    private final Object m8953C(T t3, InterfaceC3012d<? super C2925r> interfaceC3012d) {
        InterfaceC3012d<C2925r>[] interfaceC3012dArrM8955E;
        a aVar;
        C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
        c2576m.m8623v();
        InterfaceC3012d<C2925r>[] interfaceC3012dArrM8955E2 = C2695b.f10658a;
        synchronized (this) {
            if (m8963N(t3)) {
                C2925r c2925r = C2925r.f11415a;
                C2919l.a aVar2 = C2919l.f11409a;
                c2576m.resumeWith(C2919l.m9989a(c2925r));
                interfaceC3012dArrM8955E = m8955E(interfaceC3012dArrM8955E2);
                aVar = null;
            } else {
                a aVar3 = new a(this, m8961K() + m8957G(), t3, c2576m);
                m8954D(aVar3);
                this.f10614l++;
                if (this.f10608f == 0) {
                    interfaceC3012dArrM8955E2 = m8955E(interfaceC3012dArrM8955E2);
                }
                interfaceC3012dArrM8955E = interfaceC3012dArrM8955E2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C2580n.m8639a(c2576m, aVar);
        }
        int i4 = 0;
        int length = interfaceC3012dArrM8955E.length;
        while (i4 < length) {
            InterfaceC3012d<C2925r> interfaceC3012d2 = interfaceC3012dArrM8955E[i4];
            i4++;
            if (interfaceC3012d2 != null) {
                C2925r c2925r2 = C2925r.f11415a;
                C2919l.a aVar4 = C2919l.f11409a;
                interfaceC3012d2.resumeWith(C2919l.m9989a(c2925r2));
            }
        }
        Object objM8621s = c2576m.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s == C3033d.m10175c() ? objM8621s : C2925r.f11415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m8954D(Object obj) {
        int iM8961K = m8961K();
        Object[] objArrM8962L = this.f10610h;
        if (objArrM8962L == null) {
            objArrM8962L = m8962L(null, 0, 2);
        } else if (iM8961K >= objArrM8962L.length) {
            objArrM8962L = m8962L(objArrM8962L, iM8961K, objArrM8962L.length * 2);
        }
        C2677j.m8994f(objArrM8962L, m8957G() + iM8961K, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: E */
    public final InterfaceC3012d<C2925r>[] m8955E(InterfaceC3012d<C2925r>[] interfaceC3012dArr) {
        AbstractC2696c[] abstractC2696cArr;
        C2678k c2678k;
        InterfaceC3012d<? super C2925r> interfaceC3012d;
        int length = interfaceC3012dArr.length;
        if (((AbstractC2694a) this).f10655b != 0 && (abstractC2696cArr = ((AbstractC2694a) this).f10654a) != null) {
            int length2 = abstractC2696cArr.length;
            int i4 = 0;
            interfaceC3012dArr = interfaceC3012dArr;
            while (i4 < length2) {
                AbstractC2696c abstractC2696c = abstractC2696cArr[i4];
                if (abstractC2696c != null && (interfaceC3012d = (c2678k = (C2678k) abstractC2696c).f10629b) != null && m8965P(c2678k) >= 0) {
                    int length3 = interfaceC3012dArr.length;
                    interfaceC3012dArr = interfaceC3012dArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC3012dArr, Math.max(2, interfaceC3012dArr.length * 2));
                        C2769l.m9240d(CopyOf, "java.util.Arrays.copyOf(this, newSize)");
                        interfaceC3012dArr = CopyOf;
                    }
                    interfaceC3012dArr[length] = interfaceC3012d;
                    c2678k.f10629b = null;
                    length++;
                }
                i4++;
                interfaceC3012dArr = interfaceC3012dArr;
            }
        }
        return interfaceC3012dArr;
    }

    /* renamed from: F */
    private final long m8956F() {
        return m8957G() + this.f10613k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final long m8957G() {
        return Math.min(this.f10612j, this.f10611i);
    }

    /* renamed from: H */
    private final Object m8958H(long j4) {
        Object[] objArr = this.f10610h;
        C2769l.m9239c(objArr);
        Object objM8993e = C2677j.m8993e(objArr, j4);
        return objM8993e instanceof a ? ((a) objM8993e).f10617c : objM8993e;
    }

    /* renamed from: I */
    private final long m8959I() {
        return m8957G() + this.f10613k + this.f10614l;
    }

    /* renamed from: J */
    private final int m8960J() {
        return (int) ((m8957G() + this.f10613k) - this.f10611i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final int m8961K() {
        return this.f10613k + this.f10614l;
    }

    /* renamed from: L */
    private final Object[] m8962L(Object[] objArr, int i4, int i5) {
        int i6 = 0;
        if (!(i5 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i5];
        this.f10610h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM8957G = m8957G();
        if (i4 > 0) {
            while (true) {
                int i7 = i6 + 1;
                long j4 = i6 + jM8957G;
                C2677j.m8994f(objArr2, j4, C2677j.m8993e(objArr, j4));
                if (i7 >= i4) {
                    break;
                }
                i6 = i7;
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final boolean m8963N(T t3) {
        if (m9017j() == 0) {
            return m8964O(t3);
        }
        if (this.f10613k >= this.f10608f && this.f10612j <= this.f10611i) {
            int i4 = b.f10619a[this.f10609g.ordinal()];
            if (i4 == 1) {
                return false;
            }
            if (i4 == 2) {
                return true;
            }
        }
        m8954D(t3);
        int i5 = this.f10613k + 1;
        this.f10613k = i5;
        if (i5 > this.f10608f) {
            m8952B();
        }
        if (m8960J() > this.f10607e) {
            m8967R(this.f10611i + 1, this.f10612j, m8956F(), m8959I());
        }
        return true;
    }

    /* renamed from: O */
    private final boolean m8964O(T t3) {
        if (this.f10607e == 0) {
            return true;
        }
        m8954D(t3);
        int i4 = this.f10613k + 1;
        this.f10613k = i4;
        if (i4 > this.f10607e) {
            m8952B();
        }
        this.f10612j = m8957G() + this.f10613k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final long m8965P(C2678k c2678k) {
        long j4 = c2678k.f10628a;
        if (j4 < m8956F()) {
            return j4;
        }
        if (this.f10608f <= 0 && j4 <= m8957G() && this.f10614l != 0) {
            return j4;
        }
        return -1L;
    }

    /* renamed from: Q */
    private final Object m8966Q(C2678k c2678k) {
        Object obj;
        InterfaceC3012d<C2925r>[] interfaceC3012dArrM8984S = C2695b.f10658a;
        synchronized (this) {
            long jM8965P = m8965P(c2678k);
            if (jM8965P < 0) {
                obj = C2677j.f10627a;
            } else {
                long j4 = c2678k.f10628a;
                Object objM8958H = m8958H(jM8965P);
                c2678k.f10628a = jM8965P + 1;
                interfaceC3012dArrM8984S = m8984S(j4);
                obj = objM8958H;
            }
        }
        int i4 = 0;
        int length = interfaceC3012dArrM8984S.length;
        while (i4 < length) {
            InterfaceC3012d<C2925r> interfaceC3012d = interfaceC3012dArrM8984S[i4];
            i4++;
            if (interfaceC3012d != null) {
                C2925r c2925r = C2925r.f11415a;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC3012d.resumeWith(C2919l.m9989a(c2925r));
            }
        }
        return obj;
    }

    /* renamed from: R */
    private final void m8967R(long j4, long j5, long j6, long j7) {
        long jMin = Math.min(j5, j4);
        long jM8957G = m8957G();
        if (jM8957G < jMin) {
            while (true) {
                long j8 = 1 + jM8957G;
                Object[] objArr = this.f10610h;
                C2769l.m9239c(objArr);
                C2677j.m8994f(objArr, jM8957G, null);
                if (j8 >= jMin) {
                    break;
                } else {
                    jM8957G = j8;
                }
            }
        }
        this.f10611i = j4;
        this.f10612j = j5;
        this.f10613k = (int) (j6 - jMin);
        this.f10614l = (int) (j7 - j6);
    }

    /* renamed from: v */
    private final Object m8978v(C2678k c2678k, InterfaceC3012d<? super C2925r> interfaceC3012d) {
        C2925r c2925r;
        C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
        c2576m.m8623v();
        synchronized (this) {
            if (m8965P(c2678k) < 0) {
                c2678k.f10629b = c2576m;
            } else {
                C2925r c2925r2 = C2925r.f11415a;
                C2919l.a aVar = C2919l.f11409a;
                c2576m.resumeWith(C2919l.m9989a(c2925r2));
            }
            c2925r = C2925r.f11415a;
        }
        Object objM8621s = c2576m.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s == C3033d.m10175c() ? objM8621s : c2925r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m8979w(a aVar) {
        synchronized (this) {
            if (aVar.f10616b < m8957G()) {
                return;
            }
            Object[] objArr = this.f10610h;
            C2769l.m9239c(objArr);
            if (C2677j.m8993e(objArr, aVar.f10616b) != aVar) {
                return;
            }
            C2677j.m8994f(objArr, aVar.f10616b, C2677j.f10627a);
            m8980x();
            C2925r c2925r = C2925r.f11415a;
        }
    }

    /* renamed from: x */
    private final void m8980x() {
        if (this.f10608f != 0 || this.f10614l > 1) {
            Object[] objArr = this.f10610h;
            C2769l.m9239c(objArr);
            while (this.f10614l > 0 && C2677j.m8993e(objArr, (m8957G() + m8961K()) - 1) == C2677j.f10627a) {
                this.f10614l--;
                C2677j.m8994f(objArr, m8957G() + m8961K(), null);
            }
        }
    }

    /* renamed from: y */
    private final void m8981y(long j4) {
        AbstractC2696c[] abstractC2696cArr;
        if (((AbstractC2694a) this).f10655b != 0 && (abstractC2696cArr = ((AbstractC2694a) this).f10654a) != null) {
            for (AbstractC2696c abstractC2696c : abstractC2696cArr) {
                if (abstractC2696c != null) {
                    C2678k c2678k = (C2678k) abstractC2696c;
                    long j5 = c2678k.f10628a;
                    if (j5 >= 0 && j5 < j4) {
                        c2678k.f10628a = j4;
                    }
                }
            }
        }
        this.f10612j = j4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107j3.AbstractC2694a
    @NotNull
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C2678k[] mo8987h(int i4) {
        return new C2678k[i4];
    }

    /* renamed from: M */
    public boolean m8983M(T t3) {
        int i4;
        boolean z3;
        InterfaceC3012d<C2925r>[] interfaceC3012dArrM8955E = C2695b.f10658a;
        synchronized (this) {
            i4 = 0;
            if (m8963N(t3)) {
                interfaceC3012dArrM8955E = m8955E(interfaceC3012dArrM8955E);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        int length = interfaceC3012dArrM8955E.length;
        while (i4 < length) {
            InterfaceC3012d<C2925r> interfaceC3012d = interfaceC3012dArrM8955E[i4];
            i4++;
            if (interfaceC3012d != null) {
                C2925r c2925r = C2925r.f11415a;
                C2919l.a aVar = C2919l.f11409a;
                interfaceC3012d.resumeWith(C2919l.m9989a(c2925r));
            }
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd A[PHI: r11
      0x00bd: PHI (r11v1 q2.d<o2.r>[]) = (r11v0 q2.d<o2.r>[]), (r11v4 q2.d<o2.r>[]) binds: [B:36:0x006e, B:38:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p142q2.InterfaceC3012d<p128o2.C2925r>[] m8984S(long r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102i3.C2676i.m8984S(long):q2.d[]");
    }

    /* renamed from: T */
    public final long m8985T() {
        long j4 = this.f10611i;
        if (j4 < this.f10612j) {
            this.f10612j = j4;
        }
        return j4;
    }

    @Override // p102i3.InterfaceC2672e, p102i3.InterfaceC2669b
    @Nullable
    /* renamed from: a */
    public Object mo8120a(T t3, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        Object objM8953C;
        return (!m8983M(t3) && (objM8953C = m8953C(t3, interfaceC3012d)) == C3033d.m10175c()) ? objM8953C : C2925r.f11415a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:14:0x003b, B:35:0x00a0, B:40:0x00ae, B:39:0x00ab, B:43:0x00bf, B:19:0x0059, B:22:0x006b, B:33:0x0092), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [j3.c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4, types: [i3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [i3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [i3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v1, types: [j3.a] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [i3.i, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bc -> B:15:0x003e). Please report as a decompilation issue!!! */
    @Override // p102i3.InterfaceC2668a
    @org.jetbrains.annotations.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8948c(@org.jetbrains.annotations.NotNull p102i3.InterfaceC2669b<? super T> r9, @org.jetbrains.annotations.NotNull p142q2.InterfaceC3012d<? super p128o2.C2925r> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102i3.C2676i.mo8948c(i3.b, q2.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p107j3.AbstractC2694a
    @NotNull
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C2678k mo8986g() {
        return new C2678k();
    }
}

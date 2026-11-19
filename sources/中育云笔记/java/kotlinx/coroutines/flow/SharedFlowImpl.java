package kotlinx.coroutines.flow;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.channels.BufferOverflow;
import p309qc.C10786q;
import p379vd.AbstractC11608q;
import p379vd.C11609r;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11726a;
import p394wd.AbstractC11727b;
import p394wd.AbstractC11728c;
import p394wd.InterfaceC11734i;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import p410xd.C11839c0;
import sd.AbstractC11137m;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public class SharedFlowImpl extends AbstractC11726a implements InterfaceC11602k, InterfaceC11594c, InterfaceC11734i {

    /* renamed from: g */
    public final int f23833g;

    /* renamed from: h */
    public final int f23834h;

    /* renamed from: i */
    public final BufferOverflow f23835i;

    /* renamed from: j */
    public Object[] f23836j;

    /* renamed from: k */
    public long f23837k;

    /* renamed from: l */
    public long f23838l;

    /* renamed from: m */
    public int f23839m;

    /* renamed from: n */
    public int f23840n;

    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$a */
    public static final class C10034a implements InterfaceC11163t0 {

        /* renamed from: c */
        public final SharedFlowImpl f23841c;

        /* renamed from: d */
        public long f23842d;

        /* renamed from: e */
        public final Object f23843e;

        /* renamed from: f */
        public final InterfaceC11588c f23844f;

        public C10034a(SharedFlowImpl sharedFlowImpl, long j10, Object obj, InterfaceC11588c interfaceC11588c) {
            this.f23841c = sharedFlowImpl;
            this.f23842d = j10;
            this.f23843e = obj;
            this.f23844f = interfaceC11588c;
        }

        @Override // sd.InterfaceC11163t0
        public void dispose() {
            this.f23841c.m20860y(this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$b */
    public /* synthetic */ class C10035b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23845a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.f23519c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.f23521e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.f23520d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23845a = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.SharedFlowImpl", m26211f = "SharedFlow.kt", m26212l = {387, 394, 397}, m26213m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    public static final class C100361<T> extends ContinuationImpl {

        /* renamed from: c */
        public Object f23846c;

        /* renamed from: d */
        public Object f23847d;

        /* renamed from: e */
        public Object f23848e;

        /* renamed from: f */
        public Object f23849f;

        /* renamed from: g */
        public /* synthetic */ Object f23850g;

        /* renamed from: i */
        public int f23852i;

        public C100361(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23850g = obj;
            this.f23852i |= Integer.MIN_VALUE;
            return SharedFlowImpl.m20820A(SharedFlowImpl.this, null, this);
        }
    }

    public SharedFlowImpl(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f23833g = i10;
        this.f23834h = i11;
        this.f23835i = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).m20874b(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m20820A(kotlinx.coroutines.flow.SharedFlowImpl r8, p379vd.InterfaceC11595d r9, vc.InterfaceC11588c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m20820A(kotlinx.coroutines.flow.SharedFlowImpl, vd.d, vc.c):java.lang.Object");
    }

    /* renamed from: F */
    public static /* synthetic */ Object m20821F(SharedFlowImpl sharedFlowImpl, Object obj, InterfaceC11588c interfaceC11588c) throws Throwable {
        if (sharedFlowImpl.mo20854a(obj)) {
            return C10786q.f26013a;
        }
        Object objM20836G = sharedFlowImpl.m20836G(obj, interfaceC11588c);
        return objM20836G == AbstractC11725a.m25952f() ? objM20836G : C10786q.f26013a;
    }

    /* renamed from: B */
    public final void m20832B(long j10) {
        AbstractC11728c[] abstractC11728cArr;
        if (this.f27887d != 0 && (abstractC11728cArr = this.f27886c) != null) {
            for (AbstractC11728c abstractC11728c : abstractC11728cArr) {
                if (abstractC11728c != null) {
                    C11609r c11609r = (C11609r) abstractC11728c;
                    long j11 = c11609r.f27507a;
                    if (j11 >= 0 && j11 < j10) {
                        c11609r.f27507a = j10;
                    }
                }
            }
        }
        this.f23838l = j10;
    }

    @Override // p394wd.AbstractC11726a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C11609r mo20857i() {
        return new C11609r();
    }

    @Override // p394wd.AbstractC11726a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C11609r[] mo20858j(int i10) {
        return new C11609r[i10];
    }

    /* renamed from: E */
    public final void m20835E() {
        Object[] objArr = this.f23836j;
        AbstractC9979u.m20291d(objArr);
        AbstractC11608q.m25597g(objArr, m20840K(), null);
        this.f23839m--;
        long jM20840K = m20840K() + 1;
        if (this.f23837k < jM20840K) {
            this.f23837k = jM20840K;
        }
        if (this.f23838l < jM20840K) {
            m20832B(jM20840K);
        }
    }

    /* renamed from: G */
    public final Object m20836G(Object obj, InterfaceC11588c interfaceC11588c) throws Throwable {
        Throwable th;
        InterfaceC11588c[] interfaceC11588cArrM20838I;
        C10034a c10034a;
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        InterfaceC11588c[] interfaceC11588cArrM20838I2 = AbstractC11727b.f27890a;
        synchronized (this) {
            try {
                if (m20847R(obj)) {
                    try {
                        Result.C9921a c9921a = Result.f23263d;
                        c9997c.resumeWith(Result.m20054c(C10786q.f26013a));
                        interfaceC11588cArrM20838I = m20838I(interfaceC11588cArrM20838I2);
                        c10034a = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        c10034a = new C10034a(this, m20840K() + m20845P(), obj, c9997c);
                        m20837H(c10034a);
                        this.f23840n++;
                        if (this.f23834h == 0) {
                            interfaceC11588cArrM20838I2 = m20838I(interfaceC11588cArrM20838I2);
                        }
                        interfaceC11588cArrM20838I = interfaceC11588cArrM20838I2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c10034a != null) {
                    AbstractC11137m.m24756a(c9997c, c10034a);
                }
                for (InterfaceC11588c interfaceC11588c2 : interfaceC11588cArrM20838I) {
                    if (interfaceC11588c2 != null) {
                        Result.C9921a c9921a2 = Result.f23263d;
                        interfaceC11588c2.resumeWith(Result.m20054c(C10786q.f26013a));
                    }
                }
                Object objM20538x = c9997c.m20538x();
                if (objM20538x == AbstractC11725a.m25952f()) {
                    AbstractC11831f.m26221c(interfaceC11588c);
                }
                return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* renamed from: H */
    public final void m20837H(Object obj) {
        int iM20845P = m20845P();
        Object[] objArrM20846Q = this.f23836j;
        if (objArrM20846Q == null) {
            objArrM20846Q = m20846Q(null, 0, 2);
        } else if (iM20845P >= objArrM20846Q.length) {
            objArrM20846Q = m20846Q(objArrM20846Q, iM20845P, objArrM20846Q.length * 2);
        }
        AbstractC11608q.m25597g(objArrM20846Q, m20840K() + iM20845P, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: I */
    public final InterfaceC11588c[] m20838I(InterfaceC11588c[] interfaceC11588cArr) {
        AbstractC11728c[] abstractC11728cArr;
        C11609r c11609r;
        InterfaceC11588c interfaceC11588c;
        int length = interfaceC11588cArr.length;
        if (this.f27887d != 0 && (abstractC11728cArr = this.f27886c) != null) {
            int length2 = abstractC11728cArr.length;
            int i10 = 0;
            interfaceC11588cArr = interfaceC11588cArr;
            while (i10 < length2) {
                AbstractC11728c abstractC11728c = abstractC11728cArr[i10];
                if (abstractC11728c != null && (interfaceC11588c = (c11609r = (C11609r) abstractC11728c).f27508b) != null && m20849T(c11609r) >= 0) {
                    int length3 = interfaceC11588cArr.length;
                    interfaceC11588cArr = interfaceC11588cArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC11588cArr, Math.max(2, interfaceC11588cArr.length * 2));
                        AbstractC9979u.m20293f(CopyOf, "copyOf(...)");
                        interfaceC11588cArr = CopyOf;
                    }
                    interfaceC11588cArr[length] = interfaceC11588c;
                    c11609r.f27508b = null;
                    length++;
                }
                i10++;
                interfaceC11588cArr = interfaceC11588cArr;
            }
        }
        return interfaceC11588cArr;
    }

    /* renamed from: J */
    public final long m20839J() {
        return m20840K() + this.f23839m;
    }

    /* renamed from: K */
    public final long m20840K() {
        return Math.min(this.f23838l, this.f23837k);
    }

    /* renamed from: L */
    public final Object m20841L() {
        Object[] objArr = this.f23836j;
        AbstractC9979u.m20291d(objArr);
        return AbstractC11608q.m25596f(objArr, (this.f23837k + m20844O()) - 1);
    }

    /* renamed from: M */
    public final Object m20842M(long j10) {
        Object[] objArr = this.f23836j;
        AbstractC9979u.m20291d(objArr);
        Object objM25596f = AbstractC11608q.m25596f(objArr, j10);
        return objM25596f instanceof C10034a ? ((C10034a) objM25596f).f23843e : objM25596f;
    }

    /* renamed from: N */
    public final long m20843N() {
        return m20840K() + this.f23839m + this.f23840n;
    }

    /* renamed from: O */
    public final int m20844O() {
        return (int) ((m20840K() + this.f23839m) - this.f23837k);
    }

    /* renamed from: P */
    public final int m20845P() {
        return this.f23839m + this.f23840n;
    }

    /* renamed from: Q */
    public final Object[] m20846Q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f23836j = objArr2;
        if (objArr != null) {
            long jM20840K = m20840K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + jM20840K;
                AbstractC11608q.m25597g(objArr2, j10, AbstractC11608q.m25596f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* renamed from: R */
    public final boolean m20847R(Object obj) {
        if (m25958l() == 0) {
            return m20848S(obj);
        }
        if (this.f23839m >= this.f23834h && this.f23838l <= this.f23837k) {
            int i10 = C10035b.f23845a[this.f23835i.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        m20837H(obj);
        int i11 = this.f23839m + 1;
        this.f23839m = i11;
        if (i11 > this.f23834h) {
            m20835E();
        }
        if (m20844O() > this.f23833g) {
            m20851V(this.f23837k + 1, this.f23838l, m20839J(), m20843N());
        }
        return true;
    }

    /* renamed from: S */
    public final boolean m20848S(Object obj) {
        if (this.f23833g == 0) {
            return true;
        }
        m20837H(obj);
        int i10 = this.f23839m + 1;
        this.f23839m = i10;
        if (i10 > this.f23833g) {
            m20835E();
        }
        this.f23838l = m20840K() + this.f23839m;
        return true;
    }

    /* renamed from: T */
    public final long m20849T(C11609r c11609r) {
        long j10 = c11609r.f27507a;
        if (j10 >= m20839J() && (this.f23834h > 0 || j10 > m20840K() || this.f23840n == 0)) {
            return -1L;
        }
        return j10;
    }

    /* renamed from: U */
    public final Object m20850U(C11609r c11609r) {
        Object obj;
        InterfaceC11588c[] interfaceC11588cArrM20852W = AbstractC11727b.f27890a;
        synchronized (this) {
            try {
                long jM20849T = m20849T(c11609r);
                if (jM20849T < 0) {
                    obj = AbstractC11608q.f27506a;
                } else {
                    long j10 = c11609r.f27507a;
                    Object objM20842M = m20842M(jM20849T);
                    c11609r.f27507a = jM20849T + 1;
                    interfaceC11588cArrM20852W = m20852W(j10);
                    obj = objM20842M;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC11588c interfaceC11588c : interfaceC11588cArrM20852W) {
            if (interfaceC11588c != null) {
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
            }
        }
        return obj;
    }

    /* renamed from: V */
    public final void m20851V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM20840K = m20840K(); jM20840K < jMin; jM20840K++) {
            Object[] objArr = this.f23836j;
            AbstractC9979u.m20291d(objArr);
            AbstractC11608q.m25597g(objArr, jM20840K, null);
        }
        this.f23837k = j10;
        this.f23838l = j11;
        this.f23839m = (int) (j12 - jMin);
        this.f23840n = (int) (j13 - j12);
    }

    /* renamed from: W */
    public final InterfaceC11588c[] m20852W(long j10) {
        long j11;
        long j12;
        long j13;
        AbstractC11728c[] abstractC11728cArr;
        if (j10 > this.f23838l) {
            return AbstractC11727b.f27890a;
        }
        long jM20840K = m20840K();
        long j14 = this.f23839m + jM20840K;
        if (this.f23834h == 0 && this.f23840n > 0) {
            j14++;
        }
        if (this.f27887d != 0 && (abstractC11728cArr = this.f27886c) != null) {
            for (AbstractC11728c abstractC11728c : abstractC11728cArr) {
                if (abstractC11728c != null) {
                    long j15 = ((C11609r) abstractC11728c).f27507a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f23838l) {
            return AbstractC11727b.f27890a;
        }
        long jM20839J = m20839J();
        int iMin = m25958l() > 0 ? Math.min(this.f23840n, this.f23834h - ((int) (jM20839J - j14))) : this.f23840n;
        InterfaceC11588c[] interfaceC11588cArr = AbstractC11727b.f27890a;
        long j16 = this.f23840n + jM20839J;
        if (iMin > 0) {
            interfaceC11588cArr = new InterfaceC11588c[iMin];
            Object[] objArr = this.f23836j;
            AbstractC9979u.m20291d(objArr);
            j13 = 1;
            long j17 = jM20839J;
            int i10 = 0;
            while (true) {
                if (jM20839J >= j16) {
                    j11 = jM20840K;
                    j12 = j14;
                    jM20839J = j17;
                    break;
                }
                Object objM25596f = AbstractC11608q.m25596f(objArr, jM20839J);
                j11 = jM20840K;
                C11839c0 c11839c0 = AbstractC11608q.f27506a;
                if (objM25596f != c11839c0) {
                    AbstractC9979u.m20292e(objM25596f, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C10034a c10034a = (C10034a) objM25596f;
                    int i11 = i10 + 1;
                    j12 = j14;
                    interfaceC11588cArr[i10] = c10034a.f23844f;
                    AbstractC11608q.m25597g(objArr, jM20839J, c11839c0);
                    AbstractC11608q.m25597g(objArr, j17, c10034a.f23843e);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        jM20839J = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                jM20839J++;
                jM20840K = j11;
                j14 = j12;
            }
        } else {
            j11 = jM20840K;
            j12 = j14;
            j13 = 1;
        }
        InterfaceC11588c[] interfaceC11588cArr2 = interfaceC11588cArr;
        int i12 = (int) (jM20839J - j11);
        long j19 = m25958l() == 0 ? jM20839J : j12;
        long jMax = Math.max(this.f23837k, jM20839J - Math.min(this.f23833g, i12));
        if (this.f23834h == 0 && jMax < j16) {
            Object[] objArr2 = this.f23836j;
            AbstractC9979u.m20291d(objArr2);
            if (AbstractC9979u.m20289b(AbstractC11608q.m25596f(objArr2, jMax), AbstractC11608q.f27506a)) {
                jM20839J += j13;
                jMax += j13;
            }
        }
        m20851V(jMax, j19, jM20839J, j16);
        m20861z();
        return !(interfaceC11588cArr2.length == 0) ? m20838I(interfaceC11588cArr2) : interfaceC11588cArr2;
    }

    /* renamed from: X */
    public final long m20853X() {
        long j10 = this.f23837k;
        if (j10 < this.f23838l) {
            this.f23838l = j10;
        }
        return j10;
    }

    @Override // p379vd.InterfaceC11602k
    /* renamed from: a */
    public boolean mo20854a(Object obj) {
        int i10;
        boolean z10;
        InterfaceC11588c[] interfaceC11588cArrM20838I = AbstractC11727b.f27890a;
        synchronized (this) {
            if (m20847R(obj)) {
                interfaceC11588cArrM20838I = m20838I(interfaceC11588cArrM20838I);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC11588c interfaceC11588c : interfaceC11588cArrM20838I) {
            if (interfaceC11588c != null) {
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
            }
        }
        return z10;
    }

    @Override // p394wd.InterfaceC11734i
    /* renamed from: b */
    public InterfaceC11594c mo20855b(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return AbstractC11608q.m25595e(this, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // p379vd.InterfaceC11607p, p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return m20820A(this, interfaceC11595d, interfaceC11588c);
    }

    @Override // p379vd.InterfaceC11602k, p379vd.InterfaceC11595d
    public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
        return m20821F(this, obj, interfaceC11588c);
    }

    @Override // p379vd.InterfaceC11602k
    /* renamed from: f */
    public void mo20856f() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m20851V(m20839J(), this.f23838l, m20839J(), m20843N());
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: x */
    public final Object m20859x(C11609r c11609r, InterfaceC11588c interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        synchronized (this) {
            try {
                if (m20849T(c11609r) < 0) {
                    c11609r.f27508b = c9997c;
                } else {
                    Result.C9921a c9921a = Result.f23263d;
                    c9997c.resumeWith(Result.m20054c(C10786q.f26013a));
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    /* renamed from: y */
    public final void m20860y(C10034a c10034a) {
        synchronized (this) {
            if (c10034a.f23842d < m20840K()) {
                return;
            }
            Object[] objArr = this.f23836j;
            AbstractC9979u.m20291d(objArr);
            if (AbstractC11608q.m25596f(objArr, c10034a.f23842d) != c10034a) {
                return;
            }
            AbstractC11608q.m25597g(objArr, c10034a.f23842d, AbstractC11608q.f27506a);
            m20861z();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    /* renamed from: z */
    public final void m20861z() {
        if (this.f23834h != 0 || this.f23840n > 1) {
            Object[] objArr = this.f23836j;
            AbstractC9979u.m20291d(objArr);
            while (this.f23840n > 0 && AbstractC11608q.m25596f(objArr, (m20840K() + m20845P()) - 1) == AbstractC11608q.f27506a) {
                this.f23840n--;
                AbstractC11608q.m25597g(objArr, m20840K() + m20845P(), null);
            }
        }
    }
}

package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC3223a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10662j;
import p296pd.InterfaceC10659g;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.AbstractC11126j0;
import sd.AbstractC11137m;
import sd.AbstractC11147o1;
import sd.AbstractC11151p1;
import sd.AbstractC11155q1;
import sd.C11123i1;
import sd.C11135l1;
import sd.C11139m1;
import sd.C11153q;
import sd.C11167u1;
import sd.C11170v1;
import sd.C11172w0;
import sd.C11174x;
import sd.C11179y1;
import sd.C11182z1;
import sd.InterfaceC11127j1;
import sd.InterfaceC11149p;
import sd.InterfaceC11156r;
import sd.InterfaceC11163t0;
import sd.InterfaceC11176x1;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public class JobSupport implements InterfaceC10045g, InterfaceC11156r, InterfaceC11176x1 {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23490c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23491d = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: kotlinx.coroutines.JobSupport$a */
    public static final class C9992a extends C9997c {

        /* renamed from: k */
        public final JobSupport f23492k;

        public C9992a(InterfaceC11588c interfaceC11588c, JobSupport jobSupport) {
            super(interfaceC11588c, 1);
            this.f23492k = jobSupport;
        }

        @Override // kotlinx.coroutines.C9997c
        /* renamed from: M */
        public String mo20466M() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C9997c
        /* renamed from: v */
        public Throwable mo20467v(InterfaceC10045g interfaceC10045g) {
            Throwable thM20477e;
            Object objM20430X = this.f23492k.m20430X();
            return (!(objM20430X instanceof C9994c) || (thM20477e = ((C9994c) objM20430X).m20477e()) == null) ? objM20430X instanceof C11174x ? ((C11174x) objM20430X).f26837a : interfaceC10045g.mo20438g() : thM20477e;
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$b */
    public static final class C9993b extends AbstractC11151p1 {

        /* renamed from: g */
        public final JobSupport f23493g;

        /* renamed from: h */
        public final C9994c f23494h;

        /* renamed from: i */
        public final C11153q f23495i;

        /* renamed from: j */
        public final Object f23496j;

        public C9993b(JobSupport jobSupport, C9994c c9994c, C11153q c11153q, Object obj) {
            this.f23493g = jobSupport;
            this.f23494h = c9994c;
            this.f23495i = c11153q;
            this.f23496j = obj;
        }

        @Override // sd.AbstractC11151p1
        /* renamed from: u */
        public boolean mo20468u() {
            return false;
        }

        @Override // sd.AbstractC11151p1
        /* renamed from: v */
        public void mo20469v(Throwable th) {
            this.f23493g.m20419M(this.f23494h, this.f23495i, this.f23496j);
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$c */
    public static final class C9994c implements InterfaceC11127j1 {

        /* renamed from: d */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f23497d = AtomicIntegerFieldUpdater.newUpdater(C9994c.class, "_isCompleting$volatile");

        /* renamed from: e */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f23498e = AtomicReferenceFieldUpdater.newUpdater(C9994c.class, Object.class, "_rootCause$volatile");

        /* renamed from: f */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f23499f = AtomicReferenceFieldUpdater.newUpdater(C9994c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: c */
        public final C11167u1 f23500c;

        public C9994c(C11167u1 c11167u1, boolean z10, Throwable th) {
            this.f23500c = c11167u1;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* renamed from: a */
        public final void m20473a(Throwable th) {
            Throwable thM20477e = m20477e();
            if (thM20477e == null) {
                m20484o(th);
                return;
            }
            if (th == thM20477e) {
                return;
            }
            Object objM20476d = m20476d();
            if (objM20476d == null) {
                m20483n(th);
                return;
            }
            if (objM20476d instanceof Throwable) {
                if (th == objM20476d) {
                    return;
                }
                ArrayList arrayListM20475c = m20475c();
                arrayListM20475c.add(objM20476d);
                arrayListM20475c.add(th);
                m20483n(arrayListM20475c);
                return;
            }
            if (objM20476d instanceof ArrayList) {
                ((ArrayList) objM20476d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objM20476d).toString());
        }

        @Override // sd.InterfaceC11127j1
        /* renamed from: b */
        public C11167u1 mo20474b() {
            return this.f23500c;
        }

        /* renamed from: c */
        public final ArrayList m20475c() {
            return new ArrayList(4);
        }

        /* renamed from: d */
        public final Object m20476d() {
            return f23499f.get(this);
        }

        /* renamed from: e */
        public final Throwable m20477e() {
            return (Throwable) f23498e.get(this);
        }

        /* renamed from: i */
        public final boolean m20478i() {
            return m20477e() != null;
        }

        @Override // sd.InterfaceC11127j1
        public boolean isActive() {
            return m20477e() == null;
        }

        /* renamed from: j */
        public final boolean m20479j() {
            return f23497d.get(this) == 1;
        }

        /* renamed from: k */
        public final boolean m20480k() {
            return m20476d() == AbstractC11155q1.f26818e;
        }

        /* renamed from: l */
        public final List m20481l(Throwable th) {
            ArrayList arrayListM20475c;
            Object objM20476d = m20476d();
            if (objM20476d == null) {
                arrayListM20475c = m20475c();
            } else if (objM20476d instanceof Throwable) {
                ArrayList arrayListM20475c2 = m20475c();
                arrayListM20475c2.add(objM20476d);
                arrayListM20475c = arrayListM20475c2;
            } else {
                if (!(objM20476d instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM20476d).toString());
                }
                arrayListM20475c = (ArrayList) objM20476d;
            }
            Throwable thM20477e = m20477e();
            if (thM20477e != null) {
                arrayListM20475c.add(0, thM20477e);
            }
            if (th != null && !AbstractC9979u.m20289b(th, thM20477e)) {
                arrayListM20475c.add(th);
            }
            m20483n(AbstractC11155q1.f26818e);
            return arrayListM20475c;
        }

        /* renamed from: m */
        public final void m20482m(boolean z10) {
            f23497d.set(this, z10 ? 1 : 0);
        }

        /* renamed from: n */
        public final void m20483n(Object obj) {
            f23499f.set(this, obj);
        }

        /* renamed from: o */
        public final void m20484o(Throwable th) {
            f23498e.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m20478i() + ", completing=" + m20479j() + ", rootCause=" + m20477e() + ", exceptions=" + m20476d() + ", list=" + mo20474b() + ']';
        }
    }

    public JobSupport(boolean z10) {
        this._state$volatile = z10 ? AbstractC11155q1.f26820g : AbstractC11155q1.f26819f;
    }

    /* renamed from: y0 */
    public static /* synthetic */ CancellationException m20403y0(JobSupport jobSupport, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return jobSupport.m20463x0(th, str);
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: A */
    public final InterfaceC11163t0 mo20404A(InterfaceC9540l interfaceC9540l) {
        return m20434d0(true, new C11139m1(interfaceC9540l));
    }

    /* renamed from: A0 */
    public final boolean m20405A0(InterfaceC11127j1 interfaceC11127j1, Object obj) throws Throwable {
        if (!AbstractC3223a.m1395a(f23490c, this, interfaceC11127j1, AbstractC11155q1.m24796g(obj))) {
            return false;
        }
        m20448o0(null);
        mo20450p0(obj);
        m20418L(interfaceC11127j1, obj);
        return true;
    }

    /* renamed from: B */
    public final Object m20406B(InterfaceC11588c interfaceC11588c) {
        C9992a c9992a = new C9992a(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), this);
        c9992a.m20503F();
        AbstractC11137m.m24756a(c9992a, JobKt__JobKt.m20396m(this, false, new C11179y1(c9992a), 1, null));
        Object objM20538x = c9992a.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* renamed from: B0 */
    public final boolean m20407B0(InterfaceC11127j1 interfaceC11127j1, Throwable th) throws Throwable {
        C11167u1 c11167u1M20427U = m20427U(interfaceC11127j1);
        if (c11167u1M20427U == null) {
            return false;
        }
        if (!AbstractC3223a.m1395a(f23490c, this, interfaceC11127j1, new C9994c(c11167u1M20427U, false, th))) {
            return false;
        }
        m20446m0(c11167u1M20427U, th);
        return true;
    }

    /* renamed from: C0 */
    public final Object m20408C0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC11127j1) ? AbstractC11155q1.f26814a : ((!(obj instanceof C11172w0) && !(obj instanceof AbstractC11151p1)) || (obj instanceof C11153q) || (obj2 instanceof C11174x)) ? m20409D0((InterfaceC11127j1) obj, obj2) : m20405A0((InterfaceC11127j1) obj, obj2) ? obj2 : AbstractC11155q1.f26816c;
    }

    /* renamed from: D0 */
    public final Object m20409D0(InterfaceC11127j1 interfaceC11127j1, Object obj) throws Throwable {
        C11167u1 c11167u1M20427U = m20427U(interfaceC11127j1);
        if (c11167u1M20427U == null) {
            return AbstractC11155q1.f26816c;
        }
        C9994c c9994c = interfaceC11127j1 instanceof C9994c ? (C9994c) interfaceC11127j1 : null;
        if (c9994c == null) {
            c9994c = new C9994c(c11167u1M20427U, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c9994c) {
            if (c9994c.m20479j()) {
                return AbstractC11155q1.f26814a;
            }
            c9994c.m20482m(true);
            if (c9994c != interfaceC11127j1 && !AbstractC3223a.m1395a(f23490c, this, interfaceC11127j1, c9994c)) {
                return AbstractC11155q1.f26816c;
            }
            boolean zM20478i = c9994c.m20478i();
            C11174x c11174x = obj instanceof C11174x ? (C11174x) obj : null;
            if (c11174x != null) {
                c9994c.m20473a(c11174x.f26837a);
            }
            Throwable thM20477e = zM20478i ? null : c9994c.m20477e();
            ref$ObjectRef.f23402c = thM20477e;
            C10786q c10786q = C10786q.f26013a;
            if (thM20477e != null) {
                m20446m0(c11167u1M20427U, thM20477e);
            }
            C11153q c11153qM20444l0 = m20444l0(c11167u1M20427U);
            if (c11153qM20444l0 != null && m20411E0(c9994c, c11153qM20444l0, obj)) {
                return AbstractC11155q1.f26815b;
            }
            c11167u1M20427U.m20911f(2);
            C11153q c11153qM20444l02 = m20444l0(c11167u1M20427U);
            return (c11153qM20444l02 == null || !m20411E0(c9994c, c11153qM20444l02, obj)) ? m20421O(c9994c, obj) : AbstractC11155q1.f26815b;
        }
    }

    /* renamed from: E */
    public final boolean m20410E(Throwable th) {
        return m20412F(th);
    }

    /* renamed from: E0 */
    public final boolean m20411E0(C9994c c9994c, C11153q c11153q, Object obj) {
        while (AbstractC11147o1.m24778l(c11153q.f26812g, false, new C9993b(this, c9994c, c11153q, obj)) == C11170v1.f26829c) {
            c11153q = m20444l0(c11153q);
            if (c11153q == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m20412F(Object obj) throws Throwable {
        Object objM20440h0 = AbstractC11155q1.f26814a;
        if (mo20426T() && (objM20440h0 = m20414H(obj)) == AbstractC11155q1.f26815b) {
            return true;
        }
        if (objM20440h0 == AbstractC11155q1.f26814a) {
            objM20440h0 = m20440h0(obj);
        }
        if (objM20440h0 == AbstractC11155q1.f26814a || objM20440h0 == AbstractC11155q1.f26815b) {
            return true;
        }
        if (objM20440h0 == AbstractC11155q1.f26817d) {
            return false;
        }
        mo20460w(objM20440h0);
        return true;
    }

    /* renamed from: G */
    public void mo20413G(Throwable th) throws Throwable {
        m20412F(th);
    }

    /* renamed from: H */
    public final Object m20414H(Object obj) {
        Object objM20408C0;
        do {
            Object objM20430X = m20430X();
            if (!(objM20430X instanceof InterfaceC11127j1) || ((objM20430X instanceof C9994c) && ((C9994c) objM20430X).m20479j())) {
                return AbstractC11155q1.f26814a;
            }
            objM20408C0 = m20408C0(objM20430X, new C11174x(m20420N(obj), false, 2, null));
        } while (objM20408C0 == AbstractC11155q1.f26816c);
        return objM20408C0;
    }

    /* renamed from: I */
    public final boolean m20415I(Throwable th) {
        if (mo20435e0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC11149p interfaceC11149pM20429W = m20429W();
        return (interfaceC11149pM20429W == null || interfaceC11149pM20429W == C11170v1.f26829c) ? z10 : interfaceC11149pM20429W.mo24781a(th) || z10;
    }

    /* renamed from: J */
    public String mo20416J() {
        return "Job was cancelled";
    }

    /* renamed from: K */
    public boolean mo20417K(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m20412F(th) && mo20425S();
    }

    /* renamed from: L */
    public final void m20418L(InterfaceC11127j1 interfaceC11127j1, Object obj) throws Throwable {
        InterfaceC11149p interfaceC11149pM20429W = m20429W();
        if (interfaceC11149pM20429W != null) {
            interfaceC11149pM20429W.dispose();
            m20457u0(C11170v1.f26829c);
        }
        C11174x c11174x = obj instanceof C11174x ? (C11174x) obj : null;
        Throwable th = c11174x != null ? c11174x.f26837a : null;
        if (!(interfaceC11127j1 instanceof AbstractC11151p1)) {
            C11167u1 c11167u1Mo20474b = interfaceC11127j1.mo20474b();
            if (c11167u1Mo20474b != null) {
                m20447n0(c11167u1Mo20474b, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC11151p1) interfaceC11127j1).mo20469v(th);
        } catch (Throwable th2) {
            mo20432b0(new CompletionHandlerException("Exception in completion handler " + interfaceC11127j1 + " for " + this, th2));
        }
    }

    /* renamed from: M */
    public final void m20419M(C9994c c9994c, C11153q c11153q, Object obj) {
        C11153q c11153qM20444l0 = m20444l0(c11153q);
        if (c11153qM20444l0 == null || !m20411E0(c9994c, c11153qM20444l0, obj)) {
            c9994c.mo20474b().m20911f(2);
            C11153q c11153qM20444l02 = m20444l0(c11153q);
            if (c11153qM20444l02 == null || !m20411E0(c9994c, c11153qM20444l02, obj)) {
                mo20460w(m20421O(c9994c, obj));
            }
        }
    }

    /* renamed from: N */
    public final Throwable m20420N(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo20416J(), null, this) : th;
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC11176x1) obj).mo20449p();
    }

    /* renamed from: O */
    public final Object m20421O(C9994c c9994c, Object obj) throws Throwable {
        boolean zM20478i;
        Throwable thM20424R;
        C11174x c11174x = obj instanceof C11174x ? (C11174x) obj : null;
        Throwable th = c11174x != null ? c11174x.f26837a : null;
        synchronized (c9994c) {
            zM20478i = c9994c.m20478i();
            List listM20481l = c9994c.m20481l(th);
            thM20424R = m20424R(c9994c, listM20481l);
            if (thM20424R != null) {
                m20453s(thM20424R, listM20481l);
            }
        }
        if (thM20424R != null && thM20424R != th) {
            obj = new C11174x(thM20424R, false, 2, null);
        }
        if (thM20424R != null && (m20415I(thM20424R) || mo20431a0(thM20424R))) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C11174x) obj).m24815c();
        }
        if (!zM20478i) {
            m20448o0(thM20424R);
        }
        mo20450p0(obj);
        AbstractC3223a.m1395a(f23490c, this, c9994c, AbstractC11155q1.m24796g(obj));
        m20418L(c9994c, obj);
        return obj;
    }

    /* renamed from: P */
    public final Object m20422P() throws Throwable {
        Object objM20430X = m20430X();
        if (objM20430X instanceof InterfaceC11127j1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objM20430X instanceof C11174x) {
            throw ((C11174x) objM20430X).f26837a;
        }
        return AbstractC11155q1.m24797h(objM20430X);
    }

    /* renamed from: Q */
    public final Throwable m20423Q(Object obj) {
        C11174x c11174x = obj instanceof C11174x ? (C11174x) obj : null;
        if (c11174x != null) {
            return c11174x.f26837a;
        }
        return null;
    }

    /* renamed from: R */
    public final Throwable m20424R(C9994c c9994c, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (c9994c.m20478i()) {
                return new JobCancellationException(mo20416J(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: S */
    public boolean mo20425S() {
        return true;
    }

    /* renamed from: T */
    public boolean mo20426T() {
        return false;
    }

    /* renamed from: U */
    public final C11167u1 m20427U(InterfaceC11127j1 interfaceC11127j1) {
        C11167u1 c11167u1Mo20474b = interfaceC11127j1.mo20474b();
        if (c11167u1Mo20474b != null) {
            return c11167u1Mo20474b;
        }
        if (interfaceC11127j1 instanceof C11172w0) {
            return new C11167u1();
        }
        if (interfaceC11127j1 instanceof AbstractC11151p1) {
            m20454s0((AbstractC11151p1) interfaceC11127j1);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC11127j1).toString());
    }

    /* renamed from: V */
    public InterfaceC10045g m20428V() {
        InterfaceC11149p interfaceC11149pM20429W = m20429W();
        if (interfaceC11149pM20429W != null) {
            return interfaceC11149pM20429W.getParent();
        }
        return null;
    }

    /* renamed from: W */
    public final InterfaceC11149p m20429W() {
        return (InterfaceC11149p) f23491d.get(this);
    }

    /* renamed from: X */
    public final Object m20430X() {
        return f23490c.get(this);
    }

    /* renamed from: a0 */
    public boolean mo20431a0(Throwable th) {
        return false;
    }

    /* renamed from: c0 */
    public final void m20433c0(InterfaceC10045g interfaceC10045g) {
        if (interfaceC10045g == null) {
            m20457u0(C11170v1.f26829c);
            return;
        }
        interfaceC10045g.start();
        InterfaceC11149p interfaceC11149pMo20464y = interfaceC10045g.mo20464y(this);
        m20457u0(interfaceC11149pMo20464y);
        if (isCompleted()) {
            interfaceC11149pMo20464y.dispose();
            m20457u0(C11170v1.f26829c);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo20416J(), null, this);
        }
        mo20413G(cancellationException);
    }

    /* renamed from: d0 */
    public final InterfaceC11163t0 m20434d0(boolean z10, AbstractC11151p1 abstractC11151p1) {
        boolean z11;
        boolean zM20908c;
        abstractC11151p1.m24788w(this);
        while (true) {
            Object objM20430X = m20430X();
            z11 = true;
            if (!(objM20430X instanceof C11172w0)) {
                if (!(objM20430X instanceof InterfaceC11127j1)) {
                    z11 = false;
                    break;
                }
                InterfaceC11127j1 interfaceC11127j1 = (InterfaceC11127j1) objM20430X;
                C11167u1 c11167u1Mo20474b = interfaceC11127j1.mo20474b();
                if (c11167u1Mo20474b == null) {
                    AbstractC9979u.m20292e(objM20430X, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m20454s0((AbstractC11151p1) objM20430X);
                } else {
                    if (abstractC11151p1.mo20468u()) {
                        C9994c c9994c = interfaceC11127j1 instanceof C9994c ? (C9994c) interfaceC11127j1 : null;
                        Throwable thM20477e = c9994c != null ? c9994c.m20477e() : null;
                        if (thM20477e != null) {
                            if (z10) {
                                abstractC11151p1.mo20469v(thM20477e);
                            }
                            return C11170v1.f26829c;
                        }
                        zM20908c = c11167u1Mo20474b.m20908c(abstractC11151p1, 5);
                    } else {
                        zM20908c = c11167u1Mo20474b.m20908c(abstractC11151p1, 1);
                    }
                    if (zM20908c) {
                        break;
                    }
                }
            } else {
                C11172w0 c11172w0 = (C11172w0) objM20430X;
                if (!c11172w0.isActive()) {
                    m20452r0(c11172w0);
                } else if (AbstractC3223a.m1395a(f23490c, this, objM20430X, abstractC11151p1)) {
                    break;
                }
            }
        }
        if (z11) {
            return abstractC11151p1;
        }
        if (z10) {
            Object objM20430X2 = m20430X();
            C11174x c11174x = objM20430X2 instanceof C11174x ? (C11174x) objM20430X2 : null;
            abstractC11151p1.mo20469v(c11174x != null ? c11174x.f26837a : null);
        }
        return C11170v1.f26829c;
    }

    /* renamed from: e0 */
    public boolean mo20435e0() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: f */
    public final InterfaceC10659g mo20436f() {
        return AbstractC10662j.m22558b(new JobSupport$children$1(this, null));
    }

    /* renamed from: f0 */
    public final boolean m20437f0() {
        Object objM20430X;
        do {
            objM20430X = m20430X();
            if (!(objM20430X instanceof InterfaceC11127j1)) {
                return false;
            }
        } while (m20459v0(objM20430X) < 0);
        return true;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public Object fold(Object obj, InterfaceC9544p interfaceC9544p) {
        return InterfaceC10045g.a.m20901b(this, obj, interfaceC9544p);
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: g */
    public final CancellationException mo20438g() {
        Object objM20430X = m20430X();
        if (!(objM20430X instanceof C9994c)) {
            if (objM20430X instanceof InterfaceC11127j1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM20430X instanceof C11174x) {
                return m20403y0(this, ((C11174x) objM20430X).f26837a, null, 1, null);
            }
            return new JobCancellationException(AbstractC11126j0.m24738a(this) + " has completed normally", null, this);
        }
        Throwable thM20477e = ((C9994c) objM20430X).m20477e();
        if (thM20477e != null) {
            CancellationException cancellationExceptionM20463x0 = m20463x0(thM20477e, AbstractC11126j0.m24738a(this) + " is cancelling");
            if (cancellationExceptionM20463x0 != null) {
                return cancellationExceptionM20463x0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: g0 */
    public final Object m20439g0(InterfaceC11588c interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        AbstractC11137m.m24756a(c9997c, JobKt__JobKt.m20396m(this, false, new C11182z1(c9997c), 1, null));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d.b get(InterfaceC9945d.c cVar) {
        return InterfaceC10045g.a.m20902c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b
    public final InterfaceC9945d.c getKey() {
        return InterfaceC10045g.f23976b0;
    }

    /* renamed from: h0 */
    public final Object m20440h0(Object obj) throws Throwable {
        Throwable thM20420N = null;
        while (true) {
            Object objM20430X = m20430X();
            if (objM20430X instanceof C9994c) {
                synchronized (objM20430X) {
                    if (((C9994c) objM20430X).m20480k()) {
                        return AbstractC11155q1.f26817d;
                    }
                    boolean zM20478i = ((C9994c) objM20430X).m20478i();
                    if (obj != null || !zM20478i) {
                        if (thM20420N == null) {
                            thM20420N = m20420N(obj);
                        }
                        ((C9994c) objM20430X).m20473a(thM20420N);
                    }
                    Throwable thM20477e = zM20478i ? null : ((C9994c) objM20430X).m20477e();
                    if (thM20477e != null) {
                        m20446m0(((C9994c) objM20430X).mo20474b(), thM20477e);
                    }
                    return AbstractC11155q1.f26814a;
                }
            }
            if (!(objM20430X instanceof InterfaceC11127j1)) {
                return AbstractC11155q1.f26817d;
            }
            if (thM20420N == null) {
                thM20420N = m20420N(obj);
            }
            InterfaceC11127j1 interfaceC11127j1 = (InterfaceC11127j1) objM20430X;
            if (!interfaceC11127j1.isActive()) {
                Object objM20408C0 = m20408C0(objM20430X, new C11174x(thM20420N, false, 2, null));
                if (objM20408C0 == AbstractC11155q1.f26814a) {
                    throw new IllegalStateException(("Cannot happen in " + objM20430X).toString());
                }
                if (objM20408C0 != AbstractC11155q1.f26816c) {
                    return objM20408C0;
                }
            } else if (m20407B0(interfaceC11127j1, thM20420N)) {
                return AbstractC11155q1.f26814a;
            }
        }
    }

    /* renamed from: i0 */
    public final boolean m20441i0(Object obj) {
        Object objM20408C0;
        do {
            objM20408C0 = m20408C0(m20430X(), obj);
            if (objM20408C0 == AbstractC11155q1.f26814a) {
                return false;
            }
            if (objM20408C0 == AbstractC11155q1.f26815b) {
                return true;
            }
        } while (objM20408C0 == AbstractC11155q1.f26816c);
        mo20460w(objM20408C0);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public boolean isActive() {
        Object objM20430X = m20430X();
        return (objM20430X instanceof InterfaceC11127j1) && ((InterfaceC11127j1) objM20430X).isActive();
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public final boolean isCancelled() {
        Object objM20430X = m20430X();
        if (objM20430X instanceof C11174x) {
            return true;
        }
        return (objM20430X instanceof C9994c) && ((C9994c) objM20430X).m20478i();
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public final boolean isCompleted() {
        return !(m20430X() instanceof InterfaceC11127j1);
    }

    /* renamed from: j0 */
    public final Object m20442j0(Object obj) {
        Object objM20408C0;
        do {
            objM20408C0 = m20408C0(m20430X(), obj);
            if (objM20408C0 == AbstractC11155q1.f26814a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m20423Q(obj));
            }
        } while (objM20408C0 == AbstractC11155q1.f26816c);
        return objM20408C0;
    }

    /* renamed from: k0 */
    public String mo20443k0() {
        return AbstractC11126j0.m24738a(this);
    }

    /* renamed from: l0 */
    public final C11153q m20444l0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo20918p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m20917l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m20916k();
            if (!lockFreeLinkedListNode.mo20918p()) {
                if (lockFreeLinkedListNode instanceof C11153q) {
                    return (C11153q) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof C11167u1) {
                    return null;
                }
            }
        }
    }

    @Override // sd.InterfaceC11156r
    /* renamed from: m */
    public final void mo20445m(InterfaceC11176x1 interfaceC11176x1) throws Throwable {
        m20412F(interfaceC11176x1);
    }

    /* renamed from: m0 */
    public final void m20446m0(C11167u1 c11167u1, Throwable th) throws Throwable {
        m20448o0(th);
        c11167u1.m20911f(4);
        Object objM20915j = c11167u1.m20915j();
        AbstractC9979u.m20292e(objM20915j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM20916k = (LockFreeLinkedListNode) objM20915j; !AbstractC9979u.m20289b(lockFreeLinkedListNodeM20916k, c11167u1); lockFreeLinkedListNodeM20916k = lockFreeLinkedListNodeM20916k.m20916k()) {
            if ((lockFreeLinkedListNodeM20916k instanceof AbstractC11151p1) && ((AbstractC11151p1) lockFreeLinkedListNodeM20916k).mo20468u()) {
                try {
                    ((AbstractC11151p1) lockFreeLinkedListNodeM20916k).mo20469v(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC10771b.m22973a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeM20916k + " for " + this, th2);
                        C10786q c10786q = C10786q.f26013a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo20432b0(completionHandlerException);
        }
        m20415I(th);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return InterfaceC10045g.a.m20903d(this, cVar);
    }

    /* renamed from: n0 */
    public final void m20447n0(C11167u1 c11167u1, Throwable th) throws Throwable {
        c11167u1.m20911f(1);
        Object objM20915j = c11167u1.m20915j();
        AbstractC9979u.m20292e(objM20915j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM20916k = (LockFreeLinkedListNode) objM20915j; !AbstractC9979u.m20289b(lockFreeLinkedListNodeM20916k, c11167u1); lockFreeLinkedListNodeM20916k = lockFreeLinkedListNodeM20916k.m20916k()) {
            if (lockFreeLinkedListNodeM20916k instanceof AbstractC11151p1) {
                try {
                    ((AbstractC11151p1) lockFreeLinkedListNodeM20916k).mo20469v(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC10771b.m22973a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeM20916k + " for " + this, th2);
                        C10786q c10786q = C10786q.f26013a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo20432b0(completionHandlerException);
        }
    }

    /* renamed from: o0 */
    public void m20448o0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // sd.InterfaceC11176x1
    /* renamed from: p */
    public CancellationException mo20449p() {
        CancellationException cancellationExceptionM20477e;
        Object objM20430X = m20430X();
        if (objM20430X instanceof C9994c) {
            cancellationExceptionM20477e = ((C9994c) objM20430X).m20477e();
        } else if (objM20430X instanceof C11174x) {
            cancellationExceptionM20477e = ((C11174x) objM20430X).f26837a;
        } else {
            if (objM20430X instanceof InterfaceC11127j1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM20430X).toString());
            }
            cancellationExceptionM20477e = null;
        }
        CancellationException cancellationException = cancellationExceptionM20477e instanceof CancellationException ? cancellationExceptionM20477e : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m20461w0(objM20430X), cancellationExceptionM20477e, this);
    }

    /* renamed from: p0 */
    public void mo20450p0(Object obj) {
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return InterfaceC10045g.a.m20904e(this, interfaceC9945d);
    }

    /* renamed from: q0 */
    public void mo20451q0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [sd.i1] */
    /* renamed from: r0 */
    public final void m20452r0(C11172w0 c11172w0) {
        C11167u1 c11167u1 = new C11167u1();
        if (!c11172w0.isActive()) {
            c11167u1 = new C11123i1(c11167u1);
        }
        AbstractC3223a.m1395a(f23490c, this, c11172w0, c11167u1);
    }

    /* renamed from: s */
    public final void m20453s(Throwable th, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC10771b.m22973a(th, th2);
            }
        }
    }

    /* renamed from: s0 */
    public final void m20454s0(AbstractC11151p1 abstractC11151p1) {
        abstractC11151p1.m20910e(new C11167u1());
        AbstractC3223a.m1395a(f23490c, this, abstractC11151p1, abstractC11151p1.m20916k());
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public final boolean start() {
        int iM20459v0;
        do {
            iM20459v0 = m20459v0(m20430X());
            if (iM20459v0 == 0) {
                return false;
            }
        } while (iM20459v0 != 1);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: t */
    public final InterfaceC11163t0 mo20455t(boolean z10, boolean z11, InterfaceC9540l interfaceC9540l) {
        return m20434d0(z11, z10 ? new C11135l1(interfaceC9540l) : new C11139m1(interfaceC9540l));
    }

    /* renamed from: t0 */
    public final void m20456t0(AbstractC11151p1 abstractC11151p1) {
        Object objM20430X;
        do {
            objM20430X = m20430X();
            if (!(objM20430X instanceof AbstractC11151p1)) {
                if (!(objM20430X instanceof InterfaceC11127j1) || ((InterfaceC11127j1) objM20430X).mo20474b() == null) {
                    return;
                }
                abstractC11151p1.m20919q();
                return;
            }
            if (objM20430X != abstractC11151p1) {
                return;
            }
        } while (!AbstractC3223a.m1395a(f23490c, this, objM20430X, AbstractC11155q1.f26820g));
    }

    public String toString() {
        return m20465z0() + '@' + AbstractC11126j0.m24739b(this);
    }

    /* renamed from: u0 */
    public final void m20457u0(InterfaceC11149p interfaceC11149p) {
        f23491d.set(this, interfaceC11149p);
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: v */
    public final Object mo20458v(InterfaceC11588c interfaceC11588c) {
        if (m20437f0()) {
            Object objM20439g0 = m20439g0(interfaceC11588c);
            return objM20439g0 == AbstractC11725a.m25952f() ? objM20439g0 : C10786q.f26013a;
        }
        AbstractC11147o1.m24775i(interfaceC11588c.getContext());
        return C10786q.f26013a;
    }

    /* renamed from: v0 */
    public final int m20459v0(Object obj) {
        if (obj instanceof C11172w0) {
            if (((C11172w0) obj).isActive()) {
                return 0;
            }
            if (!AbstractC3223a.m1395a(f23490c, this, obj, AbstractC11155q1.f26820g)) {
                return -1;
            }
            mo20451q0();
            return 1;
        }
        if (!(obj instanceof C11123i1)) {
            return 0;
        }
        if (!AbstractC3223a.m1395a(f23490c, this, obj, ((C11123i1) obj).mo20474b())) {
            return -1;
        }
        mo20451q0();
        return 1;
    }

    /* renamed from: w */
    public void mo20460w(Object obj) {
    }

    /* renamed from: w0 */
    public final String m20461w0(Object obj) {
        if (!(obj instanceof C9994c)) {
            return obj instanceof InterfaceC11127j1 ? ((InterfaceC11127j1) obj).isActive() ? "Active" : "New" : obj instanceof C11174x ? "Cancelled" : "Completed";
        }
        C9994c c9994c = (C9994c) obj;
        return c9994c.m20478i() ? "Cancelling" : c9994c.m20479j() ? "Completing" : "Active";
    }

    /* renamed from: x */
    public final Object m20462x(InterfaceC11588c interfaceC11588c) throws Throwable {
        Object objM20430X;
        do {
            objM20430X = m20430X();
            if (!(objM20430X instanceof InterfaceC11127j1)) {
                if (objM20430X instanceof C11174x) {
                    throw ((C11174x) objM20430X).f26837a;
                }
                return AbstractC11155q1.m24797h(objM20430X);
            }
        } while (m20459v0(objM20430X) < 0);
        return m20406B(interfaceC11588c);
    }

    /* renamed from: x0 */
    public final CancellationException m20463x0(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = mo20416J();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: y */
    public final InterfaceC11149p mo20464y(InterfaceC11156r interfaceC11156r) {
        C11153q c11153q = new C11153q(interfaceC11156r);
        c11153q.m24788w(this);
        while (true) {
            Object objM20430X = m20430X();
            if (objM20430X instanceof C11172w0) {
                C11172w0 c11172w0 = (C11172w0) objM20430X;
                if (!c11172w0.isActive()) {
                    m20452r0(c11172w0);
                } else if (AbstractC3223a.m1395a(f23490c, this, objM20430X, c11153q)) {
                    return c11153q;
                }
            } else {
                if (!(objM20430X instanceof InterfaceC11127j1)) {
                    Object objM20430X2 = m20430X();
                    C11174x c11174x = objM20430X2 instanceof C11174x ? (C11174x) objM20430X2 : null;
                    c11153q.mo20469v(c11174x != null ? c11174x.f26837a : null);
                    return C11170v1.f26829c;
                }
                C11167u1 c11167u1Mo20474b = ((InterfaceC11127j1) objM20430X).mo20474b();
                if (c11167u1Mo20474b != null) {
                    if (!c11167u1Mo20474b.m20908c(c11153q, 7)) {
                        boolean zM20908c = c11167u1Mo20474b.m20908c(c11153q, 3);
                        Object objM20430X3 = m20430X();
                        if (objM20430X3 instanceof C9994c) {
                            thM20477e = ((C9994c) objM20430X3).m20477e();
                        } else {
                            C11174x c11174x2 = objM20430X3 instanceof C11174x ? (C11174x) objM20430X3 : null;
                            if (c11174x2 != null) {
                                thM20477e = c11174x2.f26837a;
                            }
                        }
                        c11153q.mo20469v(thM20477e);
                        if (!zM20908c) {
                            return C11170v1.f26829c;
                        }
                    }
                    return c11153q;
                }
                AbstractC9979u.m20292e(objM20430X, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                m20454s0((AbstractC11151p1) objM20430X);
            }
        }
    }

    /* renamed from: z0 */
    public final String m20465z0() {
        return mo20443k0() + '{' + m20461w0(m20430X()) + '}';
    }

    /* renamed from: b0 */
    public void mo20432b0(Throwable th) throws Throwable {
        throw th;
    }
}

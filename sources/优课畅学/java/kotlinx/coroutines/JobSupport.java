package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC3193a;
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
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC9211m;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p101f8.AbstractC8472j;
import p101f8.InterfaceC8469g;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p135i8.AbstractC8825c0;
import p135i8.AbstractC8829d1;
import p135i8.AbstractC8832e1;
import p135i8.AbstractC8851l;
import p135i8.AbstractC8894z0;
import p135i8.C8844i1;
import p135i8.C8847j1;
import p135i8.C8856m1;
import p135i8.C8858n0;
import p135i8.C8859n1;
import p135i8.C8863p;
import p135i8.C8879u0;
import p135i8.C8884w;
import p135i8.C8888x0;
import p135i8.C8891y0;
import p135i8.InterfaceC8849k0;
import p135i8.InterfaceC8853l1;
import p135i8.InterfaceC8860o;
import p135i8.InterfaceC8866q;
import p135i8.InterfaceC8882v0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9463p;
import p191n8.AbstractC9470w;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public class JobSupport implements InterfaceC9212n, InterfaceC8866q, InterfaceC8853l1 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17564a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17565b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: kotlinx.coroutines.JobSupport$a */
    public static final class C9148a extends C9155c {

        /* renamed from: i */
        public final JobSupport f17566i;

        public C9148a(InterfaceC9324c interfaceC9324c, JobSupport jobSupport) {
            super(interfaceC9324c, 1);
            this.f17566i = jobSupport;
        }

        @Override // kotlinx.coroutines.C9155c
        /* renamed from: K */
        public String mo16306K() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C9155c
        /* renamed from: u */
        public Throwable mo16307u(InterfaceC9212n interfaceC9212n) {
            Throwable thM16314d;
            Object objM16276X = this.f17566i.m16276X();
            return (!(objM16276X instanceof C9150c) || (thM16314d = ((C9150c) objM16276X).m16314d()) == null) ? objM16276X instanceof C8884w ? ((C8884w) objM16276X).f16545a : interfaceC9212n.mo16281e() : thM16314d;
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$b */
    public static final class C9149b extends AbstractC8829d1 {

        /* renamed from: e */
        public final JobSupport f17567e;

        /* renamed from: f */
        public final C9150c f17568f;

        /* renamed from: g */
        public final C8863p f17569g;

        /* renamed from: h */
        public final Object f17570h;

        public C9149b(JobSupport jobSupport, C9150c c9150c, C8863p c8863p, Object obj) {
            this.f17567e = jobSupport;
            this.f17568f = c9150c;
            this.f17569g = c8863p;
            this.f17570h = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC9211m
        /* renamed from: a */
        public void mo14884a(Throwable th) {
            this.f17567e.m16267M(this.f17568f, this.f17569g, this.f17570h);
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$c */
    public static final class C9150c implements InterfaceC8882v0 {

        /* renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f17571b = AtomicIntegerFieldUpdater.newUpdater(C9150c.class, "_isCompleting$volatile");

        /* renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f17572c = AtomicReferenceFieldUpdater.newUpdater(C9150c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f17573d = AtomicReferenceFieldUpdater.newUpdater(C9150c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a */
        public final C8844i1 f17574a;

        public C9150c(C8844i1 c8844i1, boolean z10, Throwable th) {
            this.f17574a = c8844i1;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* renamed from: a */
        public final void m16311a(Throwable th) {
            Throwable thM16314d = m16314d();
            if (thM16314d == null) {
                m16321n(th);
                return;
            }
            if (th == thM16314d) {
                return;
            }
            Object objM16313c = m16313c();
            if (objM16313c == null) {
                m16320m(th);
                return;
            }
            if (objM16313c instanceof Throwable) {
                if (th == objM16313c) {
                    return;
                }
                ArrayList arrayListM16312b = m16312b();
                arrayListM16312b.add(objM16313c);
                arrayListM16312b.add(th);
                m16320m(arrayListM16312b);
                return;
            }
            if (objM16313c instanceof ArrayList) {
                ((ArrayList) objM16313c).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objM16313c).toString());
        }

        /* renamed from: b */
        public final ArrayList m16312b() {
            return new ArrayList(4);
        }

        /* renamed from: c */
        public final Object m16313c() {
            return f17573d.get(this);
        }

        /* renamed from: d */
        public final Throwable m16314d() {
            return (Throwable) f17572c.get(this);
        }

        @Override // p135i8.InterfaceC8882v0
        public C8844i1 getList() {
            return this.f17574a;
        }

        /* renamed from: h */
        public final boolean m16315h() {
            return m16314d() != null;
        }

        /* renamed from: i */
        public final boolean m16316i() {
            return f17571b.get(this) != 0;
        }

        @Override // p135i8.InterfaceC8882v0
        public boolean isActive() {
            return m16314d() == null;
        }

        /* renamed from: j */
        public final boolean m16317j() {
            return m16313c() == AbstractC8832e1.f16506e;
        }

        /* renamed from: k */
        public final List m16318k(Throwable th) {
            ArrayList arrayListM16312b;
            Object objM16313c = m16313c();
            if (objM16313c == null) {
                arrayListM16312b = m16312b();
            } else if (objM16313c instanceof Throwable) {
                ArrayList arrayListM16312b2 = m16312b();
                arrayListM16312b2.add(objM16313c);
                arrayListM16312b = arrayListM16312b2;
            } else {
                if (!(objM16313c instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objM16313c).toString());
                }
                arrayListM16312b = (ArrayList) objM16313c;
            }
            Throwable thM16314d = m16314d();
            if (thM16314d != null) {
                arrayListM16312b.add(0, thM16314d);
            }
            if (th != null && !AbstractC9133u.m16128b(th, thM16314d)) {
                arrayListM16312b.add(th);
            }
            m16320m(AbstractC8832e1.f16506e);
            return arrayListM16312b;
        }

        /* renamed from: l */
        public final void m16319l(boolean z10) {
            f17571b.set(this, z10 ? 1 : 0);
        }

        /* renamed from: m */
        public final void m16320m(Object obj) {
            f17573d.set(this, obj);
        }

        /* renamed from: n */
        public final void m16321n(Throwable th) {
            f17572c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m16315h() + ", completing=" + m16316i() + ", rootCause=" + m16314d() + ", exceptions=" + m16313c() + ", list=" + getList() + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$d */
    public static final class C9151d extends LockFreeLinkedListNode.AbstractC9206a {

        /* renamed from: d */
        public final /* synthetic */ JobSupport f17580d;

        /* renamed from: e */
        public final /* synthetic */ Object f17581e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9151d(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f17580d = jobSupport;
            this.f17581e = obj;
        }

        @Override // p191n8.AbstractC9437b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object mo16322e(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f17580d.m16276X() == this.f17581e) {
                return null;
            }
            return AbstractC9463p.m17381a();
        }
    }

    public JobSupport(boolean z10) {
        this._state$volatile = z10 ? AbstractC8832e1.f16508g : AbstractC8832e1.f16507f;
    }

    /* renamed from: z0 */
    public static /* synthetic */ CancellationException m16251z0(JobSupport jobSupport, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return jobSupport.m16304y0(th, str);
    }

    /* renamed from: A */
    public final void m16252A(Throwable th, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC8722b.m14228a(th, th2);
            }
        }
    }

    /* renamed from: A0 */
    public final String m16253A0() {
        return mo14929l0() + '{' + m16303x0(m16276X()) + '}';
    }

    /* renamed from: B */
    public void mo14824B(Object obj) {
    }

    /* renamed from: B0 */
    public final boolean m16254B0(InterfaceC8882v0 interfaceC8882v0, Object obj) throws Throwable {
        if (!AbstractC3193a.m1318a(f17564a, this, interfaceC8882v0, AbstractC8832e1.m14840g(obj))) {
            return false;
        }
        m16295p0(null);
        mo16296q0(obj);
        m16266L(interfaceC8882v0, obj);
        return true;
    }

    /* renamed from: C */
    public final Object m16255C(InterfaceC9324c interfaceC9324c) throws Throwable {
        Object objM16276X;
        do {
            objM16276X = m16276X();
            if (!(objM16276X instanceof InterfaceC8882v0)) {
                if (objM16276X instanceof C8884w) {
                    throw ((C8884w) objM16276X).f16545a;
                }
                return AbstractC8832e1.m14841h(objM16276X);
            }
        } while (m16302w0(objM16276X) < 0);
        return m16257D(interfaceC9324c);
    }

    /* renamed from: C0 */
    public final boolean m16256C0(InterfaceC8882v0 interfaceC8882v0, Throwable th) throws Throwable {
        C8844i1 c8844i1M16274V = m16274V(interfaceC8882v0);
        if (c8844i1M16274V == null) {
            return false;
        }
        if (!AbstractC3193a.m1318a(f17564a, this, interfaceC8882v0, new C9150c(c8844i1M16274V, false, th))) {
            return false;
        }
        m16292n0(c8844i1M16274V, th);
        return true;
    }

    /* renamed from: D */
    public final Object m16257D(InterfaceC9324c interfaceC9324c) {
        C9148a c9148a = new C9148a(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), this);
        c9148a.m16343D();
        AbstractC8851l.m14878a(c9148a, JobKt__JobKt.m16244m(this, false, false, new C8856m1(c9148a), 3, null));
        Object objM16372x = c9148a.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* renamed from: D0 */
    public final Object m16258D0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC8882v0) ? AbstractC8832e1.f16502a : ((!(obj instanceof C8858n0) && !(obj instanceof AbstractC8829d1)) || (obj instanceof C8863p) || (obj2 instanceof C8884w)) ? m16260E0((InterfaceC8882v0) obj, obj2) : m16254B0((InterfaceC8882v0) obj, obj2) ? obj2 : AbstractC8832e1.f16504c;
    }

    /* renamed from: E */
    public final boolean m16259E(Throwable th) {
        return m16261F(th);
    }

    /* renamed from: E0 */
    public final Object m16260E0(InterfaceC8882v0 interfaceC8882v0, Object obj) throws Throwable {
        C8844i1 c8844i1M16274V = m16274V(interfaceC8882v0);
        if (c8844i1M16274V == null) {
            return AbstractC8832e1.f16504c;
        }
        C9150c c9150c = interfaceC8882v0 instanceof C9150c ? (C9150c) interfaceC8882v0 : null;
        if (c9150c == null) {
            c9150c = new C9150c(c8844i1M16274V, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c9150c) {
            if (c9150c.m16316i()) {
                return AbstractC8832e1.f16502a;
            }
            c9150c.m16319l(true);
            if (c9150c != interfaceC8882v0 && !AbstractC3193a.m1318a(f17564a, this, interfaceC8882v0, c9150c)) {
                return AbstractC8832e1.f16504c;
            }
            boolean zM16315h = c9150c.m16315h();
            C8884w c8884w = obj instanceof C8884w ? (C8884w) obj : null;
            if (c8884w != null) {
                c9150c.m16311a(c8884w.f16545a);
            }
            Throwable thM16314d = zM16315h ? null : c9150c.m16314d();
            ref$ObjectRef.f17473a = thM16314d;
            C8736p c8736p = C8736p.f16368a;
            if (thM16314d != null) {
                m16292n0(c8844i1M16274V, thM16314d);
            }
            C8863p c8863pM16270P = m16270P(interfaceC8882v0);
            return (c8863pM16270P == null || !m16262F0(c9150c, c8863pM16270P, obj)) ? m16269O(c9150c, obj) : AbstractC8832e1.f16503b;
        }
    }

    /* renamed from: F */
    public final boolean m16261F(Object obj) throws Throwable {
        Object objM16284h0 = AbstractC8832e1.f16502a;
        if (mo14801U() && (objM16284h0 = m16263H(obj)) == AbstractC8832e1.f16503b) {
            return true;
        }
        if (objM16284h0 == AbstractC8832e1.f16502a) {
            objM16284h0 = m16284h0(obj);
        }
        if (objM16284h0 == AbstractC8832e1.f16502a || objM16284h0 == AbstractC8832e1.f16503b) {
            return true;
        }
        if (objM16284h0 == AbstractC8832e1.f16505d) {
            return false;
        }
        mo14824B(objM16284h0);
        return true;
    }

    /* renamed from: F0 */
    public final boolean m16262F0(C9150c c9150c, C8863p c8863p, Object obj) {
        while (JobKt__JobKt.m16244m(c8863p.f16532e, false, false, new C9149b(this, c9150c, c8863p, obj), 1, null) == C8847j1.f16518a) {
            c8863p = m16290m0(c8863p);
            if (c8863p == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public void mo15873G(Throwable th) throws Throwable {
        m16261F(th);
    }

    /* renamed from: H */
    public final Object m16263H(Object obj) {
        Object objM16258D0;
        do {
            Object objM16276X = m16276X();
            if (!(objM16276X instanceof InterfaceC8882v0) || ((objM16276X instanceof C9150c) && ((C9150c) objM16276X).m16316i())) {
                return AbstractC8832e1.f16502a;
            }
            objM16258D0 = m16258D0(objM16276X, new C8884w(m16268N(obj), false, 2, null));
        } while (objM16258D0 == AbstractC8832e1.f16504c);
        return objM16258D0;
    }

    /* renamed from: I */
    public final boolean m16264I(Throwable th) {
        if (mo14826e0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC8860o interfaceC8860oM16275W = m16275W();
        return (interfaceC8860oM16275W == null || interfaceC8860oM16275W == C8847j1.f16518a) ? z10 : interfaceC8860oM16275W.mo14877b(th) || z10;
    }

    /* renamed from: J */
    public String mo16265J() {
        return "Job was cancelled";
    }

    /* renamed from: K */
    public boolean mo14903K(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m16261F(th) && mo14800T();
    }

    /* renamed from: L */
    public final void m16266L(InterfaceC8882v0 interfaceC8882v0, Object obj) throws Throwable {
        InterfaceC8860o interfaceC8860oM16275W = m16275W();
        if (interfaceC8860oM16275W != null) {
            interfaceC8860oM16275W.dispose();
            m16301v0(C8847j1.f16518a);
        }
        C8884w c8884w = obj instanceof C8884w ? (C8884w) obj : null;
        Throwable th = c8884w != null ? c8884w.f16545a : null;
        if (!(interfaceC8882v0 instanceof AbstractC8829d1)) {
            C8844i1 list = interfaceC8882v0.getList();
            if (list != null) {
                m16293o0(list, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC8829d1) interfaceC8882v0).mo14884a(th);
        } catch (Throwable th2) {
            mo16277b0(new CompletionHandlerException("Exception in completion handler " + interfaceC8882v0 + " for " + this, th2));
        }
    }

    /* renamed from: M */
    public final void m16267M(C9150c c9150c, C8863p c8863p, Object obj) {
        C8863p c8863pM16290m0 = m16290m0(c8863p);
        if (c8863pM16290m0 == null || !m16262F0(c9150c, c8863pM16290m0, obj)) {
            mo14824B(m16269O(c9150c, obj));
        }
    }

    /* renamed from: N */
    public final Throwable m16268N(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo16265J(), null, this) : th;
        }
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC8853l1) obj).mo14881j();
    }

    /* renamed from: O */
    public final Object m16269O(C9150c c9150c, Object obj) throws Throwable {
        boolean zM16315h;
        Throwable thM16273S;
        C8884w c8884w = obj instanceof C8884w ? (C8884w) obj : null;
        Throwable th = c8884w != null ? c8884w.f16545a : null;
        synchronized (c9150c) {
            zM16315h = c9150c.m16315h();
            List listM16318k = c9150c.m16318k(th);
            thM16273S = m16273S(c9150c, listM16318k);
            if (thM16273S != null) {
                m16252A(thM16273S, listM16318k);
            }
        }
        if (thM16273S != null && thM16273S != th) {
            obj = new C8884w(thM16273S, false, 2, null);
        }
        if (thM16273S != null && (m16264I(thM16273S) || mo14898a0(thM16273S))) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C8884w) obj).m14928c();
        }
        if (!zM16315h) {
            m16295p0(thM16273S);
        }
        mo16296q0(obj);
        AbstractC3193a.m1318a(f17564a, this, c9150c, AbstractC8832e1.m14840g(obj));
        m16266L(c9150c, obj);
        return obj;
    }

    /* renamed from: P */
    public final C8863p m16270P(InterfaceC8882v0 interfaceC8882v0) {
        C8863p c8863p = interfaceC8882v0 instanceof C8863p ? (C8863p) interfaceC8882v0 : null;
        if (c8863p != null) {
            return c8863p;
        }
        C8844i1 list = interfaceC8882v0.getList();
        if (list != null) {
            return m16290m0(list);
        }
        return null;
    }

    /* renamed from: Q */
    public final Object m16271Q() throws Throwable {
        Object objM16276X = m16276X();
        if (objM16276X instanceof InterfaceC8882v0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objM16276X instanceof C8884w) {
            throw ((C8884w) objM16276X).f16545a;
        }
        return AbstractC8832e1.m14841h(objM16276X);
    }

    /* renamed from: R */
    public final Throwable m16272R(Object obj) {
        C8884w c8884w = obj instanceof C8884w ? (C8884w) obj : null;
        if (c8884w != null) {
            return c8884w.f16545a;
        }
        return null;
    }

    /* renamed from: S */
    public final Throwable m16273S(C9150c c9150c, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (c9150c.m16315h()) {
                return new JobCancellationException(mo16265J(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
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
            Iterator it2 = list.iterator();
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

    /* renamed from: T */
    public boolean mo14800T() {
        return true;
    }

    /* renamed from: U */
    public boolean mo14801U() {
        return false;
    }

    /* renamed from: V */
    public final C8844i1 m16274V(InterfaceC8882v0 interfaceC8882v0) {
        C8844i1 list = interfaceC8882v0.getList();
        if (list != null) {
            return list;
        }
        if (interfaceC8882v0 instanceof C8858n0) {
            return new C8844i1();
        }
        if (interfaceC8882v0 instanceof AbstractC8829d1) {
            m16299t0((AbstractC8829d1) interfaceC8882v0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC8882v0).toString());
    }

    /* renamed from: W */
    public final InterfaceC8860o m16275W() {
        return (InterfaceC8860o) f17565b.get(this);
    }

    /* renamed from: X */
    public final Object m16276X() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17564a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC9470w)) {
                return obj;
            }
            ((AbstractC9470w) obj).mo17298a(this);
        }
    }

    /* renamed from: a0 */
    public boolean mo14898a0(Throwable th) {
        return false;
    }

    @Override // p135i8.InterfaceC8866q
    /* renamed from: b */
    public final void mo14899b(InterfaceC8853l1 interfaceC8853l1) throws Throwable {
        m16261F(interfaceC8853l1);
    }

    /* renamed from: c0 */
    public final void m16278c0(InterfaceC9212n interfaceC9212n) {
        if (interfaceC9212n == null) {
            m16301v0(C8847j1.f16518a);
            return;
        }
        interfaceC9212n.start();
        InterfaceC8860o interfaceC8860oMo16297s = interfaceC9212n.mo16297s(this);
        m16301v0(interfaceC8860oMo16297s);
        if (mo16289l()) {
            interfaceC8860oMo16297s.dispose();
            m16301v0(C8847j1.f16518a);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC9212n, p157k8.InterfaceC9073i
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo16265J(), null, this);
        }
        mo15873G(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: d */
    public final InterfaceC8469g mo16279d() {
        return AbstractC8472j.m13827b(new JobSupport$children$1(this, null));
    }

    /* renamed from: d0 */
    public final InterfaceC8849k0 m16280d0(boolean z10, boolean z11, InterfaceC9211m interfaceC9211m) {
        AbstractC8829d1 abstractC8829d1M16288k0 = m16288k0(interfaceC9211m, z10);
        while (true) {
            Object objM16276X = m16276X();
            if (objM16276X instanceof C8858n0) {
                C8858n0 c8858n0 = (C8858n0) objM16276X;
                if (!c8858n0.isActive()) {
                    m16298s0(c8858n0);
                } else if (AbstractC3193a.m1318a(f17564a, this, objM16276X, abstractC8829d1M16288k0)) {
                    break;
                }
            } else {
                if (!(objM16276X instanceof InterfaceC8882v0)) {
                    if (z11) {
                        C8884w c8884w = objM16276X instanceof C8884w ? (C8884w) objM16276X : null;
                        interfaceC9211m.mo14884a(c8884w != null ? c8884w.f16545a : null);
                    }
                    return C8847j1.f16518a;
                }
                C8844i1 list = ((InterfaceC8882v0) objM16276X).getList();
                if (list == null) {
                    AbstractC9133u.m16131e(objM16276X, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m16299t0((AbstractC8829d1) objM16276X);
                } else {
                    InterfaceC8849k0 interfaceC8849k0 = C8847j1.f16518a;
                    if (z10 && (objM16276X instanceof C9150c)) {
                        synchronized (objM16276X) {
                            try {
                                thM16314d = ((C9150c) objM16276X).m16314d();
                                if (thM16314d == null || ((interfaceC9211m instanceof C8863p) && !((C9150c) objM16276X).m16316i())) {
                                    if (m16305z(objM16276X, list, abstractC8829d1M16288k0)) {
                                        if (thM16314d == null) {
                                            return abstractC8829d1M16288k0;
                                        }
                                        interfaceC8849k0 = abstractC8829d1M16288k0;
                                    }
                                }
                                C8736p c8736p = C8736p.f16368a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thM16314d != null) {
                        if (z11) {
                            interfaceC9211m.mo14884a(thM16314d);
                        }
                        return interfaceC8849k0;
                    }
                    if (m16305z(objM16276X, list, abstractC8829d1M16288k0)) {
                        break;
                    }
                }
            }
        }
        return abstractC8829d1M16288k0;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: e */
    public final CancellationException mo16281e() {
        Object objM16276X = m16276X();
        if (!(objM16276X instanceof C9150c)) {
            if (objM16276X instanceof InterfaceC8882v0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM16276X instanceof C8884w) {
                return m16251z0(this, ((C8884w) objM16276X).f16545a, null, 1, null);
            }
            return new JobCancellationException(AbstractC8825c0.m14820a(this) + " has completed normally", null, this);
        }
        Throwable thM16314d = ((C9150c) objM16276X).m16314d();
        if (thM16314d != null) {
            CancellationException cancellationExceptionM16304y0 = m16304y0(thM16314d, AbstractC8825c0.m14820a(this) + " is cancelling");
            if (cancellationExceptionM16304y0 != null) {
                return cancellationExceptionM16304y0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: e0 */
    public boolean mo14826e0() {
        return false;
    }

    /* renamed from: f0 */
    public final boolean m16282f0() {
        Object objM16276X;
        do {
            objM16276X = m16276X();
            if (!(objM16276X instanceof InterfaceC8882v0)) {
                return false;
            }
        } while (m16302w0(objM16276X) < 0);
        return true;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public Object fold(Object obj, InterfaceC10574p interfaceC10574p) {
        return InterfaceC9212n.a.m16778b(this, obj, interfaceC10574p);
    }

    /* renamed from: g0 */
    public final Object m16283g0(InterfaceC9324c interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        AbstractC8851l.m14878a(c9155c, JobKt__JobKt.m16244m(this, false, false, new C8859n1(c9155c), 3, null));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d.b get(InterfaceC9100d.c cVar) {
        return InterfaceC9212n.a.m16779c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b
    public final InterfaceC9100d.c getKey() {
        return InterfaceC9212n.f18095c0;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public InterfaceC9212n getParent() {
        InterfaceC8860o interfaceC8860oM16275W = m16275W();
        if (interfaceC8860oM16275W != null) {
            return interfaceC8860oM16275W.getParent();
        }
        return null;
    }

    /* renamed from: h0 */
    public final Object m16284h0(Object obj) throws Throwable {
        Throwable thM16268N = null;
        while (true) {
            Object objM16276X = m16276X();
            if (objM16276X instanceof C9150c) {
                synchronized (objM16276X) {
                    if (((C9150c) objM16276X).m16317j()) {
                        return AbstractC8832e1.f16505d;
                    }
                    boolean zM16315h = ((C9150c) objM16276X).m16315h();
                    if (obj != null || !zM16315h) {
                        if (thM16268N == null) {
                            thM16268N = m16268N(obj);
                        }
                        ((C9150c) objM16276X).m16311a(thM16268N);
                    }
                    Throwable thM16314d = zM16315h ? null : ((C9150c) objM16276X).m16314d();
                    if (thM16314d != null) {
                        m16292n0(((C9150c) objM16276X).getList(), thM16314d);
                    }
                    return AbstractC8832e1.f16502a;
                }
            }
            if (!(objM16276X instanceof InterfaceC8882v0)) {
                return AbstractC8832e1.f16505d;
            }
            if (thM16268N == null) {
                thM16268N = m16268N(obj);
            }
            InterfaceC8882v0 interfaceC8882v0 = (InterfaceC8882v0) objM16276X;
            if (!interfaceC8882v0.isActive()) {
                Object objM16258D0 = m16258D0(objM16276X, new C8884w(thM16268N, false, 2, null));
                if (objM16258D0 == AbstractC8832e1.f16502a) {
                    throw new IllegalStateException(("Cannot happen in " + objM16276X).toString());
                }
                if (objM16258D0 != AbstractC8832e1.f16504c) {
                    return objM16258D0;
                }
            } else if (m16256C0(interfaceC8882v0, thM16268N)) {
                return AbstractC8832e1.f16502a;
            }
        }
    }

    /* renamed from: i0 */
    public final boolean m16285i0(Object obj) {
        Object objM16258D0;
        do {
            objM16258D0 = m16258D0(m16276X(), obj);
            if (objM16258D0 == AbstractC8832e1.f16502a) {
                return false;
            }
            if (objM16258D0 == AbstractC8832e1.f16503b) {
                return true;
            }
        } while (objM16258D0 == AbstractC8832e1.f16504c);
        mo14824B(objM16258D0);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public boolean isActive() {
        Object objM16276X = m16276X();
        return (objM16276X instanceof InterfaceC8882v0) && ((InterfaceC8882v0) objM16276X).isActive();
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public final boolean isCancelled() {
        Object objM16276X = m16276X();
        if (objM16276X instanceof C8884w) {
            return true;
        }
        return (objM16276X instanceof C9150c) && ((C9150c) objM16276X).m16315h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p135i8.InterfaceC8853l1
    /* renamed from: j */
    public CancellationException mo14881j() {
        CancellationException cancellationExceptionM16314d;
        Object objM16276X = m16276X();
        if (objM16276X instanceof C9150c) {
            cancellationExceptionM16314d = ((C9150c) objM16276X).m16314d();
        } else if (objM16276X instanceof C8884w) {
            cancellationExceptionM16314d = ((C8884w) objM16276X).f16545a;
        } else {
            if (objM16276X instanceof InterfaceC8882v0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM16276X).toString());
            }
            cancellationExceptionM16314d = null;
        }
        CancellationException cancellationException = cancellationExceptionM16314d instanceof CancellationException ? cancellationExceptionM16314d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m16303x0(objM16276X), cancellationExceptionM16314d, this);
    }

    /* renamed from: j0 */
    public final Object m16286j0(Object obj) {
        Object objM16258D0;
        do {
            objM16258D0 = m16258D0(m16276X(), obj);
            if (objM16258D0 == AbstractC8832e1.f16502a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m16272R(obj));
            }
        } while (objM16258D0 == AbstractC8832e1.f16504c);
        return objM16258D0;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: k */
    public final InterfaceC8849k0 mo16287k(InterfaceC10570l interfaceC10570l) {
        return m16280d0(false, true, new InterfaceC9211m.a(interfaceC10570l));
    }

    /* renamed from: k0 */
    public final AbstractC8829d1 m16288k0(InterfaceC9211m interfaceC9211m, boolean z10) {
        AbstractC8829d1 c8891y0;
        if (z10) {
            c8891y0 = interfaceC9211m instanceof AbstractC8894z0 ? (AbstractC8894z0) interfaceC9211m : null;
            if (c8891y0 == null) {
                c8891y0 = new C8888x0(interfaceC9211m);
            }
        } else {
            c8891y0 = interfaceC9211m instanceof AbstractC8829d1 ? (AbstractC8829d1) interfaceC9211m : null;
            if (c8891y0 == null) {
                c8891y0 = new C8891y0(interfaceC9211m);
            }
        }
        c8891y0.m14830u(this);
        return c8891y0;
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: l */
    public final boolean mo16289l() {
        return !(m16276X() instanceof InterfaceC8882v0);
    }

    /* renamed from: l0 */
    public String mo14929l0() {
        return AbstractC8825c0.m14820a(this);
    }

    /* renamed from: m0 */
    public final C8863p m16290m0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo16736o()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m16735k();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m16734j();
            if (!lockFreeLinkedListNode.mo16736o()) {
                if (lockFreeLinkedListNode instanceof C8863p) {
                    return (C8863p) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof C8844i1) {
                    return null;
                }
            }
        }
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return InterfaceC9212n.a.m16780d(this, cVar);
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: n */
    public final Object mo16291n(InterfaceC9324c interfaceC9324c) {
        if (m16282f0()) {
            Object objM16283g0 = m16283g0(interfaceC9324c);
            return objM16283g0 == AbstractC9434a.m17291f() ? objM16283g0 : C8736p.f16368a;
        }
        AbstractC8823b1.m14814j(interfaceC9324c.getContext());
        return C8736p.f16368a;
    }

    /* renamed from: n0 */
    public final void m16292n0(C8844i1 c8844i1, Throwable th) throws Throwable {
        m16295p0(th);
        Object objM16733i = c8844i1.m16733i();
        AbstractC9133u.m16131e(objM16733i, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM16734j = (LockFreeLinkedListNode) objM16733i; !AbstractC9133u.m16128b(lockFreeLinkedListNodeM16734j, c8844i1); lockFreeLinkedListNodeM16734j = lockFreeLinkedListNodeM16734j.m16734j()) {
            if (lockFreeLinkedListNodeM16734j instanceof AbstractC8894z0) {
                AbstractC8829d1 abstractC8829d1 = (AbstractC8829d1) lockFreeLinkedListNodeM16734j;
                try {
                    abstractC8829d1.mo14884a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC8722b.m14228a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC8829d1 + " for " + this, th2);
                        C8736p c8736p = C8736p.f16368a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo16277b0(completionHandlerException);
        }
        m16264I(th);
    }

    /* renamed from: o0 */
    public final void m16293o0(C8844i1 c8844i1, Throwable th) throws Throwable {
        Object objM16733i = c8844i1.m16733i();
        AbstractC9133u.m16131e(objM16733i, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM16734j = (LockFreeLinkedListNode) objM16733i; !AbstractC9133u.m16128b(lockFreeLinkedListNodeM16734j, c8844i1); lockFreeLinkedListNodeM16734j = lockFreeLinkedListNodeM16734j.m16734j()) {
            if (lockFreeLinkedListNodeM16734j instanceof AbstractC8829d1) {
                AbstractC8829d1 abstractC8829d1 = (AbstractC8829d1) lockFreeLinkedListNodeM16734j;
                try {
                    abstractC8829d1.mo14884a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC8722b.m14228a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + abstractC8829d1 + " for " + this, th2);
                        C8736p c8736p = C8736p.f16368a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo16277b0(completionHandlerException);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: p */
    public final InterfaceC8849k0 mo16294p(boolean z10, boolean z11, InterfaceC10570l interfaceC10570l) {
        return m16280d0(z10, z11, new InterfaceC9211m.a(interfaceC10570l));
    }

    /* renamed from: p0 */
    public void m16295p0(Throwable th) {
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return InterfaceC9212n.a.m16781e(this, interfaceC9100d);
    }

    /* renamed from: q0 */
    public void mo16296q0(Object obj) {
    }

    /* renamed from: r0 */
    public void mo14850r0() {
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    /* renamed from: s */
    public final InterfaceC8860o mo16297s(InterfaceC8866q interfaceC8866q) {
        InterfaceC8849k0 interfaceC8849k0M16244m = JobKt__JobKt.m16244m(this, true, false, new C8863p(interfaceC8866q), 2, null);
        AbstractC9133u.m16131e(interfaceC8849k0M16244m, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC8860o) interfaceC8849k0M16244m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [i8.u0] */
    /* renamed from: s0 */
    public final void m16298s0(C8858n0 c8858n0) {
        C8844i1 c8844i1 = new C8844i1();
        if (!c8858n0.isActive()) {
            c8844i1 = new C8879u0(c8844i1);
        }
        AbstractC3193a.m1318a(f17564a, this, c8858n0, c8844i1);
    }

    @Override // kotlinx.coroutines.InterfaceC9212n
    public final boolean start() {
        int iM16302w0;
        do {
            iM16302w0 = m16302w0(m16276X());
            if (iM16302w0 == 0) {
                return false;
            }
        } while (iM16302w0 != 1);
        return true;
    }

    /* renamed from: t0 */
    public final void m16299t0(AbstractC8829d1 abstractC8829d1) {
        abstractC8829d1.m16729e(new C8844i1());
        AbstractC3193a.m1318a(f17564a, this, abstractC8829d1, abstractC8829d1.m16734j());
    }

    public String toString() {
        return m16253A0() + '@' + AbstractC8825c0.m14821b(this);
    }

    /* renamed from: u0 */
    public final void m16300u0(AbstractC8829d1 abstractC8829d1) {
        Object objM16276X;
        do {
            objM16276X = m16276X();
            if (!(objM16276X instanceof AbstractC8829d1)) {
                if (!(objM16276X instanceof InterfaceC8882v0) || ((InterfaceC8882v0) objM16276X).getList() == null) {
                    return;
                }
                abstractC8829d1.m16737p();
                return;
            }
            if (objM16276X != abstractC8829d1) {
                return;
            }
        } while (!AbstractC3193a.m1318a(f17564a, this, objM16276X, AbstractC8832e1.f16508g));
    }

    /* renamed from: v0 */
    public final void m16301v0(InterfaceC8860o interfaceC8860o) {
        f17565b.set(this, interfaceC8860o);
    }

    /* renamed from: w0 */
    public final int m16302w0(Object obj) {
        if (obj instanceof C8858n0) {
            if (((C8858n0) obj).isActive()) {
                return 0;
            }
            if (!AbstractC3193a.m1318a(f17564a, this, obj, AbstractC8832e1.f16508g)) {
                return -1;
            }
            mo14850r0();
            return 1;
        }
        if (!(obj instanceof C8879u0)) {
            return 0;
        }
        if (!AbstractC3193a.m1318a(f17564a, this, obj, ((C8879u0) obj).getList())) {
            return -1;
        }
        mo14850r0();
        return 1;
    }

    /* renamed from: x0 */
    public final String m16303x0(Object obj) {
        if (!(obj instanceof C9150c)) {
            return obj instanceof InterfaceC8882v0 ? ((InterfaceC8882v0) obj).isActive() ? "Active" : "New" : obj instanceof C8884w ? "Cancelled" : "Completed";
        }
        C9150c c9150c = (C9150c) obj;
        return c9150c.m16315h() ? "Cancelling" : c9150c.m16316i() ? "Completing" : "Active";
    }

    /* renamed from: y0 */
    public final CancellationException m16304y0(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = mo16265J();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    /* renamed from: z */
    public final boolean m16305z(Object obj, C8844i1 c8844i1, AbstractC8829d1 abstractC8829d1) {
        int iM16740s;
        C9151d c9151d = new C9151d(abstractC8829d1, this, obj);
        do {
            iM16740s = c8844i1.m16735k().m16740s(abstractC8829d1, c8844i1, c9151d);
            if (iM16740s == 1) {
                return true;
            }
        } while (iM16740s != 2);
        return false;
    }

    /* renamed from: b0 */
    public void mo16277b0(Throwable th) throws Throwable {
        throw th;
    }
}

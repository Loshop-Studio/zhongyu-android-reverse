package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.InterfaceC9996b;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11828c;
import p410xd.AbstractC11875z;
import p410xd.C11839c0;
import p410xd.C11848h;
import sd.AbstractC11106e0;
import sd.AbstractC11114g0;
import sd.AbstractC11126j0;
import sd.AbstractC11133l;
import sd.AbstractC11137m;
import sd.AbstractC11150p0;
import sd.AbstractC11177y;
import sd.C11097c;
import sd.C11141n;
import sd.C11145o;
import sd.C11170v1;
import sd.C11171w;
import sd.C11174x;
import sd.InterfaceC11125j;
import sd.InterfaceC11144n2;
import sd.InterfaceC11163t0;
import sd.InterfaceC11173w1;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes6.dex */
public class C9997c extends AbstractC10008f implements InterfaceC11125j, InterfaceC11828c, InterfaceC11144n2 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23514h = AtomicIntegerFieldUpdater.newUpdater(C9997c.class, "_decisionAndIndex$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23515i = AtomicReferenceFieldUpdater.newUpdater(C9997c.class, Object.class, "_state$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23516j = AtomicReferenceFieldUpdater.newUpdater(C9997c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: f */
    public final InterfaceC11588c f23517f;

    /* renamed from: g */
    public final InterfaceC9945d f23518g;

    public C9997c(InterfaceC11588c interfaceC11588c, int i10) {
        super(i10);
        this.f23517f = interfaceC11588c;
        this.f23518g = interfaceC11588c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C11097c.f26774c;
    }

    /* renamed from: Q */
    public static final C10786q m20498Q(InterfaceC9540l interfaceC9540l, Throwable th, Object obj, InterfaceC9945d interfaceC9945d) {
        interfaceC9540l.invoke(th);
        return C10786q.f26013a;
    }

    /* renamed from: S */
    public static /* synthetic */ void m20499S(C9997c c9997c, Object obj, int i10, InterfaceC9545q interfaceC9545q, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC9545q = null;
        }
        c9997c.m20513R(obj, i10, interfaceC9545q);
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: C */
    public void mo20501C(AbstractC11106e0 abstractC11106e0, Object obj) {
        InterfaceC11588c interfaceC11588c = this.f23517f;
        C11848h c11848h = interfaceC11588c instanceof C11848h ? (C11848h) interfaceC11588c : null;
        m20499S(this, obj, (c11848h != null ? c11848h.f28087f : null) == abstractC11106e0 ? 4 : this.f23590e, null, 4, null);
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: D */
    public void mo20502D(Object obj) {
        m20535t(this.f23590e);
    }

    /* renamed from: F */
    public void m20503F() {
        InterfaceC11163t0 interfaceC11163t0M20504G = m20504G();
        if (interfaceC11163t0M20504G != null && m20507J()) {
            interfaceC11163t0M20504G.dispose();
            f23516j.set(this, C11170v1.f26829c);
        }
    }

    /* renamed from: G */
    public final InterfaceC11163t0 m20504G() {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) getContext().get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g == null) {
            return null;
        }
        InterfaceC11163t0 interfaceC11163t0M20396m = JobKt__JobKt.m20396m(interfaceC10045g, false, new C11145o(this), 1, null);
        AbstractC3223a.m1395a(f23516j, this, null, interfaceC11163t0M20396m);
        return interfaceC11163t0M20396m;
    }

    /* renamed from: H */
    public final void m20505H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23515i;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C11097c) {
                if (AbstractC3223a.m1395a(f23515i, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC9996b) || (obj2 instanceof AbstractC11875z)) {
                m20509L(obj, obj2);
            } else {
                if (obj2 instanceof C11174x) {
                    C11174x c11174x = (C11174x) obj2;
                    if (!c11174x.m24815c()) {
                        m20509L(obj, obj2);
                    }
                    if (obj2 instanceof C11141n) {
                        if (obj2 == null) {
                            c11174x = null;
                        }
                        Throwable th = c11174x != null ? c11174x.f26837a : null;
                        if (obj instanceof InterfaceC9996b) {
                            m20527l((InterfaceC9996b) obj, th);
                            return;
                        } else {
                            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m20529n((AbstractC11875z) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof C11171w) {
                    C11171w c11171w = (C11171w) obj2;
                    if (c11171w.f26831b != null) {
                        m20509L(obj, obj2);
                    }
                    if (obj instanceof AbstractC11875z) {
                        return;
                    }
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC9996b interfaceC9996b = (InterfaceC9996b) obj;
                    if (c11171w.m24811c()) {
                        m20527l(interfaceC9996b, c11171w.f26834e);
                        return;
                    } else {
                        if (AbstractC3223a.m1395a(f23515i, this, obj2, C11171w.m24809b(c11171w, null, interfaceC9996b, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof AbstractC11875z) {
                        return;
                    }
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (AbstractC3223a.m1395a(f23515i, this, obj2, new C11171w(obj2, (InterfaceC9996b) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final void m20506I(InterfaceC9996b interfaceC9996b) {
        m20505H(interfaceC9996b);
    }

    /* renamed from: J */
    public boolean m20507J() {
        return !(m20539y() instanceof InterfaceC11173w1);
    }

    /* renamed from: K */
    public final boolean m20508K() {
        if (!AbstractC11150p0.m24784c(this.f23590e)) {
            return false;
        }
        InterfaceC11588c interfaceC11588c = this.f23517f;
        AbstractC9979u.m20292e(interfaceC11588c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C11848h) interfaceC11588c).m26273p();
    }

    /* renamed from: L */
    public final void m20509L(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: M */
    public String mo20466M() {
        return "CancellableContinuation";
    }

    /* renamed from: N */
    public final void m20510N(Throwable th) {
        if (m20531p(th)) {
            return;
        }
        mo20530o(th);
        m20534s();
    }

    /* renamed from: O */
    public final void m20511O() {
        Throwable thM26276t;
        InterfaceC11588c interfaceC11588c = this.f23517f;
        C11848h c11848h = interfaceC11588c instanceof C11848h ? (C11848h) interfaceC11588c : null;
        if (c11848h == null || (thM26276t = c11848h.m26276t(this)) == null) {
            return;
        }
        m20532q();
        mo20530o(thM26276t);
    }

    /* renamed from: P */
    public final boolean m20512P() {
        Object obj = f23515i.get(this);
        if ((obj instanceof C11171w) && ((C11171w) obj).f26833d != null) {
            m20532q();
            return false;
        }
        f23514h.set(this, 536870911);
        f23515i.set(this, C11097c.f26774c);
        return true;
    }

    /* renamed from: R */
    public final void m20513R(Object obj, int i10, InterfaceC9545q interfaceC9545q) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23515i;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC11173w1)) {
                Object obj3 = obj;
                InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
                if (obj2 instanceof C11141n) {
                    C11141n c11141n = (C11141n) obj2;
                    if (c11141n.m24762e()) {
                        if (interfaceC9545q2 != null) {
                            m20528m(interfaceC9545q2, c11141n.f26837a, obj3);
                            return;
                        }
                        return;
                    }
                }
                m20525j(obj3);
                throw new KotlinNothingValueException();
            }
            Object obj4 = obj;
            int i11 = i10;
            InterfaceC9545q interfaceC9545q3 = interfaceC9545q;
            if (AbstractC3223a.m1395a(f23515i, this, obj2, m20514T((InterfaceC11173w1) obj2, obj4, i11, interfaceC9545q3, null))) {
                m20534s();
                m20535t(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                interfaceC9545q = interfaceC9545q3;
            }
        }
    }

    /* renamed from: T */
    public final Object m20514T(InterfaceC11173w1 interfaceC11173w1, Object obj, int i10, InterfaceC9545q interfaceC9545q, Object obj2) {
        if (obj instanceof C11174x) {
            return obj;
        }
        if ((AbstractC11150p0.m24783b(i10) || obj2 != null) && !(interfaceC9545q == null && !(interfaceC11173w1 instanceof InterfaceC9996b) && obj2 == null)) {
            return new C11171w(obj, interfaceC11173w1 instanceof InterfaceC9996b ? (InterfaceC9996b) interfaceC11173w1 : null, interfaceC9545q, obj2, null, 16, null);
        }
        return obj;
    }

    /* renamed from: U */
    public final boolean m20515U() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23514h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f23514h.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    /* renamed from: V */
    public final C11839c0 m20516V(Object obj, Object obj2, InterfaceC9545q interfaceC9545q) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23515i;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC11173w1)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C11171w) && obj4 != null && ((C11171w) obj3).f26833d == obj4) {
                    return AbstractC11133l.f26798a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            InterfaceC9545q interfaceC9545q2 = interfaceC9545q;
            if (AbstractC3223a.m1395a(f23515i, this, obj3, m20514T((InterfaceC11173w1) obj3, obj5, this.f23590e, interfaceC9545q2, obj6))) {
                m20534s();
                return AbstractC11133l.f26798a;
            }
            obj = obj5;
            interfaceC9545q = interfaceC9545q2;
            obj2 = obj6;
        }
    }

    /* renamed from: W */
    public final boolean m20517W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23514h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f23514h.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: a */
    public void mo20518a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23515i;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC11173w1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C11174x) {
                return;
            }
            if (obj2 instanceof C11171w) {
                C11171w c11171w = (C11171w) obj2;
                if (c11171w.m24811c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC3223a.m1395a(f23515i, this, obj2, C11171w.m24809b(c11171w, null, null, null, null, th3, 15, null))) {
                    c11171w.m24812d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC3223a.m1395a(f23515i, this, obj2, new C11171w(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: b */
    public final InterfaceC11588c mo20519b() {
        return this.f23517f;
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: c */
    public void mo20520c(Object obj, final InterfaceC9540l interfaceC9540l) {
        m20513R(obj, this.f23590e, interfaceC9540l != null ? new InterfaceC9545q() { // from class: sd.k
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return C9997c.m20498Q(interfaceC9540l, (Throwable) obj2, obj3, (InterfaceC9945d) obj4);
            }
        } : null);
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: d */
    public Throwable mo20521d(Object obj) {
        Throwable thMo20521d = super.mo20521d(obj);
        if (thMo20521d != null) {
            return thMo20521d;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: e */
    public Object mo20522e(Object obj) {
        return obj instanceof C11171w ? ((C11171w) obj).f26830a : obj;
    }

    @Override // sd.InterfaceC11144n2
    /* renamed from: f */
    public void mo20523f(AbstractC11875z abstractC11875z, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23514h;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        m20505H(abstractC11875z);
    }

    @Override // p409xc.InterfaceC11828c
    public InterfaceC11828c getCallerFrame() {
        InterfaceC11588c interfaceC11588c = this.f23517f;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        return this.f23518g;
    }

    @Override // kotlinx.coroutines.AbstractC10008f
    /* renamed from: h */
    public Object mo20524h() {
        return m20539y();
    }

    @Override // sd.InterfaceC11125j
    public boolean isActive() {
        return m20539y() instanceof InterfaceC11173w1;
    }

    /* renamed from: j */
    public final Void m20525j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: k */
    public void mo20526k(Object obj, InterfaceC9545q interfaceC9545q) {
        m20513R(obj, this.f23590e, interfaceC9545q);
    }

    /* renamed from: l */
    public final void m20527l(InterfaceC9996b interfaceC9996b, Throwable th) {
        try {
            interfaceC9996b.mo20494a(th);
        } catch (Throwable th2) {
            AbstractC11114g0.m24718a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public final void m20528m(InterfaceC9545q interfaceC9545q, Throwable th, Object obj) {
        try {
            interfaceC9545q.invoke(th, obj, getContext());
        } catch (Throwable th2) {
            AbstractC11114g0.m24718a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public final void m20529n(AbstractC11875z abstractC11875z, Throwable th) {
        int i10 = f23514h.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC11875z.mo2761s(i10, th, getContext());
        } catch (Throwable th2) {
            AbstractC11114g0.m24718a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: o */
    public boolean mo20530o(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23515i;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC11173w1)) {
                return false;
            }
        } while (!AbstractC3223a.m1395a(f23515i, this, obj, new C11141n(this, th, (obj instanceof InterfaceC9996b) || (obj instanceof AbstractC11875z))));
        InterfaceC11173w1 interfaceC11173w1 = (InterfaceC11173w1) obj;
        if (interfaceC11173w1 instanceof InterfaceC9996b) {
            m20527l((InterfaceC9996b) obj, th);
        } else if (interfaceC11173w1 instanceof AbstractC11875z) {
            m20529n((AbstractC11875z) obj, th);
        }
        m20534s();
        m20535t(this.f23590e);
        return true;
    }

    /* renamed from: p */
    public final boolean m20531p(Throwable th) {
        if (!m20508K()) {
            return false;
        }
        InterfaceC11588c interfaceC11588c = this.f23517f;
        AbstractC9979u.m20292e(interfaceC11588c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C11848h) interfaceC11588c).m26274q(th);
    }

    /* renamed from: q */
    public final void m20532q() {
        InterfaceC11163t0 interfaceC11163t0M20537w = m20537w();
        if (interfaceC11163t0M20537w == null) {
            return;
        }
        interfaceC11163t0M20537w.dispose();
        f23516j.set(this, C11170v1.f26829c);
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: r */
    public Object mo20533r(Object obj, Object obj2, InterfaceC9545q interfaceC9545q) {
        return m20516V(obj, obj2, interfaceC9545q);
    }

    @Override // vc.InterfaceC11588c
    public void resumeWith(Object obj) {
        m20499S(this, AbstractC11177y.m24830c(obj, this), this.f23590e, null, 4, null);
    }

    /* renamed from: s */
    public final void m20534s() {
        if (m20508K()) {
            return;
        }
        m20532q();
    }

    /* renamed from: t */
    public final void m20535t(int i10) {
        if (m20515U()) {
            return;
        }
        AbstractC11150p0.m24782a(this, i10);
    }

    public String toString() {
        return mo20466M() + '(' + AbstractC11126j0.m24740c(this.f23517f) + "){" + m20540z() + "}@" + AbstractC11126j0.m24739b(this);
    }

    @Override // sd.InterfaceC11125j
    /* renamed from: u */
    public void mo20536u(InterfaceC9540l interfaceC9540l) {
        AbstractC11137m.m24758c(this, new InterfaceC9996b.a(interfaceC9540l));
    }

    /* renamed from: v */
    public Throwable mo20467v(InterfaceC10045g interfaceC10045g) {
        return interfaceC10045g.mo20438g();
    }

    /* renamed from: w */
    public final InterfaceC11163t0 m20537w() {
        return (InterfaceC11163t0) f23516j.get(this);
    }

    /* renamed from: x */
    public final Object m20538x() {
        InterfaceC10045g interfaceC10045g;
        boolean zM20508K = m20508K();
        if (m20517W()) {
            if (m20537w() == null) {
                m20504G();
            }
            if (zM20508K) {
                m20511O();
            }
            return AbstractC11725a.m25952f();
        }
        if (zM20508K) {
            m20511O();
        }
        Object objM20539y = m20539y();
        if (objM20539y instanceof C11174x) {
            throw ((C11174x) objM20539y).f26837a;
        }
        if (!AbstractC11150p0.m24783b(this.f23590e) || (interfaceC10045g = (InterfaceC10045g) getContext().get(InterfaceC10045g.f23976b0)) == null || interfaceC10045g.isActive()) {
            return mo20522e(objM20539y);
        }
        CancellationException cancellationExceptionMo20438g = interfaceC10045g.mo20438g();
        mo20518a(objM20539y, cancellationExceptionMo20438g);
        throw cancellationExceptionMo20438g;
    }

    /* renamed from: y */
    public final Object m20539y() {
        return f23515i.get(this);
    }

    /* renamed from: z */
    public final String m20540z() {
        Object objM20539y = m20539y();
        return objM20539y instanceof InterfaceC11173w1 ? "Active" : objM20539y instanceof C11141n ? "Cancelled" : "Completed";
    }
}

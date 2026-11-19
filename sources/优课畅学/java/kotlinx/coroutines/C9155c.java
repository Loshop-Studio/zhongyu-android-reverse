package kotlinx.coroutines;

import androidx.concurrent.futures.AbstractC3193a;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9154b;
import p135i8.AbstractC8818a0;
import p135i8.AbstractC8825c0;
import p135i8.AbstractC8837g0;
import p135i8.AbstractC8848k;
import p135i8.AbstractC8851l;
import p135i8.AbstractC8890y;
import p135i8.C8824c;
import p135i8.C8847j1;
import p135i8.C8854m;
import p135i8.C8857n;
import p135i8.C8881v;
import p135i8.C8884w;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;
import p135i8.InterfaceC8850k1;
import p135i8.InterfaceC8895z1;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9436a0;
import p191n8.C9442d0;
import p191n8.C9453j;
import p201o7.InterfaceC9538c;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes5.dex */
public class C9155c extends AbstractC9205i implements InterfaceC8845j, InterfaceC9538c, InterfaceC8895z1 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17598f = AtomicIntegerFieldUpdater.newUpdater(C9155c.class, "_decisionAndIndex$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17599g = AtomicReferenceFieldUpdater.newUpdater(C9155c.class, Object.class, "_state$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17600h = AtomicReferenceFieldUpdater.newUpdater(C9155c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public final InterfaceC9324c f17601d;

    /* renamed from: e */
    public final InterfaceC9100d f17602e;

    public C9155c(InterfaceC9324c interfaceC9324c, int i10) {
        super(i10);
        this.f17601d = interfaceC9324c;
        this.f17602e = interfaceC9324c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C8824c.f16495a;
    }

    /* renamed from: P */
    public static /* synthetic */ void m16342P(C9155c c9155c, Object obj, int i10, InterfaceC10570l interfaceC10570l, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        c9155c.m16353O(obj, i10, interfaceC10570l);
    }

    /* renamed from: D */
    public void m16343D() {
        InterfaceC8849k0 interfaceC8849k0M16344E = m16344E();
        if (interfaceC8849k0M16344E != null && m16347H()) {
            interfaceC8849k0M16344E.dispose();
            f17600h.set(this, C8847j1.f16518a);
        }
    }

    /* renamed from: E */
    public final InterfaceC8849k0 m16344E() {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) getContext().get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n == null) {
            return null;
        }
        InterfaceC8849k0 interfaceC8849k0M16244m = JobKt__JobKt.m16244m(interfaceC9212n, true, false, new C8857n(this), 2, null);
        AbstractC3193a.m1318a(f17600h, this, null, interfaceC8849k0M16244m);
        return interfaceC8849k0M16244m;
    }

    /* renamed from: F */
    public final void m16345F(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17599g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C8824c)) {
                if (obj2 instanceof InterfaceC9154b ? true : obj2 instanceof AbstractC9436a0) {
                    m16349J(obj, obj2);
                } else {
                    if (obj2 instanceof C8884w) {
                        C8884w c8884w = (C8884w) obj2;
                        if (!c8884w.m14928c()) {
                            m16349J(obj, obj2);
                        }
                        if (obj2 instanceof C8854m) {
                            if (obj2 == null) {
                                c8884w = null;
                            }
                            Throwable th = c8884w != null ? c8884w.f16545a : null;
                            if (obj instanceof InterfaceC9154b) {
                                m16364k((InterfaceC9154b) obj, th);
                                return;
                            } else {
                                AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m16366m((AbstractC9436a0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C8881v) {
                        C8881v c8881v = (C8881v) obj2;
                        if (c8881v.f16538b != null) {
                            m16349J(obj, obj2);
                        }
                        if (obj instanceof AbstractC9436a0) {
                            return;
                        }
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        InterfaceC9154b interfaceC9154b = (InterfaceC9154b) obj;
                        if (c8881v.m14920c()) {
                            m16364k(interfaceC9154b, c8881v.f16541e);
                            return;
                        } else {
                            if (AbstractC3193a.m1318a(f17599g, this, obj2, C8881v.m14918b(c8881v, null, interfaceC9154b, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC9436a0) {
                            return;
                        }
                        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (AbstractC3193a.m1318a(f17599g, this, obj2, new C8881v(obj2, (InterfaceC9154b) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (AbstractC3193a.m1318a(f17599g, this, obj2, obj)) {
                return;
            }
        }
    }

    /* renamed from: G */
    public final void m16346G(InterfaceC9154b interfaceC9154b) {
        m16345F(interfaceC9154b);
    }

    /* renamed from: H */
    public boolean m16347H() {
        return !(m16373y() instanceof InterfaceC8850k1);
    }

    /* renamed from: I */
    public final boolean m16348I() {
        if (!AbstractC8837g0.m14855c(this.f18067c)) {
            return false;
        }
        InterfaceC9324c interfaceC9324c = this.f17601d;
        AbstractC9133u.m16131e(interfaceC9324c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C9453j) interfaceC9324c).m17347o();
    }

    /* renamed from: J */
    public final void m16349J(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: K */
    public String mo16306K() {
        return "CancellableContinuation";
    }

    /* renamed from: L */
    public final void m16350L(Throwable th) {
        if (m16367n(th)) {
            return;
        }
        mo14871i(th);
        m16369p();
    }

    /* renamed from: M */
    public final void m16351M() {
        Throwable thM17350u;
        InterfaceC9324c interfaceC9324c = this.f17601d;
        C9453j c9453j = interfaceC9324c instanceof C9453j ? (C9453j) interfaceC9324c : null;
        if (c9453j == null || (thM17350u = c9453j.m17350u(this)) == null) {
            return;
        }
        m16368o();
        mo14871i(thM17350u);
    }

    /* renamed from: N */
    public final boolean m16352N() {
        Object obj = f17599g.get(this);
        if ((obj instanceof C8881v) && ((C8881v) obj).f16540d != null) {
            m16368o();
            return false;
        }
        f17598f.set(this, 536870911);
        f17599g.set(this, C8824c.f16495a);
        return true;
    }

    /* renamed from: O */
    public final void m16353O(Object obj, int i10, InterfaceC10570l interfaceC10570l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17599g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC8850k1)) {
                Object obj3 = obj;
                InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
                if (obj2 instanceof C8854m) {
                    C8854m c8854m = (C8854m) obj2;
                    if (c8854m.m14883e()) {
                        if (interfaceC10570l2 != null) {
                            m16365l(interfaceC10570l2, c8854m.f16545a);
                            return;
                        }
                        return;
                    }
                }
                m16363j(obj3);
                throw new KotlinNothingValueException();
            }
            Object obj4 = obj;
            int i11 = i10;
            InterfaceC10570l interfaceC10570l3 = interfaceC10570l;
            if (AbstractC3193a.m1318a(f17599g, this, obj2, m16354Q((InterfaceC8850k1) obj2, obj4, i11, interfaceC10570l3, null))) {
                m16369p();
                m16370s(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                interfaceC10570l = interfaceC10570l3;
            }
        }
    }

    /* renamed from: Q */
    public final Object m16354Q(InterfaceC8850k1 interfaceC8850k1, Object obj, int i10, InterfaceC10570l interfaceC10570l, Object obj2) {
        if (obj instanceof C8884w) {
            return obj;
        }
        if ((AbstractC8837g0.m14854b(i10) || obj2 != null) && !(interfaceC10570l == null && !(interfaceC8850k1 instanceof InterfaceC9154b) && obj2 == null)) {
            return new C8881v(obj, interfaceC8850k1 instanceof InterfaceC9154b ? (InterfaceC9154b) interfaceC8850k1 : null, interfaceC10570l, obj2, null, 16, null);
        }
        return obj;
    }

    /* renamed from: R */
    public final boolean m16355R() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17598f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f17598f.compareAndSet(this, i10, BasicMeasure.EXACTLY + (536870911 & i10)));
        return true;
    }

    /* renamed from: S */
    public final C9442d0 m16356S(Object obj, Object obj2, InterfaceC10570l interfaceC10570l) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17599g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC8850k1)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C8881v) && obj4 != null && ((C8881v) obj3).f16540d == obj4) {
                    return AbstractC8848k.f16519a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
            if (AbstractC3193a.m1318a(f17599g, this, obj3, m16354Q((InterfaceC8850k1) obj3, obj5, this.f18067c, interfaceC10570l2, obj6))) {
                m16369p();
                return AbstractC8848k.f16519a;
            }
            obj = obj5;
            interfaceC10570l = interfaceC10570l2;
            obj2 = obj6;
        }
    }

    /* renamed from: T */
    public final boolean m16357T() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17598f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f17598f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: a */
    public void mo16358a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17599g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC8850k1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C8884w) {
                return;
            }
            if (obj2 instanceof C8881v) {
                C8881v c8881v = (C8881v) obj2;
                if (c8881v.m14920c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC3193a.m1318a(f17599g, this, obj2, C8881v.m14918b(c8881v, null, null, null, null, th3, 15, null))) {
                    c8881v.m14921d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC3193a.m1318a(f17599g, this, obj2, new C8881v(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: b */
    public final InterfaceC9324c mo16359b() {
        return this.f17601d;
    }

    @Override // p135i8.InterfaceC8895z1
    /* renamed from: c */
    public void mo14938c(AbstractC9436a0 abstractC9436a0, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17598f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        m16345F(abstractC9436a0);
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: d */
    public Throwable mo16360d(Object obj) {
        Throwable thMo16360d = super.mo16360d(obj);
        if (thMo16360d != null) {
            return thMo16360d;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: e */
    public Object mo16361e(Object obj) {
        return obj instanceof C8881v ? ((C8881v) obj).f16537a : obj;
    }

    @Override // p135i8.InterfaceC8845j
    /* renamed from: g */
    public void mo14870g(Object obj, InterfaceC10570l interfaceC10570l) {
        m16353O(obj, this.f18067c, interfaceC10570l);
    }

    @Override // p201o7.InterfaceC9538c
    public InterfaceC9538c getCallerFrame() {
        InterfaceC9324c interfaceC9324c = this.f17601d;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        return this.f17602e;
    }

    @Override // kotlinx.coroutines.AbstractC9205i
    /* renamed from: h */
    public Object mo16362h() {
        return m16373y();
    }

    @Override // p135i8.InterfaceC8845j
    /* renamed from: i */
    public boolean mo14871i(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17599g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC8850k1)) {
                return false;
            }
        } while (!AbstractC3193a.m1318a(f17599g, this, obj, new C8854m(this, th, (obj instanceof InterfaceC9154b) || (obj instanceof AbstractC9436a0))));
        InterfaceC8850k1 interfaceC8850k1 = (InterfaceC8850k1) obj;
        if (interfaceC8850k1 instanceof InterfaceC9154b) {
            m16364k((InterfaceC9154b) obj, th);
        } else if (interfaceC8850k1 instanceof AbstractC9436a0) {
            m16366m((AbstractC9436a0) obj, th);
        }
        m16369p();
        m16370s(this.f18067c);
        return true;
    }

    @Override // p135i8.InterfaceC8845j
    public boolean isActive() {
        return m16373y() instanceof InterfaceC8850k1;
    }

    /* renamed from: j */
    public final Void m16363j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: k */
    public final void m16364k(InterfaceC9154b interfaceC9154b, Throwable th) {
        try {
            interfaceC9154b.mo14865a(th);
        } catch (Throwable th2) {
            AbstractC8818a0.m14797a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void m16365l(InterfaceC10570l interfaceC10570l, Throwable th) {
        try {
            interfaceC10570l.invoke(th);
        } catch (Throwable th2) {
            AbstractC8818a0.m14797a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public final void m16366m(AbstractC9436a0 abstractC9436a0, Throwable th) {
        int i10 = f17598f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC9436a0.mo15890s(i10, th, getContext());
        } catch (Throwable th2) {
            AbstractC8818a0.m14797a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public final boolean m16367n(Throwable th) {
        if (!m16348I()) {
            return false;
        }
        InterfaceC9324c interfaceC9324c = this.f17601d;
        AbstractC9133u.m16131e(interfaceC9324c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C9453j) interfaceC9324c).m17348p(th);
    }

    /* renamed from: o */
    public final void m16368o() {
        InterfaceC8849k0 interfaceC8849k0M16371v = m16371v();
        if (interfaceC8849k0M16371v == null) {
            return;
        }
        interfaceC8849k0M16371v.dispose();
        f17600h.set(this, C8847j1.f16518a);
    }

    /* renamed from: p */
    public final void m16369p() {
        if (m16348I()) {
            return;
        }
        m16368o();
    }

    @Override // p135i8.InterfaceC8845j
    /* renamed from: q */
    public void mo14872q(CoroutineDispatcher coroutineDispatcher, Object obj) {
        InterfaceC9324c interfaceC9324c = this.f17601d;
        C9453j c9453j = interfaceC9324c instanceof C9453j ? (C9453j) interfaceC9324c : null;
        m16342P(this, obj, (c9453j != null ? c9453j.f18659d : null) == coroutineDispatcher ? 4 : this.f18067c, null, 4, null);
    }

    @Override // p135i8.InterfaceC8845j
    /* renamed from: r */
    public void mo14873r(InterfaceC10570l interfaceC10570l) {
        AbstractC8851l.m14880c(this, new InterfaceC9154b.a(interfaceC10570l));
    }

    @Override // p179m7.InterfaceC9324c
    public void resumeWith(Object obj) {
        m16342P(this, AbstractC8890y.m14935b(obj, this), this.f18067c, null, 4, null);
    }

    /* renamed from: s */
    public final void m16370s(int i10) {
        if (m16355R()) {
            return;
        }
        AbstractC8837g0.m14853a(this, i10);
    }

    @Override // p135i8.InterfaceC8845j
    /* renamed from: t */
    public Object mo14874t(Object obj, Object obj2, InterfaceC10570l interfaceC10570l) {
        return m16356S(obj, obj2, interfaceC10570l);
    }

    public String toString() {
        return mo16306K() + '(' + AbstractC8825c0.m14822c(this.f17601d) + "){" + m16374z() + "}@" + AbstractC8825c0.m14821b(this);
    }

    /* renamed from: u */
    public Throwable mo16307u(InterfaceC9212n interfaceC9212n) {
        return interfaceC9212n.mo16281e();
    }

    /* renamed from: v */
    public final InterfaceC8849k0 m16371v() {
        return (InterfaceC8849k0) f17600h.get(this);
    }

    @Override // p135i8.InterfaceC8845j
    /* renamed from: w */
    public void mo14875w(Object obj) {
        m16370s(this.f18067c);
    }

    /* renamed from: x */
    public final Object m16372x() {
        InterfaceC9212n interfaceC9212n;
        boolean zM16348I = m16348I();
        if (m16357T()) {
            if (m16371v() == null) {
                m16344E();
            }
            if (zM16348I) {
                m16351M();
            }
            return AbstractC9434a.m17291f();
        }
        if (zM16348I) {
            m16351M();
        }
        Object objM16373y = m16373y();
        if (objM16373y instanceof C8884w) {
            throw ((C8884w) objM16373y).f16545a;
        }
        if (!AbstractC8837g0.m14854b(this.f18067c) || (interfaceC9212n = (InterfaceC9212n) getContext().get(InterfaceC9212n.f18095c0)) == null || interfaceC9212n.isActive()) {
            return mo16361e(objM16373y);
        }
        CancellationException cancellationExceptionMo16281e = interfaceC9212n.mo16281e();
        mo16358a(objM16373y, cancellationExceptionMo16281e);
        throw cancellationExceptionMo16281e;
    }

    /* renamed from: y */
    public final Object m16373y() {
        return f17599g.get(this);
    }

    /* renamed from: z */
    public final String m16374z() {
        Object objM16373y = m16373y();
        return objM16373y instanceof InterfaceC8850k1 ? "Active" : objM16373y instanceof C8854m ? "Cancelled" : "Completed";
    }
}

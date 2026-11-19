package p087f3;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC2749e;
import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.C2790e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.InterfaceC2578m1;
import p128o2.C2911d;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3033d;
import p171x2.InterfaceC3470l;

/* renamed from: f3.m */
/* loaded from: classes.dex */
public class C2576m<T> extends AbstractC2599t0<T> implements InterfaceC2572l<T>, InterfaceC2749e {

    /* renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10261g = AtomicIntegerFieldUpdater.newUpdater(C2576m.class, "_decision");

    /* renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10262h = AtomicReferenceFieldUpdater.newUpdater(C2576m.class, Object.class, "_state");

    @NotNull
    private volatile /* synthetic */ int _decision;

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* renamed from: d */
    @NotNull
    private final InterfaceC3012d<T> f10263d;

    /* renamed from: e */
    @NotNull
    private final InterfaceC3015g f10264e;

    /* renamed from: f */
    @Nullable
    private InterfaceC2608w0 f10265f;

    /* JADX WARN: Multi-variable type inference failed */
    public C2576m(@NotNull InterfaceC3012d<? super T> interfaceC3012d, int i4) {
        super(i4);
        this.f10263d = interfaceC3012d;
        this.f10264e = interfaceC3012d.getContext();
        this._decision = 0;
        this._state = C2540d.f10230a;
    }

    /* renamed from: A */
    private final void m8594A(InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC3470l + ", already has " + obj).toString());
    }

    /* renamed from: D */
    private final void m8595D() {
        InterfaceC3012d<T> interfaceC3012d = this.f10263d;
        C2790e c2790e = interfaceC3012d instanceof C2790e ? (C2790e) interfaceC3012d : null;
        Throwable thM9287o = c2790e != null ? c2790e.m9287o(this) : null;
        if (thM9287o == null) {
            return;
        }
        m8619o();
        mo8589g(thM9287o);
    }

    /* renamed from: E */
    private final void m8596E(Object obj, int i4, InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof InterfaceC2531a2)) {
                if (obj2 instanceof C2583o) {
                    C2583o c2583o = (C2583o) obj2;
                    if (c2583o.m8641c()) {
                        if (interfaceC3470l == null) {
                            return;
                        }
                        m8618m(interfaceC3470l, c2583o.f10316a);
                        return;
                    }
                }
                m8601j(obj);
                throw new C2911d();
            }
        } while (!C0827b.m4278a(f10262h, this, obj2, m8598G((InterfaceC2531a2) obj2, obj, i4, interfaceC3470l, null)));
        m8604p();
        m8605q(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    static /* synthetic */ void m8597F(C2576m c2576m, Object obj, int i4, InterfaceC3470l interfaceC3470l, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i5 & 4) != 0) {
            interfaceC3470l = null;
        }
        c2576m.m8596E(obj, i4, interfaceC3470l);
    }

    /* renamed from: G */
    private final Object m8598G(InterfaceC2531a2 interfaceC2531a2, Object obj, int i4, InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, Object obj2) {
        if (obj instanceof C2613y) {
            return obj;
        }
        if (!C2602u0.m8729b(i4) && obj2 == null) {
            return obj;
        }
        if (interfaceC3470l == null && !(interfaceC2531a2 instanceof AbstractC2564j) && obj2 == null) {
            return obj;
        }
        return new C2610x(obj, interfaceC2531a2 instanceof AbstractC2564j ? (AbstractC2564j) interfaceC2531a2 : null, interfaceC3470l, obj2, null, 16, null);
    }

    /* renamed from: H */
    private final boolean m8599H() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f10261g.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: I */
    private final boolean m8600I() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f10261g.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: j */
    private final Void m8601j(Object obj) {
        throw new IllegalStateException(C2769l.m9248l("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: l */
    private final void m8602l(InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, Throwable th) {
        try {
            interfaceC3470l.invoke(th);
        } catch (Throwable th2) {
            C2553g0.m8561a(getContext(), new C2533b0(C2769l.m9248l("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: n */
    private final boolean m8603n(Throwable th) {
        if (m8608y()) {
            return ((C2790e) this.f10263d).m9285m(th);
        }
        return false;
    }

    /* renamed from: p */
    private final void m8604p() {
        if (m8608y()) {
            return;
        }
        m8619o();
    }

    /* renamed from: q */
    private final void m8605q(int i4) {
        if (m8599H()) {
            return;
        }
        C2602u0.m8728a(this, i4);
    }

    /* renamed from: u */
    private final String m8606u() {
        Object objM8622t = m8622t();
        return objM8622t instanceof InterfaceC2531a2 ? "Active" : objM8622t instanceof C2583o ? "Cancelled" : "Completed";
    }

    /* renamed from: w */
    private final InterfaceC2608w0 m8607w() {
        InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) getContext().get(InterfaceC2578m1.f10268P);
        if (interfaceC2578m1 == null) {
            return null;
        }
        InterfaceC2608w0 interfaceC2608w0M8636d = InterfaceC2578m1.a.m8636d(interfaceC2578m1, true, false, new C2586p(this), 2, null);
        this.f10265f = interfaceC2608w0M8636d;
        return interfaceC2608w0M8636d;
    }

    /* renamed from: y */
    private final boolean m8608y() {
        return C2602u0.m8730c(this.f10281c) && ((C2790e) this.f10263d).m9284l();
    }

    /* renamed from: z */
    private final AbstractC2564j m8609z(InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        return interfaceC3470l instanceof AbstractC2564j ? (AbstractC2564j) interfaceC3470l : new C2566j1(interfaceC3470l);
    }

    @NotNull
    /* renamed from: B */
    protected String mo8610B() {
        return "CancellableContinuation";
    }

    /* renamed from: C */
    public final void m8611C(@NotNull Throwable th) {
        if (m8603n(th)) {
            return;
        }
        mo8589g(th);
        m8604p();
    }

    @Override // p087f3.AbstractC2599t0
    /* renamed from: a */
    public void mo8612a(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC2531a2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C2613y) {
                return;
            }
            if (obj2 instanceof C2610x) {
                C2610x c2610x = (C2610x) obj2;
                if (!(!c2610x.m8755c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (C0827b.m4278a(f10262h, this, obj2, C2610x.m8753b(c2610x, null, null, null, null, th, 15, null))) {
                    c2610x.m8756d(this, th);
                    return;
                }
            } else if (C0827b.m4278a(f10262h, this, obj2, new C2610x(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // p087f3.AbstractC2599t0
    @NotNull
    /* renamed from: b */
    public final InterfaceC3012d<T> mo8613b() {
        return this.f10263d;
    }

    @Override // p087f3.AbstractC2599t0
    @Nullable
    /* renamed from: c */
    public Throwable mo8614c(@Nullable Object obj) {
        Throwable thMo8614c = super.mo8614c(obj);
        if (thMo8614c == null) {
            return null;
        }
        mo8613b();
        return thMo8614c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087f3.AbstractC2599t0
    /* renamed from: d */
    public <T> T mo8615d(@Nullable Object obj) {
        return obj instanceof C2610x ? (T) ((C2610x) obj).f10309a : obj;
    }

    @Override // p087f3.InterfaceC2572l
    /* renamed from: f */
    public void mo8588f(@NotNull AbstractC2545e0 abstractC2545e0, T t3) {
        InterfaceC3012d<T> interfaceC3012d = this.f10263d;
        C2790e c2790e = interfaceC3012d instanceof C2790e ? (C2790e) interfaceC3012d : null;
        m8597F(this, t3, (c2790e != null ? c2790e.f10754d : null) == abstractC2545e0 ? 4 : this.f10281c, null, 4, null);
    }

    @Override // p087f3.InterfaceC2572l
    /* renamed from: g */
    public boolean mo8589g(@Nullable Throwable th) {
        Object obj;
        boolean z3;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC2531a2)) {
                return false;
            }
            z3 = obj instanceof AbstractC2564j;
        } while (!C0827b.m4278a(f10262h, this, obj, new C2583o(this, th, z3)));
        AbstractC2564j abstractC2564j = z3 ? (AbstractC2564j) obj : null;
        if (abstractC2564j != null) {
            m8617k(abstractC2564j, th);
        }
        m8604p();
        m8605q(this.f10281c);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC2749e
    @Nullable
    public InterfaceC2749e getCallerFrame() {
        InterfaceC3012d<T> interfaceC3012d = this.f10263d;
        if (interfaceC3012d instanceof InterfaceC2749e) {
            return (InterfaceC2749e) interfaceC3012d;
        }
        return null;
    }

    @Override // p142q2.InterfaceC3012d
    @NotNull
    public InterfaceC3015g getContext() {
        return this.f10264e;
    }

    @Override // p087f3.InterfaceC2572l
    /* renamed from: h */
    public void mo8590h(@NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        AbstractC2564j abstractC2564jM8609z = m8609z(interfaceC3470l);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C2540d) {
                if (C0827b.m4278a(f10262h, this, obj, abstractC2564jM8609z)) {
                    return;
                }
            } else if (obj instanceof AbstractC2564j) {
                m8594A(interfaceC3470l, obj);
            } else {
                boolean z3 = obj instanceof C2613y;
                if (z3) {
                    C2613y c2613y = (C2613y) obj;
                    if (!c2613y.m8760b()) {
                        m8594A(interfaceC3470l, obj);
                    }
                    if (obj instanceof C2583o) {
                        if (!z3) {
                            c2613y = null;
                        }
                        m8602l(interfaceC3470l, c2613y != null ? c2613y.f10316a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof C2610x) {
                    C2610x c2610x = (C2610x) obj;
                    if (c2610x.f10310b != null) {
                        m8594A(interfaceC3470l, obj);
                    }
                    if (c2610x.m8755c()) {
                        m8602l(interfaceC3470l, c2610x.f10313e);
                        return;
                    } else {
                        if (C0827b.m4278a(f10262h, this, obj, C2610x.m8753b(c2610x, null, abstractC2564jM8609z, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (C0827b.m4278a(f10262h, this, obj, new C2610x(obj, abstractC2564jM8609z, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // p087f3.AbstractC2599t0
    @Nullable
    /* renamed from: i */
    public Object mo8616i() {
        return m8622t();
    }

    /* renamed from: k */
    public final void m8617k(@NotNull AbstractC2564j abstractC2564j, @Nullable Throwable th) {
        try {
            abstractC2564j.mo8585a(th);
        } catch (Throwable th2) {
            C2553g0.m8561a(getContext(), new C2533b0(C2769l.m9248l("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: m */
    public final void m8618m(@NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, @NotNull Throwable th) {
        try {
            interfaceC3470l.invoke(th);
        } catch (Throwable th2) {
            C2553g0.m8561a(getContext(), new C2533b0(C2769l.m9248l("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: o */
    public final void m8619o() {
        InterfaceC2608w0 interfaceC2608w0 = this.f10265f;
        if (interfaceC2608w0 == null) {
            return;
        }
        interfaceC2608w0.mo8520b();
        this.f10265f = C2618z1.f10323a;
    }

    @NotNull
    /* renamed from: r */
    public Throwable mo8620r(@NotNull InterfaceC2578m1 interfaceC2578m1) {
        return interfaceC2578m1.mo8632u();
    }

    @Override // p142q2.InterfaceC3012d
    public void resumeWith(@NotNull Object obj) {
        m8597F(this, C2537c0.m8532b(obj, this), this.f10281c, null, 4, null);
    }

    @Nullable
    /* renamed from: s */
    public final Object m8621s() {
        InterfaceC2578m1 interfaceC2578m1;
        boolean zM8608y = m8608y();
        if (m8600I()) {
            if (this.f10265f == null) {
                m8607w();
            }
            if (zM8608y) {
                m8595D();
            }
            return C3033d.m10175c();
        }
        if (zM8608y) {
            m8595D();
        }
        Object objM8622t = m8622t();
        if (objM8622t instanceof C2613y) {
            throw ((C2613y) objM8622t).f10316a;
        }
        if (!C2602u0.m8729b(this.f10281c) || (interfaceC2578m1 = (InterfaceC2578m1) getContext().get(InterfaceC2578m1.f10268P)) == null || interfaceC2578m1.isActive()) {
            return mo8615d(objM8622t);
        }
        CancellationException cancellationExceptionMo8632u = interfaceC2578m1.mo8632u();
        mo8612a(objM8622t, cancellationExceptionMo8632u);
        throw cancellationExceptionMo8632u;
    }

    @Nullable
    /* renamed from: t */
    public final Object m8622t() {
        return this._state;
    }

    @NotNull
    public String toString() {
        return mo8610B() + '(' + C2573l0.m8593c(this.f10263d) + "){" + m8606u() + "}@" + C2573l0.m8592b(this);
    }

    /* renamed from: v */
    public void m8623v() {
        InterfaceC2608w0 interfaceC2608w0M8607w = m8607w();
        if (interfaceC2608w0M8607w != null && m8624x()) {
            interfaceC2608w0M8607w.mo8520b();
            this.f10265f = C2618z1.f10323a;
        }
    }

    /* renamed from: x */
    public boolean m8624x() {
        return !(m8622t() instanceof InterfaceC2531a2);
    }
}

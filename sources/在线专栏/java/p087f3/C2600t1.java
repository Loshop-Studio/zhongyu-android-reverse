package p087f3;

import androidx.work.impl.utils.futures.C0827b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.AbstractC2802q;
import kotlinx.coroutines.internal.C2795j;
import kotlinx.coroutines.internal.C2796k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.InterfaceC2578m1;
import p128o2.C2909b;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3032c;
import p146r2.C3033d;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3474p;

/* renamed from: f3.t1 */
/* loaded from: classes.dex */
public class C2600t1 implements InterfaceC2578m1, InterfaceC2595s, InterfaceC2535b2 {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10282a = AtomicReferenceFieldUpdater.newUpdater(C2600t1.class, Object.class, "_state");

    @NotNull
    private volatile /* synthetic */ Object _parentHandle;

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* renamed from: f3.t1$a */
    private static final class a<T> extends C2576m<T> {

        /* renamed from: i */
        @NotNull
        private final C2600t1 f10283i;

        public a(@NotNull InterfaceC3012d<? super T> interfaceC3012d, @NotNull C2600t1 c2600t1) {
            super(interfaceC3012d, 1);
            this.f10283i = c2600t1;
        }

        @Override // p087f3.C2576m
        @NotNull
        /* renamed from: B */
        protected String mo8610B() {
            return "AwaitContinuation";
        }

        @Override // p087f3.C2576m
        @NotNull
        /* renamed from: r */
        public Throwable mo8620r(@NotNull InterfaceC2578m1 interfaceC2578m1) {
            Throwable thM8719e;
            Object objM8700O = this.f10283i.m8700O();
            return (!(objM8700O instanceof c) || (thM8719e = ((c) objM8700O).m8719e()) == null) ? objM8700O instanceof C2613y ? ((C2613y) objM8700O).f10316a : interfaceC2578m1.mo8632u() : thM8719e;
        }
    }

    /* renamed from: f3.t1$b */
    private static final class b extends AbstractC2597s1 {

        /* renamed from: e */
        @NotNull
        private final C2600t1 f10284e;

        /* renamed from: f */
        @NotNull
        private final c f10285f;

        /* renamed from: g */
        @NotNull
        private final C2592r f10286g;

        /* renamed from: h */
        @Nullable
        private final Object f10287h;

        public b(@NotNull C2600t1 c2600t1, @NotNull c cVar, @NotNull C2592r c2592r, @Nullable Object obj) {
            this.f10284e = c2600t1;
            this.f10285f = cVar;
            this.f10286g = c2592r;
            this.f10287h = obj;
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
            mo8502s(th);
            return C2925r.f11415a;
        }

        @Override // p087f3.AbstractC2529a0
        /* renamed from: s */
        public void mo8502s(@Nullable Throwable th) {
            this.f10284e.m8670E(this.f10285f, this.f10286g, this.f10287h);
        }
    }

    /* renamed from: f3.t1$c */
    private static final class c implements InterfaceC2558h1 {

        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @NotNull
        private volatile /* synthetic */ int _isCompleting;

        @NotNull
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a */
        @NotNull
        private final C2615y1 f10288a;

        public c(@NotNull C2615y1 c2615y1, boolean z3, @Nullable Throwable th) {
            this.f10288a = c2615y1;
            this._isCompleting = z3 ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m8715c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        private final Object m8716d() {
            return this._exceptionsHolder;
        }

        /* renamed from: k */
        private final void m8717k(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // p087f3.InterfaceC2558h1
        @NotNull
        /* renamed from: a */
        public C2615y1 mo8563a() {
            return this.f10288a;
        }

        /* renamed from: b */
        public final void m8718b(@NotNull Throwable th) {
            Throwable thM8719e = m8719e();
            if (thM8719e == null) {
                m8725l(th);
                return;
            }
            if (th == thM8719e) {
                return;
            }
            Object objM8716d = m8716d();
            if (objM8716d == null) {
                m8717k(th);
                return;
            }
            if (!(objM8716d instanceof Throwable)) {
                if (!(objM8716d instanceof ArrayList)) {
                    throw new IllegalStateException(C2769l.m9248l("State is ", objM8716d).toString());
                }
                ((ArrayList) objM8716d).add(th);
            } else {
                if (th == objM8716d) {
                    return;
                }
                ArrayList<Throwable> arrayListM8715c = m8715c();
                arrayListM8715c.add(objM8716d);
                arrayListM8715c.add(th);
                C2925r c2925r = C2925r.f11415a;
                m8717k(arrayListM8715c);
            }
        }

        @Nullable
        /* renamed from: e */
        public final Throwable m8719e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public final boolean m8720f() {
            return m8719e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: g */
        public final boolean m8721g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public final boolean m8722h() {
            return m8716d() == C2603u1.f10297e;
        }

        @NotNull
        /* renamed from: i */
        public final List<Throwable> m8723i(@Nullable Throwable th) {
            ArrayList<Throwable> arrayListM8715c;
            Object objM8716d = m8716d();
            if (objM8716d == null) {
                arrayListM8715c = m8715c();
            } else if (objM8716d instanceof Throwable) {
                ArrayList<Throwable> arrayListM8715c2 = m8715c();
                arrayListM8715c2.add(objM8716d);
                arrayListM8715c = arrayListM8715c2;
            } else {
                if (!(objM8716d instanceof ArrayList)) {
                    throw new IllegalStateException(C2769l.m9248l("State is ", objM8716d).toString());
                }
                arrayListM8715c = (ArrayList) objM8716d;
            }
            Throwable thM8719e = m8719e();
            if (thM8719e != null) {
                arrayListM8715c.add(0, thM8719e);
            }
            if (th != null && !C2769l.m9237a(th, thM8719e)) {
                arrayListM8715c.add(th);
            }
            m8717k(C2603u1.f10297e);
            return arrayListM8715c;
        }

        @Override // p087f3.InterfaceC2558h1
        public boolean isActive() {
            return m8719e() == null;
        }

        /* renamed from: j */
        public final void m8724j(boolean z3) {
            this._isCompleting = z3 ? 1 : 0;
        }

        /* renamed from: l */
        public final void m8725l(@Nullable Throwable th) {
            this._rootCause = th;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m8720f() + ", completing=" + m8721g() + ", rootCause=" + m8719e() + ", exceptions=" + m8716d() + ", list=" + mo8563a() + ']';
        }
    }

    /* renamed from: f3.t1$d */
    public static final class d extends C2796k.a {

        /* renamed from: d */
        final /* synthetic */ C2796k f10289d;

        /* renamed from: e */
        final /* synthetic */ C2600t1 f10290e;

        /* renamed from: f */
        final /* synthetic */ Object f10291f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C2796k c2796k, C2600t1 c2600t1, Object obj) {
            super(c2796k);
            this.f10289d = c2796k;
            this.f10290e = c2600t1;
            this.f10291f = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2788c
        @Nullable
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo8726g(@NotNull C2796k c2796k) {
            if (this.f10290e.m8700O() == this.f10291f) {
                return null;
            }
            return C2795j.m9299a();
        }
    }

    public C2600t1(boolean z3) {
        this._state = z3 ? C2603u1.f10299g : C2603u1.f10298f;
        this._parentHandle = null;
    }

    /* renamed from: D */
    private final void m8669D(InterfaceC2558h1 interfaceC2558h1, Object obj) throws Throwable {
        InterfaceC2589q interfaceC2589qM8699N = m8699N();
        if (interfaceC2589qM8699N != null) {
            interfaceC2589qM8699N.mo8520b();
            m8708i0(C2618z1.f10323a);
        }
        C2613y c2613y = obj instanceof C2613y ? (C2613y) obj : null;
        Throwable th = c2613y != null ? c2613y.f10316a : null;
        if (!(interfaceC2558h1 instanceof AbstractC2597s1)) {
            C2615y1 c2615y1Mo8563a = interfaceC2558h1.mo8563a();
            if (c2615y1Mo8563a == null) {
                return;
            }
            m8681b0(c2615y1Mo8563a, th);
            return;
        }
        try {
            ((AbstractC2597s1) interfaceC2558h1).mo8502s(th);
        } catch (Throwable th2) {
            mo8495Q(new C2533b0("Exception in completion handler " + interfaceC2558h1 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m8670E(c cVar, C2592r c2592r, Object obj) {
        C2592r c2592rM8679Z = m8679Z(c2592r);
        if (c2592rM8679Z == null || !m8696s0(cVar, c2592rM8679Z, obj)) {
            mo8546l(m8672G(cVar, obj));
        }
    }

    /* renamed from: F */
    private final Throwable m8671F(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2582n1(mo8494A(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC2535b2) obj).mo8529s();
    }

    /* renamed from: G */
    private final Object m8672G(c cVar, Object obj) throws Throwable {
        boolean zM8720f;
        Throwable thM8675J;
        C2613y c2613y = obj instanceof C2613y ? (C2613y) obj : null;
        Throwable th = c2613y == null ? null : c2613y.f10316a;
        synchronized (cVar) {
            zM8720f = cVar.m8720f();
            List<Throwable> listM8723i = cVar.m8723i(th);
            thM8675J = m8675J(cVar, listM8723i);
            if (thM8675J != null) {
                m8688k(thM8675J, listM8723i);
            }
        }
        if (thM8675J != null && thM8675J != th) {
            obj = new C2613y(thM8675J, false, 2, null);
        }
        if (thM8675J != null) {
            if (m8698z(thM8675J) || mo8544P(thM8675J)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C2613y) obj).m8760b();
            }
        }
        if (!zM8720f) {
            m8705c0(thM8675J);
        }
        mo8497d0(obj);
        C0827b.m4278a(f10282a, this, cVar, C2603u1.m8739g(obj));
        m8669D(cVar, obj);
        return obj;
    }

    /* renamed from: H */
    private final C2592r m8673H(InterfaceC2558h1 interfaceC2558h1) {
        C2592r c2592r = interfaceC2558h1 instanceof C2592r ? (C2592r) interfaceC2558h1 : null;
        if (c2592r != null) {
            return c2592r;
        }
        C2615y1 c2615y1Mo8563a = interfaceC2558h1.mo8563a();
        if (c2615y1Mo8563a == null) {
            return null;
        }
        return m8679Z(c2615y1Mo8563a);
    }

    /* renamed from: I */
    private final Throwable m8674I(Object obj) {
        C2613y c2613y = obj instanceof C2613y ? (C2613y) obj : null;
        if (c2613y == null) {
            return null;
        }
        return c2613y.f10316a;
    }

    /* renamed from: J */
    private final Throwable m8675J(c cVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.m8720f()) {
                return new C2582n1(mo8494A(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    /* renamed from: M */
    private final C2615y1 m8676M(InterfaceC2558h1 interfaceC2558h1) {
        C2615y1 c2615y1Mo8563a = interfaceC2558h1.mo8563a();
        if (c2615y1Mo8563a != null) {
            return c2615y1Mo8563a;
        }
        if (interfaceC2558h1 instanceof C2614y0) {
            return new C2615y1();
        }
        if (!(interfaceC2558h1 instanceof AbstractC2597s1)) {
            throw new IllegalStateException(C2769l.m9248l("State should have list: ", interfaceC2558h1).toString());
        }
        m8684g0((AbstractC2597s1) interfaceC2558h1);
        return null;
    }

    /* renamed from: V */
    private final Object m8677V(Object obj) throws Throwable {
        Throwable thM8671F = null;
        while (true) {
            Object objM8700O = m8700O();
            if (objM8700O instanceof c) {
                synchronized (objM8700O) {
                    if (((c) objM8700O).m8722h()) {
                        return C2603u1.f10296d;
                    }
                    boolean zM8720f = ((c) objM8700O).m8720f();
                    if (obj != null || !zM8720f) {
                        if (thM8671F == null) {
                            thM8671F = m8671F(obj);
                        }
                        ((c) objM8700O).m8718b(thM8671F);
                    }
                    Throwable thM8719e = zM8720f ^ true ? ((c) objM8700O).m8719e() : null;
                    if (thM8719e != null) {
                        m8680a0(((c) objM8700O).mo8563a(), thM8719e);
                    }
                    return C2603u1.f10293a;
                }
            }
            if (!(objM8700O instanceof InterfaceC2558h1)) {
                return C2603u1.f10296d;
            }
            if (thM8671F == null) {
                thM8671F = m8671F(obj);
            }
            InterfaceC2558h1 interfaceC2558h1 = (InterfaceC2558h1) objM8700O;
            if (!interfaceC2558h1.isActive()) {
                Object objM8694q0 = m8694q0(objM8700O, new C2613y(thM8671F, false, 2, null));
                if (objM8694q0 == C2603u1.f10293a) {
                    throw new IllegalStateException(C2769l.m9248l("Cannot happen in ", objM8700O).toString());
                }
                if (objM8694q0 != C2603u1.f10295c) {
                    return objM8694q0;
                }
            } else if (m8692p0(interfaceC2558h1, thM8671F)) {
                return C2603u1.f10293a;
            }
        }
    }

    /* renamed from: X */
    private final AbstractC2597s1 m8678X(InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l, boolean z3) {
        AbstractC2597s1 c2574l1;
        if (z3) {
            c2574l1 = interfaceC3470l instanceof AbstractC2585o1 ? (AbstractC2585o1) interfaceC3470l : null;
            if (c2574l1 == null) {
                c2574l1 = new C2570k1(interfaceC3470l);
            }
        } else {
            AbstractC2597s1 abstractC2597s1 = interfaceC3470l instanceof AbstractC2597s1 ? (AbstractC2597s1) interfaceC3470l : null;
            c2574l1 = abstractC2597s1 != null ? abstractC2597s1 : null;
            if (c2574l1 == null) {
                c2574l1 = new C2574l1(interfaceC3470l);
            }
        }
        c2574l1.m8667u(this);
        return c2574l1;
    }

    /* renamed from: Z */
    private final C2592r m8679Z(C2796k c2796k) {
        while (c2796k.mo9298n()) {
            c2796k = c2796k.m9309m();
        }
        while (true) {
            c2796k = c2796k.m9308l();
            if (!c2796k.mo9298n()) {
                if (c2796k instanceof C2592r) {
                    return (C2592r) c2796k;
                }
                if (c2796k instanceof C2615y1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a0 */
    private final void m8680a0(C2615y1 c2615y1, Throwable th) throws Throwable {
        C2533b0 c2533b0;
        m8705c0(th);
        C2533b0 c2533b02 = null;
        for (C2796k c2796kM9308l = (C2796k) c2615y1.m9307k(); !C2769l.m9237a(c2796kM9308l, c2615y1); c2796kM9308l = c2796kM9308l.m9308l()) {
            if (c2796kM9308l instanceof AbstractC2585o1) {
                AbstractC2597s1 abstractC2597s1 = (AbstractC2597s1) c2796kM9308l;
                try {
                    abstractC2597s1.mo8502s(th);
                } catch (Throwable th2) {
                    if (c2533b02 == null) {
                        c2533b0 = null;
                    } else {
                        C2909b.m9982a(c2533b02, th2);
                        c2533b0 = c2533b02;
                    }
                    if (c2533b0 == null) {
                        c2533b02 = new C2533b0("Exception in completion handler " + abstractC2597s1 + " for " + this, th2);
                    }
                }
            }
        }
        if (c2533b02 != null) {
            mo8495Q(c2533b02);
        }
        m8698z(th);
    }

    /* renamed from: b0 */
    private final void m8681b0(C2615y1 c2615y1, Throwable th) throws Throwable {
        C2533b0 c2533b0;
        C2533b0 c2533b02 = null;
        for (C2796k c2796kM9308l = (C2796k) c2615y1.m9307k(); !C2769l.m9237a(c2796kM9308l, c2615y1); c2796kM9308l = c2796kM9308l.m9308l()) {
            if (c2796kM9308l instanceof AbstractC2597s1) {
                AbstractC2597s1 abstractC2597s1 = (AbstractC2597s1) c2796kM9308l;
                try {
                    abstractC2597s1.mo8502s(th);
                } catch (Throwable th2) {
                    if (c2533b02 == null) {
                        c2533b0 = null;
                    } else {
                        C2909b.m9982a(c2533b02, th2);
                        c2533b0 = c2533b02;
                    }
                    if (c2533b0 == null) {
                        c2533b02 = new C2533b0("Exception in completion handler " + abstractC2597s1 + " for " + this, th2);
                    }
                }
            }
        }
        if (c2533b02 == null) {
            return;
        }
        mo8495Q(c2533b02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [f3.g1] */
    /* renamed from: f0 */
    private final void m8683f0(C2614y0 c2614y0) {
        C2615y1 c2615y1 = new C2615y1();
        if (!c2614y0.isActive()) {
            c2615y1 = new C2554g1(c2615y1);
        }
        C0827b.m4278a(f10282a, this, c2614y0, c2615y1);
    }

    /* renamed from: g0 */
    private final void m8684g0(AbstractC2597s1 abstractC2597s1) {
        abstractC2597s1.m9306g(new C2615y1());
        C0827b.m4278a(f10282a, this, abstractC2597s1, abstractC2597s1.m9308l());
    }

    /* renamed from: j */
    private final boolean m8686j(Object obj, C2615y1 c2615y1, AbstractC2597s1 abstractC2597s1) {
        int iM9312r;
        d dVar = new d(abstractC2597s1, this, obj);
        do {
            iM9312r = c2615y1.m9309m().m9312r(abstractC2597s1, c2615y1, dVar);
            if (iM9312r == 1) {
                return true;
            }
        } while (iM9312r != 2);
        return false;
    }

    /* renamed from: j0 */
    private final int m8687j0(Object obj) {
        if (obj instanceof C2614y0) {
            if (((C2614y0) obj).isActive()) {
                return 0;
            }
            if (!C0827b.m4278a(f10282a, this, obj, C2603u1.f10299g)) {
                return -1;
            }
            mo8706e0();
            return 1;
        }
        if (!(obj instanceof C2554g1)) {
            return 0;
        }
        if (!C0827b.m4278a(f10282a, this, obj, ((C2554g1) obj).mo8563a())) {
            return -1;
        }
        mo8706e0();
        return 1;
    }

    /* renamed from: k */
    private final void m8688k(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                C2909b.m9982a(th, th2);
            }
        }
    }

    /* renamed from: k0 */
    private final String m8689k0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC2558h1 ? ((InterfaceC2558h1) obj).isActive() ? "Active" : "New" : obj instanceof C2613y ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.m8720f() ? "Cancelling" : cVar.m8721g() ? "Completing" : "Active";
    }

    /* renamed from: m0 */
    public static /* synthetic */ CancellationException m8690m0(C2600t1 c2600t1, Throwable th, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        return c2600t1.m8709l0(th, str);
    }

    /* renamed from: o0 */
    private final boolean m8691o0(InterfaceC2558h1 interfaceC2558h1, Object obj) throws Throwable {
        if (!C0827b.m4278a(f10282a, this, interfaceC2558h1, C2603u1.m8739g(obj))) {
            return false;
        }
        m8705c0(null);
        mo8497d0(obj);
        m8669D(interfaceC2558h1, obj);
        return true;
    }

    /* renamed from: p0 */
    private final boolean m8692p0(InterfaceC2558h1 interfaceC2558h1, Throwable th) throws Throwable {
        C2615y1 c2615y1M8676M = m8676M(interfaceC2558h1);
        if (c2615y1M8676M == null) {
            return false;
        }
        if (!C0827b.m4278a(f10282a, this, interfaceC2558h1, new c(c2615y1M8676M, false, th))) {
            return false;
        }
        m8680a0(c2615y1M8676M, th);
        return true;
    }

    /* renamed from: q */
    private final Object m8693q(InterfaceC3012d<Object> interfaceC3012d) {
        a aVar = new a(C3032c.m10174b(interfaceC3012d), this);
        aVar.m8623v();
        C2580n.m8639a(aVar, m8702S(new C2539c2(aVar)));
        Object objM8621s = aVar.m8621s();
        if (objM8621s == C3033d.m10175c()) {
            C2752h.m9217c(interfaceC3012d);
        }
        return objM8621s;
    }

    /* renamed from: q0 */
    private final Object m8694q0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC2558h1) ? C2603u1.f10293a : ((!(obj instanceof C2614y0) && !(obj instanceof AbstractC2597s1)) || (obj instanceof C2592r) || (obj2 instanceof C2613y)) ? m8695r0((InterfaceC2558h1) obj, obj2) : m8691o0((InterfaceC2558h1) obj, obj2) ? obj2 : C2603u1.f10295c;
    }

    /* renamed from: r0 */
    private final Object m8695r0(InterfaceC2558h1 interfaceC2558h1, Object obj) throws Throwable {
        C2615y1 c2615y1M8676M = m8676M(interfaceC2558h1);
        if (c2615y1M8676M == null) {
            return C2603u1.f10295c;
        }
        c cVar = interfaceC2558h1 instanceof c ? (c) interfaceC2558h1 : null;
        if (cVar == null) {
            cVar = new c(c2615y1M8676M, false, null);
        }
        synchronized (cVar) {
            if (cVar.m8721g()) {
                return C2603u1.f10293a;
            }
            cVar.m8724j(true);
            if (cVar != interfaceC2558h1 && !C0827b.m4278a(f10282a, this, interfaceC2558h1, cVar)) {
                return C2603u1.f10295c;
            }
            boolean zM8720f = cVar.m8720f();
            C2613y c2613y = obj instanceof C2613y ? (C2613y) obj : null;
            if (c2613y != null) {
                cVar.m8718b(c2613y.f10316a);
            }
            Throwable thM8719e = true ^ zM8720f ? cVar.m8719e() : null;
            C2925r c2925r = C2925r.f11415a;
            if (thM8719e != null) {
                m8680a0(c2615y1M8676M, thM8719e);
            }
            C2592r c2592rM8673H = m8673H(interfaceC2558h1);
            return (c2592rM8673H == null || !m8696s0(cVar, c2592rM8673H, obj)) ? m8672G(cVar, obj) : C2603u1.f10294b;
        }
    }

    /* renamed from: s0 */
    private final boolean m8696s0(c cVar, C2592r c2592r, Object obj) {
        while (InterfaceC2578m1.a.m8636d(c2592r.f10277e, false, false, new b(this, cVar, c2592r, obj), 1, null) == C2618z1.f10323a) {
            c2592r = m8679Z(c2592r);
            if (c2592r == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    private final Object m8697y(Object obj) {
        Object objM8694q0;
        do {
            Object objM8700O = m8700O();
            if (!(objM8700O instanceof InterfaceC2558h1) || ((objM8700O instanceof c) && ((c) objM8700O).m8721g())) {
                return C2603u1.f10293a;
            }
            objM8694q0 = m8694q0(objM8700O, new C2613y(m8671F(obj), false, 2, null));
        } while (objM8694q0 == C2603u1.f10295c);
        return objM8694q0;
    }

    /* renamed from: z */
    private final boolean m8698z(Throwable th) {
        if (mo8545U()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC2589q interfaceC2589qM8699N = m8699N();
        return (interfaceC2589qM8699N == null || interfaceC2589qM8699N == C2618z1.f10323a) ? z3 : interfaceC2589qM8699N.mo8647e(th) || z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: A */
    public String mo8494A() {
        return "Job was cancelled";
    }

    @Override // p087f3.InterfaceC2578m1
    /* renamed from: B */
    public void mo8629B(@Nullable CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C2582n1(mo8494A(), null, this);
        }
        m8714x(cancellationException);
    }

    /* renamed from: C */
    public boolean mo8552C(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m8713w(th) && mo8645K();
    }

    /* renamed from: K */
    public boolean mo8645K() {
        return true;
    }

    /* renamed from: L */
    public boolean mo8646L() {
        return false;
    }

    @Nullable
    /* renamed from: N */
    public final InterfaceC2589q m8699N() {
        return (InterfaceC2589q) this._parentHandle;
    }

    @Nullable
    /* renamed from: O */
    public final Object m8700O() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC2802q)) {
                return obj;
            }
            ((AbstractC2802q) obj).mo9278c(this);
        }
    }

    /* renamed from: P */
    protected boolean mo8544P(@NotNull Throwable th) {
        return false;
    }

    /* renamed from: Q */
    public void mo8495Q(@NotNull Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: R */
    protected final void m8701R(@Nullable InterfaceC2578m1 interfaceC2578m1) {
        if (interfaceC2578m1 == null) {
            m8708i0(C2618z1.f10323a);
            return;
        }
        interfaceC2578m1.start();
        InterfaceC2589q interfaceC2589qMo8630a = interfaceC2578m1.mo8630a(this);
        m8708i0(interfaceC2589qMo8630a);
        if (m8703T()) {
            interfaceC2589qMo8630a.mo8520b();
            m8708i0(C2618z1.f10323a);
        }
    }

    @NotNull
    /* renamed from: S */
    public final InterfaceC2608w0 m8702S(@NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        return mo8631r(false, true, interfaceC3470l);
    }

    /* renamed from: T */
    public final boolean m8703T() {
        return !(m8700O() instanceof InterfaceC2558h1);
    }

    /* renamed from: U */
    protected boolean mo8545U() {
        return false;
    }

    @Nullable
    /* renamed from: W */
    public final Object m8704W(@Nullable Object obj) {
        Object objM8694q0;
        do {
            objM8694q0 = m8694q0(m8700O(), obj);
            if (objM8694q0 == C2603u1.f10293a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m8674I(obj));
            }
        } while (objM8694q0 == C2603u1.f10295c);
        return objM8694q0;
    }

    @NotNull
    /* renamed from: Y */
    public String mo8496Y() {
        return C2573l0.m8591a(this);
    }

    @Override // p087f3.InterfaceC2578m1
    @NotNull
    /* renamed from: a */
    public final InterfaceC2589q mo8630a(@NotNull InterfaceC2595s interfaceC2595s) {
        return (InterfaceC2589q) InterfaceC2578m1.a.m8636d(this, true, false, new C2592r(interfaceC2595s), 2, null);
    }

    @Override // p087f3.InterfaceC2595s
    /* renamed from: b */
    public final void mo8662b(@NotNull InterfaceC2535b2 interfaceC2535b2) throws Throwable {
        m8713w(interfaceC2535b2);
    }

    /* renamed from: c0 */
    protected void m8705c0(@Nullable Throwable th) {
    }

    /* renamed from: d0 */
    protected void mo8497d0(@Nullable Object obj) {
    }

    /* renamed from: e0 */
    protected void mo8706e0() {
    }

    @Override // p142q2.InterfaceC3015g
    public <R> R fold(R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3015g.b, ? extends R> interfaceC3474p) {
        return (R) InterfaceC2578m1.a.m8634b(this, r3, interfaceC3474p);
    }

    @Override // p142q2.InterfaceC3015g.b, p142q2.InterfaceC3015g
    @Nullable
    public <E extends InterfaceC3015g.b> E get(@NotNull InterfaceC3015g.c<E> cVar) {
        return (E) InterfaceC2578m1.a.m8635c(this, cVar);
    }

    @Override // p142q2.InterfaceC3015g.b
    @NotNull
    public final InterfaceC3015g.c<?> getKey() {
        return InterfaceC2578m1.f10268P;
    }

    /* renamed from: h0 */
    public final void m8707h0(@NotNull AbstractC2597s1 abstractC2597s1) {
        Object objM8700O;
        do {
            objM8700O = m8700O();
            if (!(objM8700O instanceof AbstractC2597s1)) {
                if (!(objM8700O instanceof InterfaceC2558h1) || ((InterfaceC2558h1) objM8700O).mo8563a() == null) {
                    return;
                }
                abstractC2597s1.m9310o();
                return;
            }
            if (objM8700O != abstractC2597s1) {
                return;
            }
        } while (!C0827b.m4278a(f10282a, this, objM8700O, C2603u1.f10299g));
    }

    /* renamed from: i0 */
    public final void m8708i0(@Nullable InterfaceC2589q interfaceC2589q) {
        this._parentHandle = interfaceC2589q;
    }

    @Override // p087f3.InterfaceC2578m1
    public boolean isActive() {
        Object objM8700O = m8700O();
        return (objM8700O instanceof InterfaceC2558h1) && ((InterfaceC2558h1) objM8700O).isActive();
    }

    /* renamed from: l */
    protected void mo8546l(@Nullable Object obj) {
    }

    @NotNull
    /* renamed from: l0 */
    protected final CancellationException m8709l0(@NotNull Throwable th, @Nullable String str) {
        CancellationException c2582n1 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c2582n1 == null) {
            if (str == null) {
                str = mo8494A();
            }
            c2582n1 = new C2582n1(str, th, this);
        }
        return c2582n1;
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g minusKey(@NotNull InterfaceC3015g.c<?> cVar) {
        return InterfaceC2578m1.a.m8637e(this, cVar);
    }

    @NotNull
    /* renamed from: n0 */
    public final String m8710n0() {
        return mo8496Y() + '{' + m8689k0(m8700O()) + '}';
    }

    @Nullable
    /* renamed from: p */
    public final Object m8711p(@NotNull InterfaceC3012d<Object> interfaceC3012d) throws Throwable {
        Object objM8700O;
        do {
            objM8700O = m8700O();
            if (!(objM8700O instanceof InterfaceC2558h1)) {
                if (objM8700O instanceof C2613y) {
                    throw ((C2613y) objM8700O).f10316a;
                }
                return C2603u1.m8740h(objM8700O);
            }
        } while (m8687j0(objM8700O) < 0);
        return m8693q(interfaceC3012d);
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g plus(@NotNull InterfaceC3015g interfaceC3015g) {
        return InterfaceC2578m1.a.m8638f(this, interfaceC3015g);
    }

    @Override // p087f3.InterfaceC2578m1
    @NotNull
    /* renamed from: r */
    public final InterfaceC2608w0 mo8631r(boolean z3, boolean z4, @NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        AbstractC2597s1 abstractC2597s1M8678X = m8678X(interfaceC3470l, z3);
        while (true) {
            Object objM8700O = m8700O();
            if (objM8700O instanceof C2614y0) {
                C2614y0 c2614y0 = (C2614y0) objM8700O;
                if (!c2614y0.isActive()) {
                    m8683f0(c2614y0);
                } else if (C0827b.m4278a(f10282a, this, objM8700O, abstractC2597s1M8678X)) {
                    return abstractC2597s1M8678X;
                }
            } else {
                if (!(objM8700O instanceof InterfaceC2558h1)) {
                    if (z4) {
                        C2613y c2613y = objM8700O instanceof C2613y ? (C2613y) objM8700O : null;
                        interfaceC3470l.invoke(c2613y != null ? c2613y.f10316a : null);
                    }
                    return C2618z1.f10323a;
                }
                C2615y1 c2615y1Mo8563a = ((InterfaceC2558h1) objM8700O).mo8563a();
                if (c2615y1Mo8563a == null) {
                    Objects.requireNonNull(objM8700O, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m8684g0((AbstractC2597s1) objM8700O);
                } else {
                    InterfaceC2608w0 interfaceC2608w0 = C2618z1.f10323a;
                    if (z3 && (objM8700O instanceof c)) {
                        synchronized (objM8700O) {
                            thM8719e = ((c) objM8700O).m8719e();
                            if (thM8719e == null || ((interfaceC3470l instanceof C2592r) && !((c) objM8700O).m8721g())) {
                                if (m8686j(objM8700O, c2615y1Mo8563a, abstractC2597s1M8678X)) {
                                    if (thM8719e == null) {
                                        return abstractC2597s1M8678X;
                                    }
                                    interfaceC2608w0 = abstractC2597s1M8678X;
                                }
                            }
                            C2925r c2925r = C2925r.f11415a;
                        }
                    }
                    if (thM8719e != null) {
                        if (z4) {
                            interfaceC3470l.invoke(thM8719e);
                        }
                        return interfaceC2608w0;
                    }
                    if (m8686j(objM8700O, c2615y1Mo8563a, abstractC2597s1M8678X)) {
                        return abstractC2597s1M8678X;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // p087f3.InterfaceC2535b2
    @NotNull
    /* renamed from: s */
    public CancellationException mo8529s() {
        CancellationException cancellationExceptionM8719e;
        Object objM8700O = m8700O();
        if (objM8700O instanceof c) {
            cancellationExceptionM8719e = ((c) objM8700O).m8719e();
        } else if (objM8700O instanceof C2613y) {
            cancellationExceptionM8719e = ((C2613y) objM8700O).f10316a;
        } else {
            if (objM8700O instanceof InterfaceC2558h1) {
                throw new IllegalStateException(C2769l.m9248l("Cannot be cancelling child in this state: ", objM8700O).toString());
            }
            cancellationExceptionM8719e = null;
        }
        CancellationException cancellationException = cancellationExceptionM8719e instanceof CancellationException ? cancellationExceptionM8719e : null;
        return cancellationException == null ? new C2582n1(C2769l.m9248l("Parent job is ", m8689k0(objM8700O)), cancellationExceptionM8719e, this) : cancellationException;
    }

    @Override // p087f3.InterfaceC2578m1
    public final boolean start() {
        int iM8687j0;
        do {
            iM8687j0 = m8687j0(m8700O());
            if (iM8687j0 == 0) {
                return false;
            }
        } while (iM8687j0 != 1);
        return true;
    }

    @NotNull
    public String toString() {
        return m8710n0() + '@' + C2573l0.m8592b(this);
    }

    @Override // p087f3.InterfaceC2578m1
    @NotNull
    /* renamed from: u */
    public final CancellationException mo8632u() {
        Object objM8700O = m8700O();
        if (!(objM8700O instanceof c)) {
            if (objM8700O instanceof InterfaceC2558h1) {
                throw new IllegalStateException(C2769l.m9248l("Job is still new or active: ", this).toString());
            }
            return objM8700O instanceof C2613y ? m8690m0(this, ((C2613y) objM8700O).f10316a, null, 1, null) : new C2582n1(C2769l.m9248l(C2573l0.m8591a(this), " has completed normally"), null, this);
        }
        Throwable thM8719e = ((c) objM8700O).m8719e();
        if (thM8719e != null) {
            return m8709l0(thM8719e, C2769l.m9248l(C2573l0.m8591a(this), " is cancelling"));
        }
        throw new IllegalStateException(C2769l.m9248l("Job is still new or active: ", this).toString());
    }

    /* renamed from: v */
    public final boolean m8712v(@Nullable Throwable th) {
        return m8713w(th);
    }

    /* renamed from: w */
    public final boolean m8713w(@Nullable Object obj) throws Throwable {
        Object objM8677V = C2603u1.f10293a;
        if (mo8646L() && (objM8677V = m8697y(obj)) == C2603u1.f10294b) {
            return true;
        }
        if (objM8677V == C2603u1.f10293a) {
            objM8677V = m8677V(obj);
        }
        if (objM8677V == C2603u1.f10293a || objM8677V == C2603u1.f10294b) {
            return true;
        }
        if (objM8677V == C2603u1.f10296d) {
            return false;
        }
        mo8546l(objM8677V);
        return true;
    }

    /* renamed from: x */
    public void m8714x(@NotNull Throwable th) throws Throwable {
        m8713w(th);
    }
}

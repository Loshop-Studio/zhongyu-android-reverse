package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5803r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.C5970a;
import p045d6.C5443s;
import p054e7.C5475g;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.c1 */
/* loaded from: classes4.dex */
public class C5871c1 implements InterfaceC6013w0, InterfaceC5973j1 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9288a = AtomicReferenceFieldUpdater.newUpdater(C5871c1.class, Object.class, "_state$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9289b = AtomicReferenceFieldUpdater.newUpdater(C5871c1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C5871c1(boolean z8) {
        this._state$volatile = z8 ? AbstractC6014x.f9526j : AbstractC6014x.f9525i;
    }

    /* renamed from: Q */
    public static C5974k m5433Q(C5970a c5970a) {
        while (c5970a.mo5519g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5970a.f9462b;
            C5970a c5970aM5591d = c5970a.m5591d();
            if (c5970aM5591d == null) {
                Object obj = atomicReferenceFieldUpdater.get(c5970a);
                while (true) {
                    c5970a = (C5970a) obj;
                    if (!c5970a.mo5519g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c5970a);
                }
            } else {
                c5970a = c5970aM5591d;
            }
        }
        while (true) {
            c5970a = c5970a.m5593f();
            if (!c5970a.mo5519g()) {
                if (c5970a instanceof C5974k) {
                    return (C5974k) c5970a;
                }
                if (c5970a instanceof C5897f1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: X */
    public static String m5434X(Object obj) {
        if (!(obj instanceof C5868b1)) {
            return obj instanceof InterfaceC5999s0 ? ((InterfaceC5999s0) obj).isActive() ? "Active" : "New" : obj instanceof C5989p ? "Cancelled" : "Completed";
        }
        C5868b1 c5868b1 = (C5868b1) obj;
        return c5868b1.m5431d() ? "Cancelling" : C5868b1.f9282b.get(c5868b1) == 1 ? "Completing" : "Active";
    }

    /* renamed from: A */
    public final void m5435A(InterfaceC5999s0 interfaceC5999s0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9289b;
        InterfaceC5971j interfaceC5971j = (InterfaceC5971j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC5971j != null) {
            interfaceC5971j.dispose();
            atomicReferenceFieldUpdater.set(this, C5966h1.f9456a);
        }
        CompletionHandlerException completionHandlerException = null;
        C5989p c5989p = obj instanceof C5989p ? (C5989p) obj : null;
        Throwable th = c5989p != null ? c5989p.f9486a : null;
        if (interfaceC5999s0 instanceof AbstractC6017y0) {
            try {
                ((AbstractC6017y0) interfaceC5999s0).mo5427j(th);
                return;
            } catch (Throwable th2) {
                mo5420J(new CompletionHandlerException("Exception in completion handler " + interfaceC5999s0 + " for " + this, th2));
                return;
            }
        }
        C5897f1 c5897f1Mo5429b = interfaceC5999s0.mo5429b();
        if (c5897f1Mo5429b != null) {
            c5897f1Mo5429b.m5590c(new C5475g(1), 1);
            Object obj2 = C5970a.f9461a.get(c5897f1Mo5429b);
            AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C5970a c5970aM5593f = (C5970a) obj2; !c5970aM5593f.equals(c5897f1Mo5429b); c5970aM5593f = c5970aM5593f.m5593f()) {
                if (c5970aM5593f instanceof AbstractC6017y0) {
                    try {
                        ((AbstractC6017y0) c5970aM5593f).mo5427j(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            AbstractC5806u.m5266e(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c5970aM5593f + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo5420J(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* renamed from: B */
    public final Throwable m5436B(Object obj) {
        CancellationException cancellationExceptionM5430c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C5871c1 c5871c1 = (C5871c1) ((InterfaceC5973j1) obj);
        Object obj2 = f9288a.get(c5871c1);
        if (obj2 instanceof C5868b1) {
            cancellationExceptionM5430c = ((C5868b1) obj2).m5430c();
        } else if (obj2 instanceof C5989p) {
            cancellationExceptionM5430c = ((C5989p) obj2).f9486a;
        } else {
            if (obj2 instanceof InterfaceC5999s0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionM5430c = null;
        }
        CancellationException cancellationException = cancellationExceptionM5430c instanceof CancellationException ? cancellationExceptionM5430c : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m5434X(obj2)), cancellationExceptionM5430c, c5871c1) : cancellationException;
    }

    /* renamed from: C */
    public final Object m5437C(C5868b1 c5868b1, Object obj) {
        Throwable thM5439E;
        C5989p c5989p = obj instanceof C5989p ? (C5989p) obj : null;
        Throwable th = c5989p != null ? c5989p.f9486a : null;
        synchronized (c5868b1) {
            c5868b1.m5431d();
            ArrayList arrayListM5432e = c5868b1.m5432e(th);
            thM5439E = m5439E(c5868b1, arrayListM5432e);
            if (thM5439E != null && arrayListM5432e.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM5432e.size()));
                int size = arrayListM5432e.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListM5432e.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thM5439E && th2 != thM5439E && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC5806u.m5266e(thM5439E, th2);
                    }
                }
            }
        }
        if (thM5439E != null && thM5439E != th) {
            obj = new C5989p(false, thM5439E);
        }
        if (thM5439E != null && (m5464x(thM5439E) || mo5443I(thM5439E))) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C5989p.f9485b.compareAndSet((C5989p) obj, 0, 1);
        }
        mo5421S(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9288a;
        Object c6004t0 = obj instanceof InterfaceC5999s0 ? new C6004t0((InterfaceC5999s0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c5868b1, c6004t0) && atomicReferenceFieldUpdater.get(this) == c5868b1) {
        }
        m5435A(c5868b1, obj);
        return obj;
    }

    /* renamed from: D */
    public final C5803r m5438D() {
        return new C5803r(new JobSupport$children$1(this, null));
    }

    /* renamed from: E */
    public final Throwable m5439E(C5868b1 c5868b1, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c5868b1.m5431d()) {
                return new JobCancellationException(mo5424y(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i8);
            i8++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: F */
    public boolean mo5440F() {
        return true;
    }

    /* renamed from: G */
    public boolean mo5441G() {
        return this instanceof C5980m;
    }

    /* renamed from: H */
    public final C5897f1 m5442H(InterfaceC5999s0 interfaceC5999s0) {
        C5897f1 c5897f1Mo5429b = interfaceC5999s0.mo5429b();
        if (c5897f1Mo5429b != null) {
            return c5897f1Mo5429b;
        }
        if (interfaceC5999s0 instanceof C5968i0) {
            return new C5897f1();
        }
        if (interfaceC5999s0 instanceof AbstractC6017y0) {
            m5452V((AbstractC6017y0) interfaceC5999s0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC5999s0).toString());
    }

    /* renamed from: I */
    public boolean mo5443I(Throwable th) {
        return false;
    }

    /* renamed from: K */
    public final void m5444K(InterfaceC6013w0 interfaceC6013w0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9289b;
        C5966h1 c5966h1 = C5966h1.f9456a;
        if (interfaceC6013w0 == null) {
            atomicReferenceFieldUpdater.set(this, c5966h1);
            return;
        }
        interfaceC6013w0.start();
        InterfaceC5971j interfaceC5971jMo5458g = interfaceC6013w0.mo5458g(this);
        atomicReferenceFieldUpdater.set(this, interfaceC5971jMo5458g);
        if (f9288a.get(this) instanceof InterfaceC5999s0) {
            return;
        }
        interfaceC5971jMo5458g.dispose();
        atomicReferenceFieldUpdater.set(this, c5966h1);
    }

    /* renamed from: L */
    public final InterfaceC5962g0 m5445L(boolean z8, AbstractC6017y0 abstractC6017y0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C5966h1 c5966h1;
        boolean z9;
        boolean zM5590c;
        abstractC6017y0.f9530d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f9288a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof C5968i0;
            c5966h1 = C5966h1.f9456a;
            z9 = true;
            if (!z10) {
                if (!(obj instanceof InterfaceC5999s0)) {
                    z9 = false;
                    break;
                }
                InterfaceC5999s0 interfaceC5999s0 = (InterfaceC5999s0) obj;
                C5897f1 c5897f1Mo5429b = interfaceC5999s0.mo5429b();
                if (c5897f1Mo5429b == null) {
                    AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m5452V((AbstractC6017y0) obj);
                } else {
                    if (abstractC6017y0.mo5426i()) {
                        C5868b1 c5868b1 = interfaceC5999s0 instanceof C5868b1 ? (C5868b1) interfaceC5999s0 : null;
                        Throwable thM5430c = c5868b1 != null ? c5868b1.m5430c() : null;
                        if (thM5430c == null) {
                            zM5590c = c5897f1Mo5429b.m5590c(abstractC6017y0, 5);
                        } else if (z8) {
                            abstractC6017y0.mo5427j(thM5430c);
                            return c5966h1;
                        }
                    } else {
                        zM5590c = c5897f1Mo5429b.m5590c(abstractC6017y0, 1);
                    }
                    if (zM5590c) {
                        break;
                    }
                }
            } else {
                C5968i0 c5968i0 = (C5968i0) obj;
                if (c5968i0.f9459a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC6017y0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m5451U(c5968i0);
            }
        }
        if (z9) {
            return abstractC6017y0;
        }
        if (z8) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C5989p c5989p = obj2 instanceof C5989p ? (C5989p) obj2 : null;
            abstractC6017y0.mo5427j(c5989p != null ? c5989p.f9486a : null);
        }
        return c5966h1;
    }

    /* renamed from: M */
    public boolean mo4858M() {
        return this instanceof C5869c;
    }

    /* renamed from: N */
    public final boolean m5446N(Object obj) {
        Object objM5454Y;
        do {
            objM5454Y = m5454Y(f9288a.get(this), obj);
            if (objM5454Y == AbstractC6014x.f9520d) {
                return false;
            }
            if (objM5454Y == AbstractC6014x.f9521e) {
                return true;
            }
        } while (objM5454Y == AbstractC6014x.f9522f);
        mo4860s(objM5454Y);
        return true;
    }

    /* renamed from: O */
    public final Object m5447O(Object obj) {
        Object objM5454Y;
        do {
            objM5454Y = m5454Y(f9288a.get(this), obj);
            if (objM5454Y == AbstractC6014x.f9520d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C5989p c5989p = obj instanceof C5989p ? (C5989p) obj : null;
                throw new IllegalStateException(str, c5989p != null ? c5989p.f9486a : null);
            }
        } while (objM5454Y == AbstractC6014x.f9522f);
        return objM5454Y;
    }

    /* renamed from: P */
    public String mo5448P() {
        return getClass().getSimpleName();
    }

    /* renamed from: R */
    public final void m5449R(C5897f1 c5897f1, Throwable th) {
        c5897f1.m5590c(new C5475g(4), 4);
        Object obj = C5970a.f9461a.get(c5897f1);
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C5970a c5970aM5593f = (C5970a) obj; !c5970aM5593f.equals(c5897f1); c5970aM5593f = c5970aM5593f.m5593f()) {
            if ((c5970aM5593f instanceof AbstractC6017y0) && ((AbstractC6017y0) c5970aM5593f).mo5426i()) {
                try {
                    ((AbstractC6017y0) c5970aM5593f).mo5427j(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC5806u.m5266e(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c5970aM5593f + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo5420J(completionHandlerException);
        }
        m5464x(th);
    }

    /* renamed from: S */
    public void mo5421S(Object obj) {
    }

    /* renamed from: T */
    public void mo5450T() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.r0] */
    /* renamed from: U */
    public final void m5451U(C5968i0 c5968i0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C5897f1 c5897f1 = new C5897f1();
        if (!c5968i0.f9459a) {
            c5897f1 = new C5996r0(c5897f1);
        }
        do {
            atomicReferenceFieldUpdater = f9288a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c5968i0, c5897f1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c5968i0);
    }

    /* renamed from: V */
    public final void m5452V(AbstractC6017y0 abstractC6017y0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C5897f1 c5897f1 = new C5897f1();
        abstractC6017y0.getClass();
        C5970a.f9462b.set(c5897f1, abstractC6017y0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C5970a.f9461a;
        atomicReferenceFieldUpdater2.set(c5897f1, abstractC6017y0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC6017y0) == abstractC6017y0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC6017y0, abstractC6017y0, c5897f1)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC6017y0) != abstractC6017y0) {
                        break;
                    }
                }
                c5897f1.m5592e(abstractC6017y0);
                break loop0;
            }
            break;
        }
        C5970a c5970aM5593f = abstractC6017y0.m5593f();
        do {
            atomicReferenceFieldUpdater = f9288a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC6017y0, c5970aM5593f)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC6017y0);
    }

    /* renamed from: W */
    public final int m5453W(Object obj) {
        boolean z8 = obj instanceof C5968i0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9288a;
        if (z8) {
            if (((C5968i0) obj).f9459a) {
                return 0;
            }
            C5968i0 c5968i0 = AbstractC6014x.f9526j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5968i0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo5450T();
            return 1;
        }
        if (!(obj instanceof C5996r0)) {
            return 0;
        }
        C5897f1 c5897f1 = ((C5996r0) obj).f9494a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5897f1)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo5450T();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: Y */
    public final Object m5454Y(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC5999s0)) {
            return AbstractC6014x.f9520d;
        }
        if (((obj instanceof C5968i0) || (obj instanceof AbstractC6017y0)) && !(obj instanceof C5974k) && !(obj2 instanceof C5989p)) {
            InterfaceC5999s0 interfaceC5999s0 = (InterfaceC5999s0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9288a;
            Object c6004t0 = obj2 instanceof InterfaceC5999s0 ? new C6004t0((InterfaceC5999s0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC5999s0, c6004t0)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC5999s0) {
                    return AbstractC6014x.f9522f;
                }
            }
            mo5421S(obj2);
            m5435A(interfaceC5999s0, obj2);
            return obj2;
        }
        InterfaceC5999s0 interfaceC5999s02 = (InterfaceC5999s0) obj;
        C5897f1 c5897f1M5442H = m5442H(interfaceC5999s02);
        if (c5897f1M5442H == null) {
            return AbstractC6014x.f9522f;
        }
        C5868b1 c5868b1 = interfaceC5999s02 instanceof C5868b1 ? (C5868b1) interfaceC5999s02 : null;
        if (c5868b1 == null) {
            c5868b1 = new C5868b1(c5897f1M5442H, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c5868b1) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5868b1.f9282b;
            if (atomicIntegerFieldUpdater.get(c5868b1) == 1) {
                return AbstractC6014x.f9520d;
            }
            atomicIntegerFieldUpdater.set(c5868b1, 1);
            if (c5868b1 != interfaceC5999s02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9288a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC5999s02, c5868b1)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC5999s02) {
                        return AbstractC6014x.f9522f;
                    }
                }
            }
            boolean zM5431d = c5868b1.m5431d();
            C5989p c5989p = obj2 instanceof C5989p ? (C5989p) obj2 : null;
            if (c5989p != null) {
                c5868b1.m5428a(c5989p.f9486a);
            }
            ?? M5430c = zM5431d ? 0 : c5868b1.m5430c();
            ref$ObjectRef.element = M5430c;
            if (M5430c != 0) {
                m5449R(c5897f1M5442H, M5430c);
            }
            C5974k c5974kM5433Q = m5433Q(c5897f1M5442H);
            if (c5974kM5433Q != null && m5455Z(c5868b1, c5974kM5433Q, obj2)) {
                return AbstractC6014x.f9521e;
            }
            c5897f1M5442H.m5590c(new C5475g(2), 2);
            C5974k c5974kM5433Q2 = m5433Q(c5897f1M5442H);
            return (c5974kM5433Q2 == null || !m5455Z(c5868b1, c5974kM5433Q2, obj2)) ? m5437C(c5868b1, obj2) : AbstractC6014x.f9521e;
        }
    }

    /* renamed from: Z */
    public final boolean m5455Z(C5868b1 c5868b1, C5974k c5974k, Object obj) {
        while (c5974k.f9466e.m5445L(false, new C5865a1(this, c5868b1, c5974k, obj)) == C5966h1.f9456a) {
            c5974k = m5433Q(c5974k);
            if (c5974k == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo5424y(), null, this);
        }
        mo5463w(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: e */
    public final Object mo5456e(ContinuationImpl continuationImpl) {
        Object obj;
        C5443s c5443s;
        do {
            obj = f9288a.get(this);
            boolean z8 = obj instanceof InterfaceC5999s0;
            c5443s = C5443s.f8405a;
            if (!z8) {
                AbstractC6014x.m5639j(continuationImpl.getContext());
                return c5443s;
            }
        } while (m5453W(obj) < 0);
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(continuationImpl));
        c5961g.m5584u();
        c5961g.m5586w(new C5892e(AbstractC6014x.m5646q(this, new C5967i(c5961g, 1)), 1));
        Object objM5583t = c5961g.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM5583t != coroutineSingletons) {
            objM5583t = c5443s;
        }
        return objM5583t == coroutineSingletons ? objM5583t : c5443s;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: f */
    public final CancellationException mo5457f() {
        CancellationException cancellationException;
        Object obj = f9288a.get(this);
        if (!(obj instanceof C5868b1)) {
            if (obj instanceof InterfaceC5999s0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C5989p)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C5989p) obj).f9486a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(mo5424y(), th, this) : cancellationException;
        }
        Throwable thM5430c = ((C5868b1) obj).m5430c();
        if (thM5430c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM5430c instanceof CancellationException ? (CancellationException) thM5430c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo5424y();
        }
        return new JobCancellationException(strConcat, thM5430c, this);
    }

    @Override // p075h6.InterfaceC5636h
    public final Object fold(Object obj, InterfaceC6473e interfaceC6473e) {
        return AbstractC6600a.m6230a(this, obj, interfaceC6473e);
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: g */
    public final InterfaceC5971j mo5458g(C5871c1 c5871c1) {
        C5974k c5974k = new C5974k(c5871c1);
        c5974k.f9530d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9288a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C5968i0) {
                C5968i0 c5968i0 = (C5968i0) obj;
                if (c5968i0.f9459a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5974k)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m5451U(c5968i0);
            } else {
                boolean z8 = obj instanceof InterfaceC5999s0;
                C5966h1 c5966h1 = C5966h1.f9456a;
                if (!z8) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C5989p c5989p = obj2 instanceof C5989p ? (C5989p) obj2 : null;
                    c5974k.mo5427j(c5989p != null ? c5989p.f9486a : null);
                    return c5966h1;
                }
                C5897f1 c5897f1Mo5429b = ((InterfaceC5999s0) obj).mo5429b();
                if (c5897f1Mo5429b == null) {
                    AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m5452V((AbstractC6017y0) obj);
                } else if (!c5897f1Mo5429b.m5590c(c5974k, 7)) {
                    boolean zM5590c = c5897f1Mo5429b.m5590c(c5974k, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C5868b1) {
                        thM5430c = ((C5868b1) obj3).m5430c();
                    } else {
                        C5989p c5989p2 = obj3 instanceof C5989p ? (C5989p) obj3 : null;
                        if (c5989p2 != null) {
                            thM5430c = c5989p2.f9486a;
                        }
                    }
                    c5974k.mo5427j(thM5430c);
                    if (zM5590c) {
                        break loop0;
                    }
                    return c5966h1;
                }
            }
        }
        return c5974k;
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5634f get(InterfaceC5635g interfaceC5635g) {
        return AbstractC6600a.m6231b(this, interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5634f
    public final InterfaceC5635g getKey() {
        return C6010v0.f9513a;
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: h */
    public final InterfaceC5962g0 mo5459h(InterfaceC6471c interfaceC6471c) {
        return m5445L(true, new C5965h0(interfaceC6471c, 1));
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    public boolean isActive() {
        Object obj = f9288a.get(this);
        return (obj instanceof InterfaceC5999s0) && ((InterfaceC5999s0) obj).isActive();
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h minusKey(InterfaceC5635g interfaceC5635g) {
        return AbstractC6600a.m6237m(this, interfaceC5635g);
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    /* renamed from: p */
    public final InterfaceC5962g0 mo5460p(boolean z8, boolean z9, InterfaceC6471c interfaceC6471c) {
        return m5445L(z9, z8 ? new C6007u0(interfaceC6471c) : new C5965h0(interfaceC6471c, 1));
    }

    @Override // p075h6.InterfaceC5636h
    public final InterfaceC5636h plus(InterfaceC5636h interfaceC5636h) {
        return AbstractC6600a.m6239o(interfaceC5636h, this);
    }

    /* renamed from: s */
    public void mo4860s(Object obj) {
    }

    @Override // kotlinx.coroutines.InterfaceC6013w0
    public final boolean start() {
        int iM5453W;
        do {
            iM5453W = m5453W(f9288a.get(this));
            if (iM5453W == 0) {
                return false;
            }
        } while (iM5453W != 1);
        return true;
    }

    /* renamed from: t */
    public void mo4861t(Object obj) {
        mo4860s(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5448P() + '{' + m5434X(f9288a.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC6014x.m5642m(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final Object m5461u(ContinuationImpl continuationImpl) throws Throwable {
        Object obj;
        do {
            obj = f9288a.get(this);
            if (!(obj instanceof InterfaceC5999s0)) {
                if (obj instanceof C5989p) {
                    throw ((C5989p) obj).f9486a;
                }
                return AbstractC6014x.m5624D(obj);
            }
        } while (m5453W(obj) < 0);
        C6019z0 c6019z0 = new C6019z0(this, AbstractC6683l.m6374n(continuationImpl));
        c6019z0.m5584u();
        c6019z0.m5586w(new C5892e(AbstractC6014x.m5646q(this, new C5965h0(c6019z0, 2)), 1));
        Object objM5583t = c6019z0.m5583t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5583t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r0
      0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5462v(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5871c1.m5462v(java.lang.Object):boolean");
    }

    /* renamed from: w */
    public void mo5463w(CancellationException cancellationException) {
        m5462v(cancellationException);
    }

    /* renamed from: x */
    public final boolean m5464x(Throwable th) {
        if (mo4858M()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC5971j interfaceC5971j = (InterfaceC5971j) f9289b.get(this);
        return (interfaceC5971j == null || interfaceC5971j == C5966h1.f9456a) ? z8 : interfaceC5971j.mo5589a(th) || z8;
    }

    /* renamed from: y */
    public String mo5424y() {
        return "Job was cancelled";
    }

    /* renamed from: z */
    public boolean mo5465z(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m5462v(th) && mo5440F();
    }

    /* renamed from: J */
    public void mo5420J(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }
}

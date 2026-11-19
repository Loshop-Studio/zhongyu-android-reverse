package kotlinx.coroutines;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.zykj.mistake.feature.collection.detail.C4589e1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p054e7.AbstractC5484p;
import p054e7.C5473e;
import p054e7.C5486r;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p083i6.InterfaceC5682b;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

/* renamed from: kotlinx.coroutines.g */
/* loaded from: classes4.dex */
public class C5961g extends AbstractC5893e0 implements InterfaceC5895f, InterfaceC5682b, InterfaceC6008u1 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9447f = AtomicIntegerFieldUpdater.newUpdater(C5961g.class, "_decisionAndIndex$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9448g = AtomicReferenceFieldUpdater.newUpdater(C5961g.class, Object.class, "_state$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9449h = AtomicReferenceFieldUpdater.newUpdater(C5961g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public final InterfaceC5631c f9450d;

    /* renamed from: e */
    public final InterfaceC5636h f9451e;

    public C5961g(int i, InterfaceC5631c interfaceC5631c) {
        super(i);
        this.f9450d = interfaceC5631c;
        this.f9451e = interfaceC5631c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C5866b.f9281a;
    }

    /* renamed from: D */
    public static Object m5572D(InterfaceC5969i1 interfaceC5969i1, Object obj, int i, InterfaceC6474f interfaceC6474f) {
        if (obj instanceof C5989p) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC6474f != null || (interfaceC5969i1 instanceof C5892e)) {
            return new C5986o(obj, interfaceC5969i1 instanceof C5892e ? (C5892e) interfaceC5969i1 : null, interfaceC6474f, (Throwable) null, 16);
        }
        return obj;
    }

    /* renamed from: y */
    public static void m5573y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: A */
    public final void m5574A() {
        InterfaceC5631c interfaceC5631c = this.f9450d;
        Throwable th = null;
        C5473e c5473e = interfaceC5631c instanceof C5473e ? (C5473e) interfaceC5631c : null;
        if (c5473e != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5473e.f8449h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c5473e);
                C5486r c5486r = AbstractC5469a.f8440c;
                if (obj == c5486r) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c5473e, c5486r, this)) {
                        if (atomicReferenceFieldUpdater.get(c5473e) != c5486r) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c5473e, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c5473e) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m5580p();
            mo4965i(th);
        }
    }

    /* renamed from: B */
    public final void m5575B(Object obj, int i, InterfaceC6474f interfaceC6474f) throws DispatchException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9448g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC5969i1) {
                Object objM5572D = m5572D((InterfaceC5969i1) obj2, obj, i, interfaceC6474f);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM5572D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m5587x()) {
                    m5580p();
                }
                m5581q(i);
                return;
            }
            if (obj2 instanceof C5964h) {
                C5964h c5964h = (C5964h) obj2;
                c5964h.getClass();
                if (C5964h.f9453c.compareAndSet(c5964h, 0, 1)) {
                    if (interfaceC6474f != null) {
                        m5578l(interfaceC6474f, c5964h.f9486a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* renamed from: C */
    public final void m5576C(AbstractC5995r abstractC5995r) {
        InterfaceC5631c interfaceC5631c = this.f9450d;
        C5473e c5473e = interfaceC5631c instanceof C5473e ? (C5473e) interfaceC5631c : null;
        m5575B(C5443s.f8405a, (c5473e != null ? c5473e.f8450d : null) == abstractC5995r ? 4 : this.f9341c, null);
    }

    @Override // kotlinx.coroutines.InterfaceC6008u1
    /* renamed from: a */
    public final void mo4962a(AbstractC5484p abstractC5484p, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f9447f;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i));
        m5586w(abstractC5484p);
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: b */
    public final void mo4963b(Object obj, InterfaceC6474f interfaceC6474f) throws DispatchException {
        m5575B(obj, this.f9341c, interfaceC6474f);
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: c */
    public final void mo5515c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9448g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC5969i1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C5989p) {
                return;
            }
            if (!(obj instanceof C5986o)) {
                cancellationException2 = cancellationException;
                C5986o c5986o = new C5986o(obj, (C5892e) null, (InterfaceC6474f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5986o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C5986o c5986o2 = (C5986o) obj;
            if (c5986o2.f9479e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C5986o c5986oM5602a = C5986o.m5602a(c5986o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5986oM5602a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C5892e c5892e = c5986o2.f9476b;
            if (c5892e != null) {
                m5577k(c5892e, cancellationException);
            }
            InterfaceC6474f interfaceC6474f = c5986o2.f9477c;
            if (interfaceC6474f != null) {
                m5578l(interfaceC6474f, cancellationException, c5986o2.f9475a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: d */
    public final void mo4964d(Object obj, InterfaceC6471c interfaceC6471c) {
        m5575B(obj, this.f9341c, interfaceC6471c != null ? new C4589e1(interfaceC6471c, 2) : null);
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: e */
    public final InterfaceC5631c mo4843e() {
        return this.f9450d;
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: f */
    public final Throwable mo5516f(Object obj) {
        Throwable thMo5516f = super.mo5516f(obj);
        if (thMo5516f != null) {
            return thMo5516f;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: g */
    public final Object mo5517g(Object obj) {
        return obj instanceof C5986o ? ((C5986o) obj).f9475a : obj;
    }

    @Override // p083i6.InterfaceC5682b
    public final InterfaceC5682b getCallerFrame() {
        InterfaceC5631c interfaceC5631c = this.f9450d;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return this.f9451e;
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: i */
    public final boolean mo4965i(Throwable th) throws DispatchException {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9448g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC5969i1)) {
                return false;
            }
            boolean z8 = (obj instanceof C5892e) || (obj instanceof AbstractC5484p);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C5964h c5964h = new C5964h(z8, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5964h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC5969i1 interfaceC5969i1 = (InterfaceC5969i1) obj;
            if (interfaceC5969i1 instanceof C5892e) {
                m5577k((C5892e) obj, th);
            } else if (interfaceC5969i1 instanceof AbstractC5484p) {
                m5579o((AbstractC5484p) obj, th);
            }
            if (!m5587x()) {
                m5580p();
            }
            m5581q(this.f9341c);
            return true;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    public final boolean isActive() {
        return f9448g.get(this) instanceof InterfaceC5969i1;
    }

    @Override // kotlinx.coroutines.AbstractC5893e0
    /* renamed from: j */
    public final Object mo4844j() {
        return f9448g.get(this);
    }

    /* renamed from: k */
    public final void m5577k(C5892e c5892e, Throwable th) {
        try {
            switch (c5892e.f9339a) {
                case 0:
                    ((InterfaceC6471c) c5892e.f9340b).invoke(th);
                    break;
                default:
                    ((InterfaceC5962g0) c5892e.f9340b).dispose();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC6014x.m5645p(this.f9451e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void m5578l(InterfaceC6474f interfaceC6474f, Throwable th, Object obj) {
        InterfaceC5636h interfaceC5636h = this.f9451e;
        try {
            interfaceC6474f.invoke(th, obj, interfaceC5636h);
        } catch (Throwable th2) {
            AbstractC6014x.m5645p(interfaceC5636h, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: m */
    public final void mo4966m(InterfaceC6471c interfaceC6471c) {
        m5586w(new C5892e(interfaceC6471c, 0));
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: n */
    public final C5486r mo4967n(Object obj, InterfaceC6474f interfaceC6474f) {
        C5486r c5486r = AbstractC6014x.f9517a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9448g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC5969i1)) {
                return null;
            }
            Object objM5572D = m5572D((InterfaceC5969i1) obj2, obj, this.f9341c, interfaceC6474f);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM5572D)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m5587x()) {
                m5580p();
            }
            return c5486r;
        }
    }

    /* renamed from: o */
    public final void m5579o(AbstractC5484p abstractC5484p, Throwable th) {
        InterfaceC5636h interfaceC5636h = this.f9451e;
        int i = f9447f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC5484p.mo4864g(i, interfaceC5636h);
        } catch (Throwable th2) {
            AbstractC6014x.m5645p(interfaceC5636h, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: p */
    public final void m5580p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9449h;
        InterfaceC5962g0 interfaceC5962g0 = (InterfaceC5962g0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC5962g0 == null) {
            return;
        }
        interfaceC5962g0.dispose();
        atomicReferenceFieldUpdater.set(this, C5966h1.f9456a);
    }

    /* renamed from: q */
    public final void m5581q(int i) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f9447f;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z8 = i == 4;
                InterfaceC5631c interfaceC5631c = this.f9450d;
                if (!z8 && (interfaceC5631c instanceof C5473e)) {
                    boolean z9 = i == 1 || i == 2;
                    int i10 = this.f9341c;
                    if (z9 == (i10 == 1 || i10 == 2)) {
                        C5473e c5473e = (C5473e) interfaceC5631c;
                        AbstractC5995r abstractC5995r = c5473e.f8450d;
                        InterfaceC5636h context = c5473e.f8451e.getContext();
                        if (AbstractC5469a.m4834j(abstractC5995r, context)) {
                            AbstractC5469a.m4833i(abstractC5995r, context, this);
                            return;
                        }
                        AbstractC5987o0 abstractC5987o0M5608a = AbstractC5988o1.m5608a();
                        if (abstractC5987o0M5608a.f9481a >= 4294967296L) {
                            abstractC5987o0M5608a.m5604k(this);
                            return;
                        }
                        abstractC5987o0M5608a.m5605m(true);
                        try {
                            AbstractC6014x.m5654y(this, interfaceC5631c, true);
                            do {
                            } while (abstractC5987o0M5608a.m5606o());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC6014x.m5654y(this, interfaceC5631c, z8);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, BasicMeasure.EXACTLY + (536870911 & i8)));
    }

    @Override // kotlinx.coroutines.InterfaceC5895f
    /* renamed from: r */
    public final void mo4968r(Object obj) {
        m5581q(this.f9341c);
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(obj);
        if (thM13959exceptionOrNullimpl != null) {
            obj = new C5989p(false, thM13959exceptionOrNullimpl);
        }
        m5575B(obj, this.f9341c, null);
    }

    /* renamed from: s */
    public Throwable mo5582s(C5871c1 c5871c1) {
        return c5871c1.mo5457f();
    }

    /* renamed from: t */
    public final Object m5583t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC6013w0 interfaceC6013w0;
        boolean zM5587x = m5587x();
        do {
            atomicIntegerFieldUpdater = f9447f;
            i = atomicIntegerFieldUpdater.get(this);
            int i8 = i >> 29;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM5587x) {
                    m5574A();
                }
                Object obj = f9448g.get(this);
                if (obj instanceof C5989p) {
                    throw ((C5989p) obj).f9486a;
                }
                int i9 = this.f9341c;
                if ((i9 != 1 && i9 != 2) || (interfaceC6013w0 = (InterfaceC6013w0) this.f9451e.get(C6010v0.f9513a)) == null || interfaceC6013w0.isActive()) {
                    return mo5517g(obj);
                }
                CancellationException cancellationExceptionMo5457f = interfaceC6013w0.mo5457f();
                mo5515c(cancellationExceptionMo5457f);
                throw cancellationExceptionMo5457f;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC5962g0) f9449h.get(this)) == null) {
            m5585v();
        }
        if (zM5587x) {
            m5574A();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5588z());
        sb.append('(');
        sb.append(AbstractC6014x.m5623C(this.f9450d));
        sb.append("){");
        Object obj = f9448g.get(this);
        sb.append(obj instanceof InterfaceC5969i1 ? "Active" : obj instanceof C5964h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC6014x.m5642m(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final void m5584u() {
        InterfaceC5962g0 interfaceC5962g0M5585v = m5585v();
        if (interfaceC5962g0M5585v == null || (f9448g.get(this) instanceof InterfaceC5969i1)) {
            return;
        }
        interfaceC5962g0M5585v.dispose();
        f9449h.set(this, C5966h1.f9456a);
    }

    /* renamed from: v */
    public final InterfaceC5962g0 m5585v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) this.f9451e.get(C6010v0.f9513a);
        if (interfaceC6013w0 == null) {
            return null;
        }
        InterfaceC5962g0 interfaceC5962g0M5646q = AbstractC6014x.m5646q(interfaceC6013w0, new C5967i(this, 0));
        do {
            atomicReferenceFieldUpdater = f9449h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC5962g0M5646q)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC5962g0M5646q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        m5573y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        throw null;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5586w(kotlinx.coroutines.InterfaceC5969i1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.C5961g.f9448g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof kotlinx.coroutines.C5866b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto Lae
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof kotlinx.coroutines.C5892e
            r3 = 0
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof p054e7.AbstractC5484p
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof kotlinx.coroutines.C5989p
            if (r1 == 0) goto L5b
            r0 = r2
            kotlinx.coroutines.p r0 = (kotlinx.coroutines.C5989p) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.C5989p.f9485b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L57
            boolean r1 = r2 instanceof kotlinx.coroutines.C5964h
            if (r1 == 0) goto Lae
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.f9486a
        L42:
            boolean r0 = r8 instanceof kotlinx.coroutines.C5892e
            if (r0 == 0) goto L4c
            kotlinx.coroutines.e r8 = (kotlinx.coroutines.C5892e) r8
            r7.m5577k(r8, r3)
            return
        L4c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r8, r0)
            e7.p r8 = (p054e7.AbstractC5484p) r8
            r7.m5579o(r8, r3)
            return
        L57:
            m5573y(r8, r2)
            throw r3
        L5b:
            boolean r1 = r2 instanceof kotlinx.coroutines.C5986o
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L94
            r1 = r2
            kotlinx.coroutines.o r1 = (kotlinx.coroutines.C5986o) r1
            kotlinx.coroutines.e r5 = r1.f9476b
            if (r5 != 0) goto L90
            boolean r5 = r8 instanceof p054e7.AbstractC5484p
            if (r5 == 0) goto L6d
            return
        L6d:
            kotlin.jvm.internal.AbstractC5830k.m5328e(r8, r4)
            r4 = r8
            kotlinx.coroutines.e r4 = (kotlinx.coroutines.C5892e) r4
            java.lang.Throwable r5 = r1.f9479e
            if (r5 == 0) goto L7b
            r7.m5577k(r4, r5)
            return
        L7b:
            r5 = 29
            kotlinx.coroutines.o r1 = kotlinx.coroutines.C5986o.m5602a(r1, r4, r3, r5)
        L81:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L88
            goto Lae
        L88:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L81
            goto L0
        L90:
            m5573y(r8, r2)
            throw r3
        L94:
            boolean r1 = r8 instanceof p054e7.AbstractC5484p
            if (r1 == 0) goto L99
            return
        L99:
            kotlin.jvm.internal.AbstractC5830k.m5328e(r8, r4)
            r3 = r8
            kotlinx.coroutines.e r3 = (kotlinx.coroutines.C5892e) r3
            kotlinx.coroutines.o r1 = new kotlinx.coroutines.o
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        La8:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto Laf
        Lae:
            return
        Laf:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto La8
            goto L0
        Lb7:
            m5573y(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5961g.m5586w(kotlinx.coroutines.i1):void");
    }

    /* renamed from: x */
    public final boolean m5587x() {
        if (this.f9341c != 2) {
            return false;
        }
        InterfaceC5631c interfaceC5631c = this.f9450d;
        AbstractC5830k.m5328e(interfaceC5631c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C5473e.f8449h.get((C5473e) interfaceC5631c) != null;
    }

    /* renamed from: z */
    public String mo5588z() {
        return "CancellableContinuation";
    }
}

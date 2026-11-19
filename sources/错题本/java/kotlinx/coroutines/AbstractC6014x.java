package kotlinx.coroutines;

import androidx.navigation.C2827b;
import coil3.network.AbstractC3315g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p046d7.C5447d;
import p054e7.AbstractC5469a;
import p054e7.C5471c;
import p054e7.C5473e;
import p054e7.C5483o;
import p054e7.C5486r;
import p054e7.C5488t;
import p068g7.C5609e;
import p075h6.C5632d;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5633e;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p083i6.InterfaceC5682b;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.x */
/* loaded from: classes4.dex */
public abstract class AbstractC6014x {

    /* renamed from: a */
    public static final C5486r f9517a = new C5486r("RESUME_TOKEN");

    /* renamed from: b */
    public static final C5486r f9518b = new C5486r("REMOVED_TASK");

    /* renamed from: c */
    public static final C5486r f9519c = new C5486r("CLOSED_EMPTY");

    /* renamed from: d */
    public static final C5486r f9520d = new C5486r("COMPLETING_ALREADY");

    /* renamed from: e */
    public static final C5486r f9521e = new C5486r("COMPLETING_WAITING_CHILDREN");

    /* renamed from: f */
    public static final C5486r f9522f = new C5486r("COMPLETING_RETRY");

    /* renamed from: g */
    public static final C5486r f9523g = new C5486r("TOO_LATE_TO_CANCEL");

    /* renamed from: h */
    public static final C5486r f9524h = new C5486r("SEALED");

    /* renamed from: i */
    public static final C5968i0 f9525i = new C5968i0(false);

    /* renamed from: j */
    public static final C5968i0 f9526j = new C5968i0(true);

    /* renamed from: A */
    public static Object m5621A(C2827b c2827b, InterfaceC5631c interfaceC5631c) {
        return m5626F(EmptyCoroutineContext.INSTANCE, new InterruptibleKt$runInterruptible$2(c2827b, null), interfaceC5631c);
    }

    /* renamed from: B */
    public static final Object m5622B(RunnableC5994q1 runnableC5994q1, InterfaceC6473e interfaceC6473e) {
        m5646q(runnableC5994q1, new C5965h0(m5641l(runnableC5994q1.f8476d.getContext()).mo4815a(runnableC5994q1.f9493e, runnableC5994q1, runnableC5994q1.f9276c), 0));
        return AbstractC3315g.m2244m(runnableC5994q1, false, runnableC5994q1, interfaceC6473e);
    }

    /* renamed from: C */
    public static final String m5623C(InterfaceC5631c interfaceC5631c) {
        Object objM13956constructorimpl;
        if (interfaceC5631c instanceof C5473e) {
            return ((C5473e) interfaceC5631c).toString();
        }
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(interfaceC5631c + '@' + m5642m(interfaceC5631c));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
            objM13956constructorimpl = interfaceC5631c.getClass().getName() + '@' + m5642m(interfaceC5631c);
        }
        return (String) objM13956constructorimpl;
    }

    /* renamed from: D */
    public static final Object m5624D(Object obj) {
        InterfaceC5999s0 interfaceC5999s0;
        C6004t0 c6004t0 = obj instanceof C6004t0 ? (C6004t0) obj : null;
        return (c6004t0 == null || (interfaceC5999s0 = c6004t0.f9508a) == null) ? obj : interfaceC5999s0;
    }

    /* renamed from: E */
    public static final C6000s1 m5625E(InterfaceC5631c interfaceC5631c, InterfaceC5636h interfaceC5636h, Object obj) {
        C6000s1 c6000s1 = null;
        if ((interfaceC5631c instanceof InterfaceC5682b) && interfaceC5636h.get(C6005t1.f9509a) != null) {
            InterfaceC5682b callerFrame = (InterfaceC5682b) interfaceC5631c;
            while (true) {
                if ((callerFrame instanceof C5890d0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof C6000s1) {
                    c6000s1 = (C6000s1) callerFrame;
                    break;
                }
            }
            if (c6000s1 != null) {
                c6000s1.m5613f0(interfaceC5636h, obj);
            }
        }
        return c6000s1;
    }

    /* renamed from: F */
    public static final Object m5626F(InterfaceC5636h interfaceC5636h, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c) throws Throwable {
        Object objM5624D;
        InterfaceC5636h context = interfaceC5631c.getContext();
        InterfaceC5636h interfaceC5636hPlus = !((Boolean) interfaceC5636h.fold(Boolean.FALSE, new C5488t(7))).booleanValue() ? context.plus(interfaceC5636h) : m5640k(context, interfaceC5636h, false);
        m5639j(interfaceC5636hPlus);
        if (interfaceC5636hPlus == context) {
            C5483o c5483o = new C5483o(interfaceC5631c, interfaceC5636hPlus);
            objM5624D = AbstractC3315g.m2244m(c5483o, true, c5483o, interfaceC6473e);
        } else {
            C5632d c5632d = C5632d.f8764a;
            if (AbstractC5830k.m5325b(interfaceC5636hPlus.get(c5632d), context.get(c5632d))) {
                C6000s1 c6000s1 = new C6000s1(interfaceC5631c, interfaceC5636hPlus);
                InterfaceC5636h interfaceC5636h2 = c6000s1.f9276c;
                Object objM4838n = AbstractC5469a.m4838n(interfaceC5636h2, null);
                try {
                    Object objM2244m = AbstractC3315g.m2244m(c6000s1, true, c6000s1, interfaceC6473e);
                    AbstractC5469a.m4831g(interfaceC5636h2, objM4838n);
                    objM5624D = objM2244m;
                } catch (Throwable th) {
                    AbstractC5469a.m4831g(interfaceC5636h2, objM4838n);
                    throw th;
                }
            } else {
                C5890d0 c5890d0 = new C5890d0(interfaceC5631c, interfaceC5636hPlus);
                AbstractC0000a.m13p(interfaceC6473e, c5890d0, c5890d0);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5890d0.f9337e;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(c5890d0);
                    if (i != 0) {
                        if (i != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objM5624D = m5624D(C5871c1.f9288a.get(c5890d0));
                        if (objM5624D instanceof C5989p) {
                            throw ((C5989p) objM5624D).f9486a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c5890d0, 0, 1)) {
                        objM5624D = CoroutineSingletons.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5624D;
    }

    /* renamed from: G */
    public static final Object m5627G(long j7, InterfaceC6473e interfaceC6473e, SuspendLambda suspendLambda) {
        if (j7 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objM5622B = m5622B(new RunnableC5994q1(j7, suspendLambda), interfaceC6473e);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5622B;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.q1] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5628H(long r6, p152r6.InterfaceC6473e r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r7 = r0.L$0
            r6.e r7 = (p152r6.InterfaceC6473e) r7
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L2f
            return r9
        L2f:
            r7 = move-exception
            goto L61
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.AbstractC5774b.m5119b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L43
            goto L67
        L43:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.L$0 = r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            r0.L$1 = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            r0.J$0 = r6     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            r0.label = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            kotlinx.coroutines.q1 r2 = new kotlinx.coroutines.q1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            r9.element = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            java.lang.Object r6 = m5622B(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5f
            if (r6 != r1) goto L5e
            return r1
        L5e:
            return r6
        L5f:
            r7 = move-exception
            r6 = r9
        L61:
            kotlinx.coroutines.w0 r8 = r7.coroutine
            T r6 = r6.element
            if (r8 != r6) goto L69
        L67:
            r6 = 0
            return r6
        L69:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC6014x.m5628H(long, r6.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5629I(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            h6.h r0 = r7.getContext()
            m5639j(r0)
            h6.c r7 = p185v7.AbstractC6683l.m6374n(r7)
            boolean r1 = r7 instanceof p054e7.C5473e
            if (r1 == 0) goto L12
            e7.e r7 = (p054e7.C5473e) r7
            goto L13
        L12:
            r7 = 0
        L13:
            d6.s r1 = p045d6.C5443s.f8405a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L88
        L1a:
            kotlinx.coroutines.r r2 = r7.f8450d
            boolean r3 = p054e7.AbstractC5469a.m4834j(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f8452f = r1
            r7.f9341c = r4
            r2.dispatchYield(r0, r7)
            goto L86
        L2b:
            kotlinx.coroutines.v1 r3 = new kotlinx.coroutines.v1
            kotlinx.coroutines.v0 r5 = kotlinx.coroutines.C6011v1.f9514b
            r3.<init>(r5)
            h6.h r0 = r0.plus(r3)
            r7.f8452f = r1
            r7.f9341c = r4
            r2.dispatchYield(r0, r7)
            boolean r0 = r3.f9515a
            if (r0 == 0) goto L86
            kotlinx.coroutines.o0 r0 = kotlinx.coroutines.AbstractC5988o1.m5608a()
            kotlin.collections.p r2 = r0.f9483c
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.f9481a
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            r2 = r4
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6c
            r7.f8452f = r1
            r7.f9341c = r4
            r0.m5604k(r7)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L88
        L6c:
            r0.m5605m(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r2 = r0.m5606o()     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L72
        L78:
            r0.m5603d(r4)
            goto L17
        L7c:
            r2 = move-exception
            r7.m5518h(r2)     // Catch: java.lang.Throwable -> L81
            goto L78
        L81:
            r7 = move-exception
            r0.m5603d(r4)
            throw r7
        L86:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
        L88:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r0) goto L8d
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC6014x.m5629I(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: a */
    public static final C5471c m5630a(InterfaceC5636h interfaceC5636h) {
        if (interfaceC5636h.get(C6010v0.f9513a) == null) {
            interfaceC5636h = interfaceC5636h.plus(m5631b());
        }
        return new C5471c(interfaceC5636h);
    }

    /* renamed from: b */
    public static C6015x0 m5631b() {
        return new C6015x0(null);
    }

    /* renamed from: c */
    public static C5982m1 m5632c() {
        return new C5982m1(null);
    }

    /* renamed from: d */
    public static C5867b0 m5633d(InterfaceC6009v interfaceC6009v, C5447d c5447d, InterfaceC6473e interfaceC6473e, int i) {
        InterfaceC5636h interfaceC5636h = c5447d;
        if ((i & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        InterfaceC5636h interfaceC5636hM5652w = m5652w(interfaceC6009v, interfaceC5636h);
        C5867b0 c5891d1 = coroutineStart.isLazy() ? new C5891d1(interfaceC5636hM5652w, interfaceC6473e) : new C5867b0(interfaceC5636hM5652w, true);
        coroutineStart.invoke(interfaceC6473e, c5891d1, c5891d1);
        return c5891d1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m5634e(kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.DelayKt$awaitCancellation$1 r0 = new kotlinx.coroutines.DelayKt$awaitCancellation$1
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            kotlin.AbstractC5774b.m5119b(r4)
            goto L47
        L2f:
            kotlin.AbstractC5774b.m5119b(r4)
            r0.label = r3
            kotlinx.coroutines.g r4 = new kotlinx.coroutines.g
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)
            r4.<init>(r3, r0)
            r4.m5584u()
            java.lang.Object r4 = r4.m5583t()
            if (r4 != r1) goto L47
            return r1
        L47:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC6014x.m5634e(kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* renamed from: f */
    public static final void m5635f(InterfaceC6009v interfaceC6009v, CancellationException cancellationException) {
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC6009v.getCoroutineContext().get(C6010v0.f9513a);
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC6009v).toString());
        }
    }

    /* renamed from: g */
    public static final Object m5636g(InterfaceC6013w0 interfaceC6013w0, SuspendLambda suspendLambda) {
        interfaceC6013w0.cancel(null);
        Object objMo5456e = interfaceC6013w0.mo5456e(suspendLambda);
        return objMo5456e == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5456e : C5443s.f8405a;
    }

    /* renamed from: h */
    public static final Object m5637h(InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c) {
        C5483o c5483o = new C5483o(interfaceC5631c, interfaceC5631c.getContext());
        Object objM2244m = AbstractC3315g.m2244m(c5483o, true, c5483o, interfaceC6473e);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM2244m;
    }

    /* renamed from: i */
    public static final Object m5638i(long j7, InterfaceC5631c interfaceC5631c) {
        if (j7 > 0) {
            C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
            c5961g.m5584u();
            if (j7 < Long.MAX_VALUE) {
                m5641l(c5961g.f9451e).mo4816b(j7, c5961g);
            }
            Object objM5583t = c5961g.m5583t();
            if (objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM5583t;
            }
        }
        return C5443s.f8405a;
    }

    /* renamed from: j */
    public static final void m5639j(InterfaceC5636h interfaceC5636h) {
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a);
        if (interfaceC6013w0 != null && !interfaceC6013w0.isActive()) {
            throw interfaceC6013w0.mo5457f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: k */
    public static final InterfaceC5636h m5640k(InterfaceC5636h interfaceC5636h, InterfaceC5636h interfaceC5636h2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC5636h.fold(bool, new C5488t(7))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC5636h2.fold(bool, new C5488t(7))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC5636h.plus(interfaceC5636h2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = interfaceC5636h2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC5636h interfaceC5636h3 = (InterfaceC5636h) interfaceC5636h.fold(emptyCoroutineContext, new C5488t(8));
        if (zBooleanValue2) {
            ref$ObjectRef.element = ((InterfaceC5636h) ref$ObjectRef.element).fold(emptyCoroutineContext, new C5488t(9));
        }
        return interfaceC5636h3.plus((InterfaceC5636h) ref$ObjectRef.element);
    }

    /* renamed from: l */
    public static final InterfaceC5870c0 m5641l(InterfaceC5636h interfaceC5636h) {
        InterfaceC5634f interfaceC5634f = interfaceC5636h.get(C5632d.f8764a);
        InterfaceC5870c0 interfaceC5870c0 = interfaceC5634f instanceof InterfaceC5870c0 ? (InterfaceC5870c0) interfaceC5634f : null;
        return interfaceC5870c0 == null ? AbstractC6018z.f9531a : interfaceC5870c0;
    }

    /* renamed from: m */
    public static final String m5642m(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: n */
    public static final InterfaceC6013w0 m5643n(InterfaceC5636h interfaceC5636h) {
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a);
        if (interfaceC6013w0 != null) {
            return interfaceC6013w0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC5636h).toString());
    }

    /* renamed from: o */
    public static final C5961g m5644o(InterfaceC5631c interfaceC5631c) {
        C5961g c5961g;
        C5961g c5961g2;
        if (!(interfaceC5631c instanceof C5473e)) {
            return new C5961g(1, interfaceC5631c);
        }
        C5473e c5473e = (C5473e) interfaceC5631c;
        C5486r c5486r = AbstractC5469a.f8440c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5473e.f8449h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c5473e);
            c5961g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c5473e, c5486r);
                c5961g2 = null;
                break;
            }
            if (obj instanceof C5961g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c5473e, obj, c5486r)) {
                    if (atomicReferenceFieldUpdater.get(c5473e) != obj) {
                        break;
                    }
                }
                c5961g2 = (C5961g) obj;
                break loop0;
            }
            if (obj != c5486r && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c5961g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C5961g.f9448g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c5961g2);
            if (!(obj2 instanceof C5986o) || ((C5986o) obj2).f9478d == null) {
                C5961g.f9447f.set(c5961g2, 536870911);
                atomicReferenceFieldUpdater2.set(c5961g2, C5866b.f9281a);
                c5961g = c5961g2;
            } else {
                c5961g2.m5580p();
            }
            if (c5961g != null) {
                return c5961g;
            }
        }
        return new C5961g(2, interfaceC5631c);
    }

    /* renamed from: p */
    public static final void m5645p(InterfaceC5636h interfaceC5636h, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            InterfaceC6003t interfaceC6003t = (InterfaceC6003t) interfaceC5636h.get(C5998s.f9496a);
            if (interfaceC6003t != null) {
                interfaceC6003t.handleException(interfaceC5636h, th);
            } else {
                AbstractC5469a.m4828d(interfaceC5636h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC5806u.m5266e(runtimeException, th);
                th = runtimeException;
            }
            AbstractC5469a.m4828d(interfaceC5636h, th);
        }
    }

    /* renamed from: q */
    public static InterfaceC5962g0 m5646q(InterfaceC6013w0 interfaceC6013w0, AbstractC6017y0 abstractC6017y0) {
        return interfaceC6013w0 instanceof C5871c1 ? ((C5871c1) interfaceC6013w0).m5445L(true, abstractC6017y0) : interfaceC6013w0.mo5460p(abstractC6017y0.mo5426i(), true, new JobKt__JobKt$invokeOnCompletion$1(abstractC6017y0));
    }

    /* renamed from: r */
    public static final boolean m5647r(InterfaceC5636h interfaceC5636h) {
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a);
        if (interfaceC6013w0 != null) {
            return interfaceC6013w0.isActive();
        }
        return true;
    }

    /* renamed from: s */
    public static final boolean m5648s(InterfaceC6009v interfaceC6009v) {
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC6009v.getCoroutineContext().get(C6010v0.f9513a);
        if (interfaceC6013w0 != null) {
            return interfaceC6013w0.isActive();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5649t(java.util.ArrayList r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.AwaitKt$joinAll$3
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt$joinAll$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.AbstractC5774b.m5119b(r5)
            goto L3a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.AbstractC5774b.m5119b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.w0 r5 = (kotlinx.coroutines.InterfaceC6013w0) r5
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo5456e(r0)
            if (r5 != r1) goto L3a
            return r1
        L51:
            d6.s r4 = p045d6.C5443s.f8405a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC6014x.m5649t(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: u */
    public static final C5976k1 m5650u(InterfaceC6009v interfaceC6009v, InterfaceC5636h interfaceC5636h, CoroutineStart coroutineStart, InterfaceC6473e interfaceC6473e) {
        InterfaceC5636h interfaceC5636hM5652w = m5652w(interfaceC6009v, interfaceC5636h);
        C5976k1 c5894e1 = coroutineStart.isLazy() ? new C5894e1(interfaceC5636hM5652w, interfaceC6473e) : new C5976k1(interfaceC5636hM5652w, true);
        coroutineStart.invoke(interfaceC6473e, c5894e1, c5894e1);
        return c5894e1;
    }

    /* renamed from: v */
    public static /* synthetic */ C5976k1 m5651v(InterfaceC6009v interfaceC6009v, InterfaceC5636h interfaceC5636h, CoroutineStart coroutineStart, InterfaceC6473e interfaceC6473e, int i) {
        if ((i & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return m5650u(interfaceC6009v, interfaceC5636h, coroutineStart, interfaceC6473e);
    }

    /* renamed from: w */
    public static final InterfaceC5636h m5652w(InterfaceC6009v interfaceC6009v, InterfaceC5636h interfaceC5636h) {
        InterfaceC5636h interfaceC5636hM5640k = m5640k(interfaceC6009v.getCoroutineContext(), interfaceC5636h, true);
        C5609e c5609e = AbstractC5896f0.f9343a;
        return (interfaceC5636hM5640k == c5609e || interfaceC5636hM5640k.get(C5632d.f8764a) != null) ? interfaceC5636hM5640k : interfaceC5636hM5640k.plus(c5609e);
    }

    /* renamed from: x */
    public static final Object m5653x(Object obj) {
        return obj instanceof C5989p ? Result.m13956constructorimpl(AbstractC5774b.m5118a(((C5989p) obj).f9486a)) : Result.m13956constructorimpl(obj);
    }

    /* renamed from: y */
    public static final void m5654y(C5961g c5961g, InterfaceC5631c interfaceC5631c, boolean z8) {
        Object obj = C5961g.f9448g.get(c5961g);
        Throwable thMo5516f = c5961g.mo5516f(obj);
        Object objM13956constructorimpl = Result.m13956constructorimpl(thMo5516f != null ? AbstractC5774b.m5118a(thMo5516f) : c5961g.mo5517g(obj));
        if (!z8) {
            interfaceC5631c.resumeWith(objM13956constructorimpl);
            return;
        }
        AbstractC5830k.m5328e(interfaceC5631c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C5473e c5473e = (C5473e) interfaceC5631c;
        InterfaceC5631c interfaceC5631c2 = c5473e.f8451e;
        Object obj2 = c5473e.f8453g;
        InterfaceC5636h context = interfaceC5631c2.getContext();
        Object objM4838n = AbstractC5469a.m4838n(context, obj2);
        C6000s1 c6000s1M5625E = objM4838n != AbstractC5469a.f8441d ? m5625E(interfaceC5631c2, context, objM4838n) : null;
        try {
            interfaceC5631c2.resumeWith(objM13956constructorimpl);
            if (c6000s1M5625E == null || c6000s1M5625E.m5611d0()) {
                AbstractC5469a.m4831g(context, objM4838n);
            }
        } catch (Throwable th) {
            if (c6000s1M5625E == null || c6000s1M5625E.m5611d0()) {
                AbstractC5469a.m4831g(context, objM4838n);
            }
            throw th;
        }
    }

    /* renamed from: z */
    public static final Object m5655z(InterfaceC5636h interfaceC5636h, InterfaceC6473e interfaceC6473e) throws Throwable {
        AbstractC5987o0 abstractC5987o0M5608a;
        InterfaceC5636h interfaceC5636hM5640k;
        long jMo5596n;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC5635g interfaceC5635g = C5632d.f8764a;
        InterfaceC5633e interfaceC5633e = (InterfaceC5633e) interfaceC5636h.get(interfaceC5635g);
        if (interfaceC5633e == null) {
            abstractC5987o0M5608a = AbstractC5988o1.m5608a();
            interfaceC5636hM5640k = m5640k(EmptyCoroutineContext.INSTANCE, interfaceC5636h.plus(abstractC5987o0M5608a), true);
            C5609e c5609e = AbstractC5896f0.f9343a;
            if (interfaceC5636hM5640k != c5609e && interfaceC5636hM5640k.get(interfaceC5635g) == null) {
                interfaceC5636hM5640k = interfaceC5636hM5640k.plus(c5609e);
            }
        } else {
            if (interfaceC5633e instanceof AbstractC5987o0) {
            }
            abstractC5987o0M5608a = (AbstractC5987o0) AbstractC5988o1.f9484a.get();
            interfaceC5636hM5640k = m5640k(EmptyCoroutineContext.INSTANCE, interfaceC5636h, true);
            C5609e c5609e2 = AbstractC5896f0.f9343a;
            if (interfaceC5636hM5640k != c5609e2 && interfaceC5636hM5640k.get(interfaceC5635g) == null) {
                interfaceC5636hM5640k = interfaceC5636hM5640k.plus(c5609e2);
            }
        }
        C5869c c5869c = new C5869c(interfaceC5636hM5640k, threadCurrentThread, abstractC5987o0M5608a);
        CoroutineStart.DEFAULT.invoke(interfaceC6473e, c5869c, c5869c);
        AbstractC5987o0 abstractC5987o0 = c5869c.f9287e;
        if (abstractC5987o0 != null) {
            int i = AbstractC5987o0.f9480d;
            abstractC5987o0.m5605m(false);
        }
        while (true) {
            if (abstractC5987o0 != null) {
                try {
                    jMo5596n = abstractC5987o0.mo5596n();
                } catch (Throwable th) {
                    if (abstractC5987o0 != null) {
                        int i8 = AbstractC5987o0.f9480d;
                        abstractC5987o0.m5603d(false);
                    }
                    throw th;
                }
            } else {
                jMo5596n = Long.MAX_VALUE;
            }
            atomicReferenceFieldUpdater = C5871c1.f9288a;
            if (!(atomicReferenceFieldUpdater.get(c5869c) instanceof InterfaceC5999s0)) {
                break;
            }
            LockSupport.parkNanos(c5869c, jMo5596n);
            if (Thread.interrupted()) {
                c5869c.m5462v(new InterruptedException());
            }
        }
        if (abstractC5987o0 != null) {
            int i9 = AbstractC5987o0.f9480d;
            abstractC5987o0.m5603d(false);
        }
        Object objM5624D = m5624D(atomicReferenceFieldUpdater.get(c5869c));
        C5989p c5989p = objM5624D instanceof C5989p ? (C5989p) objM5624D : null;
        if (c5989p == null) {
            return objM5624D;
        }
        throw c5989p.f9486a;
    }
}

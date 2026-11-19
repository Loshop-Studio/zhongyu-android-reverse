package p054e7;

import android.support.v4.media.AbstractC0037f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC5985n1;
import kotlinx.coroutines.InterfaceC6003t;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

/* renamed from: e7.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5469a {

    /* renamed from: a */
    public static final C5486r f8438a = new C5486r("CLOSED");

    /* renamed from: b */
    public static final C5486r f8439b = new C5486r("UNDEFINED");

    /* renamed from: c */
    public static final C5486r f8440c = new C5486r("REUSABLE_CLAIMED");

    /* renamed from: d */
    public static final C5486r f8441d = new C5486r("NO_THREAD_ELEMENTS");

    /* renamed from: e */
    public static final C5488t f8442e = new C5488t(0);

    /* renamed from: f */
    public static final C5488t f8443f = new C5488t(1);

    /* renamed from: g */
    public static final C5488t f8444g = new C5488t(2);

    /* renamed from: a */
    public static final void m4825a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* renamed from: b */
    public static final Object m4826b(AbstractC5484p abstractC5484p, long j7, InterfaceC6473e interfaceC6473e) {
        while (true) {
            if (abstractC5484p.f8478c >= j7 && !abstractC5484p.mo4841c()) {
                return abstractC5484p;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC5470b.f8445a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC5484p);
            C5486r c5486r = f8438a;
            if (obj == c5486r) {
                return c5486r;
            }
            AbstractC5484p abstractC5484p2 = (AbstractC5484p) ((AbstractC5470b) obj);
            if (abstractC5484p2 == null) {
                abstractC5484p2 = (AbstractC5484p) interfaceC6473e.invoke(Long.valueOf(abstractC5484p.f8478c + 1), abstractC5484p);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC5484p, null, abstractC5484p2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC5484p) != null) {
                        break;
                    }
                }
                if (abstractC5484p.mo4841c()) {
                    abstractC5484p.m4842d();
                }
            }
            abstractC5484p = abstractC5484p2;
        }
    }

    /* renamed from: c */
    public static final AbstractC5484p m4827c(Object obj) {
        if (obj != f8438a) {
            return (AbstractC5484p) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* renamed from: d */
    public static final void m4828d(InterfaceC5636h interfaceC5636h, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC5472d.f8448a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC6003t) it.next()).handleException(interfaceC5636h, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC5806u.m5266e(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC5806u.m5266e(th, new DiagnosticCoroutineContextException(interfaceC5636h));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* renamed from: e */
    public static final boolean m4829e(Object obj) {
        return obj == f8438a;
    }

    /* renamed from: f */
    public static final Object m4830f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* renamed from: g */
    public static final void m4831g(InterfaceC5636h interfaceC5636h, Object obj) {
        if (obj == f8441d) {
            return;
        }
        if (!(obj instanceof C5490v)) {
            Object objFold = interfaceC5636h.fold(null, f8443f);
            AbstractC5830k.m5328e(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((InterfaceC5985n1) objFold).restoreThreadContext(interfaceC5636h, obj);
            return;
        }
        C5490v c5490v = (C5490v) obj;
        InterfaceC5985n1[] interfaceC5985n1Arr = c5490v.f8488c;
        int length = interfaceC5985n1Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC5985n1 interfaceC5985n1 = interfaceC5985n1Arr[length];
            AbstractC5830k.m5327d(interfaceC5985n1);
            interfaceC5985n1.restoreThreadContext(interfaceC5636h, c5490v.f8487b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: all -> 0x006d, DONT_GENERATE, TryCatch #2 {all -> 0x006d, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x0091, B:23:0x006f, B:25:0x007d, B:30:0x0088, B:32:0x008e, B:38:0x009e, B:41:0x00a7, B:40:0x00a4, B:28:0x0083), top: B:54:0x0049, inners: #0 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4832h(p075h6.InterfaceC5631c r9, java.lang.Object r10) throws kotlinx.coroutines.DispatchException {
        /*
            boolean r0 = r9 instanceof p054e7.C5473e
            if (r0 == 0) goto Lb2
            e7.e r9 = (p054e7.C5473e) r9
            kotlinx.coroutines.r r0 = r9.f8450d
            java.lang.Throwable r1 = kotlin.Result.m13959exceptionOrNullimpl(r10)
            if (r1 != 0) goto L10
            r2 = r10
            goto L16
        L10:
            kotlinx.coroutines.p r2 = new kotlinx.coroutines.p
            r3 = 0
            r2.<init>(r3, r1)
        L16:
            h6.c r1 = r9.f8451e
            h6.h r3 = r1.getContext()
            boolean r3 = m4834j(r0, r3)
            r4 = 1
            if (r3 == 0) goto L2f
            r9.f8452f = r2
            r9.f9341c = r4
            h6.h r10 = r1.getContext()
            m4833i(r0, r10, r9)
            return
        L2f:
            kotlinx.coroutines.o0 r0 = kotlinx.coroutines.AbstractC5988o1.m5608a()
            long r5 = r0.f9481a
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r9.f8452f = r2
            r9.f9341c = r4
            r0.m5604k(r9)
            goto Lac
        L46:
            r0.m5605m(r4)
            h6.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.v0 r3 = kotlinx.coroutines.C6010v0.f9513a     // Catch: java.lang.Throwable -> L6d
            h6.f r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L6d
            kotlinx.coroutines.w0 r2 = (kotlinx.coroutines.InterfaceC6013w0) r2     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L6f
            boolean r3 = r2.isActive()     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto L6f
            java.util.concurrent.CancellationException r10 = r2.mo5457f()     // Catch: java.lang.Throwable -> L6d
            kotlin.Result$Failure r10 = kotlin.AbstractC5774b.m5118a(r10)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r10 = kotlin.Result.m13956constructorimpl(r10)     // Catch: java.lang.Throwable -> L6d
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L6d
            goto L91
        L6d:
            r10 = move-exception
            goto La8
        L6f:
            java.lang.Object r2 = r9.f8453g     // Catch: java.lang.Throwable -> L6d
            h6.h r3 = r1.getContext()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = m4838n(r3, r2)     // Catch: java.lang.Throwable -> L6d
            e7.r r5 = p054e7.AbstractC5469a.f8441d     // Catch: java.lang.Throwable -> L6d
            if (r2 == r5) goto L82
            kotlinx.coroutines.s1 r5 = kotlinx.coroutines.AbstractC6014x.m5625E(r1, r3, r2)     // Catch: java.lang.Throwable -> L6d
            goto L83
        L82:
            r5 = 0
        L83:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L8e
            boolean r10 = r5.m5611d0()     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L91
        L8e:
            m4831g(r3, r2)     // Catch: java.lang.Throwable -> L6d
        L91:
            boolean r10 = r0.m5606o()     // Catch: java.lang.Throwable -> L6d
            if (r10 != 0) goto L91
        L97:
            r0.m5603d(r4)
            goto Lac
        L9b:
            r10 = move-exception
            if (r5 == 0) goto La4
            boolean r1 = r5.m5611d0()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto La7
        La4:
            m4831g(r3, r2)     // Catch: java.lang.Throwable -> L6d
        La7:
            throw r10     // Catch: java.lang.Throwable -> L6d
        La8:
            r9.m5518h(r10)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r9 = move-exception
            r0.m5603d(r4)
            throw r9
        Lb2:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054e7.AbstractC5469a.m4832h(h6.c, java.lang.Object):void");
    }

    /* renamed from: i */
    public static final void m4833i(AbstractC5995r abstractC5995r, InterfaceC5636h interfaceC5636h, Runnable runnable) throws DispatchException {
        try {
            abstractC5995r.dispatch(interfaceC5636h, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC5995r, interfaceC5636h);
        }
    }

    /* renamed from: j */
    public static final boolean m4834j(AbstractC5995r abstractC5995r, InterfaceC5636h interfaceC5636h) throws DispatchException {
        try {
            return abstractC5995r.isDispatchNeeded(interfaceC5636h);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC5995r, interfaceC5636h);
        }
    }

    /* renamed from: k */
    public static final long m4835k(long j7, long j8, long j9, String str) {
        String property;
        int i = AbstractC5487s.f8482a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j7;
        }
        Long lM5411E = AbstractC5862w.m5411E(property);
        if (lM5411E == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM5411E.longValue();
        if (j8 <= jLongValue && jLongValue <= j9) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: l */
    public static int m4836l(int i, int i8, String str) {
        return (int) m4835k(i, 1, (i8 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    /* renamed from: m */
    public static final Object m4837m(InterfaceC5636h interfaceC5636h) {
        Object objFold = interfaceC5636h.fold(0, f8442e);
        AbstractC5830k.m5327d(objFold);
        return objFold;
    }

    /* renamed from: n */
    public static final Object m4838n(InterfaceC5636h interfaceC5636h, Object obj) {
        if (obj == null) {
            obj = m4837m(interfaceC5636h);
        }
        return obj == 0 ? f8441d : obj instanceof Integer ? interfaceC5636h.fold(new C5490v(((Number) obj).intValue(), interfaceC5636h), f8444g) : ((InterfaceC5985n1) obj).updateThreadContext(interfaceC5636h);
    }
}

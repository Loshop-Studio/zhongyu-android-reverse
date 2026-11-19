package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.DispatchException;
import p309qc.C10786q;
import sd.AbstractC11106e0;
import sd.AbstractC11175x0;
import sd.C11120h2;

/* renamed from: xd.i */
/* loaded from: classes6.dex */
public abstract class AbstractC11850i {

    /* renamed from: a */
    public static final C11839c0 f28091a = new C11839c0("UNDEFINED");

    /* renamed from: b */
    public static final C11839c0 f28092b = new C11839c0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m26278b(vc.InterfaceC11588c r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof p410xd.C11848h
            if (r0 == 0) goto Lb2
            xd.h r6 = (p410xd.C11848h) r6
            java.lang.Object r0 = sd.AbstractC11177y.m24829b(r7)
            sd.e0 r1 = r6.f28087f
            kotlin.coroutines.d r2 = r6.getContext()
            boolean r1 = m26280d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f28089h = r0
            r6.f23590e = r2
            sd.e0 r7 = r6.f28087f
            kotlin.coroutines.d r0 = r6.getContext()
            m26279c(r7, r0, r6)
            goto Lac
        L26:
            sd.h2 r1 = sd.C11120h2.f26785a
            sd.x0 r1 = r1.m24730b()
            boolean r3 = r1.m24826w()
            if (r3 == 0) goto L3b
            r6.f28089h = r0
            r6.f23590e = r2
            r1.m24823l(r6)
            goto Lac
        L3b:
            r1.m24825s(r2)
            kotlin.coroutines.d r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.g$b r4 = kotlinx.coroutines.InterfaceC10045g.f23976b0     // Catch: java.lang.Throwable -> L67
            kotlin.coroutines.d$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.g r3 = (kotlinx.coroutines.InterfaceC10045g) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.mo20438g()     // Catch: java.lang.Throwable -> L67
            r6.mo20518a(r0, r7)     // Catch: java.lang.Throwable -> L67
            kotlin.Result$a r0 = kotlin.Result.f23263d     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.AbstractC9924b.m20070a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.Result.m20054c(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            vc.c r0 = r6.f28088g     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f28090i     // Catch: java.lang.Throwable -> L67
            kotlin.coroutines.d r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = p410xd.AbstractC11853j0.m26293i(r4, r3)     // Catch: java.lang.Throwable -> L67
            xd.c0 r5 = p410xd.AbstractC11853j0.f28093a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            sd.l2 r0 = sd.AbstractC11098c0.m24691m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            vc.c r5 = r6.f28088g     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            qc.q r7 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.m24753K0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            p410xd.AbstractC11853j0.m26290f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.m24819C()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.m24821i(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.m24753K0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            p410xd.AbstractC11853j0.m26290f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.m20755g(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.m24821i(r2)
            throw r6
        Lb2:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410xd.AbstractC11850i.m26278b(vc.c, java.lang.Object):void");
    }

    /* renamed from: c */
    public static final void m26279c(AbstractC11106e0 abstractC11106e0, InterfaceC9945d interfaceC9945d, Runnable runnable) {
        try {
            abstractC11106e0.dispatch(interfaceC9945d, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC11106e0, interfaceC9945d);
        }
    }

    /* renamed from: d */
    public static final boolean m26280d(AbstractC11106e0 abstractC11106e0, InterfaceC9945d interfaceC9945d) throws DispatchException {
        try {
            return abstractC11106e0.isDispatchNeeded(interfaceC9945d);
        } catch (Throwable th) {
            throw new DispatchException(th, abstractC11106e0, interfaceC9945d);
        }
    }

    /* renamed from: e */
    public static final boolean m26281e(C11848h c11848h) {
        C10786q c10786q = C10786q.f26013a;
        AbstractC11175x0 abstractC11175x0M24730b = C11120h2.f26785a.m24730b();
        if (abstractC11175x0M24730b.m24827x()) {
            return false;
        }
        if (abstractC11175x0M24730b.m24826w()) {
            c11848h.f28089h = c10786q;
            c11848h.f23590e = 1;
            abstractC11175x0M24730b.m24823l(c11848h);
            return true;
        }
        abstractC11175x0M24730b.m24825s(true);
        try {
            c11848h.run();
            do {
            } while (abstractC11175x0M24730b.m24819C());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}

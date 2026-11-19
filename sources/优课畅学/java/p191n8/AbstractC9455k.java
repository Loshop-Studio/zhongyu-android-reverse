package p191n8;

import p123h7.C8736p;
import p135i8.AbstractC8861o0;
import p135i8.C8883v1;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* renamed from: n8.k */
/* loaded from: classes5.dex */
public abstract class AbstractC9455k {

    /* renamed from: a */
    public static final C9442d0 f18663a = new C9442d0("UNDEFINED");

    /* renamed from: b */
    public static final C9442d0 f18664b = new C9442d0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:45:0x003f, inners: #1 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m17353b(p179m7.InterfaceC9324c r6, java.lang.Object r7, p300x7.InterfaceC10570l r8) {
        /*
            boolean r0 = r6 instanceof p191n8.C9453j
            if (r0 == 0) goto Lb3
            n8.j r6 = (p191n8.C9453j) r6
            java.lang.Object r8 = p135i8.AbstractC8890y.m14936c(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.f18659d
            kotlin.coroutines.d r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.f18661f = r8
            r6.f18067c = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f18659d
            kotlin.coroutines.d r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto Lad
        L26:
            i8.v1 r0 = p135i8.C8883v1.f16542a
            i8.o0 r0 = r0.m14923b()
            boolean r2 = r0.m14893w()
            if (r2 == 0) goto L3b
            r6.f18661f = r8
            r6.f18067c = r1
            r0.m14890q(r6)
            goto Lad
        L3b:
            r0.m14892t(r1)
            r2 = 0
            kotlin.coroutines.d r3 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.n$b r4 = kotlinx.coroutines.InterfaceC9212n.f18095c0     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.d$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            kotlinx.coroutines.n r3 = (kotlinx.coroutines.InterfaceC9212n) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.mo16281e()     // Catch: java.lang.Throwable -> L68
            r6.mo16358a(r8, r7)     // Catch: java.lang.Throwable -> L68
            kotlin.Result$a r8 = kotlin.Result.f17350b     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.AbstractC9079b.m15925a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.Result.m15909b(r7)     // Catch: java.lang.Throwable -> L68
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            m7.c r8 = r6.f18660e     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.f18662g     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.d r4 = r8.getContext()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.m16749c(r4, r3)     // Catch: java.lang.Throwable -> L68
            n8.d0 r5 = kotlinx.coroutines.internal.ThreadContextKt.f18077a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            i8.x1 r8 = kotlinx.coroutines.CoroutineContextKt.m16218g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            m7.c r5 = r6.f18660e     // Catch: java.lang.Throwable -> L9c
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9c
            h7.p r7 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.m14932K0()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            kotlinx.coroutines.internal.ThreadContextKt.m16747a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.m14896z()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.m14888i(r1)
            goto Lad
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.m14932K0()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            kotlinx.coroutines.internal.ThreadContextKt.m16747a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.m16723f(r7, r2)     // Catch: java.lang.Throwable -> Lae
            goto L98
        Lad:
            return
        Lae:
            r6 = move-exception
            r0.m14888i(r1)
            throw r6
        Lb3:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p191n8.AbstractC9455k.m17353b(m7.c, java.lang.Object, x7.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m17354c(InterfaceC9324c interfaceC9324c, Object obj, InterfaceC10570l interfaceC10570l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC10570l = null;
        }
        m17353b(interfaceC9324c, obj, interfaceC10570l);
    }

    /* renamed from: d */
    public static final boolean m17355d(C9453j c9453j) {
        C8736p c8736p = C8736p.f16368a;
        AbstractC8861o0 abstractC8861o0M14923b = C8883v1.f16542a.m14923b();
        if (abstractC8861o0M14923b.m14894x()) {
            return false;
        }
        if (abstractC8861o0M14923b.m14893w()) {
            c9453j.f18661f = c8736p;
            c9453j.f18067c = 1;
            abstractC8861o0M14923b.m14890q(c9453j);
            return true;
        }
        abstractC8861o0M14923b.m14892t(true);
        try {
            c9453j.run();
            do {
            } while (abstractC8861o0M14923b.m14896z());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}

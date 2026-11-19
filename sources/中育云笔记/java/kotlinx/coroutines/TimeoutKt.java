package kotlinx.coroutines;

import p181hd.InterfaceC9544p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p426yd.AbstractC11945b;
import sd.AbstractC11147o1;
import sd.InterfaceC11146o0;
import sd.RunnableC11128j2;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class TimeoutKt {
    /* renamed from: a */
    public static final TimeoutCancellationException m20485a(long j10, InterfaceC11146o0 interfaceC11146o0, InterfaceC10045g interfaceC10045g) {
        return new TimeoutCancellationException("Timed out waiting for " + j10 + " ms", interfaceC10045g);
    }

    /* renamed from: b */
    public static final Object m20486b(RunnableC11128j2 runnableC11128j2, InterfaceC9544p interfaceC9544p) {
        AbstractC11147o1.m24774h(runnableC11128j2, DelayKt.m20377c(runnableC11128j2.f28133f.getContext()).mo24710c(runnableC11128j2.f26792g, runnableC11128j2, runnableC11128j2.getContext()));
        return AbstractC11945b.m26508e(runnableC11128j2, runnableC11128j2, interfaceC9544p);
    }

    /* renamed from: c */
    public static final Object m20487c(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objM20486b = m20486b(new RunnableC11128j2(j10, interfaceC11588c), interfaceC9544p);
        if (objM20486b == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20486b;
    }

    /* renamed from: d */
    public static final Object m20488d(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        return m20487c(DelayKt.m20378d(j10), interfaceC9544p, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20489e(long r7, p181hd.InterfaceC9544p r9, vc.InterfaceC11588c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.f23511g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23511g = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23510f
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23511g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f23509e
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.f23508d
            hd.p r8 = (p181hd.InterfaceC9544p) r8
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.AbstractC9924b.m20071b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f23508d = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f23509e = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f23507c = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f23511g = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            sd.j2 r2 = new sd.j2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f23402c = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = m20486b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = p393wc.AbstractC11725a.m25952f()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            p409xc.AbstractC11831f.m26221c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            kotlinx.coroutines.g r9 = r8.f23506c
            java.lang.Object r7 = r7.f23402c
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m20489e(long, hd.p, vc.c):java.lang.Object");
    }
}

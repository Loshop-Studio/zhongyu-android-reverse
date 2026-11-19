package kotlinx.coroutines;

import p135i8.AbstractC8823b1;
import p135i8.RunnableC8886w1;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p202o8.AbstractC9545b;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract class TimeoutKt {
    /* renamed from: a */
    public static final TimeoutCancellationException m16324a(long j10, InterfaceC9203g interfaceC9203g, InterfaceC9212n interfaceC9212n) {
        return new TimeoutCancellationException("Timed out waiting for " + j10 + " ms", interfaceC9212n);
    }

    /* renamed from: b */
    public static final Object m16325b(RunnableC8886w1 runnableC8886w1, InterfaceC10574p interfaceC10574p) {
        AbstractC8823b1.m14813i(runnableC8886w1, DelayKt.m16228c(runnableC8886w1.f18693d.getContext()).mo16335f(runnableC8886w1.f16547e, runnableC8886w1, runnableC8886w1.getContext()));
        return AbstractC9545b.m17821c(runnableC8886w1, runnableC8886w1, interfaceC10574p);
    }

    /* renamed from: c */
    public static final Object m16326c(long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objM16325b = m16325b(new RunnableC8886w1(j10, interfaceC9324c), interfaceC10574p);
        if (objM16325b == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16325b;
    }

    /* renamed from: d */
    public static final Object m16327d(long j10, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        return m16326c(DelayKt.m16229d(j10), interfaceC10574p, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16328e(long r7, p300x7.InterfaceC10574p r9, p179m7.InterfaceC9324c r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = (kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1) r0
            int r1 = r0.f17587e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17587e = r1
            goto L18
        L13:
            kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1 r0 = new kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17586d
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17587e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f17585c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.f17584b
            x7.p r8 = (p300x7.InterfaceC10574p) r8
            kotlin.AbstractC9079b.m15926b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
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
            kotlin.AbstractC9079b.m15926b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f17584b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f17585c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f17583a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f17587e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            i8.w1 r2 = new i8.w1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f17473a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = m16325b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = p190n7.AbstractC9434a.m17291f()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            p201o7.AbstractC9541f.m17811c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
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
            kotlinx.coroutines.n r9 = r8.f17582a
            java.lang.Object r7 = r7.f17473a
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.TimeoutKt.m16328e(long, x7.p, m7.c):java.lang.Object");
    }
}

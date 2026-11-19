package kotlinx.coroutines.flow;

/* renamed from: kotlinx.coroutines.flow.a */
/* loaded from: classes4.dex */
public abstract class AbstractC5900a implements InterfaceC5910f {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, r6.e] */
    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.InterfaceC5912g r7, p075h6.InterfaceC5631c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            kotlin.AbstractC5774b.m5119b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L58
        L2d:
            r8 = move-exception
            goto L62
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC5774b.m5119b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            h6.h r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L60
            r0.label = r4     // Catch: java.lang.Throwable -> L60
            r7 = r6
            kotlinx.coroutines.flow.b0 r7 = (kotlinx.coroutines.flow.C5903b0) r7     // Catch: java.lang.Throwable -> L60
            kotlin.coroutines.jvm.internal.SuspendLambda r7 = r7.f9350a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L60
            if (r7 != r1) goto L53
            goto L54
        L53:
            r7 = r3
        L54:
            if (r7 != r1) goto L57
            return r1
        L57:
            r7 = r8
        L58:
            r7.releaseIntercepted()
            return r3
        L5c:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L62
        L60:
            r7 = move-exception
            goto L5c
        L62:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC5900a.collect(kotlinx.coroutines.flow.g, h6.c):java.lang.Object");
    }
}

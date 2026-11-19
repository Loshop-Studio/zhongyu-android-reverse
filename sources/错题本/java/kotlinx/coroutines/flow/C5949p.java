package kotlinx.coroutines.flow;

import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.p */
/* loaded from: classes4.dex */
public final class C5949p implements InterfaceC5910f {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5910f f9432a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6473e f9433b;

    public C5949p(InterfaceC5944m0 interfaceC5944m0, InterfaceC6473e interfaceC6473e) {
        this.f9432a = interfaceC5944m0;
        this.f9433b = interfaceC6473e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.InterfaceC5912g r6, p075h6.InterfaceC5631c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.flow.q r6 = (kotlinx.coroutines.flow.C5951q) r6
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L59
        L2b:
            r7 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.AbstractC5774b.m5119b(r7)
            kotlinx.coroutines.flow.f r7 = r5.f9432a
            kotlinx.coroutines.flow.q r2 = new kotlinx.coroutines.flow.q
            r6.e r4 = r5.f9433b
            r2.<init>(r4, r6)
            r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            if (r6 != r1) goto L59
            return r1
        L4c:
            r7 = move-exception
            r6 = r2
        L4e:
            java.lang.Object r1 = r7.owner
            if (r1 != r6) goto L5c
            h6.h r6 = r0.getContext()
            kotlinx.coroutines.AbstractC6014x.m5639j(r6)
        L59:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        L5c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5949p.collect(kotlinx.coroutines.flow.g, h6.c):java.lang.Object");
    }
}

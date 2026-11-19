package kotlinx.coroutines.flow;

import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.q */
/* loaded from: classes4.dex */
public final class C5951q implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6473e f9435a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC5912g f9436b;

    public C5951q(InterfaceC6473e interfaceC6473e, InterfaceC5912g interfaceC5912g) {
        this.f9435a = interfaceC6473e;
        this.f9436b = interfaceC5912g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, p075h6.InterfaceC5631c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.q r8 = (kotlinx.coroutines.flow.C5951q) r8
            kotlin.AbstractC5774b.m5119b(r9)
            goto L72
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.q r2 = (kotlinx.coroutines.flow.C5951q) r2
            kotlin.AbstractC5774b.m5119b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L59
        L44:
            kotlin.AbstractC5774b.m5119b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            r6.e r9 = r7.f9435a
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L56
            goto L70
        L56:
            r2 = r9
            r9 = r8
            r8 = r7
        L59:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L71
            kotlinx.coroutines.flow.g r2 = r8.f9436b
            r0.L$0 = r8
            r5 = 0
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 != r1) goto L72
        L70:
            return r1
        L71:
            r4 = 0
        L72:
            if (r4 == 0) goto L77
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        L77:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5951q.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

/* renamed from: kotlinx.coroutines.flow.n */
/* loaded from: classes4.dex */
public final class C5945n implements InterfaceC5910f {

    /* renamed from: a */
    public final /* synthetic */ C5916i f9425a;

    public C5945n(C5916i c5916i) {
        this.f9425a = c5916i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.InterfaceC5912g r8, p075h6.InterfaceC5631c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L5a
        L29:
            r9 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.AbstractC5774b.m5119b(r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.flow.i r4 = r7.f9425a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            kotlinx.coroutines.flow.o r5 = new kotlinx.coroutines.flow.o     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r5.<init>(r2, r8, r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.L$0 = r9     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r8 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            if (r8 != r1) goto L5a
            return r1
        L52:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L56:
            java.lang.Object r0 = r9.owner
            if (r0 != r8) goto L5d
        L5a:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        L5d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5945n.collect(kotlinx.coroutines.flow.g, h6.c):java.lang.Object");
    }
}

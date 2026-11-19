package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.s */
/* loaded from: classes4.dex */
public final class C5953s implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6473e f9438a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f9439b;

    public C5953s(Ref$ObjectRef ref$ObjectRef, InterfaceC6473e interfaceC6473e) {
        this.f9438a = interfaceC6473e;
        this.f9439b = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, p075h6.InterfaceC5631c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.s r0 = (kotlinx.coroutines.flow.C5953s) r0
            kotlin.AbstractC5774b.m5119b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC5774b.m5119b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            r6.e r6 = r4.f9438a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L53
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        L53:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f9439b
            r6.element = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5953s.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}

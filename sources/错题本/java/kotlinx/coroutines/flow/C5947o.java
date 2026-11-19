package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

/* renamed from: kotlinx.coroutines.flow.o */
/* loaded from: classes4.dex */
public final class C5947o implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f9428a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC5912g f9429b;

    /* renamed from: c */
    public final /* synthetic */ Object f9430c;

    public C5947o(Ref$IntRef ref$IntRef, InterfaceC5912g interfaceC5912g, Object obj) {
        this.f9428a = ref$IntRef;
        this.f9429b = interfaceC5912g;
        this.f9430c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, p075h6.InterfaceC5631c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.AbstractC5774b.m5119b(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.AbstractC5774b.m5119b(r8)
            return r3
        L38:
            kotlin.AbstractC5774b.m5119b(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = r6.f9428a
            int r2 = r8.element
            int r2 = r2 + r5
            r8.element = r2
            kotlinx.coroutines.flow.g r8 = r6.f9429b
            if (r2 >= r5) goto L4f
            r0.label = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L5a
            goto L59
        L4f:
            r0.label = r4
            java.lang.Object r2 = r6.f9430c
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlinx.coroutines.flow.AbstractC5914h.m5547c(r8, r7, r2, r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5947o.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}

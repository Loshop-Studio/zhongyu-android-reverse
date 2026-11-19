package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: kotlinx.coroutines.flow.d */
/* loaded from: classes4.dex */
public final class C5906d implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ C5908e f9354a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f9355b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5912g f9356c;

    public C5906d(C5908e c5908e, Ref$ObjectRef ref$ObjectRef, InterfaceC5912g interfaceC5912g) {
        this.f9354a = c5908e;
        this.f9355b = ref$ObjectRef;
        this.f9356c = interfaceC5912g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, p075h6.InterfaceC5631c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.AbstractC5774b.m5119b(r8)
            return r3
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.AbstractC5774b.m5119b(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = r6.f9355b
            T r2 = r8.element
            e7.r r5 = kotlinx.coroutines.flow.internal.AbstractC5920b.f9388b
            if (r2 == r5) goto L4c
            kotlinx.coroutines.flow.e r5 = r6.f9354a
            r6.e r5 = r5.f9362b
            java.lang.Object r2 = r5.invoke(r2, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L59
        L4c:
            r8.element = r7
            r0.label = r4
            kotlinx.coroutines.flow.g r8 = r6.f9356c
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5906d.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}

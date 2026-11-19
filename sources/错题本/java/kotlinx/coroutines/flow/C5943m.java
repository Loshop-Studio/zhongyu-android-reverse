package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import p152r6.InterfaceC6473e;

/* renamed from: kotlinx.coroutines.flow.m */
/* loaded from: classes4.dex */
public final class C5943m implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f9422a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC5912g f9423b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6473e f9424c;

    public C5943m(Ref$BooleanRef ref$BooleanRef, InterfaceC5912g interfaceC5912g, InterfaceC6473e interfaceC6473e) {
        this.f9422a = ref$BooleanRef;
        this.f9423b = interfaceC5912g;
        this.f9424c = interfaceC6473e;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, p075h6.InterfaceC5631c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            d6.s r5 = p045d6.C5443s.f8405a
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC5774b.m5119b(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.L$1
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.m r2 = (kotlinx.coroutines.flow.C5943m) r2
            kotlin.AbstractC5774b.m5119b(r9)
            goto L6a
        L41:
            kotlin.AbstractC5774b.m5119b(r9)
            goto L59
        L45:
            kotlin.AbstractC5774b.m5119b(r9)
            kotlin.jvm.internal.Ref$BooleanRef r9 = r7.f9422a
            boolean r9 = r9.element
            if (r9 == 0) goto L5a
            r0.label = r6
            kotlinx.coroutines.flow.g r9 = r7.f9423b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L59
            goto L85
        L59:
            return r5
        L5a:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            r6.e r9 = r7.f9424c
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L69
            goto L85
        L69:
            r2 = r7
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L86
            kotlin.jvm.internal.Ref$BooleanRef r9 = r2.f9422a
            r9.element = r6
            kotlinx.coroutines.flow.g r9 = r2.f9423b
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5943m.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}

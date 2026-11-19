package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import p379vd.InterfaceC11595d;

/* loaded from: classes6.dex */
public final class FlowKt__TransformKt$withIndex$1$1 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11595d f23821c;

    /* renamed from: d */
    public final /* synthetic */ Ref$IntRef f23822d;

    public FlowKt__TransformKt$withIndex$1$1(InterfaceC11595d interfaceC11595d, Ref$IntRef ref$IntRef) {
        this.f23821c = interfaceC11595d;
        this.f23822d = ref$IntRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r0
            int r1 = r0.f23825e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23825e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f23823c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23825e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r9)
            goto L4e
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.AbstractC9924b.m20071b(r9)
            vd.d r9 = r7.f23821c
            rc.k0 r2 = new rc.k0
            kotlin.jvm.internal.Ref$IntRef r4 = r7.f23822d
            int r5 = r4.f23400c
            int r6 = r5 + 1
            r4.f23400c = r6
            if (r5 < 0) goto L51
            r2.<init>(r5, r8)
            r0.f23825e = r3
            java.lang.Object r8 = r9.emit(r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        L51:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}

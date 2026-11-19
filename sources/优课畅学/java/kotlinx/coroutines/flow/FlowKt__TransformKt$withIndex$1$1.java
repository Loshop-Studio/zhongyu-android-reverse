package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import p169l8.InterfaceC9267d;

/* loaded from: classes5.dex */
public final class FlowKt__TransformKt$withIndex$1$1 implements InterfaceC9267d {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9267d f17902a;

    /* renamed from: b */
    public final /* synthetic */ Ref$IntRef f17903b;

    public FlowKt__TransformKt$withIndex$1$1(InterfaceC9267d interfaceC9267d, Ref$IntRef ref$IntRef) {
        this.f17902a = interfaceC9267d;
        this.f17903b = ref$IntRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9267d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1) r0
            int r1 = r0.f17906c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17906c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f17904a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17906c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r9)
            goto L4e
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.AbstractC9079b.m15926b(r9)
            l8.d r9 = r7.f17902a
            i7.j0 r2 = new i7.j0
            kotlin.jvm.internal.Ref$IntRef r4 = r7.f17903b
            int r5 = r4.f17471a
            int r6 = r5 + 1
            r4.f17471a = r6
            if (r5 < 0) goto L51
            r2.<init>(r5, r8)
            r0.f17906c = r3
            java.lang.Object r8 = r9.emit(r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        L51:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1.emit(java.lang.Object, m7.c):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import p379vd.InterfaceC11595d;

/* loaded from: classes6.dex */
public final class FlowKt__ErrorsKt$catchImpl$2 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11595d f23703c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f23704d;

    public FlowKt__ErrorsKt$catchImpl$2(InterfaceC11595d interfaceC11595d, Ref$ObjectRef ref$ObjectRef) {
        this.f23703c = interfaceC11595d;
        this.f23704d = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.f23708f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23708f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f23706d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23708f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f23705c
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L47
        L2d:
            r6 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC9924b.m20071b(r6)
            vd.d r6 = r4.f23703c     // Catch: java.lang.Throwable -> L4a
            r0.f23705c = r4     // Catch: java.lang.Throwable -> L4a
            r0.f23708f = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L47
            return r1
        L47:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        L4a:
            r6 = move-exception
            r5 = r4
        L4c:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f23704d
            r5.f23402c = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import p379vd.InterfaceC11595d;

/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$drop$2$1 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ Ref$IntRef f23732c;

    /* renamed from: d */
    public final /* synthetic */ int f23733d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11595d f23734e;

    public FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i10, InterfaceC11595d interfaceC11595d) {
        this.f23732c = ref$IntRef;
        this.f23733d = i10;
        this.f23734e = interfaceC11595d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.f23737e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23737e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f23735c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23737e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.AbstractC9924b.m20071b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f23732c
            int r2 = r7.f23400c
            int r4 = r5.f23733d
            if (r2 < r4) goto L4a
            vd.d r7 = r5.f23734e
            r0.f23737e = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L4a:
            int r2 = r2 + r3
            r7.f23400c = r2
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}

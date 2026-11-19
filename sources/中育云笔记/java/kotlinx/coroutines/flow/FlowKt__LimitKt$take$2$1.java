package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import p379vd.InterfaceC11595d;

/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$take$2$1 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ Ref$IntRef f23749c;

    /* renamed from: d */
    public final /* synthetic */ int f23750d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11595d f23751e;

    /* renamed from: f */
    public final /* synthetic */ Object f23752f;

    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i10, InterfaceC11595d interfaceC11595d, Object obj) {
        this.f23749c = ref$IntRef;
        this.f23750d = i10;
        this.f23751e = interfaceC11595d;
        this.f23752f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt__LimitKt.m20794d(r7, r6, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.f23755e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23755e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f23753c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23755e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r7)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L51
        L38:
            kotlin.AbstractC9924b.m20071b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f23749c
            int r2 = r7.f23400c
            int r2 = r2 + r4
            r7.f23400c = r2
            int r7 = r5.f23750d
            if (r2 >= r7) goto L54
            vd.d r7 = r5.f23751e
            r0.f23755e = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L51
            goto L60
        L51:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L54:
            vd.d r7 = r5.f23751e
            java.lang.Object r2 = r5.f23752f
            r0.f23755e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.m20791a(r7, r6, r2, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}

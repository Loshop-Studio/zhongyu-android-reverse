package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m26211f = "Merge.kt", m26212l = {213, 213}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements InterfaceC9545q {

    /* renamed from: c */
    public int f23757c;

    /* renamed from: d */
    public /* synthetic */ Object f23758d;

    /* renamed from: e */
    public /* synthetic */ Object f23759e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC9544p f23760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        super(3, interfaceC11588c);
        this.f23760f = interfaceC9544p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r5.f23757c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9924b.m20071b(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f23758d
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r6)
            goto L39
        L22:
            kotlin.AbstractC9924b.m20071b(r6)
            java.lang.Object r6 = r5.f23758d
            r1 = r6
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            java.lang.Object r6 = r5.f23759e
            hd.p r4 = r5.f23760f
            r5.f23758d = r1
            r5.f23757c = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L39
            goto L44
        L39:
            r3 = 0
            r5.f23758d = r3
            r5.f23757c = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9545q
    public final Object invoke(InterfaceC11595d interfaceC11595d, Object obj, InterfaceC11588c interfaceC11588c) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f23760f, interfaceC11588c);
        flowKt__MergeKt$mapLatest$1.f23758d = interfaceC11595d;
        flowKt__MergeKt$mapLatest$1.f23759e = obj;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(C10786q.f26013a);
    }
}

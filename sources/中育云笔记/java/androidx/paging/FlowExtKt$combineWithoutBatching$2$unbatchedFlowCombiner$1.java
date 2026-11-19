package androidx.paging;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", m26211f = "FlowExt.kt", m26212l = {Opcodes.IAND, Opcodes.IAND}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 extends SuspendLambda implements InterfaceC9546r {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ InterfaceC9546r $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(SimpleProducerScope<R> simpleProducerScope, InterfaceC9546r interfaceC9546r, InterfaceC11588c<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1> interfaceC11588c) {
        super(4, interfaceC11588c);
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$transform = interfaceC9546r;
    }

    public final Object invoke(T1 t12, T2 t22, CombineSource combineSource, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 = new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(this.$$this$simpleChannelFlow, this.$transform, interfaceC11588c);
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$0 = t12;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$1 = t22;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$2 = combineSource;
        return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r1.send(r9, r8) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.AbstractC9924b.m20071b(r9)
            goto L4b
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.L$0
            androidx.paging.SimpleProducerScope r1 = (androidx.paging.SimpleProducerScope) r1
            kotlin.AbstractC9924b.m20071b(r9)
            goto L40
        L23:
            kotlin.AbstractC9924b.m20071b(r9)
            java.lang.Object r9 = r8.L$0
            java.lang.Object r1 = r8.L$1
            java.lang.Object r5 = r8.L$2
            androidx.paging.CombineSource r5 = (androidx.paging.CombineSource) r5
            androidx.paging.SimpleProducerScope<R> r6 = r8.$$this$simpleChannelFlow
            hd.r r7 = r8.$transform
            r8.L$0 = r6
            r8.L$1 = r2
            r8.label = r4
            java.lang.Object r9 = r7.invoke(r9, r1, r5, r8)
            if (r9 != r0) goto L3f
            goto L4a
        L3f:
            r1 = r6
        L40:
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r9 = r1.send(r9, r8)
            if (r9 != r0) goto L4b
        L4a:
            return r0
        L4b:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object obj2 = this.L$0;
        AbstractC9977s.m20287c(10);
        Object obj3 = this.L$1;
        AbstractC9977s.m20287c(10);
        CombineSource combineSource = (CombineSource) this.L$2;
        AbstractC9977s.m20287c(10);
        InterfaceC10005f interfaceC10005f = this.$$this$simpleChannelFlow;
        Object objInvoke = this.$transform.invoke(obj2, obj3, combineSource, this);
        AbstractC9977s.m20287c(0);
        interfaceC10005f.send(objInvoke, this);
        AbstractC9977s.m20287c(1);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9546r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1) obj, obj2, (CombineSource) obj3, (InterfaceC11588c<? super C10786q>) obj4);
    }
}

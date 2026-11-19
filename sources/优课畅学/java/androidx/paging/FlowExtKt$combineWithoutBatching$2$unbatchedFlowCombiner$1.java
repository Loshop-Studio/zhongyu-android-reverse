package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10576r;

@InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", m17801f = "FlowExt.kt", m17802l = {141, 141}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 extends SuspendLambda implements InterfaceC10576r {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ InterfaceC10576r $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(SimpleProducerScope<R> simpleProducerScope, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1> interfaceC9324c) {
        super(4, interfaceC9324c);
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$transform = interfaceC10576r;
    }

    public final Object invoke(T1 t12, T2 t22, CombineSource combineSource, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 = new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(this.$$this$simpleChannelFlow, this.$transform, interfaceC9324c);
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$0 = t12;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$1 = t22;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$2 = combineSource;
        return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(C8736p.f16368a);
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.AbstractC9079b.m15926b(r9)
            goto L4b
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.L$0
            androidx.paging.SimpleProducerScope r1 = (androidx.paging.SimpleProducerScope) r1
            kotlin.AbstractC9079b.m15926b(r9)
            goto L40
        L23:
            kotlin.AbstractC9079b.m15926b(r9)
            java.lang.Object r9 = r8.L$0
            java.lang.Object r1 = r8.L$1
            java.lang.Object r5 = r8.L$2
            androidx.paging.CombineSource r5 = (androidx.paging.CombineSource) r5
            androidx.paging.SimpleProducerScope<R> r6 = r8.$$this$simpleChannelFlow
            x7.r r7 = r8.$transform
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
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        CombineSource combineSource = (CombineSource) this.L$2;
        InterfaceC9163f interfaceC9163f = this.$$this$simpleChannelFlow;
        Object objInvoke = this.$transform.invoke(obj2, obj3, combineSource, this);
        AbstractC9131s.m16126c(0);
        interfaceC9163f.send(objInvoke, this);
        AbstractC9131s.m16126c(1);
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10576r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1) obj, obj2, (CombineSource) obj3, (InterfaceC9324c<? super C8736p>) obj4);
    }
}

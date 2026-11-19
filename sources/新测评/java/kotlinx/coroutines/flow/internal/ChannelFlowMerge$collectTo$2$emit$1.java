package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;

@Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m13596f = "Merge.kt", m13597i = {0, 0}, m13598l = {62}, m13599m = "emit", m13600n = {"this", "inner"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChannelFlowMerge.C83962<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(ChannelFlowMerge.C83962<? super T> c83962, Continuation<? super ChannelFlowMerge$collectTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c83962;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Flow) null, (Continuation<? super Unit>) this);
    }
}

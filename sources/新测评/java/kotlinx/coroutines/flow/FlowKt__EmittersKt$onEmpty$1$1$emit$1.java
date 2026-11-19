package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", m13596f = "Emitters.kt", m13597i = {}, m13598l = {181}, m13599m = "emit", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onEmpty$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__EmittersKt$onEmpty$1$1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$onEmpty$1$1$emit$1(FlowKt__EmittersKt$onEmpty$1$1<? super T> flowKt__EmittersKt$onEmpty$1$1, Continuation<? super FlowKt__EmittersKt$onEmpty$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = flowKt__EmittersKt$onEmpty$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}

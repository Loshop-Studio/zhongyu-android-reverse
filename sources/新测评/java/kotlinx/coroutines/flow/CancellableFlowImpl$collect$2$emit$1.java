package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.CancellableFlowImpl;

@Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m13596f = "Context.kt", m13597i = {}, m13598l = {278}, m13599m = "emit", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CancellableFlowImpl.C82782<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl.C82782<? super T> c82782, Continuation<? super CancellableFlowImpl$collect$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c82782;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}

package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m5192f = "Limit.kt", m5193i = {0}, m5194l = {73}, m5195m = "emitAbort$FlowKt__LimitKt", m5196n = {"$this$emitAbort"}, m5197s = {"L$0"})
/* loaded from: classes2.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LimitKt$emitAbort$1(Continuation<? super FlowKt__LimitKt$emitAbort$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(null, null, this);
    }
}

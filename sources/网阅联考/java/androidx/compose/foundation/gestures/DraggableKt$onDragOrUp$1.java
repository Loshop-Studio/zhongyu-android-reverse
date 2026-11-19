package androidx.compose.foundation.gestures;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DraggableKt", m5192f = "Draggable.kt", m5193i = {0, 0, 0, 0, 0}, m5194l = {470}, m5195m = "onDragOrUp-Axegvzg", m5196n = {"onDrag", "motionFromChange", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m5197s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class DraggableKt$onDragOrUp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DraggableKt$onDragOrUp$1(Continuation<? super DraggableKt$onDragOrUp$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.m7179onDragOrUpAxegvzg(null, null, 0L, null, this);
    }
}

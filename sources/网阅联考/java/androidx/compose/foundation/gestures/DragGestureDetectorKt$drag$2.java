package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = 176)
@DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m5192f = "DragGestureDetector.kt", m5193i = {0, 0, 0, 0, 0, 0}, m5194l = {876}, m5195m = "drag-VnAYq1g", m5196n = {"$this$drag_u2dVnAYq1g", "onDrag", "motionFromChange", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m5197s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,873:1\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$2(Continuation<? super DragGestureDetectorKt$drag$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m7160dragVnAYq1g(null, 0L, null, null, null, this);
    }
}

package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m13596f = "DragGestureDetector.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {1055}, m13599m = "verticalDrag-jO51t88", m13600n = {"onDrag", "$this$drag_u2dVnAYq1g$iv", "orientation$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$verticalDrag$1(Continuation<? super DragGestureDetectorKt$verticalDrag$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m17392verticalDragjO51t88(null, 0L, null, this);
    }
}

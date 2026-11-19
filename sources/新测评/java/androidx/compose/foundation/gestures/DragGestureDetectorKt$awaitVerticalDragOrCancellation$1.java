package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m13596f = "DragGestureDetector.kt", m13597i = {0, 0}, m13598l = {1048}, m13599m = "awaitVerticalDragOrCancellation-rnUCldI", m13600n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitVerticalDragOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m17383awaitVerticalDragOrCancellationrnUCldI(null, 0L, this);
    }
}

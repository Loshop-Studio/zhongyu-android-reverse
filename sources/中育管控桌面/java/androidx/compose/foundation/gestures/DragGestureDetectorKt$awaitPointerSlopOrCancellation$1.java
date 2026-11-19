package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 176)
@DebugMetadata(m7917c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m7918f = "DragGestureDetector.kt", m7919i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m7920l = {802, 825}, m7921m = "awaitPointerSlopOrCancellation-6ksA65w", m7922n = {"$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "touchSlop", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "dragEvent", "touchSlop"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m10302awaitPointerSlopOrCancellation6ksA65w(null, 0L, 0, null, 0L, null, this);
    }
}

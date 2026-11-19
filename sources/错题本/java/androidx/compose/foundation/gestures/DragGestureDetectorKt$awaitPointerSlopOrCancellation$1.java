package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = 176)
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m5303f = "DragGestureDetector.kt", m5304i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m5305l = {802, 825}, m5306m = "awaitPointerSlopOrCancellation-6ksA65w", m5307n = {"$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "touchSlop", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w", "onPointerSlopReached", "pointer", "touchSlopDetector", "dragEvent", "touchSlop"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
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

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(InterfaceC5631c<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m6951awaitPointerSlopOrCancellation6ksA65w(null, 0L, 0, null, 0L, null, this);
    }
}

package androidx.compose.foundation.gestures;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m5303f = "DragGestureDetector.kt", m5304i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m5305l = {1061, 1101}, m5306m = "awaitTouchSlopOrCancellation-jO51t88", m5307n = {"onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "touchSlop$iv", "onTouchSlopReached", "$this$awaitPointerSlopOrCancellation_u2d6ksA65w_u24default$iv", "pointer$iv", "touchSlopDetector$iv", "dragEvent$iv", "touchSlop$iv"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(InterfaceC5631c<? super DragGestureDetectorKt$awaitTouchSlopOrCancellation$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m6954awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}

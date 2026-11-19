package androidx.compose.foundation.gestures;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m5303f = "DragGestureDetector.kt", m5304i = {0, 0}, m5305l = {1048}, m5306m = "awaitVerticalDragOrCancellation-rnUCldI", m5307n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, m5308s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(InterfaceC5631c<? super DragGestureDetectorKt$awaitVerticalDragOrCancellation$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m6955awaitVerticalDragOrCancellationrnUCldI(null, 0L, this);
    }
}

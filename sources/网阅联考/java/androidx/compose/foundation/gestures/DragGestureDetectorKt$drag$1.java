package androidx.compose.foundation.gestures;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m5192f = "DragGestureDetector.kt", m5193i = {0, 0}, m5194l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m5195m = "drag-jO51t88", m5196n = {"$this$drag_u2djO51t88", "onDrag"}, m5197s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$drag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$1(Continuation<? super DragGestureDetectorKt$drag$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m7162dragjO51t88(null, 0L, null, this);
    }
}

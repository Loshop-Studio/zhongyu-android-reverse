package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", m5192f = "Scrollable.kt", m5193i = {0, 0}, m5194l = {516}, m5195m = "onPostFling-RZ2iAVY", m5196n = {"this", "available"}, m5197s = {"L$0", "J$0"})
/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableKt.C04841 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt.C04841 c04841, Continuation<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = c04841;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7212onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
